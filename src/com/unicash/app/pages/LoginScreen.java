package com.unicash.app.pages;

import javax.swing.JOptionPane;

public class LoginScreen extends javax.swing.JFrame {
    public LoginScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        loginFormPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        titleTxtLabel = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JTextField();
        showPassBtn = new javax.swing.JToggleButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel.setBackground(new java.awt.Color(0, 9, 36));

        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/images/unicash_icon.png"))); // NOI18N
        imageLabel.setText("jLabel3");
        imagePanel.add(imageLabel);

        getContentPane().add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        loginFormPanel.setBackground(new java.awt.Color(0, 0, 51));
        loginFormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        loginFormPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 31));

        titleTxtLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleTxtLabel.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        titleTxtLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleTxtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleTxtLabel.setText("UniCash Login");
        loginFormPanel.add(titleTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 350, -1));

        txtCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        txtCNPJ.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        txtCNPJ.setText("CNPJ:");
        loginFormPanel.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 270, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Entrar");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        loginFormPanel.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, 40));

        txtPassword.setBackground(new java.awt.Color(255, 255, 255));
        txtPassword.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Senha:");
        loginFormPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 270, -1));

        btnRegister.setBackground(new java.awt.Color(255, 255, 255));
        btnRegister.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(0, 0, 0));
        btnRegister.setText("Cadastrar-se");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        loginFormPanel.add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 160, 40));

        iconLabel.setBackground(new java.awt.Color(0, 0, 51));
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/images/unicash_login_icon.png"))); // NOI18N
        loginFormPanel.add(iconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, 83));

        tfCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        tfCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        loginFormPanel.add(tfCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 270, -1));

        showPassBtn.setBackground(new java.awt.Color(255, 255, 255));
        showPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/icons/hidePassword.png"))); // NOI18N
        showPassBtn.setBorder(null);
        showPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassBtnActionPerformed(evt);
            }
        });
        loginFormPanel.add(showPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 30, 22));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        loginFormPanel.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 240, 22));

        getContentPane().add(loginFormPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 430, 490));

        setSize(new java.awt.Dimension(800, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
       String cnpj = tfCNPJ.getText();
       char[] passwordChars = tfPassword.getPassword();
       
        if (cnpj.isEmpty() || passwordChars.length == 0) {
        JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
        return;
        }
        
        String password = new String(passwordChars);
        
        if (cnpj.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(this, "CNPJ ou senha inválidos.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RegisterScreen registerFrame = new RegisterScreen();
        registerFrame.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void showPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPassBtnActionPerformed
        if (showPassBtn.isSelected()) {
            tfPassword.setEchoChar((char) 0);
        } else {
            tfPassword.setEchoChar('•');
        }
    }//GEN-LAST:event_showPassBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JToggleButton showPassBtn;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JLabel titleTxtLabel;
    private javax.swing.JLabel txtCNPJ;
    private javax.swing.JLabel txtPassword;
    // End of variables declaration//GEN-END:variables
}
