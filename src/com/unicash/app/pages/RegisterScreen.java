package com.unicash.app.pages;

public class RegisterScreen extends javax.swing.JFrame {
    public RegisterScreen() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblSaida = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        tfCNPJ = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfNameEmpress = new javax.swing.JTextField();
        btnRegisterConfirm = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSaida.setBackground(new java.awt.Color(255, 255, 255));
        lblSaida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSaida.setForeground(new java.awt.Color(255, 255, 255));
        lblSaida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaida.setText("X");
        lblSaida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSaidaMouseClicked(evt);
            }
        });
        jPanel2.add(lblSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 0, 42, 31));

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Unicash Cadastro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome da Empresa:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 51));
        jLabel3.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNPJ:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setBackground(new java.awt.Color(0, 0, 51));
        jLabel5.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Senha:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 290, -1));

        tfCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        tfCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tfCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 290, -1));

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 290, -1));

        tfNameEmpress.setBackground(new java.awt.Color(255, 255, 255));
        tfNameEmpress.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tfNameEmpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 290, -1));

        btnRegisterConfirm.setBackground(new java.awt.Color(255, 255, 255));
        btnRegisterConfirm.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnRegisterConfirm.setForeground(new java.awt.Color(0, 0, 0));
        btnRegisterConfirm.setText("Cadastrar");
        btnRegisterConfirm.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegisterConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegisterConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterConfirmActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegisterConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 140, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 450));

        jLabel8.setBackground(new java.awt.Color(0, 9, 36));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/images/unicash_registerscreen_icon.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSaidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSaidaMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lblSaidaMouseClicked

    private void btnRegisterConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterConfirmActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RegisterScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterConfirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblSaida;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNameEmpress;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}
