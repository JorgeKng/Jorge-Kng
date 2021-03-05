package com.istloja.modelTables;

import com.istloja.modelo.Persona;
import com.istloja.modelo.Proveedores;
import com.istloja.modelo.Inventario;

/**
 *
 * @author johnp
 */
public interface ComunicacionVistaModelosTablas {
   void clickPersona(Persona p);
   void clickProveedores(Proveedores p);
   void clickInventario(Inventario p);
   
}