/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.Utilidades;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Jorge Kng
 */
public class Utilidad {
public boolean validadorDeCedula(String cedula) {
    boolean cedulaCorrecta = false;
 
    try {
 
    if (cedula.length() == 10) // ConstantesApp.LongitudCedula
    {
    int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
    if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
    int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
    int verificador = Integer.parseInt(cedula.substring(9,10));
    int suma = 0;
    int digito = 0;
    for (int i = 0; i < (cedula.length() - 1); i++) {
        digito = Integer.parseInt(cedula.substring(i, i + 1))* coefValCedula[i];
        suma += ((digito % 10) + (digito / 10));
    }
 
    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
        cedulaCorrecta = true;
    }
    else if ((10 - (suma % 10)) == verificador) {
        cedulaCorrecta = true;
    } else {
        cedulaCorrecta = false;
    }
    } else {
    cedulaCorrecta = false;
    }
    } else {
    cedulaCorrecta = false;
    }
    } catch (NumberFormatException nfe) {
    cedulaCorrecta = false;
        } catch (Exception err) {
    System.out.println("Una excepcion ocurrio en el proceso de validadcion");
    cedulaCorrecta = false;
    }
 
    if (!cedulaCorrecta) {
        System.out.println("La Cédula ingresada es Incorrecta");
    }
    return cedulaCorrecta;
    }
public boolean validarCorreo(String Correo){
        // Patrón para validar el email
        Pattern pattern = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        boolean Valido = false;
 
        Matcher mather = pattern.matcher(Correo);
 
        if (mather.find() == true) {
            
            Valido = true;
        } else {
            
            Valido = false;
    }
        return Valido;
}
public boolean ValidarTelef(String telefono){
    
       
       
        if(telefono.isEmpty()){
            return false;
        }else {
            if(telefono.length()>10&&telefono.length()<7){
                return false;
                
            }
        }
         try{
           int Numero = Integer.parseInt(telefono);
           return true; 
        }catch(NumberFormatException e){
            System.out.println("Error "+e);
            return false;
        }       

    }
public boolean ValidarTelef0(String telefono){
    Pattern pattern = Pattern
                .compile("^0");
        Matcher mather = pattern.matcher(telefono);
        if (mather.find() == true) {
            
            return true;
        }else{
            return false;
        }
}



    
} 


