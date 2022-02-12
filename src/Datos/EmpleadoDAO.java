package Datos;
import Clases.Cliente;
import Clases.Empleado;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAO extends Dao<Empleado> {
    
    public static final String MOSTRAR_EMPLEADOS = "SELECT * FROM Empleado";
    public static final String INSERTAR_EMPLEADO = "INSERT INTO Empleado(nombreEmpleado,primerApellido,segundoApellido,dniEmpleado,loginUsuario,loginContrasenia,telefono,sueldo,idTipoEmpleado,fechaInicioContrato,fechaFinContrato)"
            + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static final String ELIMINAR_EMPLEADO = "DELETE FROM Empleado where idEmpleado = ?";
    public static final String ACTUALIZAR_EMPLEADO = "UPDATE Empleado SET nombreEmpleado= ?, primerApellido= ?, segundoApellido= ?, dniEmpleado= ?, loginUsuario= ?, loginContrasenia= ?, telefono= ?, sueldo= ?, idTipoEmpleado= ?, fechaInicioContrato= ?, fechaFinContrato= ? WHERE idEmpleado = ?";
    
    @Override
    public int insertar(Empleado empleado) {
        //String primerApellido = "";
        //String segundoApellido = "";
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        String[] apellidos = empleado.getApellido().split(" ");
// (apellidos[1] != " ")? apellidos[1] : ""
        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(INSERTAR_EMPLEADO);
            sentencia.setString(1, empleado.getNombre());
            this.separarApellidos(apellidos, sentencia);
            sentencia.setString(4, empleado.getDni());
            sentencia.setString(5, empleado.getUsuario());
            sentencia.setString(6, empleado.getContraseña());
            sentencia.setString(7, empleado.getTelefono());
            sentencia.setDouble(8, empleado.getSueldo());
            sentencia.setInt(9, empleado.getTipoEmpleado());
            sentencia.setString(10, empleado.getFechaInicioContrato());
            sentencia.setString(11, empleado.getFechaFinContrato());
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
    
    public void separarApellidos(String[] array, PreparedStatement sentencia) throws SQLException{
             if(array.length==1){
                sentencia.setString(2, array[0]);
                sentencia.setString(3, "");
            }else if(array.length == 2){
                sentencia.setString(2, array[0]);
                sentencia.setString(3, array[1]);
            }
    }

    @Override
    public List<Empleado> mostrarListado() {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Empleado empleado = null;
        List<Empleado> empleados = new ArrayList<>();

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(MOSTRAR_EMPLEADOS);
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                empleado = new Empleado();
                empleado.setCodigo(resultado.getInt("idEmpleado"));
                empleado.setNombre(resultado.getString("nombreEmpleado"));
                empleado.setApellido(resultado.getString("primerApellido") + " " + resultado.getString("segundoApellido"));
                empleado.setDni(resultado.getString("dniEmpleado"));
                empleado.setUsuario(resultado.getString("loginUsuario"));
                empleado.setContraseña(resultado.getString("loginContrasenia"));
                empleado.setTelefono(resultado.getString("telefono"));
                empleado.setSueldo(resultado.getDouble("sueldo"));
                empleado.setTipoEmpleado(resultado.getInt("idTipoEmpleado"));
                empleado.setFechaInicioContrato(resultado.getString("fechaInicioContrato"));
                empleado.setFechaFinContrato(resultado.getString("fechaFinContrato"));
                empleados.add(empleado);
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

        return empleados;
    }

    @Override
    public int editar(Empleado empleado) {
        //String primerApellido = "";
        //String segundoApellido = "";
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;
        String[] apellidos = empleado.getApellido().split(" ");

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(ACTUALIZAR_EMPLEADO);
            sentencia.setString(1, empleado.getNombre());
            this.separarApellidos(apellidos, sentencia);
            sentencia.setString(4, empleado.getDni());
            sentencia.setString(5, empleado.getUsuario());
            sentencia.setString(6, empleado.getContraseña());
            sentencia.setString(7, empleado.getTelefono());
            sentencia.setDouble(8, empleado.getSueldo());
            sentencia.setInt(9, empleado.getTipoEmpleado());
            sentencia.setString(10, empleado.getFechaInicioContrato());
            sentencia.setString(11, empleado.getFechaFinContrato());
            sentencia.setInt(12, empleado.getCodigo());
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
    public int eliminar(Empleado empleado) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(ELIMINAR_EMPLEADO);
            sentencia.setInt(1, empleado.getCodigo());
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
}
