package main.view;

import javax.swing.JOptionPane;
import main.controller.PageManager;
import main.controller.PageTransitionHandler;
import main.view.AlertsPage;
import main.view.LoginPage;
import main.view.MaterialsPage;
import main.view.ProductPage;

public class ProfilePage extends javax.swing.JFrame {
    private PageTransitionHandler pageTHandler;
    private PageManager profilePage;
    
    public ProfilePage(PageTransitionHandler pageTHandler) {
        initComponents();
        this.pageTHandler = pageTHandler;
    }
    
    public ProfilePage() {
        initComponents();
    }
    
    
    private void fillProfileFields() {

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        profileNameLabel = new javax.swing.JLabel();
        profileImage = new javax.swing.JLabel();
        textLabel = new javax.swing.JLabel();
        editProfileBtn = new javax.swing.JButton();
        personalNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cnpjLabel = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        cnpjTF = new javax.swing.JTextField();
        empNameTF = new javax.swing.JTextField();
        persNameTF = new javax.swing.JTextField();
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
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHeader.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        logoHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/image/unicash_icon_removebg.png"))); // NOI18N
        headerPanel.add(logoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 90, 80));

        titleLabel.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("UniCash");
        headerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 860, -1));

        mainPanel.setBackground(new java.awt.Color(217, 217, 217));

        profileNameLabel.setFont(new java.awt.Font("Inter", 0, 18)); // NOI18N
        profileNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        profileNameLabel.setText("NOME DA EMPRESA");
        profileNameLabel.setAlignmentY(0.0F);

        profileImage.setBackground(new java.awt.Color(1, 8, 34));
        profileImage.setForeground(new java.awt.Color(1, 8, 34));
        profileImage.setToolTipText("");
        profileImage.setAlignmentY(0.0F);
        profileImage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        profileImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        profileImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        editProfileBtn.setText("Editar Perfil");
        editProfileBtn.setBorder(null);
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

        emailTF.setEditable(false);
        emailTF.setBackground(new java.awt.Color(204, 204, 204));
        emailTF.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        emailTF.setForeground(new java.awt.Color(51, 51, 51));
        emailTF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        cnpjTF.setEditable(false);
        cnpjTF.setBackground(new java.awt.Color(204, 204, 204));
        cnpjTF.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        cnpjTF.setForeground(new java.awt.Color(51, 51, 51));
        cnpjTF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        empNameTF.setEditable(false);
        empNameTF.setBackground(new java.awt.Color(204, 204, 204));
        empNameTF.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        empNameTF.setForeground(new java.awt.Color(51, 51, 51));
        empNameTF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        empNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameTFActionPerformed(evt);
            }
        });

        persNameTF.setEditable(false);
        persNameTF.setBackground(new java.awt.Color(204, 204, 204));
        persNameTF.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        persNameTF.setForeground(new java.awt.Color(51, 51, 51));
        persNameTF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(profileNameLabel)
                    .addComponent(personalNameLabel)
                    .addComponent(emailLabel)
                    .addComponent(cnpjLabel)
                    .addComponent(emailTF)
                    .addComponent(cnpjTF)
                    .addComponent(empNameTF)
                    .addComponent(persNameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(editProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
            .addComponent(textLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(textLabel)
                .addGap(58, 58, 58)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(profileImage, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(profileNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(personalNameLabel)
                        .addGap(7, 7, 7)
                        .addComponent(persNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(cnpjLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cnpjTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(divisorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(divisorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileBtnActionPerformed

    }//GEN-LAST:event_editProfileBtnActionPerformed

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

    private void empNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameTFActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateTaxBtn;
    private javax.swing.JLabel cnpjLabel;
    private javax.swing.JTextField cnpjTF;
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JButton editProfileBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JTextField empNameTF;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton myAlertsBtn;
    private javax.swing.JButton myMaterialsBtn;
    private javax.swing.JButton myProductsBtn;
    private javax.swing.JButton myProfileBtn;
    private javax.swing.JTextField persNameTF;
    private javax.swing.JLabel personalNameLabel;
    private javax.swing.JLabel profileImage;
    private javax.swing.JLabel profileNameLabel;
    private javax.swing.JLabel textLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
