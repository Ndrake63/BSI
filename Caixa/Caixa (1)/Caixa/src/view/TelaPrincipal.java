/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controlador.ControladorCaixa;
import ferramentas.data;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author victorperes
 */
public class TelaPrincipal extends javax.swing.JFrame {
 data b;
    
    public void runData() {
        b = new data();
        b.le_data();
        jLabelData.setText(b.dia_semana + " , " + b.dia + " de " + b.mes + " de " + b.ano);
    }
    
    public void runHora(){
        ActionListener action = new ActionListener() {

            public void actionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent e) {
                b.le_hora();
                jLabelHora.setText((b.hora));
            }
        };
        Timer t = new Timer(1000, action);
        t.start(); 
    }
    
        public void atualizando(){
        ActionListener action = new ActionListener() {

            public void actionPerformed(@SuppressWarnings("unused") java.awt.event.ActionEvent e) {
                control.atualizando();
            }
        };
        Timer t = new Timer(10000, action);
        t.start(); 
    }
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        runData();
        runHora();
        inicio();
        atualizando();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelMesa1 = new javax.swing.JPanel();
        jTextFieldStatus1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListProdutosMesa1 = new javax.swing.JList<>();
        jTextFieldNomeMesa1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldValorMesa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanelMesa2 = new javax.swing.JPanel();
        jTextFieldStatus2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldNomeMesa2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldValorMesa2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListProdutosMesa2 = new javax.swing.JList<>();
        jPanelMesa3 = new javax.swing.JPanel();
        jTextFieldStatus3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNomeMesa3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldValorMesa1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jListProdutosMesa3 = new javax.swing.JList<>();
        jPanelMesa4 = new javax.swing.JPanel();
        jTextFieldStatus4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldNomeMesa4 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldValorMesa4 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jListProdutosMesa4 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Caixa");

        jPanelMesa1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mesa 1"));
        jPanelMesa1.setRequestFocusEnabled(false);

        jTextFieldStatus1.setEditable(false);

        jLabel2.setText("Nome :");

        jScrollPane1.setViewportView(jListProdutosMesa1);

        jTextFieldNomeMesa1.setEditable(false);

        jLabel3.setText("Consumo :");

        jLabel4.setText("Valor (R$) : ");

        jTextFieldValorMesa.setEditable(false);

        jLabel5.setText("Status:");

        javax.swing.GroupLayout jPanelMesa1Layout = new javax.swing.GroupLayout(jPanelMesa1);
        jPanelMesa1.setLayout(jPanelMesa1Layout);
        jPanelMesa1Layout.setHorizontalGroup(
            jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelMesa1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 244, Short.MAX_VALUE))
                    .addGroup(jPanelMesa1Layout.createSequentialGroup()
                        .addGroup(jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeMesa1)
                            .addComponent(jTextFieldStatus1)))
                    .addGroup(jPanelMesa1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldValorMesa)))
                .addContainerGap())
        );
        jPanelMesa1Layout.setVerticalGroup(
            jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa1Layout.createSequentialGroup()
                .addGroup(jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelMesa1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldValorMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelMesa2.setBorder(javax.swing.BorderFactory.createTitledBorder("Mesa 2"));
        jPanelMesa2.setPreferredSize(new java.awt.Dimension(269, 266));

        jTextFieldStatus2.setEditable(false);

        jLabel8.setText("Nome :");

        jTextFieldNomeMesa2.setEditable(false);

        jLabel9.setText("Consumo :");

        jLabel10.setText("Valor (R$) : ");

        jTextFieldValorMesa2.setEditable(false);

        jLabel6.setText("Status:");

        jScrollPane4.setViewportView(jListProdutosMesa2);

        javax.swing.GroupLayout jPanelMesa2Layout = new javax.swing.GroupLayout(jPanelMesa2);
        jPanelMesa2.setLayout(jPanelMesa2Layout);
        jPanelMesa2Layout.setHorizontalGroup(
            jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMesa2Layout.createSequentialGroup()
                        .addGroup(jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelMesa2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 10, Short.MAX_VALUE))
                            .addGroup(jPanelMesa2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldStatus2, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addComponent(jTextFieldNomeMesa2)))
                    .addGroup(jPanelMesa2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 239, Short.MAX_VALUE))
                    .addComponent(jScrollPane4)
                    .addGroup(jPanelMesa2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldValorMesa2)))
                .addContainerGap())
        );
        jPanelMesa2Layout.setVerticalGroup(
            jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa2Layout.createSequentialGroup()
                .addGroup(jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStatus2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldNomeMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMesa2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldValorMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelMesa3.setBorder(javax.swing.BorderFactory.createTitledBorder("Mesa 3"));
        jPanelMesa3.setRequestFocusEnabled(false);

        jTextFieldStatus3.setEditable(false);

        jLabel7.setText("Nome :");

        jTextFieldNomeMesa3.setEditable(false);

        jLabel14.setText("Consumo :");

        jLabel15.setText("Valor (R$) : ");

        jTextFieldValorMesa1.setEditable(false);

        jLabel16.setText("Status:");

        jScrollPane5.setViewportView(jListProdutosMesa3);

        javax.swing.GroupLayout jPanelMesa3Layout = new javax.swing.GroupLayout(jPanelMesa3);
        jPanelMesa3.setLayout(jPanelMesa3Layout);
        jPanelMesa3Layout.setHorizontalGroup(
            jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelMesa3Layout.createSequentialGroup()
                        .addGroup(jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeMesa3)
                            .addComponent(jTextFieldStatus3)))
                    .addComponent(jScrollPane5)
                    .addGroup(jPanelMesa3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelMesa3Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldValorMesa1)))
                .addContainerGap())
        );
        jPanelMesa3Layout.setVerticalGroup(
            jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa3Layout.createSequentialGroup()
                .addGroup(jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStatus3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNomeMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMesa3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldValorMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMesa4.setBorder(javax.swing.BorderFactory.createTitledBorder("Mesa 4"));
        jPanelMesa4.setPreferredSize(new java.awt.Dimension(269, 266));

        jTextFieldStatus4.setEditable(false);

        jLabel17.setText("Nome :");

        jTextFieldNomeMesa4.setEditable(false);

        jLabel18.setText("Consumo :");

        jLabel19.setText("Valor (R$) : ");

        jTextFieldValorMesa4.setEditable(false);

        jLabel20.setText("Status:");

        jScrollPane6.setViewportView(jListProdutosMesa4);

        javax.swing.GroupLayout jPanelMesa4Layout = new javax.swing.GroupLayout(jPanelMesa4);
        jPanelMesa4.setLayout(jPanelMesa4Layout);
        jPanelMesa4Layout.setHorizontalGroup(
            jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanelMesa4Layout.createSequentialGroup()
                        .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17)
                            .addGroup(jPanelMesa4Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldStatus4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNomeMesa4)))
                    .addGroup(jPanelMesa4Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jTextFieldValorMesa4))
                    .addGroup(jPanelMesa4Layout.createSequentialGroup()
                        .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelMesa4Layout.setVerticalGroup(
            jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMesa4Layout.createSequentialGroup()
                .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStatus4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldNomeMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelMesa4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldValorMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabelData.setText("jLabel11");

        jLabelHora.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelHora)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelData))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelMesa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelMesa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelMesa4, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jPanelMesa2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelMesa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMesa2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelMesa3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelMesa4, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JList<String> jListProdutosMesa1;
    private javax.swing.JList<String> jListProdutosMesa2;
    private javax.swing.JList<String> jListProdutosMesa3;
    private javax.swing.JList<String> jListProdutosMesa4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMesa1;
    private javax.swing.JPanel jPanelMesa2;
    private javax.swing.JPanel jPanelMesa3;
    private javax.swing.JPanel jPanelMesa4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextFieldNomeMesa1;
    private javax.swing.JTextField jTextFieldNomeMesa2;
    private javax.swing.JTextField jTextFieldNomeMesa3;
    private javax.swing.JTextField jTextFieldNomeMesa4;
    private javax.swing.JTextField jTextFieldStatus1;
    private javax.swing.JTextField jTextFieldStatus2;
    private javax.swing.JTextField jTextFieldStatus3;
    private javax.swing.JTextField jTextFieldStatus4;
    private javax.swing.JTextField jTextFieldValorMesa;
    private javax.swing.JTextField jTextFieldValorMesa1;
    private javax.swing.JTextField jTextFieldValorMesa2;
    private javax.swing.JTextField jTextFieldValorMesa4;
    // End of variables declaration//GEN-END:variables
ControladorCaixa control;

public void inicio(){
    control = new ControladorCaixa(jTextFieldStatus1, jTextFieldStatus2, jTextFieldStatus3, jTextFieldStatus4, jTextFieldNomeMesa1, jTextFieldNomeMesa2, jTextFieldNomeMesa3, jTextFieldNomeMesa4, jTextFieldValorMesa1, jTextFieldValorMesa2, jTextFieldValorMesa, jTextFieldValorMesa4, jListProdutosMesa1, jListProdutosMesa2, jListProdutosMesa3, jListProdutosMesa4);
}

}
