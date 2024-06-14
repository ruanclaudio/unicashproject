package main.view;

import javax.swing.JOptionPane;
import main.controller.PageManager;
import main.controller.PageTransitionHandler;

public class AlertsPage extends javax.swing.JFrame {
    private PageTransitionHandler pageTHandler;
    private PageManager alertPage;
    
    public AlertsPage(PageTransitionHandler pageTHandler) {
        initComponents();
        this.pageTHandler = pageTHandler;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        messageLabel = new javax.swing.JLabel();
        messageArea1 = new javax.swing.JLabel();
        divisorPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        wellcome = new javax.swing.JLabel();
        myProductsBtn = new javax.swing.JButton();
        myMaterialsBtn = new javax.swing.JButton();
        myAlertsBtn = new javax.swing.JButton();
        myProfileBtn = new javax.swing.JButton();
        calculateTaxBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        headerPanel.setBackground(new java.awt.Color(1, 8, 34));
        headerPanel.setMaximumSize(new java.awt.Dimension(751, 80));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHeader.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        logoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoHeader.setIcon(new javax.swing.ImageIcon("src/resource/image/unicash_icon_removebg.png"));
        headerPanel.add(logoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 80));

        titleLabel.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("UniCash");
        headerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 10, 860, -1));

        mainPanel.setBackground(new java.awt.Color(217, 217, 217));
        mainPanel.setMaximumSize(new java.awt.Dimension(870, 520));

        messageLabel.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(0, 0, 0));
        messageLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageLabel.setText("CAIXA DE ENTRADA");

        messageArea1.setBackground(new java.awt.Color(153, 153, 153));
        messageArea1.setFont(new java.awt.Font("Inter", 0, 13)); // NOI18N
        messageArea1.setForeground(new java.awt.Color(0, 0, 0));
        messageArea1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messageArea1.setText("SUA CAIXA DE MENSAGENS ESTÁ VAZIA");
        messageArea1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(messageArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 794, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(messageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146)
                .addComponent(messageArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        divisorPanel.setBackground(new java.awt.Color(1, 8, 34));

        javax.swing.GroupLayout divisorPanelLayout = new javax.swing.GroupLayout(divisorPanel);
        divisorPanel.setLayout(divisorPanelLayout);
        divisorPanelLayout.setHorizontalGroup(
            divisorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        divisorPanelLayout.setVerticalGroup(
            divisorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        menuPanel.setBackground(new java.awt.Color(217, 217, 217));
        menuPanel.setForeground(new java.awt.Color(0, 0, 0));
        menuPanel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 500));

        wellcome.setBackground(new java.awt.Color(68, 68, 68));
        wellcome.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        wellcome.setForeground(new java.awt.Color(32, 32, 138));
        wellcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wellcome.setText("BEM-VINDO");

        myProductsBtn.setBackground(new java.awt.Color(217, 217, 217));
        myProductsBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        myProductsBtn.setForeground(new java.awt.Color(0, 0, 0));
        myProductsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/box.png"))); // NOI18N
        myProductsBtn.setText(" MEUS PRODUTOS");
        myProductsBtn.setBorder(null);
        myProductsBtn.setBorderPainted(false);
        myProductsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myProductsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myProductsBtnMouseExited(evt);
            }
        });
        myProductsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProductsBtnActionPerformed(evt);
            }
        });

        myMaterialsBtn.setBackground(new java.awt.Color(217, 217, 217));
        myMaterialsBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        myMaterialsBtn.setForeground(new java.awt.Color(0, 0, 0));
        myMaterialsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/processing.png"))); // NOI18N
        myMaterialsBtn.setText("MEUS MATERIAIS");
        myMaterialsBtn.setBorder(null);
        myMaterialsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myMaterialsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myMaterialsBtnMouseExited(evt);
            }
        });
        myMaterialsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myMaterialsBtnActionPerformed(evt);
            }
        });

        myAlertsBtn.setBackground(new java.awt.Color(217, 217, 217));
        myAlertsBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        myAlertsBtn.setForeground(new java.awt.Color(0, 0, 0));
        myAlertsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/bell.png"))); // NOI18N
        myAlertsBtn.setText("MEUS ALERTAS");
        myAlertsBtn.setBorder(null);
        myAlertsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myAlertsBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myAlertsBtnMouseExited(evt);
            }
        });
        myAlertsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myAlertsBtnActionPerformed(evt);
            }
        });

        myProfileBtn.setBackground(new java.awt.Color(217, 217, 217));
        myProfileBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        myProfileBtn.setForeground(new java.awt.Color(0, 0, 0));
        myProfileBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/user.png"))); // NOI18N
        myProfileBtn.setText("MEU PERFIL");
        myProfileBtn.setBorder(null);
        myProfileBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myProfileBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myProfileBtnMouseExited(evt);
            }
        });
        myProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myProfileBtnActionPerformed(evt);
            }
        });

        calculateTaxBtn.setBackground(new java.awt.Color(217, 217, 217));
        calculateTaxBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        calculateTaxBtn.setForeground(new java.awt.Color(0, 0, 0));
        calculateTaxBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/tax.png"))); // NOI18N
        calculateTaxBtn.setText("CALCULAR IMPOSTOS");
        calculateTaxBtn.setBorder(null);
        calculateTaxBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calculateTaxBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calculateTaxBtnMouseExited(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(217, 217, 217));
        logoutBtn.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(0, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/icons/power-button.png"))); // NOI18N
        logoutBtn.setText("SAIR");
        logoutBtn.setBorder(null);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(wellcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn)
                    .addComponent(calculateTaxBtn)
                    .addComponent(myProfileBtn)
                    .addComponent(myAlertsBtn)
                    .addComponent(myMaterialsBtn)
                    .addComponent(myProductsBtn))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(wellcome)
                .addGap(48, 48, 48)
                .addComponent(myProductsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myMaterialsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myAlertsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(myProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateTaxBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 875, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(divisorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(divisorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myProductsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProductsBtnMouseEntered
        myProductsBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myProductsBtnMouseEntered

    private void myProductsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProductsBtnMouseExited
        myProductsBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myProductsBtnMouseExited

    private void myProductsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProductsBtnActionPerformed
        if(!pageTHandler.isPageOpen(new ProductPage(pageTHandler))) {
            pageTHandler.openPage(new ProductPage(pageTHandler));
        }
    }//GEN-LAST:event_myProductsBtnActionPerformed

    private void myMaterialsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myMaterialsBtnMouseEntered
        myMaterialsBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myMaterialsBtnMouseEntered

    private void myMaterialsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myMaterialsBtnMouseExited
        myMaterialsBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myMaterialsBtnMouseExited

    private void myMaterialsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myMaterialsBtnActionPerformed
        if(!pageTHandler.isPageOpen(new MaterialsPage(pageTHandler))) {
            pageTHandler.openPage(new MaterialsPage(pageTHandler));
        }
    }//GEN-LAST:event_myMaterialsBtnActionPerformed

    private void myAlertsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAlertsBtnMouseEntered
        myAlertsBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myAlertsBtnMouseEntered

    private void myAlertsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAlertsBtnMouseExited
        myAlertsBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myAlertsBtnMouseExited

    private void myAlertsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAlertsBtnActionPerformed
        if(!pageTHandler.isPageOpen(new AlertsPage(pageTHandler))) {
            pageTHandler.openPage(new AlertsPage(pageTHandler));
        }
    }//GEN-LAST:event_myAlertsBtnActionPerformed

    private void myProfileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBtnMouseEntered
        myProfileBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myProfileBtnMouseEntered

    private void myProfileBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBtnMouseExited
        myProfileBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myProfileBtnMouseExited

    private void myProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileBtnActionPerformed
        if(!pageTHandler.isPageOpen(new ProfilePage(pageTHandler))) {
            pageTHandler.openPage(new ProfilePage(pageTHandler));
        }
    }//GEN-LAST:event_myProfileBtnActionPerformed

    private void calculateTaxBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateTaxBtnMouseEntered
        calculateTaxBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_calculateTaxBtnMouseEntered

    private void calculateTaxBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateTaxBtnMouseExited
        calculateTaxBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_calculateTaxBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da conta?", "Logout", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            pageTHandler.openPage(new LoginPage(pageTHandler));
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

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
//            java.util.logging.Logger.getLogger(AlertsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AlertsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AlertsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AlertsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AlertsPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateTaxBtn;
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel messageArea1;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JButton myAlertsBtn;
    private javax.swing.JButton myMaterialsBtn;
    private javax.swing.JButton myProductsBtn;
    private javax.swing.JButton myProfileBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
