package main.view;

import javax.swing.JOptionPane;
import main.controller.PageTransitionHandler;
import main.model.DAO.UserDAO;

public class LoginPage extends javax.swing.JFrame {
    private PageTransitionHandler pageTHandler;
    
    public LoginPage() {
        initComponents();
        
    }
    
    public LoginPage(PageTransitionHandler pageTransitionHandler) {
        initComponents();
        this.pageTHandler = pageTransitionHandler;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel = new javax.swing.JPanel();
        loginImageLabel = new javax.swing.JLabel();
        loginFormPanel = new javax.swing.JPanel();
        exitLabel = new javax.swing.JLabel();
        titleTxtLabel = new javax.swing.JLabel();
        txtCNPJ = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        loginIconLabel = new javax.swing.JLabel();
        tfCNPJ = new javax.swing.JTextField();
        showPassBtn = new javax.swing.JToggleButton();
        tfPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel.setBackground(new java.awt.Color(0, 9, 36));

        loginImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/image/unicash_image_removebg.png"))); // NOI18N
        imagePanel.add(loginImageLabel);

        getContentPane().add(imagePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 490));

        loginFormPanel.setBackground(new java.awt.Color(1, 8, 34));
        loginFormPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitLabel.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        exitLabel.setForeground(new java.awt.Color(255, 255, 255));
        exitLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/close_w.png"))); // NOI18N
        exitLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        loginFormPanel.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 31));

        titleTxtLabel.setBackground(new java.awt.Color(255, 255, 255));
        titleTxtLabel.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        titleTxtLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleTxtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleTxtLabel.setText("UniCash Login");
        loginFormPanel.add(titleTxtLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 430, -1));

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

        loginIconLabel.setBackground(new java.awt.Color(0, 0, 51));
        loginIconLabel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        loginIconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/image/unicash_icon_removebg.png"))); // NOI18N
        loginIconLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginFormPanel.add(loginIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 90, 70));

        tfCNPJ.setBackground(new java.awt.Color(255, 255, 255));
        tfCNPJ.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        tfCNPJ.setForeground(new java.awt.Color(0, 0, 0));
        loginFormPanel.add(tfCNPJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 270, -1));

        showPassBtn.setBackground(new java.awt.Color(255, 255, 255));
        showPassBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/show.png"))); // NOI18N
        showPassBtn.setBorder(null);
        showPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassBtnActionPerformed(evt);
            }
        });
        loginFormPanel.add(showPassBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 30, 22));

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
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
        
        UserDAO userDAO = new UserDAO();
        boolean sucessLogin = userDAO.verifyLogin(cnpj, password);
        
        if (sucessLogin) {
            pageTHandler.openPage(new ProductPage(pageTHandler));
        } else {
            JOptionPane.showMessageDialog(this, "CNPJ ou senha inválidos.");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        if(!pageTHandler.isPageOpen(new RegisterPage(pageTHandler))) {
            pageTHandler.openPage(new RegisterPage(pageTHandler));
        }
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
                new LoginPage().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JPanel loginFormPanel;
    private javax.swing.JLabel loginIconLabel;
    private javax.swing.JLabel loginImageLabel;
    private javax.swing.JToggleButton showPassBtn;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JLabel titleTxtLabel;
    private javax.swing.JLabel txtCNPJ;
    private javax.swing.JLabel txtPassword;
    // End of variables declaration//GEN-END:variables
}
