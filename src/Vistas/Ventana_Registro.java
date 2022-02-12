package Vistas;

import Clases.Cliente;
import Datos.ClienteDAO;
import Validacion.ValidacionRegistro;
import javax.swing.JOptionPane;

public class Ventana_Registro extends javax.swing.JFrame {

    ValidacionRegistro validacion = new ValidacionRegistro();

    public Ventana_Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRegistro = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        checkBox_Condiciones = new javax.swing.JCheckBox();
        campoIngresoNombre = new javax.swing.JTextField();
        campoIngresoApellido = new javax.swing.JTextField();
        campoIngresoDni = new javax.swing.JTextField();
        campoIngresoTelefono = new javax.swing.JTextField();
        campoIngresoDireccion = new javax.swing.JTextField();
        campoIngresoUsuario = new javax.swing.JTextField();
        campoIngresoContrasenia = new javax.swing.JPasswordField();
        campoIngresoConfirmarContrasenia = new javax.swing.JPasswordField();
        botonRegistrarse = new javax.swing.JButton();
        botonCancelarCreacionCuenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRegistro.setBackground(new java.awt.Color(254, 255, 149));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("RECREO CAMPESTRE \"FLOR DE RETAMA\"");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("REGÍSTRATE");

        jLabel2.setText("Nombre:");

        jLabel4.setText("Apellido:");

        jLabel5.setText("Dni:");

        jLabel6.setText("Teléfono:");

        jLabel7.setText("Dirección:");

        jLabel8.setText("Usuario:");

        jLabel9.setText("Contraseña:");

        jLabel10.setText("Confirmar Contraseña:");

        checkBox_Condiciones.setBackground(new java.awt.Color(254, 255, 149));
        checkBox_Condiciones.setText("Acepta los Términos y Condiciones");
        checkBox_Condiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox_CondicionesActionPerformed(evt);
            }
        });

        campoIngresoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIngresoNombreActionPerformed(evt);
            }
        });

        botonRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        botonCancelarCreacionCuenta.setText("Cancelar");
        botonCancelarCreacionCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarCreacionCuentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelRegistroLayout = new javax.swing.GroupLayout(PanelRegistro);
        PanelRegistro.setLayout(PanelRegistroLayout);
        PanelRegistroLayout.setHorizontalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBox_Condiciones)
                    .addComponent(jLabel3)
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegistroLayout.createSequentialGroup()
                                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistroLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)))
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoIngresoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoIngresoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(campoIngresoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoIngresoNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(campoIngresoContrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoIngresoUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoIngresoConfirmarContrasenia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campoIngresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24))
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(botonRegistrarse)
                .addGap(30, 30, 30)
                .addComponent(botonCancelarCreacionCuenta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelRegistroLayout.setVerticalGroup(
            PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistroLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel6))
                    .addGroup(PanelRegistroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIngresoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIngresoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIngresoDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(campoIngresoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(campoIngresoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIngresoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIngresoContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoIngresoConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addComponent(checkBox_Condiciones)
                .addGap(29, 29, 29)
                .addGroup(PanelRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegistrarse)
                    .addComponent(botonCancelarCreacionCuenta))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBox_CondicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox_CondicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBox_CondicionesActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        // TODO add your handling code here:
        this.validarTodosLosCamposDelRegistroDeCuenta();
        Cliente cliente = new Cliente();
        this.llenarDatosCliente(cliente);
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.insertar(cliente);
        this.reiniciarInpustFormularioRegistro();
        //this.validarPrimerCaracterEnMayuscula(this.campoIngresoNombre.getText());
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    public void reiniciarInpustFormularioRegistro() {
        this.campoIngresoNombre.setText("");
        this.campoIngresoApellido.setText("");
        this.campoIngresoDni.setText("");
        this.campoIngresoTelefono.setText("");
        this.campoIngresoDireccion.setText("");
        this.campoIngresoUsuario.setText("");
        this.campoIngresoContrasenia.setText("");
        this.campoIngresoConfirmarContrasenia.setText("");
        this.checkBox_Condiciones.setSelected(false);
    }

    public void llenarDatosCliente(Cliente cliente) {
        cliente.setNombre(this.campoIngresoNombre.getText());
        cliente.setApellido(this.campoIngresoApellido.getText());
        cliente.setDni(this.campoIngresoDni.getText());
        cliente.setTelefono(this.campoIngresoTelefono.getText());
        cliente.setDireccion(this.campoIngresoDireccion.getText());
        cliente.setUsuario(this.campoIngresoUsuario.getText());
        cliente.setContraseña(String.valueOf(this.campoIngresoContrasenia.getPassword()));
    }


    private void botonCancelarCreacionCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarCreacionCuentaActionPerformed
        // TODO add your handling code here:
        Ventana_Inicio ventanaInicio = new Ventana_Inicio();
        this.setVisible(false);
        ventanaInicio.setVisible(true);
    }//GEN-LAST:event_botonCancelarCreacionCuentaActionPerformed

    private void campoIngresoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIngresoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIngresoNombreActionPerformed

    public void mostrarMensajePorValidacionDeTexto(String entrada) {
        if (entrada.length() == 0) {
            this.mostrarMensajeSiCampoEstaVacio();
        } else {
            this.mostrarMensajeSiCampoNoEstaVacio(entrada);
        }
    }

    public void mostrarMensajeSiCampoEstaVacio() {
        System.out.println("Entrada vacia");
    }

    public void mostrarMensajeSiCampoNoEstaVacio(String entrada) {
        if (validacion.validarSiContenidoDeTextoSonLetras(entrada)) {
            System.out.println("Solo contiene letras");
        } else {
            System.out.println("El texto contiene números");
        }
    }

    public void validarTodosLosCamposDelRegistroDeCuenta() {
        if ((validacion.validarSiContenidoDeTextoSonLetras(this.campoIngresoNombre.getText()))
                && (validacion.validarSiContenidoDeTextoSonLetras(this.campoIngresoApellido.getText()))
                && (validacion.validarLongitudDNI(this.campoIngresoDni.getText()))
                && (validacion.validarLongitudTelefono(this.campoIngresoTelefono.getText()))
                && (validacion.validarSiContenidoDeTextoSonLetras(this.campoIngresoDireccion.getText()))
                && !(validacion.validarSiContenidoDeTextoSonLetras(this.campoIngresoUsuario.getText()))
                && !(validacion.validarSiContenidoDeTextoSonLetras(String.valueOf(this.campoIngresoContrasenia.getPassword())))
                && !(validacion.validarSiContenidoDeTextoSonLetras(String.valueOf(this.campoIngresoConfirmarContrasenia.getPassword())))
                && (validacion.validarConfirmacionContraseña(String.valueOf(this.campoIngresoContrasenia.getPassword()), String.valueOf(this.campoIngresoConfirmarContrasenia.getPassword())))
                && (this.checkBox_Condiciones.isSelected())) {
            JOptionPane.showMessageDialog(null, "Todos los datos son correctos");
        } else {
            JOptionPane.showMessageDialog(null, "Existen datos incorrectos");
        }
    }
    
    public void iniciar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Recreo Campestre Flor de Retama - Registro");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelRegistro;
    private javax.swing.JButton botonCancelarCreacionCuenta;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JTextField campoIngresoApellido;
    private javax.swing.JPasswordField campoIngresoConfirmarContrasenia;
    private javax.swing.JPasswordField campoIngresoContrasenia;
    private javax.swing.JTextField campoIngresoDireccion;
    private javax.swing.JTextField campoIngresoDni;
    private javax.swing.JTextField campoIngresoNombre;
    private javax.swing.JTextField campoIngresoTelefono;
    private javax.swing.JTextField campoIngresoUsuario;
    private javax.swing.JCheckBox checkBox_Condiciones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
