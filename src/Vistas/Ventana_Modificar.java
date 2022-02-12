package Vistas;

import Clases.Empleado;
import Datos.EmpleadoDAO;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lenovo
 */
public class Ventana_Modificar extends javax.swing.JFrame {

    public Ventana_Modificar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 =  new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModificarEmpleados = new javax.swing.JTable();
        btnEditar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblSueldoEmpleado = new javax.swing.JLabel();
        lblApellidoEmpleado = new javax.swing.JLabel();
        txtIngresarSueldoEmpleado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIngresarNombreEmpleado = new javax.swing.JTextField();
        txtIngresarApellidoEmpleado = new javax.swing.JTextField();
        lblTelefonoEmpleado = new javax.swing.JLabel();
        txtIngresarTelefonoEmpleado = new javax.swing.JTextField();
        lblDniEmpleado = new javax.swing.JLabel();
        txtIngresarDniEmpleado = new javax.swing.JTextField();
        lblUsuarioEmpleado = new javax.swing.JLabel();
        txtIngresarTipoEmpleado = new javax.swing.JTextField();
        lblContraseniaEmpleado = new javax.swing.JLabel();
        txtIngresarUsuarioEmpleado = new javax.swing.JTextField();
        lblTipoEmpleado = new javax.swing.JLabel();
        txtIngresarContraseniaEmpleado = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblInicioContrato = new javax.swing.JLabel();
        lblFinContrato = new javax.swing.JLabel();
        txtIIngresoInicioContrato = new javax.swing.JTextField();
        txtIngresoFinContrato = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaModificarEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nombre", "Apellidos", "Sueldo", "DNI", "Telefono", "Usuario", "Contraseña", "InicioFechaContrato", "FinFechaContrato", "TipoEmpleado"
            }
        ));
        jScrollPane1.setViewportView(tablaModificarEmpleados);
        if (tablaModificarEmpleados.getColumnModel().getColumnCount() > 0) {
            tablaModificarEmpleados.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 640, 130));

        btnEditar.setBackground(new java.awt.Color(204, 204, 255));
        btnEditar.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, -1));

        btnVolver.setBackground(new java.awt.Color(204, 204, 255));
        btnVolver.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        btnGuardarCambios.setBackground(new java.awt.Color(204, 204, 255));
        btnGuardarCambios.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, -1, -1));

        lblNombreEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblNombreEmpleado.setText("Nombre:");
        jPanel2.add(lblNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblSueldoEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblSueldoEmpleado.setText("Sueldo:");
        jPanel2.add(lblSueldoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        lblApellidoEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblApellidoEmpleado.setText("Apellido:");
        jPanel2.add(lblApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        txtIngresarSueldoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresarSueldoEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(txtIngresarSueldoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 120, -1));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        jLabel4.setText("Ingresar datos correspondientes: EMPLEADOS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel2.add(txtIngresarNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 110, -1));
        jPanel2.add(txtIngresarApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 117, -1));

        lblTelefonoEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblTelefonoEmpleado.setText("Telefono:");
        jPanel2.add(lblTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));
        jPanel2.add(txtIngresarTelefonoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 115, -1));

        lblDniEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblDniEmpleado.setText("DNI:");
        jPanel2.add(lblDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        jPanel2.add(txtIngresarDniEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 110, -1));

        lblUsuarioEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblUsuarioEmpleado.setText("Usuario:");
        jPanel2.add(lblUsuarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));
        jPanel2.add(txtIngresarTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 120, -1));

        lblContraseniaEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblContraseniaEmpleado.setText("Contraseña:");
        jPanel2.add(lblContraseniaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, -1, -1));
        jPanel2.add(txtIngresarUsuarioEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, 120, -1));

        lblTipoEmpleado.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblTipoEmpleado.setText("Tipo Empleado:");
        jPanel2.add(lblTipoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));
        jPanel2.add(txtIngresarContraseniaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 120, -1));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 255));
        btnCancelar.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        lblInicioContrato.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblInicioContrato.setText("Inicio Fecha Contrato:");
        jPanel2.add(lblInicioContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        lblFinContrato.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblFinContrato.setText("Fin Fecha Contrato:");
        jPanel2.add(lblFinContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        jPanel2.add(txtIIngresoInicioContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 110, -1));
        jPanel2.add(txtIngresoFinContrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 120, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIngresarSueldoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresarSueldoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresarSueldoEmpleadoActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        this.mostrarDatosActualizados();
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.mostrarVentana_P();
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.mostrarDatosFilaSeleccionada();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.reiniciarInputs();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void reiniciarInputs() {
        this.txtIngresarNombreEmpleado.setText("");
        this.txtIngresarApellidoEmpleado.setText("");
        this.txtIngresarSueldoEmpleado.setText("");
        this.txtIngresarDniEmpleado.setText("");
        this.txtIngresarTelefonoEmpleado.setText("");
        this.txtIngresarUsuarioEmpleado.setText("");
        this.txtIngresarContraseniaEmpleado.setText("");
        this.txtIngresarSueldoEmpleado.setText("");
        this.txtIngresoFinContrato.setText("");
        this.txtIIngresoInicioContrato.setText("");
        this.txtIngresarTipoEmpleado.setText("");
    }
    
    public void mostrarVentana_P(){
        Ventana_P ventanaPrincipal = new Ventana_P();
        ventanaPrincipal.iniciar();
    }
    
    public void mostrarDatosActualizados(){
        EmpleadoDAO empleado = new EmpleadoDAO();
        int registro = empleado.editar(obtenerDatosEmpleado());
        this.mostrarEmpleados();
    }

    public void mostrarDatosFilaSeleccionada() {
        this.txtIngresarNombreEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 1).toString());
        this.txtIngresarApellidoEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 2).toString());
        this.txtIngresarSueldoEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 3).toString());
        this.txtIngresarDniEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 4).toString());
        this.txtIngresarTelefonoEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 5).toString());
        this.txtIngresarUsuarioEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 6).toString());
        this.txtIngresarContraseniaEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 7).toString());
        this.txtIIngresoInicioContrato.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 8).toString());
        this.txtIngresoFinContrato.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 9).toString());
        this.txtIngresarTipoEmpleado.setText(this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 10).toString());
    }

    public String getIdFilaSeleccionada() {
        String ID = this.tablaModificarEmpleados.getValueAt(this.tablaModificarEmpleados.getSelectedRow(), 0).toString();
        return ID;
    }

    public void iniciar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Modificar Empleados");
        //this.mostrarEmpleados();
        this.mostrarEmpleados();
    }
    
    public Empleado obtenerDatosEmpleado(){
        Empleado empleado = new Empleado();
        empleado.setCodigo(Integer.parseInt(this.getIdFilaSeleccionada()));
        empleado.setNombre(this.txtIngresarNombreEmpleado.getText());
        empleado.setApellido(this.txtIngresarApellidoEmpleado.getText());
        empleado.setSueldo(Double.parseDouble(this.txtIngresarSueldoEmpleado.getText()));
        empleado.setDni(this.txtIngresarDniEmpleado.getText());
        empleado.setTelefono(this.txtIngresarTelefonoEmpleado.getText());
        empleado.setUsuario(this.txtIngresarUsuarioEmpleado.getText());
        empleado.setContraseña(this.txtIngresarContraseniaEmpleado.getText());
        empleado.setFechaInicioContrato(this.txtIIngresoInicioContrato.getText());
        empleado.setFechaFinContrato(this.txtIngresoFinContrato.getText());
        empleado.setTipoEmpleado(Integer.parseInt(this.txtIngresarTipoEmpleado.getText()));
        return empleado;
    }

    /*
    public void mostrarEmpleados(){
    Ventana_P vistaPrincipal=new Ventana_P();
    //vistaPrincipal.mostrar();
    //tablaModificarEmpleados.setModel(vistaPrincipal.retornarTabla());
}*/
    public void mostrarEmpleados() {
        EmpleadoDAO empleadoDao = new EmpleadoDAO();

        DefaultTableModel modelo = (DefaultTableModel) this.tablaModificarEmpleados.getModel();
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btnVolver;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellidoEmpleado;
    private javax.swing.JLabel lblContraseniaEmpleado;
    private javax.swing.JLabel lblDniEmpleado;
    private javax.swing.JLabel lblFinContrato;
    private javax.swing.JLabel lblInicioContrato;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblSueldoEmpleado;
    private javax.swing.JLabel lblTelefonoEmpleado;
    private javax.swing.JLabel lblTipoEmpleado;
    private javax.swing.JLabel lblUsuarioEmpleado;
    private javax.swing.JTable tablaModificarEmpleados;
    private javax.swing.JTextField txtIIngresoInicioContrato;
    private javax.swing.JTextField txtIngresarApellidoEmpleado;
    private javax.swing.JTextField txtIngresarContraseniaEmpleado;
    private javax.swing.JTextField txtIngresarDniEmpleado;
    private javax.swing.JTextField txtIngresarNombreEmpleado;
    private javax.swing.JTextField txtIngresarSueldoEmpleado;
    private javax.swing.JTextField txtIngresarTelefonoEmpleado;
    private javax.swing.JTextField txtIngresarTipoEmpleado;
    private javax.swing.JTextField txtIngresarUsuarioEmpleado;
    private javax.swing.JTextField txtIngresoFinContrato;
    // End of variables declaration//GEN-END:variables
}
