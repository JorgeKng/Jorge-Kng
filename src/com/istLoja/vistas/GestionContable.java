
package com.istLoja.vistas;



import com.istloja.controlador.Inventariodb;
import com.istloja.controlador.Personabd;
import com.istloja.controlador.Proveedoresdb;

import com.istloja.modelTables.ModelTablePersonaV2;
import com.istloja.modelo.Persona;
import com.istloja.modelo.Proveedores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.istloja.modelTables.ComunicacionVistaModelosTablas;
import com.istloja.modelTables.ModelTableInventario;
import com.istloja.modelTables.ModelTableProveedores;
import com.istloja.modelo.Inventario;
import com.istloja.utilidades.Utilidades;

/**
 *
 * @author Jorge Kng
 */
public class GestionContable extends javax.swing.JFrame  {

    private Utilidades utilidades;
    private  Personabd controladorPersona;
    private Persona personaEditarEliminar;
    private GestionPersona gestionPersona;
    //private ModelTablePersona modelTablePersona;
    private ModelTablePersonaV2 modelTablePersonaV2;
    private ModelTableProveedores modelTableProveedores;
    private ModelTableInventario modelTableInventario;
    private Proveedoresdb controladorProveedor;
    private Inventariodb controladorInventario;
    private Inventario inventarioSeleccionado;
    
    public GestionContable() {
        controladorPersona = new Personabd();
        controladorProveedor = new Proveedoresdb();
        controladorInventario = new Inventariodb();
        // modelTablePersona = new ModelTablePersona(controladorPersona.obtenerPersonas(),this);
        modelTablePersonaV2 = new ModelTablePersonaV2(controladorPersona.obtenerPersonas(), this);
        modelTableProveedores = new ModelTableProveedores(controladorProveedor.obtenerProveedores(), this);
        modelTableInventario = new ModelTableInventario(controladorInventario.obtenerProductosInventario(), this);
        initComponents();
        utilidades = new Utilidades();

        gestionPersona = new GestionPersona(txtCedula, txtNombres, txtApellidos, txtDireccion, txtCorreo, txtTelefono, utilidades, this);

    }

     

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        BuscarCedula = new javax.swing.JButton();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        BuscarTelefono = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        BtnLimpiarClientes = new javax.swing.JButton();
        lblbuscar = new javax.swing.JLabel();
        comboParametroBusqueda = new javax.swing.JComboBox<>();
        txtParametroBusqueda = new javax.swing.JTextField();
        BuscarPersona = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtInventarioCodProducto = new javax.swing.JTextField();
        txtInventarioDescripcion = new javax.swing.JTextField();
        txtInventarioPrecioCompra = new javax.swing.JTextField();
        txtInventarioPrecioVenta = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtInventarioCantidadProdcutos = new javax.swing.JTextField();
        btnInventarioCrear = new javax.swing.JButton();
        btnInventarioEditar = new javax.swing.JButton();
        btnInventarioEliminar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        txtInventarioBusqueda = new javax.swing.JTextField();
        comboBoxInventarioBusqueda = new javax.swing.JComboBox<>();
        btnInventaripBusqueda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtRucProveedores = new javax.swing.JTextField();
        txtRazonSocialProveedores = new javax.swing.JTextField();
        txtTipoActividadProveedores = new javax.swing.JTextField();
        txtNombreRepresentateLegalProveedores = new javax.swing.JTextField();
        txtApellidosRepresentateLegalProveedores = new javax.swing.JTextField();
        txtTelefonoProveedores = new javax.swing.JTextField();
        txtCorrreoProveedores = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Registro para Personas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cédula: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Correo: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Teléfono: ");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        BuscarCedula.setBackground(new java.awt.Color(255, 255, 255));
        BuscarCedula.setText("Buscar");
        BuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarCedulaActionPerformed(evt);
            }
        });

        BuscarTelefono.setText("Buscar");
        BuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTelefonoActionPerformed(evt);
            }
        });

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        BtnLimpiarClientes.setText("Limpiar");
        BtnLimpiarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarClientesActionPerformed(evt);
            }
        });

        lblbuscar.setText("Buscar Cliente");

        comboParametroBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula", "Nombres", "Apellido", "Telefono", "Correo" }));
        comboParametroBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboParametroBusquedaActionPerformed(evt);
            }
        });

        txtParametroBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParametroBusquedaActionPerformed(evt);
            }
        });

        BuscarPersona.setText("Buscar");
        BuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarPersonaActionPerformed(evt);
            }
        });

        jButton1.setText("Traer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable3.setModel(modelTablePersonaV2);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarPersona))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtNombres))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(3, 3, 3)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(BuscarCedula)
                                    .addGap(18, 18, 18)
                                    .addComponent(BtnLimpiarClientes))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtApellidos))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDireccion))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCorreo))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefono)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BuscarTelefono))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Guardar)
                                    .addGap(117, 117, 117)
                                    .addComponent(Editar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Eliminar)
                                    .addGap(11, 11, 11))))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCedula)
                    .addComponent(BtnLimpiarClientes)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarTelefono))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Editar)
                    .addComponent(Eliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbuscar)
                    .addComponent(comboParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarPersona))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas", jPanel4);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Registro Productos");

        jLabel9.setText("Código: ");

        jLabel10.setText("Nombre Producto:");

        jLabel11.setText("Pvp Compra:");

        jLabel12.setText("Pvp Venta:");

        jLabel13.setText("Cantidad:");

        txtInventarioCodProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInventarioCodProductoActionPerformed(evt);
            }
        });

        txtInventarioDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInventarioDescripcionActionPerformed(evt);
            }
        });

        jLabel14.setText("$");

        jLabel15.setText("$");

        txtInventarioCantidadProdcutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInventarioCantidadProdcutosActionPerformed(evt);
            }
        });

        btnInventarioCrear.setText("Crear");
        btnInventarioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioCrearActionPerformed(evt);
            }
        });

        btnInventarioEditar.setText("Editar");
        btnInventarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioEditarActionPerformed(evt);
            }
        });

        btnInventarioEliminar.setText("Eliminar");
        btnInventarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioEliminarActionPerformed(evt);
            }
        });

        jLabel16.setText("U.");

        TablaProductos.setModel(modelTableInventario);
        jScrollPane4.setViewportView(TablaProductos);

        jLabel26.setText("Buscador:");

        comboBoxInventarioBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInventaripBusqueda.setText("Buscar Producto");
        btnInventaripBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventaripBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtInventarioCodProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(txtInventarioDescripcion, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInventarioCrear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInventarioEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnInventarioEliminar, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(comboBoxInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtInventarioCantidadProdcutos)
                                    .addComponent(txtInventarioPrecioCompra, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInventarioPrecioVenta, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(110, 110, 110))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInventaripBusqueda))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel8)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtInventarioPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtInventarioPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtInventarioCantidadProdcutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtInventarioCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInventarioCrear))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(txtInventarioDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnInventarioEditar))
                        .addGap(18, 18, 18)
                        .addComponent(btnInventarioEliminar)
                        .addGap(82, 82, 82)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventaripBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Inventario", jPanel3);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Registro de Proveedores");

        jLabel18.setText("RUC:");

        jLabel19.setText("Razón Social:");

        jLabel20.setText("Tipo Actividad:");

        jLabel21.setText("Nombre del representante legal:");

        jLabel22.setText("Apellido del representante legal:");

        jLabel23.setText("Teléfono:");

        jLabel24.setText("Correo:");

        jButton2.setText("Guardar");

        jButton3.setText("Editar");

        jButton4.setText("Eliminar");

        jLabel25.setText("Buscador");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("Buscar Proveedor");

        jTable2.setModel(modelTableProveedores);
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRucProveedores)
                            .addComponent(txtRazonSocialProveedores)
                            .addComponent(txtTipoActividadProveedores)
                            .addComponent(txtNombreRepresentateLegalProveedores)
                            .addComponent(txtApellidosRepresentateLegalProveedores)
                            .addComponent(txtTelefonoProveedores)
                            .addComponent(txtCorrreoProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(199, 199, 199))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtRucProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtRazonSocialProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtTipoActividadProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtNombreRepresentateLegalProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtApellidosRepresentateLegalProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtTelefonoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtCorrreoProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPane1.addTab("Proveedores", jPanel2);

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        // TODO add your handling code here:
        if (controladorPersona.getPersonaCedula(txtCedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "La persona con ese número de cédula ya se encuentra registrada en el sistema.");
        } else {
            Persona personaGuardar = gestionPersona.guardarEditar();
            if (personaGuardar != null) {
                if (controladorPersona.registrarPersona(personaGuardar)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona registrada en el sistema.");
                    gestionPersona.limpiarCamposPersona();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede guardar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
          if (personaEditarEliminar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestionPersona.guardarEditar();
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditarEliminar.getIdPersona());
            if (controladorPersona.actualizar(personaEditarLocal)) {
                JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                gestionPersona.limpiarCamposPersona();
                personaEditarEliminar = null;
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la persona", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_EditarActionPerformed
     
     public void buscarPersonaPorCedula() {
        Persona persona = controladorPersona.getPersonaCedula(txtCedula.getText());
        if (persona != null) {
            txtNombres.setText(persona.getNombre());
            txtApellidos.setText(persona.getApellidos());
            txtDireccion.setText(persona.getDireccion());
            txtCorreo.setText(persona.getCorreo());
            txtTelefono.setText(persona.getTelefono());
            personaEditarEliminar = persona;
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro la persona con ese número de cédula en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtCedula.setText("");
            txtCedula.requestFocus();
        }
    }
    private void BuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarCedulaActionPerformed
         buscarPersonaPorCedula();
    }//GEN-LAST:event_BuscarCedulaActionPerformed

    private void BuscarTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTelefonoActionPerformed
        // TODO add your handling code here:
        Persona persona = controladorPersona.getPersonaTelefono(txtTelefono.getText());
        if (persona != null) {
            txtNombres.setText(persona.getNombre());
            txtApellidos.setText(persona.getApellidos());
            txtDireccion.setText(persona.getDireccion());
            txtCorreo.setText(persona.getCorreo());
            txtCedula.setText(persona.getCedula());
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontro la persona con ese número de teléfono en la base de datos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtTelefono.setText("");
            txtTelefono.requestFocus();
        }
    }//GEN-LAST:event_BuscarTelefonoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        if (personaEditarEliminar != null) {
            if (controladorPersona.eliminar(personaEditarEliminar)) {
                JOptionPane.showMessageDialog(rootPane, "Persona eliminada con éxito del sitema.");
                gestionPersona.limpiarCamposPersona();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar la persona seleccionada.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay persona seleccionada para eliminar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void BtnLimpiarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarClientesActionPerformed
        // TODO add your handling code here:
        limpiarCamposPersonas();
    }//GEN-LAST:event_BtnLimpiarClientesActionPerformed

    private void BuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarPersonaActionPerformed
        // TODO add your handling code here:
         List<Persona> personaNombre = (List<Persona>) controladorPersona.getPersonaCedula(txtParametroBusqueda.getText());
        modelTablePersonaV2.setPersonas(personaNombre);
        modelTablePersonaV2.fireTableDataChanged();
    }//GEN-LAST:event_BuscarPersonaActionPerformed

    private void comboParametroBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboParametroBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboParametroBusquedaActionPerformed

    private void txtParametroBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParametroBusquedaActionPerformed
        // TODO add your handling code here:
        buscarCliente(txtParametroBusqueda.getText());
    }//GEN-LAST:event_txtParametroBusquedaActionPerformed

    private void txtInventarioCodProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInventarioCodProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInventarioCodProductoActionPerformed

    private void txtInventarioCantidadProdcutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInventarioCantidadProdcutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInventarioCantidadProdcutosActionPerformed

    private void btnInventarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioCrearActionPerformed
        Inventario i = new Inventario();
        i.setCodProducto(txtInventarioCodProducto.getText());
        i.setDescripcion(txtInventarioDescripcion.getText());
        i.setPrecioCompra(txtInventarioPrecioCompra.getText());
        i.setPrecioVenta(txtInventarioPrecioVenta.getText());
        i.setCanProductos(txtInventarioCantidadProdcutos.getText());
        controladorInventario.registrarProducto(i);
        modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventario());
        modelTableInventario.fireTableDataChanged();
    }//GEN-LAST:event_btnInventarioCrearActionPerformed

    private void txtInventarioDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInventarioDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInventarioDescripcionActionPerformed

    private void btnInventarioEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioEditarActionPerformed
        // TODO add your handling code here:
        if (inventarioSeleccionado == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una propducto seleccionado para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (inventarioSeleccionado != null) {
            inventarioSeleccionado = valoresActualizarInventario(inventarioSeleccionado);
            if (controladorInventario.actualizarInventario(inventarioSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Producto editado con exito del sitema.");
                limpiarInventario();
                inventarioSeleccionado = null;
                modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventario());
                modelTableInventario.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede editar la Producto", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnInventarioEditarActionPerformed

    private void btnInventarioEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioEliminarActionPerformed
        // TODO add your handling code here:
        if (inventarioSeleccionado != null) {
            if (controladorInventario.eliminarInventario(inventarioSeleccionado)) {
                JOptionPane.showMessageDialog(rootPane, "Producto eliminado con éxito del sitema.");
                limpiarInventario();
                inventarioSeleccionado = null;
                modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventario());
                modelTableInventario.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el producto seleccionado.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay producto seleccionada para eliminar.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnInventarioEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         List<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditarEliminar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtCedula.setText(personaEditarEliminar.getCedula());
        txtNombres.setText(personaEditarEliminar.getNombre());
        txtApellidos.setText(personaEditarEliminar.getApellidos());
        txtDireccion.setText(personaEditarEliminar.getDireccion());
        txtCorreo.setText(personaEditarEliminar.getCorreo());
        txtTelefono.setText(personaEditarEliminar.getTelefono());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnInventaripBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventaripBusquedaActionPerformed
        System.out.println("Combo" + comboBoxInventarioBusqueda.getSelectedIndex());
        switch (comboBoxInventarioBusqueda.getSelectedIndex()) {
            case 0://Codigo
                modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventarioCodigo(txtInventarioBusqueda.getText()));
                modelTableInventario.fireTableDataChanged();
                break;
            case 1://7Descripcion
                modelTableInventario.setInventarios(controladorInventario.obtenerProductosInventarioDescripcion(txtInventarioBusqueda.getText()));
                modelTableInventario.fireTableDataChanged();
                break;
        }
    }//GEN-LAST:event_btnInventaripBusquedaActionPerformed
    private Inventario valoresActualizarInventario(Inventario i) {
        i.setCodProducto(txtInventarioCodProducto.getText());
        i.setDescripcion(txtInventarioDescripcion.getText());
        i.setPrecioCompra(txtInventarioPrecioCompra.getText());
        i.setPrecioVenta(txtInventarioPrecioVenta.getText());
        i.setCanProductos(txtInventarioCantidadProdcutos.getText());
        return i;
    }

//Metodo para limpiar campos
    void limpiarCamposProveedor() {
        txtRucProveedores.setText("");
        txtRazonSocialProveedores.setText("");
        txtTipoActividadProveedores.setText("");
        txtNombreRepresentateLegalProveedores.setText("");
        txtApellidosRepresentateLegalProveedores.setText("");
        txtTelefonoProveedores.setText("");
        txtCorrreoProveedores.setText("");
    }

    void limpiarInventario() {
        txtInventarioCodProducto.setText("");
        txtInventarioDescripcion.setText("");
        txtInventarioPrecioCompra.setText("");
        txtInventarioPrecioVenta.setText("");
        txtInventarioCantidadProdcutos.setText("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLimpiarClientes;
    private javax.swing.JButton BuscarCedula;
    private javax.swing.JButton BuscarPersona;
    private javax.swing.JButton BuscarTelefono;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnInventarioCrear;
    private javax.swing.JButton btnInventarioEditar;
    private javax.swing.JButton btnInventarioEliminar;
    private javax.swing.JButton btnInventaripBusqueda;
    private javax.swing.JComboBox<String> comboBoxInventarioBusqueda;
    private javax.swing.JComboBox<String> comboParametroBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosRepresentateLegalProveedores;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorrreoProveedores;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtInventarioBusqueda;
    private javax.swing.JTextField txtInventarioCantidadProdcutos;
    private javax.swing.JTextField txtInventarioCodProducto;
    private javax.swing.JTextField txtInventarioDescripcion;
    private javax.swing.JTextField txtInventarioPrecioCompra;
    private javax.swing.JTextField txtInventarioPrecioVenta;
    private javax.swing.JTextField txtNombreRepresentateLegalProveedores;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txtRazonSocialProveedores;
    private javax.swing.JTextField txtRucProveedores;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoProveedores;
    private javax.swing.JTextField txtTipoActividadProveedores;
    // End of variables declaration//GEN-END:variables

    public void clickPersona(Persona p) {
        txtCedula.setText(p.getCedula());
        txtNombres.setText(p.getNombre());
        txtApellidos.setText(p.getApellidos());
        txtDireccion.setText(p.getDireccion());
        txtTelefono.setText(p.getDireccion());
        txtCorreo.setText(p.getCorreo());
    }

    private void buscarCliente(String text) {
        switch (comboParametroBusqueda.getItemCount()) {

        }
    }

    public void clickProveedores(Proveedores p) {
        txtRucProveedores.setText(p.getRuc());
        txtRazonSocialProveedores.setText(p.getRazonSocial());
        txtTipoActividadProveedores.setText(p.getTipoActividad());
        txtNombreRepresentateLegalProveedores.setText(p.getNombreRepresentanteLegal());
        txtApellidosRepresentateLegalProveedores.setText(p.getApellidosRepresentanteLegal());
        txtTelefonoProveedores.setText(p.getTelefono());
        txtCorrreoProveedores.setText(p.getCorreo());

    }

    public void clickInventario(Inventario i) {
        inventarioSeleccionado = i;
        txtInventarioCodProducto.setText(i.getCodProducto());
        txtInventarioDescripcion.setText(i.getDescripcion());
        txtInventarioPrecioCompra.setText(i.getPrecioCompra());
        txtInventarioPrecioVenta.setText(i.getPrecioVenta());
        txtInventarioCantidadProdcutos.setText(i.getCanProductos());
    }

    private void limpiarCamposPersonas() {
            txtNombres.setText("");
            txtApellidos.setText("");
            txtDireccion.setText("");
            txtCorreo.setText("");
            txtCedula.setText("");
    }

   
}
