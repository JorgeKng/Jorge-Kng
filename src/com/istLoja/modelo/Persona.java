/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.modelo;

/**
 *
 * @author Jorge Kng
 */
public class Persona {
    
    private int idPersona;
    private String Cédula;
    private String Nombre;
    private String Apellido;
    private String Teléfono;
    private int idEditar;
    private int IdEliminar;
    

    public Persona(String Cédula, String Nombre, String Apellido, String Teléfono) {
        this.Cédula = Cédula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Teléfono = Teléfono;
    }

    public Persona(String Nombre, String Apellido, int idEditar) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.idEditar = idEditar;
    }

   

    public Persona(int IdEliminar) {
        this.IdEliminar = IdEliminar;
    }

    public int getIdEditar() {
        return idEditar;
    }

    public void setIdEditar(int idEditar) {
        this.idEditar = idEditar;
    }

    public int getIdEliminar() {
        return IdEliminar;
    }

    public void setIdEliminar(int IdEliminar) {
        this.IdEliminar = IdEliminar;
    }

    

    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getCédula() {
        return Cédula;
    }

    public void setCédula(String Cédula) {
        this.Cédula = Cédula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String Teléfono) {
        this.Teléfono = Teléfono;
    }
    
    
}
