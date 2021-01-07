/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conection;


/**
 *
 * @author Jorge Kng
 */

public class ConectionBd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando conexion .. ");
        
        MetodoConect Conexion = new MetodoConect();
        if(Conexion.ConexionBD()!= null){
            System.out.println("  -- Conexion Exitosa -- ");
        }else{
            System.out.println("  ***** Fallo la conexion ******  ");
        }
        
    }

        
    
    
}
