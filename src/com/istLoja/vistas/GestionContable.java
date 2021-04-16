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
import java.sql.Date;
import java.text.DecimalFormat;

/**
 *
 * @author Jorge Kng
 */
public class GestionContable extends javax.swing.JFrame implements ComunicacionVistaModelosTablas {

    private Utilidades utilidades;
    private Personabd controladorPersona;
    private Persona personaEditarEliminar;
    private Proveedores personaGuardar;
    //private GestionPersona gestionPersona;
    private ModelTablePersonaV2 modelTablePersonaV2;
    private ModelTableProveedores modelTableProveedores;
    private ModelTableInventario modelTableInventario;
    private Proveedoresdb controladorProveedor;
    private Inventariodb controladorInventario;
    private Inventario inventarioSeleccionado;
    private Gestion gestionPersona;
    DecimalFormat formato1;

    public GestionContable() {
        System.out.println("Entrò al konstruktor");
        formato1 = new DecimalFormat("#.00");
        controladorPersona = new Personabd();
        personaGuardar = new Proveedores();
        controladorProveedor = new Proveedoresdb();
        controladorInventario = new Inventariodb();
        modelTablePersonaV2 = new ModelTablePersonaV2(controladorPersona.obtenerPersonas(), this);
        modelTableProveedores = new ModelTableProveedores(controladorProveedor.obtenerProveedores(), this);
        modelTableInventario = new ModelTableInventario(controladorInventario.obtenerProductosInventario(), this);

        initComponents();
        utilidades = new Utilidades();

        gestionPersona = new Gestion(txtCedula, txtNombres, txtApellidos, txtDireccion, txtCorreo, txtTelefono, utilidades, this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
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
        BotonTraer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel27 = new javax.swing.JLabel();
        radioCedula = new javax.swing.JRadioButton();
        radioPasaporte = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        txtPvpSinIva = new javax.swing.JTextField();
        txtPvpConIva = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtCantidadProdcutos = new javax.swing.JTextField();
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
        jLabel29 = new javax.swing.JLabel();
        DateCaducidad = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        txtPvpMayorista = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtPvpClienteFijo = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtPvpClienteNormal = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
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
        btnGuardarPro = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        DateDeuda = new com.toedter.calendar.JDateChooser();
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

        txtCedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCedulaFocusLost(evt);
            }
        });
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

        BotonTraer.setText("Traer");
        BotonTraer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTraerActionPerformed(evt);
            }
        });

        jTable3.setModel(modelTablePersonaV2);
        jScrollPane3.setViewportView(jTable3);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Fecha de nacimiento:");

        radioCedula.setText("Cédula:");
        radioCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioCedulaActionPerformed(evt);
            }
        });

        radioPasaporte.setText("Pasaporte:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Genero:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No definido", "Hombre", "Mujer" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioPasaporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioCedula)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarCedula)
                        .addGap(18, 18, 18)
                        .addComponent(BtnLimpiarClientes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombres))
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
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BuscarTelefono))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(77, 77, 77)))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblbuscar)
                        .addGap(18, 18, 18)
                        .addComponent(comboParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Editar)
                        .addGap(18, 18, 18)
                        .addComponent(Guardar)
                        .addGap(37, 37, 37)
                        .addComponent(Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(BotonTraer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BuscarPersona))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                .addGap(138, 138, 138))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarCedula)
                    .addComponent(BtnLimpiarClientes)
                    .addComponent(radioCedula)
                    .addComponent(radioPasaporte))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Guardar)
                    .addComponent(Editar)
                    .addComponent(BotonTraer))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboParametroBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbuscar)
                    .addComponent(BuscarPersona))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes", jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 254));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 692, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Ventas", jPanel4);

        jPanel3.setBackground(new java.awt.Color(204, 204, 254));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Registro Productos");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Código: ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nombre Producto:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Pvp Compra sin IVA:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Pvp Compra con IVA:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        txtPvpSinIva.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtPvpSinIvaCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        txtPvpConIva.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPvpConIvaInputMethodTextChanged(evt);
            }
        });

        jLabel14.setText("$");

        jLabel15.setText("$");

        txtCantidadProdcutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProdcutosActionPerformed(evt);
            }
        });

        btnInventarioCrear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInventarioCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istLoja/Img/guardar.png"))); // NOI18N
        btnInventarioCrear.setText("Guardar");
        btnInventarioCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioCrearActionPerformed(evt);
            }
        });

        btnInventarioEditar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInventarioEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istLoja/Img/editar.png"))); // NOI18N
        btnInventarioEditar.setText("Editar");
        btnInventarioEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioEditarActionPerformed(evt);
            }
        });

        btnInventarioEliminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInventarioEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istLoja/Img/eliminar.png"))); // NOI18N
        btnInventarioEliminar.setText("Eliminar");
        btnInventarioEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioEliminarActionPerformed(evt);
            }
        });

        jLabel16.setText("U.");

        TablaProductos.setModel(modelTableInventario);
        jScrollPane4.setViewportView(TablaProductos);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Buscador:");

        comboBoxInventarioBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInventaripBusqueda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnInventaripBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istLoja/Img/buskar.png"))); // NOI18N
        btnInventaripBusqueda.setText("Buscar");
        btnInventaripBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventaripBusquedaActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Fecha de Caducidad:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Pvp Mayorista: ");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Pvp Cliente Fijo:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Pvp Cliente Normal:");

        txtPvpClienteNormal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel33.setText("$");

        jLabel34.setText("$");

        jLabel35.setText("$");

        btnCalcular.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/istLoja/Img/kalkulars_1.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnInventarioCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInventarioEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInventarioEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(18, 18, 18)
                                .addComponent(DateCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBoxInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnInventaripBusqueda))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtInventarioCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtInventarioDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtPvpSinIva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPvpConIva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel15)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel30))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtPvpClienteFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPvpClienteNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel35)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPvpMayorista, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantidadProdcutos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel16)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel8)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtInventarioCodProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtInventarioDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtPvpSinIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(txtPvpConIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel30)
                    .addComponent(txtPvpMayorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtPvpClienteFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel32)
                    .addComponent(txtPvpClienteNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(jLabel13)
                    .addComponent(txtCantidadProdcutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(DateCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInventarioCrear)
                    .addComponent(btnInventarioEditar)
                    .addComponent(btnInventarioEliminar)
                    .addComponent(btnCalcular))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxInventarioBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventaripBusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );

        jTabbedPane1.addTab("Inventario", jPanel3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 254));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Registro de Proveedores");

        jLabel18.setText("RUC:");

        jLabel19.setText("Razón Social:");

        jLabel20.setText("Tipo Actividad:");

        jLabel21.setText("Nombre del representante legal:");

        jLabel22.setText("Apellido del representante legal:");

        jLabel23.setText("Teléfono:");

        jLabel24.setText("Correo:");

        btnGuardarPro.setText("Guardar");
        btnGuardarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");

        jButton4.setText("Eliminar");

        jLabel25.setText("Buscador");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton5.setText("Buscar Proveedor");

        jTable2.setModel(modelTableProveedores);
        jScrollPane1.setViewportView(jTable2);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("Fecha de Vencimiento de Deuda:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 302, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(199, 199, 199))
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
                            .addComponent(jLabel24)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRucProveedores)
                            .addComponent(txtRazonSocialProveedores)
                            .addComponent(txtTipoActividadProveedores)
                            .addComponent(txtNombreRepresentateLegalProveedores)
                            .addComponent(txtApellidosRepresentateLegalProveedores)
                            .addComponent(txtTelefonoProveedores)
                            .addComponent(txtCorrreoProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(DateDeuda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardarPro, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
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
                        .addComponent(btnGuardarPro)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(DateDeuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Proveedores", jPanel2);

        jMenu1.setText("Archivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Acerca de");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
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
        Persona persona = (Persona) controladorPersona.getPersonaCedulaLista(txtCedula.getText());
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

    private void txtCantidadProdcutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProdcutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProdcutosActionPerformed

    private void btnInventarioCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioCrearActionPerformed
        Inventario i = new Inventario();
        i.setCodProducto(txtInventarioCodProducto.getText());
        i.setDescripcion(txtInventarioDescripcion.getText());
        i.setCanProductos(Integer.parseInt(txtCantidadProdcutos.getText()));
        i.setPrecioCompraSinIva(Double.parseDouble(txtPvpSinIva.getText()));
        i.setPrecioCompraConIva(Double.parseDouble(txtPvpConIva.getText()));
        i.setPrecioMayorista(Double.parseDouble(txtPvpMayorista.getText()));
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

    private void BotonTraerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTraerActionPerformed
        // TODO add your handling code here:
        List<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditarEliminar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtCedula.setText(personaEditarEliminar.getCedula());
        txtNombres.setText(personaEditarEliminar.getNombre());
        txtApellidos.setText(personaEditarEliminar.getApellidos());
        txtDireccion.setText(personaEditarEliminar.getDireccion());
        txtCorreo.setText(personaEditarEliminar.getCorreo());
        txtTelefono.setText(personaEditarEliminar.getTelefono());
    }//GEN-LAST:event_BotonTraerActionPerformed

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

    private void radioCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioCedulaActionPerformed
        // TODO add your handling code here:
        if (radioCedula.isEnabled()) {

        }
    }//GEN-LAST:event_radioCedulaActionPerformed

    private void txtCedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCedulaFocusLost

        if (radioCedula.isSelected()) {//Si la casilla cedula esta activada
            if (txtCedula.getText().isEmpty()) {//Si el texto esta en blanco
                System.out.println("No puede estar vacio");
            } else {
                utilidades.validadorDeCedula(txtCedula.getText());//Validar cedula
            }

        }
    }//GEN-LAST:event_txtCedulaFocusLost

    private void btnGuardarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProActionPerformed
        // TODO add your handling code here:
        Proveedores proveedores = new Proveedores();
        proveedores.setRuc(txtRucProveedores.getText());
        proveedores.setRazonSocial(txtRazonSocialProveedores.getText());
        proveedores.setTipoActividad(txtTipoActividadProveedores.getText());
        proveedores.setNombreRepresentanteLegal(txtNombreRepresentateLegalProveedores.getText());
        proveedores.setApellidosRepresentanteLegal(txtApellidosRepresentateLegalProveedores.getText());
        proveedores.setTelefono(txtTelefonoProveedores.getText());
        proveedores.setCorreo(txtCorrreoProveedores.getText());
        if (DateDeuda.getDate() != null) {
            personaGuardar.setFechaVencimientoDeuda((Date) DateDeuda.getDate());
        }
        if (controladorProveedor.registrarProveedor(proveedores)) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor guardado con éxito del sitema.");
            limpiarCamposProveedor();
            modelTableProveedores.setProveedores(controladorProveedor.obtenerProveedores());
            modelTableProveedores.fireTableDataChanged();
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se puede guardar el proveedor.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarProActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jMenu3MouseClicked

    private void txtPvpConIvaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPvpConIvaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPvpConIvaInputMethodTextChanged

    private void txtPvpSinIvaCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPvpSinIvaCaretPositionChanged
        // TODO add your handling code here:
        if (txtPvpSinIva.getText() != null) {
            txtPvpConIva.setText("2.2");
        }
    }//GEN-LAST:event_txtPvpSinIvaCaretPositionChanged

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        
        if (txtPvpSinIva.getText() != null) {
            
            Double a = Double.parseDouble(txtPvpSinIva.getText());
            Double Total = a*(1.12);
            ;
            txtPvpConIva.setText(String.valueOf(Total));
            
        }
        if(txtPvpConIva.getText()!=null){
            
            Double a = Double.parseDouble(txtPvpConIva.getText());
            Double Total = a*(1.10);
            
            txtPvpMayorista.setText(String.valueOf(Total));
        }
        if(txtPvpMayorista.getText()!= null){
            
            Double a = Double.parseDouble(txtPvpMayorista.getText());
            Double Total = a*(1.15);
            txtPvpClienteFijo.setText(String.valueOf(Total));
        }
        if(txtPvpClienteFijo.getText()!= null){
            
            Double a = Double.parseDouble(txtPvpClienteFijo.getText());
            Double Total = a*(1.20);
            txtPvpClienteNormal.setText(String.valueOf(Total));
        }
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed
    private Inventario valoresActualizarInventario(Inventario i) {
        i.setCodProducto(txtInventarioCodProducto.getText());
        i.setDescripcion(txtInventarioDescripcion.getText());
        // i.setPrecioCompra(txtInventarioPrecioCompra.getText());
        //   i.setPrecioVenta(txtInventarioPrecioVenta.getText());
        //    i.setCanProductos(txtInventarioCantidadProdcutos.getText());
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
        txtPvpSinIva.setText("");
        txtPvpConIva.setText("");
        txtCantidadProdcutos.setText("");
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
    private javax.swing.JButton BotonTraer;
    private javax.swing.JButton BtnLimpiarClientes;
    private javax.swing.JButton BuscarCedula;
    private javax.swing.JButton BuscarPersona;
    private javax.swing.JButton BuscarTelefono;
    private com.toedter.calendar.JDateChooser DateCaducidad;
    private com.toedter.calendar.JDateChooser DateDeuda;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnGuardarPro;
    private javax.swing.JButton btnInventarioCrear;
    private javax.swing.JButton btnInventarioEditar;
    private javax.swing.JButton btnInventarioEliminar;
    private javax.swing.JButton btnInventaripBusqueda;
    private javax.swing.JComboBox<String> comboBoxInventarioBusqueda;
    private javax.swing.JComboBox<String> comboParametroBusqueda;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
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
    private javax.swing.JRadioButton radioCedula;
    private javax.swing.JRadioButton radioPasaporte;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidosRepresentateLegalProveedores;
    private javax.swing.JTextField txtCantidadProdcutos;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorrreoProveedores;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtInventarioBusqueda;
    private javax.swing.JTextField txtInventarioCodProducto;
    private javax.swing.JTextField txtInventarioDescripcion;
    private javax.swing.JTextField txtNombreRepresentateLegalProveedores;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtParametroBusqueda;
    private javax.swing.JTextField txtPvpClienteFijo;
    private javax.swing.JTextField txtPvpClienteNormal;
    private javax.swing.JTextField txtPvpConIva;
    private javax.swing.JTextField txtPvpMayorista;
    private javax.swing.JTextField txtPvpSinIva;
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
        // txtInventarioPrecioCompra.setText(i.getPrecioCompra());
        //txtInventarioPrecioVenta.setText(i.getPrecioVenta());
        //txtInventarioCantidadProdcutos.setText(i.getCanProductos());
    }

    private void limpiarCamposPersonas() {
        txtNombres.setText("");
        txtApellidos.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtCedula.setText("");
    }

}
