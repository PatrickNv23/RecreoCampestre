
package Datos;

import Clases.Empleado;
import Clases.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO extends Dao<Producto> {
     public static final String MOSTRAR_PRODUCTOS = "SELECT * FROM Producto";
    public static final String INSERTAR_PRODUCTO = "INSERT INTO Producto(nombre,precioVenta,precioCompra,descripcion,idTipoProducto,cantidad)"
            + "values (?, ?, ?, ?, ?, ?)";
    public static final String ACTUALIZAR_PRODUCTO = "UPDATE Producto SET nombre= ?, precioVenta= ?, precioCompra= ?, descripcion= ?, idTipoProducto= ?, cantidad= ? WHERE idProducto = ?";
     public static final String ELIMINAR_PRODUCTO = "DELETE FROM Producto where idProducto = ?";
     
     @Override
    public int insertar(Producto producto) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(INSERTAR_PRODUCTO);
            sentencia.setString(1, producto.getNombre());
            sentencia.setDouble(2, producto.getPrecioVenta());
            sentencia.setDouble(3, producto.getPrecioCompra());
            sentencia.setString(4, producto.getDescripcion());
            sentencia.setInt(5, producto.getTipo());
            sentencia.setInt(6, producto.getCantidadDisponible());
            
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
    public List<Producto> mostrarListado() {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado = null;
        Producto producto = null;
        List<Producto> productos = new ArrayList<>();

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(MOSTRAR_PRODUCTOS);
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt("idProducto"));
                producto.setNombre(resultado.getString("nombre"));
                producto.setPrecioVenta(resultado.getDouble("precioVenta"));
                producto.setPrecioCompra(resultado.getDouble("precioCompra"));
                producto.setDescripcion(resultado.getString("descripcion"));
                producto.setTipo(resultado.getInt("idTipoProducto"));
                producto.setCantidadDisponible(resultado.getInt("cantidad"));
                productos.add(producto);
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

        return productos;
    }

     @Override
    public int editar(Producto producto) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(ACTUALIZAR_PRODUCTO);
            sentencia.setString(1, producto.getNombre());
            sentencia.setDouble(2, producto.getPrecioVenta());
            sentencia.setDouble(3, producto.getPrecioCompra());
            sentencia.setString(4, producto.getDescripcion());
            sentencia.setInt(5, producto.getTipo());
            sentencia.setInt(6, producto.getCantidadDisponible());
            sentencia.setInt(7, producto.getCodigo());
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
    public int eliminar(Producto producto) {
        Connection conexion = null;
        PreparedStatement sentencia = null;
        int registros = 0;

        try {
            conexion = ConexionBD.getConexion();
            sentencia = conexion.prepareStatement(ELIMINAR_PRODUCTO);
            sentencia.setInt(1, producto.getCodigo());
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
