/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istLoja.modelTables;

import com.istLoja.vistas.GestionContable;
import com.istLoja.modelo.Productos;
import java.util.List;
import javax.swing.event.EventListenerList;
import javax.swing.table.AbstractTableModel;

public class ModelTableProducto extends AbstractTableModel{
    private String[] m_colNames = {"CÓDIGO", "NOMBRES", "Pvp Compra", "Pvp Venta", "CANTIDAD"};
    private List<Productos> producto;
    private GestionContable gContable;

    public ModelTableProducto(List<Productos> producto, GestionContable gContable) {
        this.producto = producto;
        this.gContable = gContable;
    }

    @Override
    public int getRowCount() {
        return producto.size();
    }

    @Override
    public int getColumnCount() {
        return m_colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Productos product = producto.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return product.getCodigo();
            case 1:
                return product.getNombre();
            case 2:
                return product.getPrecioCompra();
            case 3:
                return product.getPrecioVenta();
            case 4:
                return product.getCantidad();
            
        }
        return new String();
    }

    public String getM_colNames(int column) {
        return m_colNames[column];
    }

    public void setM_colNames(String[] m_colNames) {
        this.m_colNames = m_colNames;
    }

    public List<Productos> getProducto() {
        return producto;
    }

    public void setProducto(List<Productos> producto) {
        this.producto = producto;
    }

    public GestionContable getgContable() {
        return gContable;
    }

    public void setgContable(GestionContable gContable) {
        this.gContable = gContable;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }
    
    
    
}
