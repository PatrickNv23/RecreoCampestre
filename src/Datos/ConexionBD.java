
package Datos;

import java.sql.*;


public class ConexionBD {
    private static final String ULR = "jdbc:sqlserver://DESKTOP-OBH5CT8\\PATRICKNV23:1433;databaseName=productoRestaurante;IntegratedSecurity=true";
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(ULR);
    }
    
    public static void cerrarConexion(Connection conexion) throws SQLException{
        conexion.close();
    }
    
    public static void cerrarConsulta(Statement consulta) throws SQLException{
        consulta.close();
    }
    
    
    public static void cerrarPreparedStatement(PreparedStatement consulta) throws SQLException{
        consulta.close();
    }
    
    public static void cerrarResultado(ResultSet resultado) throws SQLException{
        resultado.close();
    }
    
    
    
    
    
    
    
    
}
