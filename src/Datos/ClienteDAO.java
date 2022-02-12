package Datos;

import Clases.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO extends Dao<Cliente> {

    public static final String MOSTRAR_CLIENTES = "SELECT * FROM Cliente";
    public static final String INSERTAR_CLIENTE = "INSERT INTO Cliente(nombre,primerApellido,segundoApellido,dni,telefono,direccion,loginUsuario,loginContrasenia)"
            + "values (?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String ELIMINAR_CLIENTE = "DELETE FROM Cliente where idCliente = ?";
    public static final String ACTUALIZAR_CLIENTE = "UPDATE Cliente SET nombre= ?, primerApellido= ?, segundoApellido= ?, dni= ?, telefono= ?, direccion= ?, loginUsuario= ?, loginContrasenia= ? WHERE idCliente = ?";
    public static final String BUSCAR_CLIENTE = "SELECT * FROM Cliente where loginUsuario= ? and loginContrasenia= ?";
    
    @Override
    public int insertar(Cliente cliente) {
        //String primerApellido = "";
        //String segundoApellido = "";
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        String[] apellidos = cliente.getApellido().split(" ");
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(INSERTAR_CLIENTE);
            sentencia.setString(1, cliente.getNombre());
            this.separarApellidos(apellidos, sentencia);
            sentencia.setString(4, cliente.getDni());
            sentencia.setString(5, cliente.getTelefono());
            sentencia.setString(6, cliente.getDireccion());
            sentencia.setString(7, cliente.getUsuario());
            sentencia.setString(8, cliente.getContraseña());
            registros = sentencia.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            try {
                ConexionBD.cerrarPreparedStatement(sentencia);
                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public void separarApellidos(String[] array, PreparedStatement sentencia) throws SQLException {
        if (array.length == 1) {
            sentencia.setString(2, array[0]);
            sentencia.setString(3, "");
        } else if (array.length == 2) {
            sentencia.setString(2, array[0]);
            sentencia.setString(3, array[1]);
        }
    }

    @Override
    public List<Cliente> mostrarListado() {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(MOSTRAR_CLIENTES);
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setCodigo(resultado.getInt("idCliente"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("primerApellido") + " " + resultado.getString("segundoApellido"));
                cliente.setDni(resultado.getString("dni"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setDireccion(resultado.getString("direccion"));
                cliente.setUsuario(resultado.getString("loginUsuario"));
                cliente.setContraseña(resultado.getString("loginContrasenia"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            try {
                ConexionBD.cerrarResultado(resultado);
                ConexionBD.cerrarPreparedStatement(sentencia);
                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return clientes;
    }

    @Override
    public int editar(Cliente cliente) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        String[] apellidos = cliente.getApellido().split(" ");

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(ACTUALIZAR_CLIENTE);
            sentencia.setString(1, cliente.getNombre());
            this.separarApellidos(apellidos, sentencia);
            sentencia.setString(4, cliente.getDni());
            sentencia.setString(5, cliente.getTelefono());
            sentencia.setString(6, cliente.getDireccion());
            sentencia.setString(7, cliente.getUsuario());
            sentencia.setString(8, cliente.getContraseña());
            registros = sentencia.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            try {
                ConexionBD.cerrarPreparedStatement(sentencia);
                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    @Override
    public int eliminar(Cliente cliente) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(ELIMINAR_CLIENTE);
            sentencia.setInt(1, cliente.getCodigo());
            registros = sentencia.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            try {
                ConexionBD.cerrarPreparedStatement(sentencia);
                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }

    public List<Cliente> buscarClientes(Cliente clienteLogin) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Cliente cliente = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(BUSCAR_CLIENTE);
            sentencia.setString(1, clienteLogin.getUsuario());
            sentencia.setString(2, clienteLogin.getContraseña());
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                cliente = new Cliente();
                cliente.setCodigo(resultado.getInt("idCliente"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("primerApellido") + " " + resultado.getString("segundoApellido"));
                cliente.setDni(resultado.getString("dni"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setDireccion(resultado.getString("direccion"));
                cliente.setUsuario(resultado.getString("loginUsuario"));
                cliente.setContraseña(resultado.getString("loginContrasenia"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
            try {
                ConexionBD.cerrarResultado(resultado);
                ConexionBD.cerrarPreparedStatement(sentencia);
                ConexionBD.cerrarConexion(conexion);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return clientes;
    }
}
