/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Cliente;
import Clases.Usuario;
import Datos.ClienteDAO;
import Validacion.ValidacionInicioSesion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ventana_InicioSesion extends javax.swing.JFrame {

    private Cliente cliente;

    public Ventana_InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoInicioSesionUsuario = new javax.swing.JTextField();
        campoInicioSesionContraseña = new javax.swing.JPasswordField();
        botonIngresar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(254, 255, 149));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("RECREO CAMPESTRE \"FLOR DE RETAMA\"");

        campoInicioSesionUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoInicioSesionUsuarioActionPerformed(evt);
            }
        });

        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoInicioSesionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(campoInicioSesionContraseña)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(botonIngresar)
                        .addGap(32, 32, 32)
                        .addComponent(botonCancelar)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(campoInicioSesionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoInicioSesionContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIngresar)
                    .addComponent(botonCancelar))
                .addGap(36, 36, 36))
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

    public void instanciarUsuario() {
        this.cliente = new Cliente();
    }

    public void ingresarCredencialesAUsuario() {
        this.instanciarUsuario();
        this.cliente.setUsuario(this.campoInicioSesionUsuario.getText());
        this.cliente.setContraseña(String.valueOf(this.campoInicioSesionContraseña.getPassword()));
    }

    ; 
    /*
    public boolean validarUsuario() {
        boolean usuarioCorrecto = false;
        if (this.campoInicioSesionUsuario.getText().equals(this.usuario.getUsuario())) {
            usuarioCorrecto = true;
        }
        return usuarioCorrecto;
    }

    public boolean validarContraseña() {
        boolean contraseñaCorrecta = false;
        if (String.valueOf(this.campoInicioSesionContraseña.getPassword()).equals(this.usuario.getContraseña())) {
            contraseñaCorrecta = true;
        }
        return contraseñaCorrecta;
    }*/
    
    /*
    public void mostrarMensajeDeValidacion() {
        ValidacionInicioSesion validacion = new ValidacionInicioSesion();
        String usuario = this.usuario.getUsuario();
        String contraseña = this.usuario.getContraseña();
        if (validacion.validarUsuario(this.campoInicioSesionUsuario.getText(),usuario) 
        && validacion.validarContraseña(String.valueOf(this.campoInicioSesionContraseña.getPassword()),contraseña)) {
            JOptionPane.showMessageDialog(null, "Credenciales correctas");
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
        }
        reiniciarEntradasDeInicioSesion();
    }*/

    public void reiniciarEntradasDeInicioSesion() {
        this.campoInicioSesionUsuario.setText("");
        this.campoInicioSesionContraseña.setText("");
    }

    public List<Cliente> obtenerClienteBD() {
        ClienteDAO clientedao = new ClienteDAO();
        List<Cliente> clienteLogin = clientedao.buscarClientes(this.cliente);
        return clienteLogin;
    }

    public boolean mostrarMensajeValidacionLogin() {
        boolean esCorrecto = false;
        List<Cliente> clienteLogin = this.obtenerClienteBD();
        if (clienteLogin.size() > 0) {
            JOptionPane.showMessageDialog(null, "Credenciales correctas");
            esCorrecto = true;
        } else {
            JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            esCorrecto = false;
        }
        return esCorrecto;
    }

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // TODO add your handling code here:
        Ventana_Inicio ventanaInicio = new Ventana_Inicio();
        this.setVisible(false); // cierra ventana actual
        ventanaInicio.setVisible(true);
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void campoInicioSesionUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoInicioSesionUsuarioActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_campoInicioSesionUsuarioActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO add your handling code here:
        this.ingresarCredencialesAUsuario();
        boolean respuestaSesionLogin = this.mostrarMensajeValidacionLogin();
        if (respuestaSesionLogin) {
            Ventana_P ventanaPrincipal = new Ventana_P();
            ventanaPrincipal.iniciar();
            ventanaPrincipal.deshabilitarVentanasConPrivilegio();
            ventanaPrincipal.redirigirACarta();
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    public void iniciar() {
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JPasswordField campoInicioSesionContraseña;
    private javax.swing.JTextField campoInicioSesionUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
