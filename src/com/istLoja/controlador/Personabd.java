/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.controlador;
import com.istLoja.modelo.Persona;
import java.sql.Statement;
import com.istLoja.conexionbd.MetodoConect;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Jorge Kng
 */
public class Personabd {
    
    public boolean registrarPersona(Persona persona){
        boolean registrar = false;
        Statement stm = null;
        Connection com = null;
        String sql = "INSERT INTO `ejrbdconnection`.`persona` (`idPersona`, `Cédula`, `Nombre`, `Apellido`, `Teléfono`) VALUES ('"+String.valueOf(persona.getIdPersona())+"', '"+persona.getCédula()+"', '"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getTeléfono()+"')";
        
        try{
       
            MetodoConect conexion = new MetodoConect();
            com = conexion.ConexionBD();
            stm = com.createStatement();
            boolean execute = stm.execute(sql);
            registrar = true;
            stm.close();
            com.close();
       
        }catch (SQLException e){
                       
            System.out.println("Error es esto : "+e.getMessage());
        }                      
        return false;
    }
    
    public boolean editarPersona(Persona personaeditar){
        boolean registrar = false;
        Statement stm = null;
        Connection com = null;
        String sql = "UPDATE `ejrbdconnection`.`persona` SET `Nombre` = '"+personaeditar.getNombre()+"', `Apellido` = '"+personaeditar.getApellido()+"' WHERE (`idPersona` = '"+personaeditar.getIdEditar()+"');";
        
        try{
       
            MetodoConect conexion = new MetodoConect();
            com = conexion.ConexionBD();
            stm = com.createStatement();
            boolean execute = stm.execute(sql);
            registrar = true;
            stm.close();
            com.close();
       
        }catch (SQLException e){
                       
            System.out.println("Error es esto : "+e.getMessage());
        }                      
        return false;
    }
    public boolean eliminarPersona(Persona personaeliminar){
        boolean registrar = false;
        Statement stm = null;
        Connection com = null;
        String sql = "DELETE FROM `ejrbdconnection`.`persona` WHERE (`idPersona` = '"+personaeliminar.getIdEliminar()+"')";
        
        try{
       
            MetodoConect conexion = new MetodoConect();
            com = conexion.ConexionBD();
            stm = com.createStatement();
            boolean execute = stm.execute(sql);
            registrar = true;
            stm.close();
            com.close();
       
        }catch (SQLException e){
                       
            System.out.println("Error es esto : "+e.getMessage());
        }                      
return false;
}
}
