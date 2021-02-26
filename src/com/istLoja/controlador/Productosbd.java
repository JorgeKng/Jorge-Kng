/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.controlador;

import com.istLoja.modelo.Productos;
import com.istloja.conexionbd.Conexion;
import com.istloja.modelo.Persona;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Productosbd {
     public boolean registrarProducto(Productos producto) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        //INSERT INTO `ejercicio`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('1', '1104268899', 'John', 'Solano', 'Loja', 'jpsolanoc@gmail.com', '072587392');
        String sql = "INSERT INTO `ejercicio`.`inventario` (`cod_pro`, `descripción`, `precio_compra`, `precio_venta`, `can_producto`) VALUES('" + producto.getCodigo() + "', '" + producto.getNombre() + "', '" + producto.getPrecioCompra() + "', '" + producto.getPrecioVenta() + "', '" + producto.getCantidad() + "' );";
        try {
            //Es una instancia de la conexion previamente creada.
            Conexion conexion = new Conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }
    //ACtualizar la persona e la base de datos.
    public boolean actualizar(Productos producto) {
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `ejercicio`.`inventario` SET `codigo_pro` = '" + producto.getCodigo() + "', `descripcion` = '" + producto.getNombre() + "', `precio_compra` = '" + producto.getPrecioCompra() + "', `precio_venta` = '" + producto.getPrecioVenta() + "', `can_producto` = '" + producto.getCantidad() + "' WHERE (`codigo_pro` = '" + producto.getCodigo() + "');";
        try {
            Conexion con = new Conexion();
            connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }
    //Eliminar una persona en base al ID de la persona seleccionada de la base de datos.
    public boolean eliminar(Productos producto) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `ejercicio`.`inventario` WHERE (`codigo_pro` = '" + producto.getCodigo() + "');";
        try {
            connect = new Conexion().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }
    //Sirve para traer todos los registros de persona de la base de datos 
    public List<Productos> obtenerProductos() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM ejercicio.inventario;";
        List<Productos> listaProductos = new ArrayList<Productos>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Productos c = new Productos();
                c.setCodigo(rs.getString(1));
                c.setNombre(rs.getString(2));
                c.setPrecioCompra(rs.getString(3));
                c.setPrecioVenta(rs.getString(4));
                c.setCantidad(rs.getString(5));
                
                listaProductos.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaProductos;
    }
}
