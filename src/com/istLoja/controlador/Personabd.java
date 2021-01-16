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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    public List<Persona> obtenerPersonas(){
        Connection com = null;
        Statement stm = null;
        //Sentensia del konektor jdbs para obtener balores de la base de datos
        ResultSet rs = null;
        String sql = "SELECT * FROM ejrbdconnection.persona;";
        
        List<Persona> ListaPersona = new ArrayList<Persona>();
        
        try{
            com = new MetodoConect().ConexionBD();
            stm = com.createStatement();
            rs = stm.executeQuery(sql);
            
            while(rs.next()){
                Persona p = new Persona();
                p.setIdPersona(rs.getInt(1));
                p.setCédula(rs.getString(2));
                p.setNombre(rs.getNString(3));
                p.setApellido(rs.getNString(4));
                p.setTeléfono(rs.getNString(5));
                ListaPersona.add(p);
            }
            stm.close();
            rs.close();
            com.close();
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
            
        }
        return ListaPersona;
    }
}
