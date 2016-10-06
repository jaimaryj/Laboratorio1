/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Valmore Canelon
 */
public class VCliente extends javax.swing.JFrame {

    
    public VCliente() {
        initComponents();
        this.setTitle("Gestión Cliente");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelOpciones = new javax.swing.JPanel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonConsultar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jPanelDatos = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelRazonSocial = new javax.swing.JLabel();
        jTextFieldRazonSocial = new javax.swing.JTextField();
        jLabelEstado_Provincia = new javax.swing.JLabel();
        jTextFieldEstado_Provincia = new javax.swing.JTextField();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLocaleChooserNacionalidad = new com.toedter.components.JLocaleChooser();
        jLabelNacionalidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOpcionesLayout = new javax.swing.GroupLayout(jPanelOpciones);
        jPanelOpciones.setLayout(jPanelOpcionesLayout);
        jPanelOpcionesLayout.setHorizontalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRegistrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCancelar)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanelOpcionesLayout.setVerticalGroup(
            jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcionesLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelDatos.setToolTipText("");
        jPanelDatos.setName(""); // NOI18N

        jLabelCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCodigo.setText("Código");

        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jLabelRazonSocial.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelRazonSocial.setText("Razón Social");

        jTextFieldRazonSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRazonSocialActionPerformed(evt);
            }
        });

        jLabelEstado_Provincia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEstado_Provincia.setText("Estado/Provincia");

        jTextFieldEstado_Provincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEstado_ProvinciaActionPerformed(evt);
            }
        });

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefono.setText("Teléfono");

        jTextFieldTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTelefonoActionPerformed(evt);
            }
        });

        jLabelCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCorreo.setText("Correo");

        jTextFieldCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorreoActionPerformed(evt);
            }
        });

        jLabelNacionalidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNacionalidad.setText("Nacionalidad");

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelCodigo))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabelTelefono))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLocaleChooserNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNacionalidad))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelEstado_Provincia))
                            .addComponent(jTextFieldEstado_Provincia)
                            .addComponent(jTextFieldRazonSocial)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabelCorreo))
                            .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabelRazonSocial)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelRazonSocial))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelNacionalidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLocaleChooserNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jTextFieldRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelEstado_Provincia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEstado_Provincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelCorreo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldRazonSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazonSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazonSocialActionPerformed

    private void jTextFieldEstado_ProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEstado_ProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEstado_ProvinciaActionPerformed

    private void jTextFieldTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTelefonoActionPerformed

    private void jTextFieldCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorreoActionPerformed

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
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCliente().setVisible(true);
            }
        });
    }

    public JButton getjButtonCancelar() {
        return jButtonCancelar;
    }

    public JButton getjButtonConsultar() {
        return jButtonConsultar;
    }

    public JButton getjButtonEliminar() {
        return jButtonEliminar;
    }

    public JButton getjButtonModificar() {
        return jButtonModificar;
    }

    public JButton getjButtonRegistrar() {
        return jButtonRegistrar;
    }

    public JLabel getjLabelCodigo() {
        return jLabelCodigo;
    }

    public JLabel getjLabelCorreo() {
        return jLabelCorreo;
    }

    public JLabel getjLabelEstado_Provincia() {
        return jLabelEstado_Provincia;
    }

    public JLabel getjLabelRazonSocial() {
        return jLabelRazonSocial;
    }

    public JLabel getjLabelTelefono() {
        return jLabelTelefono;
    }

    public JPanel getjPanelDatos() {
        return jPanelDatos;
    }

    public JPanel getjPanelOpciones() {
        return jPanelOpciones;
    }

    public JTextField getjTextFieldCodigo() {
        return jTextFieldCodigo;
    }

    public JTextField getjTextFieldCorreo() {
        return jTextFieldCorreo;
    }

    public JTextField getjTextFieldEstado_Provincia() {
        return jTextFieldEstado_Provincia;
    }

    public JTextField getjTextFieldRazonSocial() {
        return jTextFieldRazonSocial;
    }

    public JTextField getjTextFieldTelefono() {
        return jTextFieldTelefono;
    }

    public void agregarListener(ActionListener accion){
        this.jButtonRegistrar.addActionListener(accion);
        this.jButtonModificar.addActionListener(accion);
        this.jButtonEliminar.addActionListener(accion);
        this.jButtonConsultar.addActionListener(accion);
        this.jButtonCancelar.addActionListener(accion);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelEstado_Provincia;
    private javax.swing.JLabel jLabelNacionalidad;
    private javax.swing.JLabel jLabelRazonSocial;
    private javax.swing.JLabel jLabelTelefono;
    private com.toedter.components.JLocaleChooser jLocaleChooserNacionalidad;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldEstado_Provincia;
    private javax.swing.JTextField jTextFieldRazonSocial;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
