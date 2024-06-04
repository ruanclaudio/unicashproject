/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.view;

/**
 *
 * @author ruanc
 */
public class EditProfilePage extends javax.swing.JFrame {

    /**
     * Creates new form EditeProfilePage
     */
    public EditProfilePage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editProfilePane = new javax.swing.JPanel();
        profileNameLabel = new javax.swing.JLabel();
        profileImage = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        editProfileBtn = new javax.swing.JButton();
        personalNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cnpjLabel = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        empNameTxtFiled = new javax.swing.JTextField();
        persNameTxtFiled = new javax.swing.JTextField();
        persNameTxtFiled3 = new javax.swing.JTextField();
        persNameTxtFiled4 = new javax.swing.JTextField();
        goBackBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(870, 520));
        setResizable(false);

        editProfilePane.setBackground(new java.awt.Color(217, 217, 217));
        editProfilePane.setPreferredSize(new java.awt.Dimension(800, 500));

        profileNameLabel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        profileNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        profileNameLabel.setText("NOME DA EMPRESA");
        profileNameLabel.setAlignmentY(0.0F);

        profileImage.setBackground(new java.awt.Color(1, 8, 34));
        profileImage.setForeground(new java.awt.Color(1, 8, 34));
        profileImage.setText("           FOTO DE PERFIL");
        profileImage.setToolTipText("");
        profileImage.setAlignmentY(0.0F);
        profileImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profileImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileImage.setMaximumSize(new java.awt.Dimension(120, 20));
        profileImage.setMinimumSize(new java.awt.Dimension(120, 20));
        profileImage.setName(""); // NOI18N

        textLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        textLabel.setForeground(new java.awt.Color(0, 0, 0));
        textLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLabel.setText("PERFIL DO USUÁRIO");

        editProfileBtn.setBackground(new java.awt.Color(1, 8, 34));
        editProfileBtn.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        editProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        editProfileBtn.setText("Upload");
        editProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileBtnActionPerformed(evt);
            }
        });

        personalNameLabel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        personalNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        personalNameLabel.setText("NOME DA PESSOA FISICA");
        personalNameLabel.setAlignmentY(0.0F);

        emailLabel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailLabel.setText("E-MAIL");
        emailLabel.setAlignmentY(0.0F);

        cnpjLabel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        cnpjLabel.setForeground(new java.awt.Color(0, 0, 0));
        cnpjLabel.setText("CNPJ");
        cnpjLabel.setAlignmentY(0.0F);

        saveBtn.setBackground(new java.awt.Color(1, 8, 36));
        saveBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("SALVAR ALTERAÇÕES");
        saveBtn.setBorder(new javax.swing.border.MatteBorder(null));
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        empNameTxtFiled.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        empNameTxtFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameTxtFiledActionPerformed(evt);
            }
        });

        persNameTxtFiled.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        persNameTxtFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persNameTxtFiledActionPerformed(evt);
            }
        });

        persNameTxtFiled3.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        persNameTxtFiled3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persNameTxtFiled3ActionPerformed(evt);
            }
        });

        persNameTxtFiled4.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        persNameTxtFiled4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persNameTxtFiled4ActionPerformed(evt);
            }
        });

        goBackBtn.setIcon(new javax.swing.ImageIcon("src/resource/icons/previous_black.png"));

        javax.swing.GroupLayout editProfilePaneLayout = new javax.swing.GroupLayout(editProfilePane);
        editProfilePane.setLayout(editProfilePaneLayout);
        editProfilePaneLayout.setHorizontalGroup(
            editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProfilePaneLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailLabel)
                        .addGroup(editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(persNameTxtFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(profileNameLabel)
                                .addComponent(empNameTxtFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(personalNameLabel)))
                        .addComponent(cnpjLabel)
                        .addComponent(persNameTxtFiled3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(persNameTxtFiled4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(profileImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProfilePaneLayout.createSequentialGroup()
                        .addComponent(editProfileBtn)
                        .addGap(33, 33, 33)))
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProfilePaneLayout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(317, 317, 317))
            .addGroup(editProfilePaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(editProfilePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        editProfilePaneLayout.setVerticalGroup(
            editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProfilePaneLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(goBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textLabel)
                .addGap(58, 58, 58)
                .addComponent(profileNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editProfilePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProfilePaneLayout.createSequentialGroup()
                        .addComponent(empNameTxtFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(personalNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(persNameTxtFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel)
                        .addGap(11, 11, 11)
                        .addComponent(persNameTxtFiled4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(cnpjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(persNameTxtFiled3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editProfilePaneLayout.createSequentialGroup()
                        .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editProfileBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editProfilePane, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editProfilePane, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(812, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editProfileBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveBtnActionPerformed

    private void empNameTxtFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameTxtFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameTxtFiledActionPerformed

    private void persNameTxtFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persNameTxtFiledActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persNameTxtFiledActionPerformed

    private void persNameTxtFiled3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persNameTxtFiled3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persNameTxtFiled3ActionPerformed

    private void persNameTxtFiled4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persNameTxtFiled4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_persNameTxtFiled4ActionPerformed

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
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JPanel editProfilePane;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField empNameTxtFiled;
    private javax.swing.JLabel goBackBtn;
    private javax.swing.JTextField persNameTxtFiled;
    private javax.swing.JTextField persNameTxtFiled3;
    private javax.swing.JTextField persNameTxtFiled4;
    private javax.swing.JLabel personalNameLabel;
    private javax.swing.JLabel profileImage;
    private javax.swing.JLabel profileNameLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel textLabel;
    // End of variables declaration//GEN-END:variables
}