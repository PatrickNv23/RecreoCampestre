package Vistas;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Producto;
import Datos.ClienteDAO;
import Datos.EmpleadoDAO;
import Datos.ProductoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Ventana_P extends javax.swing.JFrame {

    public Ventana_P() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbpGeneral = new javax.swing.JTabbedPane();
        jpRegistros = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tbpRegistrosEmpPed = new javax.swing.JTabbedPane();
        jpPedidos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPedidos = new javax.swing.JTable();
        btnImprimirBusquedaPedido = new javax.swing.JButton();
        lblFiltrarBusqueda = new javax.swing.JLabel();
        txtPrimeraBusquedaFecha = new javax.swing.JFormattedTextField();
        txtSegundaBusquedaFecha = new javax.swing.JFormattedTextField();
        btnBuscarBusquedaPedido = new javax.swing.JButton();
        btnCancelarBusquedaPedido = new javax.swing.JButton();
        jpEmpleados = new javax.swing.JPanel();
        btnModificarEmpleado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellidoEmpleado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSueldoEmpleado = new javax.swing.JTextField();
        txtInicioContratoEmpleado = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFinContratoEmpleado = new javax.swing.JFormattedTextField();
        btnAgregarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        btnCancelarEmpleado = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtDniEmpleado = new javax.swing.JTextField();
        txtTelefonoEmpleado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUsuarioEmpleado = new javax.swing.JTextField();
        txtContraseñaEmpleado = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        txtTipoEmpleado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jpClientes = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnBorrarCliente = new javax.swing.JButton();
        lblFondoImagenClientes = new javax.swing.JLabel();
        jpRegistrarProductos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreProductos = new javax.swing.JLabel();
        txtIngresarNombreProducto = new javax.swing.JTextField();
        txtIngresarPrecioVentaProducto = new javax.swing.JTextField();
        txtIngresarDescripcionProducto = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblSoles = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        txtIngresarCantidadProducto = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtIngresarTipoProducto = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        btnBorrarProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        lblRegistroProductos = new javax.swing.JLabel();
        tbpRegistroInternoProductos = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaPlatos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaBebidas = new javax.swing.JTable();
        btnGuardarCambiosProducto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIngresarPrecioCompraProducto = new javax.swing.JTextField();
        lblImagenFondo = new javax.swing.JLabel();
        jpCarta = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        lblCartaDelDia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCartaPlatosPrincipales = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaCartaBebidas = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        btnRealizarPedido = new javax.swing.JButton();
        lblMenuFondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jpPedido = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        jpnColorEsquinero = new javax.swing.JPanel();
        btnRegistros = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnRegistrarProductos = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnCarta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbpGeneral.setBackground(new java.awt.Color(255, 255, 255));

        jpRegistros.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpPedidos.setBackground(new java.awt.Color(255, 255, 204));

        tablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Importe", "Estado", "Fecha"
            }
        ));
        jScrollPane3.setViewportView(tablaPedidos);
        if (tablaPedidos.getColumnModel().getColumnCount() > 0) {
            tablaPedidos.getColumnModel().getColumn(0).setMaxWidth(160);
            tablaPedidos.getColumnModel().getColumn(1).setMaxWidth(160);
            tablaPedidos.getColumnModel().getColumn(2).setMaxWidth(160);
            tablaPedidos.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        btnImprimirBusquedaPedido.setText("IMPRIMIR");

        lblFiltrarBusqueda.setText("Filtrar datos por fecha:");

        txtSegundaBusquedaFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundaBusquedaFechaActionPerformed(evt);
            }
        });

        btnBuscarBusquedaPedido.setText("BUSCAR");

        btnCancelarBusquedaPedido.setText("CANCELAR");

        javax.swing.GroupLayout jpPedidosLayout = new javax.swing.GroupLayout(jpPedidos);
        jpPedidos.setLayout(jpPedidosLayout);
        jpPedidosLayout.setHorizontalGroup(
            jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPedidosLayout.createSequentialGroup()
                .addGroup(jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpPedidosLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnImprimirBusquedaPedido))
                    .addGroup(jpPedidosLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpPedidosLayout.createSequentialGroup()
                                .addComponent(lblFiltrarBusqueda)
                                .addGroup(jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpPedidosLayout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(btnBuscarBusquedaPedido)
                                        .addGap(65, 65, 65)
                                        .addComponent(btnCancelarBusquedaPedido))
                                    .addGroup(jpPedidosLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPrimeraBusquedaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSegundaBusquedaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(283, Short.MAX_VALUE))
        );
        jpPedidosLayout.setVerticalGroup(
            jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPedidosLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFiltrarBusqueda)
                    .addComponent(txtPrimeraBusquedaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSegundaBusquedaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jpPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarBusquedaPedido)
                    .addComponent(btnCancelarBusquedaPedido))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirBusquedaPedido)
                .addGap(23, 23, 23))
        );

        tbpRegistrosEmpPed.addTab("Registro de pedidos", jpPedidos);

        jpEmpleados.setBackground(new java.awt.Color(255, 204, 204));
        jpEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnModificarEmpleado.setText("MODIFICAR");
        btnModificarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpleadoActionPerformed(evt);
            }
        });
        jpEmpleados.add(btnModificarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel4.setText("Nombre:");
        jpEmpleados.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jpEmpleados.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 130, -1));

        jLabel5.setText("Apellidos:");
        jpEmpleados.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, -1));
        jpEmpleados.add(txtApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, -1));

        jLabel6.setText("Sueldo:");
        jpEmpleados.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jpEmpleados.add(txtSueldoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 130, -1));
        jpEmpleados.add(txtInicioContratoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 120, -1));

        jLabel7.setText("Inicio Contrato: ");
        jpEmpleados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel8.setText("Fin Contrato:");
        jpEmpleados.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));
        jpEmpleados.add(txtFinContratoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 120, -1));

        btnAgregarEmpleado.setText("AGREGAR");
        btnAgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEmpleadoActionPerformed(evt);
            }
        });
        jpEmpleados.add(btnAgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        btnEliminarEmpleado.setText("ELIMINAR");
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });
        jpEmpleados.add(btnEliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        btnCancelarEmpleado.setText("CANCELAR");
        btnCancelarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEmpleadoActionPerformed(evt);
            }
        });
        jpEmpleados.add(btnCancelarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));

        jLabel9.setText("DNI: ");
        jpEmpleados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jLabel10.setText("Teléfono: ");
        jpEmpleados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));
        jpEmpleados.add(txtDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, -1));
        jpEmpleados.add(txtTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 150, -1));

        jLabel12.setText("Usuario: ");
        jpEmpleados.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, -1));

        jLabel13.setText("Contraseña: ");
        jpEmpleados.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 20, -1, -1));

        txtUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioEmpleadoActionPerformed(evt);
            }
        });
        jpEmpleados.add(txtUsuarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 150, -1));
        jpEmpleados.add(txtContraseñaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 120, -1));

        jLabel11.setText("Tipo: ");
        jpEmpleados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, -1, -1));
        jpEmpleados.add(txtTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 70, -1));

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Apellido", "Sueldo", "Dni", "Telefono", "Usuario", "Contraseña", "Inicio Contrato", "Fin Contrato", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleados);

        jpEmpleados.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 820, 110));

        tbpRegistrosEmpPed.addTab("Registro de empleados", jpEmpleados);

        jPanel3.add(tbpRegistrosEmpPed, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 850, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPagina_.jpg"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 380));

        javax.swing.GroupLayout jpRegistrosLayout = new javax.swing.GroupLayout(jpRegistros);
        jpRegistros.setLayout(jpRegistrosLayout);
        jpRegistrosLayout.setHorizontalGroup(
            jpRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpRegistrosLayout.setVerticalGroup(
            jpRegistrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRegistrosLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        tbpGeneral.addTab("Registros", jpRegistros);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellidos", "Dni", "Telefono", "Direccion", "Usuario", "Contraseña"
            }
        ));
        jScrollPane6.setViewportView(tablaClientes);
        if (tablaClientes.getColumnModel().getColumnCount() > 0) {
            tablaClientes.getColumnModel().getColumn(0).setMinWidth(40);
            tablaClientes.getColumnModel().getColumn(0).setMaxWidth(50);
            tablaClientes.getColumnModel().getColumn(3).setMinWidth(60);
        }

        jPanel2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 680, 180));

        btnBorrarCliente.setText("BORRAR");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 90, 30));

        lblFondoImagenClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoCirculos.png"))); // NOI18N
        jPanel2.add(lblFondoImagenClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 380));

        javax.swing.GroupLayout jpClientesLayout = new javax.swing.GroupLayout(jpClientes);
        jpClientes.setLayout(jpClientesLayout);
        jpClientesLayout.setHorizontalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        jpClientesLayout.setVerticalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClientesLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpGeneral.addTab("Clientes", jpClientes);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreProductos.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblNombreProductos.setForeground(new java.awt.Color(255, 255, 204));
        lblNombreProductos.setText("Nombre:");
        jPanel1.add(lblNombreProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 50, 20));
        jPanel1.add(txtIngresarNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 100, -1));
        jPanel1.add(txtIngresarPrecioVentaProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 100, -1));
        jPanel1.add(txtIngresarDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 110, -1));

        lblPrecio.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 204));
        lblPrecio.setText("PrecioVenta:");
        jPanel1.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 20));

        lblSoles.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblSoles.setForeground(new java.awt.Color(255, 255, 204));
        lblSoles.setText("S/. ");
        jPanel1.add(lblSoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, 20));

        lblDescripcion.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 204));
        lblDescripcion.setText("Descripciòn:");
        jPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 20));

        lblCantidad.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(255, 255, 204));
        lblCantidad.setText("Cantidad:");
        jPanel1.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, 20));
        jPanel1.add(txtIngresarCantidadProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 110, -1));

        lblTipo.setFont(new java.awt.Font("Imprint MT Shadow", 1, 12)); // NOI18N
        lblTipo.setForeground(new java.awt.Color(255, 255, 204));
        lblTipo.setText("Tipo: ");
        jPanel1.add(lblTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 60, 20));
        jPanel1.add(txtIngresarTipoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 110, -1));

        btnAgregarProducto.setFont(new java.awt.Font("Imprint MT Shadow", 1, 11)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(51, 153, 0));
        btnAgregarProducto.setText("AGREGAR");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        btnBorrarProducto.setFont(new java.awt.Font("Imprint MT Shadow", 1, 11)); // NOI18N
        btnBorrarProducto.setForeground(new java.awt.Color(51, 153, 0));
        btnBorrarProducto.setText("BORRAR");
        btnBorrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        btnEditarProducto.setFont(new java.awt.Font("Imprint MT Shadow", 1, 11)); // NOI18N
        btnEditarProducto.setForeground(new java.awt.Color(51, 153, 0));
        btnEditarProducto.setText("EDITAR");
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 170, -1, -1));

        lblRegistroProductos.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        lblRegistroProductos.setForeground(new java.awt.Color(255, 255, 0));
        lblRegistroProductos.setText("REGISTRO DE PRODUCTOS");
        jPanel1.add(lblRegistroProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        tablaPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "PrecioVenta", "PrecioCompra", "Descripcion", "Cantidad", "Tipo"
            }
        ));
        jScrollPane5.setViewportView(tablaPlatos);

        tbpRegistroInternoProductos.addTab("PLATOS", jScrollPane5);

        tablaBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "PrecioVenta", "PrecioCompra", "Descripcion", "Cantidad", "Tipo"
            }
        ));
        jScrollPane4.setViewportView(tablaBebidas);

        tbpRegistroInternoProductos.addTab("BEBIDAS", jScrollPane4);

        jPanel1.add(tbpRegistroInternoProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 620, 140));

        btnGuardarCambiosProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGuardarCambiosProducto.setForeground(new java.awt.Color(51, 153, 0));
        btnGuardarCambiosProducto.setText("Guardar Cambios");
        btnGuardarCambiosProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarCambiosProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 204));
        jLabel15.setText("S/. ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 204));
        jLabel14.setText("PrecioCompra: ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));
        jPanel1.add(txtIngresarPrecioCompraProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 100, -1));

        lblImagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoProductos.jpg"))); // NOI18N
        jPanel1.add(lblImagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 380));

        javax.swing.GroupLayout jpRegistrarProductosLayout = new javax.swing.GroupLayout(jpRegistrarProductos);
        jpRegistrarProductos.setLayout(jpRegistrarProductosLayout);
        jpRegistrarProductosLayout.setHorizontalGroup(
            jpRegistrarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistrarProductosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpRegistrarProductosLayout.setVerticalGroup(
            jpRegistrarProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRegistrarProductosLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpGeneral.addTab("Productos", jpRegistrarProductos);

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCartaDelDia.setFont(new java.awt.Font("Source Code Pro Black", 1, 24)); // NOI18N
        lblCartaDelDia.setForeground(new java.awt.Color(204, 255, 204));
        lblCartaDelDia.setText("<html><center>CARTA DEL DÍA<html>");
        lblCartaDelDia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblCartaDelDia.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel7.add(lblCartaDelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, -1));

        tablaCartaPlatosPrincipales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Descripcion", "Precio"
            }
        ));
        jScrollPane2.setViewportView(tablaCartaPlatosPrincipales);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, 200));

        tablaCartaBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane7.setViewportView(tablaCartaBebidas);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 190, 200));

        jLabel16.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        jLabel16.setText("BEBIDAS");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        btnRealizarPedido.setText("REALIZAR PEDIDO");
        btnRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidoActionPerformed(evt);
            }
        });
        jPanel7.add(btnRealizarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, -1, -1));

        lblMenuFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenFondoMenu.png"))); // NOI18N
        jPanel7.add(lblMenuFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 680, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuP.jpg"))); // NOI18N
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 380));

        javax.swing.GroupLayout jpCartaLayout = new javax.swing.GroupLayout(jpCarta);
        jpCarta.setLayout(jpCartaLayout);
        jpCartaLayout.setHorizontalGroup(
            jpCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        jpCartaLayout.setVerticalGroup(
            jpCartaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbpGeneral.addTab("Carta", jpCarta);

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cantidad", "Descripción", "Precio Unitario", "Importe"
            }
        ));
        jScrollPane8.setViewportView(jTable3);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 620, 120));

        jLabel17.setText("Nro Mesa:");
        jPanel8.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel8.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 110, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel8.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 140, 30));

        jLabel18.setText("Plato Principal: ");
        jPanel8.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, -1, -1));

        jLabel19.setText("Bebidas: ");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 150, 30));

        jLabel20.setText("Cantidad: ");
        jPanel8.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 30));
        jPanel8.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 80, -1));

        jLabel21.setText("Cantidad: ");
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, 20));
        jPanel8.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 80, -1));

        jButton2.setText("GUARDAR");
        jPanel8.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jButton3.setText("BORRAR");
        jPanel8.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        jButton4.setText("PEDIDO NUEVO");
        jPanel8.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Source Code Pro SemiBold", 1, 12)); // NOI18N
        jLabel22.setText("Sub Total: ");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Source Code Pro SemiBold", 1, 12)); // NOI18N
        jLabel23.setText("IGV: ");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        jLabel24.setFont(new java.awt.Font("Source Code Pro SemiBold", 1, 12)); // NOI18N
        jLabel24.setText("Total: ");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 100, -1));
        jPanel8.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 120, -1));
        jPanel8.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 130, -1));

        jButton5.setText("SOLICITAR BOLETA");
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, -1, -1));
        jPanel8.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 80, -1));
        jPanel8.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 80, -1));

        jLabel25.setText("Precio Unitario: ");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 134, -1, 20));

        jLabel26.setText("Precio Unitario: ");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        jButton6.setText("EDITAR");
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Source Code Pro", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.jpg"))); // NOI18N
        jPanel8.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 380));

        javax.swing.GroupLayout jpPedidoLayout = new javax.swing.GroupLayout(jpPedido);
        jpPedido.setLayout(jpPedidoLayout);
        jpPedidoLayout.setHorizontalGroup(
            jpPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE)
        );
        jpPedidoLayout.setVerticalGroup(
            jpPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbpGeneral.addTab("Pedido", jpPedido);

        getContentPane().add(tbpGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 880, 410));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoPrincipal_.png"))); // NOI18N
        getContentPane().add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 720, 100));

        jpnColorEsquinero.setBackground(new java.awt.Color(204, 204, 204));

        btnRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        btnRegistros.setText("REGISTROS");
        btnRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrosActionPerformed(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnRegistrarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/productos.png"))); // NOI18N
        btnRegistrarProductos.setText("<html><center>REGISTRAR PRODUCTOS<html>");
        btnRegistrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductosActionPerformed(evt);
            }
        });

        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pedido.png"))); // NOI18N
        btnPedido.setText("PEDIDO");
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });

        btnCarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        btnCarta.setText("CARTA");
        btnCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnColorEsquineroLayout = new javax.swing.GroupLayout(jpnColorEsquinero);
        jpnColorEsquinero.setLayout(jpnColorEsquineroLayout);
        jpnColorEsquineroLayout.setHorizontalGroup(
            jpnColorEsquineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnColorEsquineroLayout.createSequentialGroup()
                .addGroup(jpnColorEsquineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarProductos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistros, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(144, 144, 144))
        );
        jpnColorEsquineroLayout.setVerticalGroup(
            jpnColorEsquineroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnColorEsquineroLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(btnRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jpnColorEsquinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrosActionPerformed
        tbpGeneral.setSelectedIndex(0);
    }//GEN-LAST:event_btnRegistrosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        tbpGeneral.setSelectedIndex(1);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnRegistrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductosActionPerformed
        tbpGeneral.setSelectedIndex(2);
    }//GEN-LAST:event_btnRegistrarProductosActionPerformed

    private void btnCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaActionPerformed
        tbpGeneral.setSelectedIndex(3);
    }//GEN-LAST:event_btnCartaActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        tbpGeneral.setSelectedIndex(4);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void txtSegundaBusquedaFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundaBusquedaFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundaBusquedaFechaActionPerformed

    private void btnAgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEmpleadoActionPerformed
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
        int registro = empleadoDao.insertar(obtenerDatosEmpleado());
        if (registro > 0) {
            System.out.println("Registro agregado satisfactoriamente");
        } else {
            System.out.println("Error no se pudo agregar el registro");
        }
        mostrarEmpleados();
    }//GEN-LAST:event_btnAgregarEmpleadoActionPerformed

    public String getIdFilaSeleccionadaEmpleados() {
        String ID = this.tablaEmpleados.getValueAt(this.tablaEmpleados.getSelectedRow(), 0).toString();
        return ID;
    }

    public String getIdFilaSeleccionadaPlatosPrincipales() {
        String ID = this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 0).toString();
        return ID;
    }

    public String getIdFilaSeleccionadaBebidas() {
        String ID = this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 0).toString();
        return ID;
    }

    public DefaultTableModel retornarTabla() {
        return (DefaultTableModel) this.tablaEmpleados.getModel();
    }

    public void mostrarEmpleados() {
        EmpleadoDAO empleadoDao = new EmpleadoDAO();

        DefaultTableModel modelo = (DefaultTableModel) this.tablaEmpleados.getModel();
        modelo.setNumRows(0);

        for (Empleado e : empleadoDao.mostrarListado()) {
            String[] empleados = new String[11];
            empleados[0] = String.valueOf(e.getCodigo());
            empleados[1] = e.getNombre();
            empleados[2] = e.getApellido();
            empleados[3] = String.valueOf(e.getSueldo());
            empleados[4] = String.valueOf(e.getDni());
            empleados[5] = e.getTelefono();
            empleados[6] = e.getUsuario();
            empleados[7] = e.getContraseña();
            empleados[8] = e.getFechaInicioContrato();
            empleados[9] = e.getFechaFinContrato();
            empleados[10] = String.valueOf(e.getTipoEmpleado());
            modelo.addRow(empleados);
        }
    }

    public void mostrarPlatosPrincipales() {
        ProductoDAO productoDao = new ProductoDAO();

        DefaultTableModel modelo = (DefaultTableModel) this.tablaPlatos.getModel();
        modelo.setNumRows(0);

        for (Producto producto : productoDao.mostrarListado()) {
            String[] productos = new String[7];
            if (producto.getTipo() == 1) {
                productos[0] = String.valueOf(producto.getCodigo());
                productos[1] = producto.getNombre();
                productos[2] = String.valueOf(producto.getPrecioVenta());
                productos[3] = String.valueOf(producto.getPrecioCompra());
                productos[4] = producto.getDescripcion();
                productos[5] = String.valueOf(producto.getCantidadDisponible());
                productos[6] = String.valueOf(producto.getTipo());
                modelo.addRow(productos);
            }
        }
    }
    
    public void mostrarCarta() {
        ProductoDAO productoDao = new ProductoDAO();

        DefaultTableModel modeloPlatos = (DefaultTableModel) this.tablaCartaPlatosPrincipales.getModel();
        modeloPlatos.setNumRows(0);
        
        DefaultTableModel modeloBebidas = (DefaultTableModel) this.tablaCartaBebidas.getModel();
        modeloBebidas.setNumRows(0);

        for (Producto producto : productoDao.mostrarListado()) {
            if (producto.getTipo() == 1) {
                String[] productos = new String[3];
                productos[0] = producto.getNombre();
                productos[1] = producto.getDescripcion();
                productos[2] = String.valueOf(producto.getPrecioVenta());
                modeloPlatos.addRow(productos);
            }else if(producto.getTipo()==2){
                String[] productos = new String[2];
                productos[0] = producto.getNombre();
                productos[1] = String.valueOf(producto.getPrecioVenta());
                modeloBebidas.addRow(productos);
            }
        }
    }
    

    public void mostrarBebidas() {
        ProductoDAO productoDao = new ProductoDAO();

        DefaultTableModel modelo = (DefaultTableModel) this.tablaBebidas.getModel();
        modelo.setNumRows(0);

        for (Producto producto : productoDao.mostrarListado()) {
            String[] productos = new String[7];
            if (producto.getTipo() == 2) {
                productos[0] = String.valueOf(producto.getCodigo());
                productos[1] = producto.getNombre();
                productos[2] = String.valueOf(producto.getPrecioVenta());
                productos[3] = String.valueOf(producto.getPrecioCompra());
                productos[4] = producto.getDescripcion();
                productos[5] = String.valueOf(producto.getCantidadDisponible());
                productos[6] = String.valueOf(producto.getTipo());
                modelo.addRow(productos);
            }
        }
    }


    private void txtUsuarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        Empleado empleado = this.instanciarEmpleado();
        empleado.setCodigo(Integer.parseInt(this.getIdFilaSeleccionadaEmpleados()));
        EmpleadoDAO empleadoDao = new EmpleadoDAO();
//        empleadoDao.eliminarEmpleados(this.instanciarEmpleado().setCodigo(Integer.parseInt(this.getIdFilaSeleccionada())));
        int registro = empleadoDao.eliminar(empleado);
        mostrarEmpleados();
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void btnCancelarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEmpleadoActionPerformed
        this.reiniciarCampos();
    }//GEN-LAST:event_btnCancelarEmpleadoActionPerformed

    private void btnModificarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpleadoActionPerformed
        this.instanciarVentana();
    }//GEN-LAST:event_btnModificarEmpleadoActionPerformed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
        ProductoDAO productoDao = new ProductoDAO();
        productoDao.insertar(this.obtenerDatosProducto());
        this.mostrarPlatosPrincipales();
        this.mostrarBebidas();
        this.limpiarInputsProducto();
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnBorrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProductoActionPerformed
        Producto producto = new Producto();
        if (this.jScrollPane5.isVisible()) {
            producto.setCodigo(Integer.parseInt(this.getIdFilaSeleccionadaPlatosPrincipales()));
            //this.jScrollPane5.setFocusable(false);
        } else if (this.jScrollPane4.isVisible()) {
            producto.setCodigo(Integer.parseInt(this.getIdFilaSeleccionadaBebidas()));
            //this.jScrollPane4.setFocusable(false);
        }
        /*
        this.tablaPlatos.clearSelection();
        this.tablaPlatos.setFocusable(false);
        this.tablaBebidas.clearSelection();
        this.tablaBebidas.setFocusable(false);*/

        ProductoDAO productoDao = new ProductoDAO();
//        empleadoDao.eliminarEmpleados(this.instanciarEmpleado().setCodigo(Integer.parseInt(this.getIdFilaSeleccionada())));
        int registro = productoDao.eliminar(producto);
        this.mostrarPlatosPrincipales();
        this.mostrarBebidas();
    }//GEN-LAST:event_btnBorrarProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        if (this.jScrollPane5.isVisible()) {
            this.mostrarDatosPlatoSeleccionada();
        } else if (this.jScrollPane4.isVisible()) {
            this.mostrarDatosBebidaSeleccionada();
        }
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnGuardarCambiosProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosProductoActionPerformed
        // TODO add your handling code here:
        Producto producto = new Producto();
        if (this.jScrollPane5.isVisible()) {
            this.llenarDatosObjetoProducto(Integer.parseInt(this.getIdFilaSeleccionadaPlatosPrincipales()), producto);
        } else if (this.jScrollPane4.isVisible()) {
            this.llenarDatosObjetoProducto(Integer.parseInt(this.getIdFilaSeleccionadaBebidas()), producto);
        }
        ProductoDAO productoDao = new ProductoDAO();
        int registro = productoDao.editar(producto);
        this.mostrarPlatosPrincipales();
        this.mostrarBebidas();
        this.reiniciarCamposProducto();
    }//GEN-LAST:event_btnGuardarCambiosProductoActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        // TODO add your handling code here:
        Cliente cliente = new Cliente(Integer.parseInt(this.getIdFilaSeleccionadaCliente()));
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.eliminar(cliente);
        this.mostrarClientes();
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoActionPerformed
        // TODO add your handling code here:
        this.redirigirAPestañaPedido();
    }//GEN-LAST:event_btnRealizarPedidoActionPerformed

    public void redirigirAPestañaPedido(){
        this.tbpGeneral.setSelectedIndex(this.tbpGeneral.indexOfComponent(this.jpPedido));
    }
    
    public String getIdFilaSeleccionadaCliente() {
        String ID = this.tablaClientes.getValueAt(this.tablaClientes.getSelectedRow(), 0).toString();
        return ID;
    }
    
    
    public void llenarDatosObjetoProducto(int codigo, Producto producto) {
        producto.setCodigo(codigo);
        producto.setNombre(this.txtIngresarNombreProducto.getText());
        producto.setPrecioVenta(Double.parseDouble(this.txtIngresarPrecioVentaProducto.getText()));
        producto.setPrecioCompra(Double.parseDouble(this.txtIngresarPrecioCompraProducto.getText()));
        producto.setDescripcion(this.txtIngresarDescripcionProducto.getText());
        producto.setCantidadDisponible(Integer.parseInt(this.txtIngresarCantidadProducto.getText()));
        producto.setTipo(Integer.parseInt(this.txtIngresarTipoProducto.getText()));
    }
    
    

    public void mostrarDatosPlatoSeleccionada() {
        this.txtIngresarNombreProducto.setText(this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 1).toString());
        this.txtIngresarPrecioVentaProducto.setText(this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 2).toString());
        this.txtIngresarPrecioCompraProducto.setText(this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 3).toString());
        this.txtIngresarDescripcionProducto.setText(this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 4).toString());
        this.txtIngresarCantidadProducto.setText(this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 5).toString());
        this.txtIngresarTipoProducto.setText(this.tablaPlatos.getValueAt(this.tablaPlatos.getSelectedRow(), 6).toString());
    }

    public void mostrarDatosBebidaSeleccionada() {
        this.txtIngresarNombreProducto.setText(this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 1).toString());
        this.txtIngresarPrecioVentaProducto.setText(this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 2).toString());
        this.txtIngresarPrecioCompraProducto.setText(this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 3).toString());
        this.txtIngresarDescripcionProducto.setText(this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 4).toString());
        this.txtIngresarCantidadProducto.setText(this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 5).toString());
        this.txtIngresarTipoProducto.setText(this.tablaBebidas.getValueAt(this.tablaBebidas.getSelectedRow(), 6).toString());
    }

    public Empleado instanciarEmpleado() {
        Empleado empleadonuevo = new Empleado();
        return empleadonuevo;
    }

    public void instanciarVentana() {
        Ventana_Modificar v1 = new Ventana_Modificar();
        v1.iniciar();
        this.dispose();
    }

    public void reiniciarCampos() {
        this.txtNombreEmpleado.setText("");
        this.txtApellidoEmpleado.setText("");
        this.txtSueldoEmpleado.setText("");
        this.txtDniEmpleado.setText("");
        this.txtTelefonoEmpleado.setText("");
        this.txtUsuarioEmpleado.setText("");
        this.txtContraseñaEmpleado.setText("");
        this.txtInicioContratoEmpleado.setText("");
        this.txtFinContratoEmpleado.setText("");
        this.txtTipoEmpleado.setText("");
    }

    public void reiniciarCamposProducto() {
        this.txtIngresarNombreProducto.setText("");
        this.txtIngresarPrecioVentaProducto.setText("");
        this.txtIngresarPrecioCompraProducto.setText("");
        this.txtIngresarDescripcionProducto.setText("");
        this.txtIngresarCantidadProducto.setText("");
        this.txtIngresarTipoProducto.setText("");
    }

    public Empleado obtenerDatosEmpleado() {
        Empleado empleado = new Empleado();
        empleado.setNombre(this.txtNombreEmpleado.getText());
        empleado.setApellido(this.txtApellidoEmpleado.getText());
        empleado.setSueldo(Double.parseDouble(this.txtSueldoEmpleado.getText()));
        empleado.setDni(this.txtDniEmpleado.getText());
        empleado.setTelefono(this.txtTelefonoEmpleado.getText());
        empleado.setUsuario(this.txtUsuarioEmpleado.getText());
        empleado.setContraseña(String.valueOf(this.txtContraseñaEmpleado.getPassword()));
        empleado.setFechaInicioContrato(this.txtInicioContratoEmpleado.getText());
        empleado.setFechaFinContrato(this.txtFinContratoEmpleado.getText());
        empleado.setTipoEmpleado(Integer.parseInt(this.txtTipoEmpleado.getText()));
        return empleado;
    }

    public Producto obtenerDatosProducto() {
        Producto producto = new Producto();
        producto.setNombre(this.txtIngresarNombreProducto.getText());
        producto.setPrecioVenta(Double.parseDouble(this.txtIngresarPrecioVentaProducto.getText()));
        producto.setPrecioCompra(Double.parseDouble(this.txtIngresarPrecioCompraProducto.getText()));
        producto.setDescripcion(this.txtIngresarDescripcionProducto.getText());
        producto.setCantidadDisponible(Integer.parseInt(this.txtIngresarCantidadProducto.getText()));
        producto.setTipo(Integer.parseInt(this.txtIngresarTipoProducto.getText()));
        return producto;
    }

    public void limpiarInputsProducto() {
        this.txtIngresarNombreProducto.setText("");
        this.txtIngresarPrecioVentaProducto.setText("");
        this.txtIngresarPrecioCompraProducto.setText("");
        this.txtIngresarCantidadProducto.setText("");
        this.txtIngresarDescripcionProducto.setText("");
        this.txtIngresarTipoProducto.setText("");
    }

    public void deshabilitarVentanasConPrivilegio(){
        this.tbpGeneral.setEnabledAt(this.tbpGeneral.indexOfComponent(this.jpRegistros), false);
        this.tbpGeneral.setEnabledAt(this.tbpGeneral.indexOfComponent(this.jpClientes), false);
        this.tbpGeneral.setEnabledAt(this.tbpGeneral.indexOfComponent(this.jpRegistrarProductos),false);
        this.tbpGeneral.setSelectedIndex(this.tbpGeneral.indexOfComponent(this.jpCarta));
    }
    
    public void deshabilitarBotonesConPrivilegio(){
        
    }
    
    public void redirigirACarta(){
        this.jpRegistros.setVisible(false);
        this.jpClientes.setVisible(false);
        this.jpRegistrarProductos.setVisible(false);
        this.jpClientes.setVisible(true);
    }
    
    
    public void iniciar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Recreo Campestre Flor de Retama");
        this.mostrarEmpleados();
        this.mostrarPlatosPrincipales();
        this.mostrarBebidas();
        this.mostrarClientes();
        this.mostrarCarta();
    }
    
    public void mostrarClientes(){
        ClienteDAO clienteDao = new ClienteDAO();

        DefaultTableModel modelo = (DefaultTableModel) this.tablaClientes.getModel();
        modelo.setNumRows(0);

        for(Cliente cliente : clienteDao.mostrarListado()) {
            String[] clientes = new String[8];
            clientes[0] = String.valueOf(cliente.getCodigo());
            clientes[1] = cliente.getNombre();
            clientes[2] = cliente.getApellido();
            clientes[3] = String.valueOf(cliente.getDni());
            clientes[4] = String.valueOf(cliente.getTelefono());
            clientes[5] = cliente.getDireccion();
            clientes[6] = cliente.getUsuario();
            clientes[7] = cliente.getContraseña();
            modelo.addRow(clientes);
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_P().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEmpleado;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBorrarProducto;
    private javax.swing.JButton btnBuscarBusquedaPedido;
    private javax.swing.JButton btnCancelarBusquedaPedido;
    private javax.swing.JButton btnCancelarEmpleado;
    private javax.swing.JButton btnCarta;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnGuardarCambiosProducto;
    private javax.swing.JButton btnImprimirBusquedaPedido;
    private javax.swing.JButton btnModificarEmpleado;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnRealizarPedido;
    private javax.swing.JButton btnRegistrarProductos;
    private javax.swing.JButton btnRegistros;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JPanel jpCarta;
    private javax.swing.JPanel jpClientes;
    private javax.swing.JPanel jpEmpleados;
    private javax.swing.JPanel jpPedido;
    private javax.swing.JPanel jpPedidos;
    private javax.swing.JPanel jpRegistrarProductos;
    private javax.swing.JPanel jpRegistros;
    private javax.swing.JPanel jpnColorEsquinero;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCartaDelDia;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblFiltrarBusqueda;
    private javax.swing.JLabel lblFondoImagenClientes;
    private javax.swing.JLabel lblImagenFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMenuFondo;
    private javax.swing.JLabel lblNombreProductos;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblRegistroProductos;
    private javax.swing.JLabel lblSoles;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tablaBebidas;
    private javax.swing.JTable tablaCartaBebidas;
    private javax.swing.JTable tablaCartaPlatosPrincipales;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaEmpleados;
    private javax.swing.JTable tablaPedidos;
    private javax.swing.JTable tablaPlatos;
    private javax.swing.JTabbedPane tbpGeneral;
    private javax.swing.JTabbedPane tbpRegistroInternoProductos;
    private javax.swing.JTabbedPane tbpRegistrosEmpPed;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JPasswordField txtContraseñaEmpleado;
    private javax.swing.JTextField txtDniEmpleado;
    private javax.swing.JFormattedTextField txtFinContratoEmpleado;
    private javax.swing.JTextField txtIngresarCantidadProducto;
    private javax.swing.JTextField txtIngresarDescripcionProducto;
    private javax.swing.JTextField txtIngresarNombreProducto;
    private javax.swing.JTextField txtIngresarPrecioCompraProducto;
    private javax.swing.JTextField txtIngresarPrecioVentaProducto;
    private javax.swing.JTextField txtIngresarTipoProducto;
    private javax.swing.JFormattedTextField txtInicioContratoEmpleado;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JFormattedTextField txtPrimeraBusquedaFecha;
    private javax.swing.JFormattedTextField txtSegundaBusquedaFecha;
    private javax.swing.JTextField txtSueldoEmpleado;
    private javax.swing.JTextField txtTelefonoEmpleado;
    private javax.swing.JTextField txtTipoEmpleado;
    private javax.swing.JTextField txtUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
