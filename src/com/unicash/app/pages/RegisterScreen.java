package com.unicash.app.pages;

public class RegisterScreen extends javax.swing.JFrame {
    public RegisterScreen() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formsPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        txtEmpress = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        tfCNPJ = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfNameEmpress = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();
        tfConfirmPass = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JLabel();
        iconPanel = new javax.swing.JPanel();
        iconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formsPanel.setBackground(new java.awt.Color(0, 0, 51));
        formsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLabel.setBackground(new java.awt.Color(255, 255, 255));
        exitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setText("X");
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        formsPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 0, 42, 31));

        titleLabel.setBackground(new java.awt.Color(0, 0, 51));
        titleLabel.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Unicash Cadastro");
        formsPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        txtEmpress.setBackground(new java.awt.Color(0, 0, 51));
        txtEmpress.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtEmpress.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpress.setText("Nome da Empresa:");
        formsPanel.add(txtEmpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 51));
        txtEmail.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email:");
        formsPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtCNPJ.setBackground(new java.awt.Color(0, 0, 51));
        txtCNPJ.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        txtCNPJ.setText("CNPJ:");
        formsPanel.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtPassword.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Senha:");
        formsPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        formsPanel.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 290, -1));

        tfCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        tfCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 290, -1));

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 290, -1));

        tfNameEmpress.setBackground(new java.awt.Color(255, 255, 255));
        tfNameEmpress.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfNameEmpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 290, -1));

        registerBtn.setBackground(new java.awt.Color(255, 255, 255));
        registerBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(0, 0, 0));
        registerBtn.setText("Cadastrar");
        registerBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        formsPanel.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 140, 40));

        goBackBtn.setBackground(new java.awt.Color(255, 255, 255));
        goBackBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        goBackBtn.setForeground(new java.awt.Color(0, 0, 0));
        goBackBtn.setText("Voltar");
        goBackBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        goBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        goBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackBtnActionPerformed(evt);
            }
        });
        formsPanel.add(goBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 100, 30));

        tfConfirmPass.setBackground(new java.awt.Color(255, 255, 255));
        tfConfirmPass.setForeground(new java.awt.Color(0, 0, 0));
        tfConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConfirmPassActionPerformed(evt);
            }
        });
        formsPanel.add(tfConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 290, -1));

        txtConfirmPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtConfirmPassword.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setText("Confirmar senha:");
        formsPanel.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        getContentPane().add(formsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 490));

        iconPanel.setBackground(new java.awt.Color(0, 9, 36));

        iconLabel.setBackground(new java.awt.Color(0, 9, 36));
        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/images/unicash_registerscreen_icon.jpeg"))); // NOI18N
        iconPanel.add(iconLabel);

        getContentPane().add(iconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        setSize(new java.awt.Dimension(800, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registerBtnActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        LoginScreen loginFrame = new LoginScreen();
        loginFrame.setVisible(true);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void tfConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConfirmPassActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterScreen().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel formsPanel;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JPasswordField tfConfirmPass;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNameEmpress;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel txtCNPJ;
    private javax.swing.JLabel txtConfirmPassword;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEmpress;
    private javax.swing.JLabel txtPassword;
    // End of variables declaration//GEN-END:variables
}
