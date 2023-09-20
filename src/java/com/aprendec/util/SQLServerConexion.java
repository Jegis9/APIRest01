package com.aprendec.util;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLServerConexion {
        static {
        try {
            // CARGAR EL CONTROLADOR DE BD
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (Exception e) {
            System.out.println("[SqlServerConexion] Error al cargar el driver de conexión");
            e.printStackTrace();
        }
    }
 
    public static Connection obtenerConexion() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(
                    "jdbc:sqlserver://DESKTOP-275P7G9:1433;databasename=ReealoDB2019", "sa", "admin123");
        } catch (Exception e) {
            System.out.println("[SqlServerConexion] Error al obtener la conexión");
            e.printStackTrace();
        }
        return con;
    }
}
