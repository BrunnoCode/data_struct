package com.example.dal;

import java.sql.*;

public class ModuleConnect {

    public static Connection conector(){
        java.sql.Connection conexion = null;

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/neivaclean";
        String user = "bbotelho";
        String password = "HELLOfriend42";

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, user, password);
            return conexion;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }
}
