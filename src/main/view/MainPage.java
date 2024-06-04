package main.view;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.model.DAO.ProductDAO;
import main.model.entities.ProdEntity;
import main.view.dialogs.*;



public class MainPage extends javax.swing.JFrame {
    public MainPage() {
        initComponents();
        
        DefaultTableModel model = (DefaultTableModel) jTdashProducts.getModel();
        jTdashProducts.setRowSorter(new TableRowSorter(model));
        readTable();
    }
    
    public void readTable() {
        DefaultTableModel model = (DefaultTableModel) jTdashProducts.getModel();
        model.setNumRows(0);
        ProductDAO pDAO = new ProductDAO();
        
        for(ProdEntity p: pDAO.readProduct()) {
            model.addRow(new Object[]{
                p.getProd_id(),
                p.getProd_name(),
                p.getProd_qnt(),
                p.getProd_cost(),
                p.getProd_price(),
                p.getProd_profit()
            });
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        headerPanel = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        buttonsPanel = new javax.swing.JPanel();
        registerProdBtn = new javax.swing.JButton();
        editProdBtn = new javax.swing.JButton();
        deleteProdBtn = new javax.swing.JButton();
        searchTxtField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdashProducts = new javax.swing.JTable();
        divisorPanel = new javax.swing.JPanel();
        menuPanel = new javax.swing.JPanel();
        wellcome = new javax.swing.JLabel();
        optProfile = new javax.swing.JLabel();
        optSettings = new javax.swing.JLabel();
        optSell = new javax.swing.JLabel();
        optAlert = new javax.swing.JLabel();
        optDashboard = new javax.swing.JLabel();
        iconDashboard = new javax.swing.JLabel();
        iconSell = new javax.swing.JLabel();
        iconAlerts = new javax.swing.JLabel();
        iconProfile = new javax.swing.JLabel();
        iconSettings = new javax.swing.JLabel();
        optSell1 = new javax.swing.JLabel();
        iconSell1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 8, 34));
        setMaximumSize(new java.awt.Dimension(1125, 600));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(1, 8, 34));
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

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1125, -1));

        mainPanel.setBackground(new java.awt.Color(217, 217, 217));

        buttonsPanel.setBackground(new java.awt.Color(153, 153, 153));

        registerProdBtn.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        registerProdBtn.setText("Cadastrar");
        registerProdBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerProdBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        registerProdBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        registerProdBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        registerProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerProdBtnActionPerformed(evt);
            }
        });

        editProdBtn.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        editProdBtn.setText("Editar");
        editProdBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editProdBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        editProdBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        editProdBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        editProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdBtnActionPerformed(evt);
            }
        });

        deleteProdBtn.setFont(new java.awt.Font("Inter", 1, 12)); // NOI18N
        deleteProdBtn.setText("Deletar");
        deleteProdBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteProdBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        deleteProdBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        deleteProdBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        deleteProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdBtnActionPerformed(evt);
            }
        });

        searchTxtField.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        searchTxtField.setText("Buscar produtos");
        searchTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTxtFieldActionPerformed(evt);
            }
        });

        searchButton.setIcon(new javax.swing.ImageIcon("src/resource/icons/search_white.png"));
        searchButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(registerProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(deleteProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(registerProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEUS PRODUTOS");

        jTdashProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUTO", "QUANTIDADE", "CUSTO", "PREÇO", "LUCRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTdashProducts);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 80, 870, 520));

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

        getContentPane().add(divisorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 5, 520));

        menuPanel.setBackground(new java.awt.Color(217, 217, 217));
        menuPanel.setForeground(new java.awt.Color(0, 0, 0));
        menuPanel.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        menuPanel.setPreferredSize(new java.awt.Dimension(250, 500));

        wellcome.setBackground(new java.awt.Color(68, 68, 68));
        wellcome.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        wellcome.setForeground(new java.awt.Color(32, 32, 138));
        wellcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wellcome.setText("BEM-VINDO");

        optProfile.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        optProfile.setForeground(new java.awt.Color(0, 0, 0));
        optProfile.setText("Perfil");
        optProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                optProfileMouseClicked(evt);
            }
        });

        optSettings.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        optSettings.setForeground(new java.awt.Color(0, 0, 0));
        optSettings.setText("Configurações");

        optSell.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        optSell.setForeground(new java.awt.Color(0, 0, 0));
        optSell.setText("Vendas");

        optAlert.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        optAlert.setForeground(new java.awt.Color(0, 0, 0));
        optAlert.setText("Alertas");

        optDashboard.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        optDashboard.setForeground(new java.awt.Color(0, 0, 0));
        optDashboard.setText("Menu");

        iconDashboard.setForeground(new java.awt.Color(0, 0, 0));
        iconDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconDashboard.setIcon(new javax.swing.ImageIcon("src/resource/icons/dashboard.png"));

        iconSell.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSell.setIcon(new javax.swing.ImageIcon("src/resource/icons/sale.png"));

        iconAlerts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAlerts.setIcon(new javax.swing.ImageIcon("src/resource/icons/bell.png"));

        iconProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconProfile.setIcon(new javax.swing.ImageIcon("src/resource/icons/user.png"));

        iconSettings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSettings.setIcon(new javax.swing.ImageIcon("src/resource/icons/settings.png"));

        optSell1.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        optSell1.setForeground(new java.awt.Color(0, 0, 0));
        optSell1.setText("Materiais");

        iconSell1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconSell1.setIcon(new javax.swing.ImageIcon("src/resource/icons/materials.png"));

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(optProfile))
                    .addComponent(iconProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconSell1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optSell1))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconSell, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optSell))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optSettings))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optDashboard))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optAlert)))
                .addGap(25, 25, 25))
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(wellcome, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(wellcome)
                .addGap(50, 50, 50)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optSell)
                    .addComponent(iconSell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optSell1)
                    .addComponent(iconSell1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optAlert))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optProfile)
                    .addComponent(iconProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optSettings))
                .addGap(0, 117, Short.MAX_VALUE))
        );

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 520));

        setSize(new java.awt.Dimension(1141, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void optProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optProfileMouseClicked

    }//GEN-LAST:event_optProfileMouseClicked

    private void registerProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerProdBtnActionPerformed
        RegisterProduct rProduct = new RegisterProduct();
        rProduct.setVisible(true);
    }//GEN-LAST:event_registerProdBtnActionPerformed

    private void editProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdBtnActionPerformed
        EditProduct eProduct = new EditProduct();
        eProduct.setVisible(true);
    }//GEN-LAST:event_editProdBtnActionPerformed

    private void deleteProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProdBtnActionPerformed
        DeleteProduct dProduct = new DeleteProduct();
        dProduct.setVisible(true);
    }//GEN-LAST:event_deleteProdBtnActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTxtFieldActionPerformed

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private java.awt.Choice choice1;
    private javax.swing.JButton deleteProdBtn;
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JButton editProdBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel iconAlerts;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconProfile;
    private javax.swing.JLabel iconSell;
    private javax.swing.JLabel iconSell1;
    private javax.swing.JLabel iconSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTdashProducts;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel optAlert;
    private javax.swing.JLabel optDashboard;
    private javax.swing.JLabel optProfile;
    private javax.swing.JLabel optSell;
    private javax.swing.JLabel optSell1;
    private javax.swing.JLabel optSettings;
    private javax.swing.JButton registerProdBtn;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTxtField;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
