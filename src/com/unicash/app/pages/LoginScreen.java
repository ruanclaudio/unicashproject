package com.unicash.app.pages;

public class LoginScreen extends javax.swing.JFrame {
    public LoginScreen() {
        initComponents();
        setResizable(false);
        //tfCNPJ.setBackground(new java.awt.Color(0,0,0,1));
       //tfPassworld.setBackground(new java.awt.Color(0,0,0,1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JTextField();
        passwordIcon = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel.setBackground(new java.awt.Color(0, 9, 36));
        imagePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/images/unicash_icon.png"))); // NOI18N
        imageLabel.setText("jLabel3");
        imagePanel.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        getContentPane().add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        jPanel2.setBackground(new java.awt.Color(0, 0, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel2.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 31));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("UniCash Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 350, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CNPJ:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 270, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 150, 40));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Senha:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, -1));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Cadastrar-se");
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 190, 40));

        iconLabel.setBackground(new java.awt.Color(0, 0, 51));
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/images/unicash_login_icon.png"))); // NOI18N
        jPanel2.add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 83));

        tfCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        tfCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tfCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, -1));

        passwordIcon.setBackground(new java.awt.Color(255, 255, 255));
        passwordIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/icons/hidePassword.png"))); // NOI18N
        passwordIcon.setBorder(null);
        passwordIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordIconActionPerformed(evt);
            }
        });
        jPanel2.add(passwordIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 30, 20));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 270, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 490));

        setSize(new java.awt.Dimension(800, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoginActionPerformed

    private void passwordIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordIconActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordIconActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton passwordIcon;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
}
