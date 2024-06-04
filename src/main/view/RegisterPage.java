package main.view;

import javax.swing.JOptionPane;
import main.model.DAO.UserDAO;
import main.model.entities.UserEntity;

public class RegisterPage extends javax.swing.JFrame {
    public RegisterPage() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        formsPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        txtUserName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JLabel();
        txtPassword = new javax.swing.JLabel();
        tfPassword = new javax.swing.JPasswordField();
        tfCNPJ = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfUserName = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        goBackBtn = new javax.swing.JButton();
        tfConfirmPass = new javax.swing.JPasswordField();
        txtConfirmPassword = new javax.swing.JLabel();
        txtEmpress = new javax.swing.JLabel();
        tfNameEmpress = new javax.swing.JTextField();
        iconPanel = new javax.swing.JPanel();
        registerImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        formsPanel.setBackground(new java.awt.Color(1, 8, 34));
        formsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLabel.setBackground(new java.awt.Color(255, 255, 255));
        exitLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon("src/resource/icons/close_white.png"));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        formsPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 0, 42, 31));

        titleLabel.setBackground(new java.awt.Color(0, 0, 51));
        titleLabel.setFont(new java.awt.Font("Inter", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Unicash Cadastro");
        formsPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 400, -1));

        txtUserName.setBackground(new java.awt.Color(0, 0, 51));
        txtUserName.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(255, 255, 255));
        txtUserName.setText("Nome de Usuário:");
        formsPanel.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        txtEmail.setBackground(new java.awt.Color(0, 0, 51));
        txtEmail.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("Email:");
        formsPanel.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        txtCNPJ.setBackground(new java.awt.Color(0, 0, 51));
        txtCNPJ.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        txtCNPJ.setText("CNPJ:");
        formsPanel.add(txtCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        txtPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtPassword.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("Senha:");
        formsPanel.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(0, 0, 0));
        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });
        formsPanel.add(tfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 290, -1));

        tfCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        tfCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 290, -1));

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 290, -1));

        tfUserName.setBackground(new java.awt.Color(255, 255, 255));
        tfUserName.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 290, -1));

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
        formsPanel.add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 140, 40));

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
        formsPanel.add(goBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, 100, 30));

        tfConfirmPass.setBackground(new java.awt.Color(255, 255, 255));
        tfConfirmPass.setForeground(new java.awt.Color(0, 0, 0));
        tfConfirmPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConfirmPassActionPerformed(evt);
            }
        });
        formsPanel.add(tfConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 290, -1));

        txtConfirmPassword.setBackground(new java.awt.Color(0, 0, 51));
        txtConfirmPassword.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassword.setText("Confirmar senha:");
        formsPanel.add(txtConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        txtEmpress.setBackground(new java.awt.Color(0, 0, 51));
        txtEmpress.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        txtEmpress.setForeground(new java.awt.Color(255, 255, 255));
        txtEmpress.setText("Nome da Empresa:");
        formsPanel.add(txtEmpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        tfNameEmpress.setBackground(new java.awt.Color(255, 255, 255));
        tfNameEmpress.setForeground(new java.awt.Color(0, 0, 0));
        formsPanel.add(tfNameEmpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 290, -1));

        getContentPane().add(formsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 400, 490));

        iconPanel.setBackground(new java.awt.Color(0, 9, 36));

        registerImageLabel.setBackground(new java.awt.Color(0, 9, 36));
        registerImageLabel.setIcon(new javax.swing.ImageIcon("src/resource/image/unicash_image_removebg.png"));
        registerImageLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        iconPanel.add(registerImageLabel);

        getContentPane().add(iconPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 490));

        setSize(new java.awt.Dimension(800, 490));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {
            char[] passwordChars = tfPassword.getPassword();
            char[] confPasswordChars = tfConfirmPass.getPassword();
            String password = new String(passwordChars);
            String confirmPassword = new String(confPasswordChars);

            if (tfCNPJ.getText().isEmpty() || tfNameEmpress.getText().isEmpty() || tfUserName.getText().isEmpty() || tfEmail.getText().isEmpty()
                || password.isEmpty() || confirmPassword.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos os campos precisam estar preenchidos para que o cadastro seja realizado.");
                return;
            }

            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(null, "As senhas não coincidem.");
                return;
            }

            UserDAO uDAO = new UserDAO();
            UserEntity newUser = new UserEntity(tfCNPJ.getText(), tfNameEmpress.getText(), tfUserName.getText(), tfEmail.getText(), password);
            uDAO.createNewUser(newUser);

            setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void goBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackBtnActionPerformed
        setVisible(false);
    }//GEN-LAST:event_goBackBtnActionPerformed

    private void tfConfirmPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConfirmPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConfirmPassActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RegisterPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel formsPanel;
    private javax.swing.JButton goBackBtn;
    private javax.swing.JPanel iconPanel;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel registerImageLabel;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JPasswordField tfConfirmPass;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNameEmpress;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel txtCNPJ;
    private javax.swing.JLabel txtConfirmPassword;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEmpress;
    private javax.swing.JLabel txtPassword;
    private javax.swing.JLabel txtUserName;
    // End of variables declaration//GEN-END:variables
}
