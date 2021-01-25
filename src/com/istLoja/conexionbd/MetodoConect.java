/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.conexionbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *jdbc:mysql://localhost:3306/mysqljdbc
 * @author Jorge Kng
 */
public class MetodoConect {
    private static final String Nombrebd = "EjrBDConnection";
    private static final String Usuario = "root";
    private static final String Kontraseña= "Jkng19";
    private   String LineaBase = "jdbc:mysql://localhost/"+Nombrebd+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
    private Connection connect = null;

    public MetodoConect() {
    }
   
    public Connection ConexionBD() {
        
        try{
        connect = DriverManager.getConnection(LineaBase,Usuario,Kontraseña);
        if(connect!= null){
            return connect;
        }
        }catch (Exception e){
            System.out.println("Error  : "+e.getMessage());
        }
     return null;   
        
        
    }
}
 