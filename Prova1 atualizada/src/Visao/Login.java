/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Visao;

import Construtor.Controlador_telas;

/**
 *
 * @author alunos
 */
public class Login extends javax.swing.JPanel {
Controlador_telas controlador_telas;
    /**
     * Creates new form Login
     */
    public Login(Controlador_telas controlador_telas2) {
        initComponents();
        controlador_telas = controlador_telas2;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtoncaixa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldlogin = new javax.swing.JTextField();
        jButtonadministrador = new javax.swing.JButton();

        jButtoncaixa.setText("Entrar Caixa");
        jButtoncaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncaixaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Login");

        jButtonadministrador.setText("Entrar administrador");
        jButtonadministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonadministradorMouseClicked(evt);
            }
        });
        jButtonadministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonadministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jTextFieldlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButtoncaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonadministrador)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jTextFieldlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtoncaixa)
                    .addComponent(jButtonadministrador))
                .addContainerGap(106, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncaixaActionPerformed
        controlador_telas.Tela_caixa(controlador_telas);
    }//GEN-LAST:event_jButtoncaixaActionPerformed

    private void jButtonadministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonadministradorActionPerformed
        controlador_telas.Tela_administrador(controlador_telas);
    }//GEN-LAST:event_jButtonadministradorActionPerformed

    private void jButtonadministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonadministradorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonadministradorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonadministrador;
    private javax.swing.JButton jButtoncaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextFieldlogin;
    // End of variables declaration//GEN-END:variables
}
