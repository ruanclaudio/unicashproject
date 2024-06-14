package main.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.controller.PageTransitionHandler;
import main.model.DAO.ProductDAO;
import main.model.entities.ProdEntity;

public class ProductPage extends javax.swing.JFrame {
    private PageTransitionHandler pageTHandler;
    
    public ProductPage(PageTransitionHandler pageTransitionHandler) {
        initComponents();
        this.pageTHandler = pageTransitionHandler;
        
        DefaultTableModel model = (DefaultTableModel) jTProducts.getModel();
        jTProducts.setRowSorter(new TableRowSorter(model));
        readTable();
    }
    
    public ProductPage() {
        initComponents();
        
    }
    
    private void readTable() {
        DefaultTableModel model = (DefaultTableModel) jTProducts.getModel();
        model.setNumRows(0);
        ProductDAO pDAO = new ProductDAO();
        
        for(ProdEntity p: pDAO.readProduct()) {
            model.addRow(new Object[]{
                p.getProd_id(),
                p.getProd_name(),
                p.getProd_qty(),
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
        nameProdTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qntProdTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costProdTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sellPriceProdTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTProducts = new javax.swing.JTable();
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
        setBackground(new java.awt.Color(1, 8, 34));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        headerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 10, 860, -1));

        getContentPane().add(headerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1125, -1));

        mainPanel.setBackground(new java.awt.Color(217, 217, 217));

        buttonsPanel.setBackground(new java.awt.Color(1, 8, 34));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(870, 100));

        registerProdBtn.setBackground(new java.awt.Color(187, 187, 187));
        registerProdBtn.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        registerProdBtn.setForeground(new java.awt.Color(51, 51, 51));
        registerProdBtn.setText("Cadastrar");
        registerProdBtn.setBorder(null);
        registerProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerProdBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        registerProdBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        registerProdBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        registerProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerProdBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerProdBtnMouseExited(evt);
            }
        });
        registerProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerProdBtnActionPerformed(evt);
            }
        });

        editProdBtn.setBackground(new java.awt.Color(187, 187, 187));
        editProdBtn.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        editProdBtn.setForeground(new java.awt.Color(51, 51, 51));
        editProdBtn.setText("Editar");
        editProdBtn.setBorder(null);
        editProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProdBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        editProdBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        editProdBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        editProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editProdBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editProdBtnMouseExited(evt);
            }
        });
        editProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProdBtnActionPerformed(evt);
            }
        });

        deleteProdBtn.setBackground(new java.awt.Color(187, 187, 187));
        deleteProdBtn.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        deleteProdBtn.setForeground(new java.awt.Color(51, 51, 51));
        deleteProdBtn.setText("Deletar");
        deleteProdBtn.setBorder(null);
        deleteProdBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteProdBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        deleteProdBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        deleteProdBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        deleteProdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteProdBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteProdBtnMouseExited(evt);
            }
        });
        deleteProdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProdBtnActionPerformed(evt);
            }
        });

        nameProdTf.setBackground(new java.awt.Color(187, 187, 187));
        nameProdTf.setForeground(new java.awt.Color(0, 0, 0));
        nameProdTf.setBorder(null);
        nameProdTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Produto:");

        qntProdTf.setBackground(new java.awt.Color(187, 187, 187));
        qntProdTf.setForeground(new java.awt.Color(0, 0, 0));
        qntProdTf.setBorder(null);
        qntProdTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");

        costProdTf.setBackground(new java.awt.Color(187, 187, 187));
        costProdTf.setForeground(new java.awt.Color(0, 0, 0));
        costProdTf.setBorder(null);
        costProdTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel4.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor de Custo:");

        sellPriceProdTf.setBackground(new java.awt.Color(187, 187, 187));
        sellPriceProdTf.setForeground(new java.awt.Color(0, 0, 0));
        sellPriceProdTf.setBorder(null);
        sellPriceProdTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel5.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Valor da Venda:");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(registerProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nameProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qntProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellPriceProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5)))))
                .addContainerGap())
        );
        buttonsPanelLayout.setVerticalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qntProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellPriceProdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(registerProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editProdBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteProdBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEUS PRODUTOS");

        tablePanel.setBackground(new java.awt.Color(217, 217, 217));

        jTProducts.setBackground(new java.awt.Color(102, 102, 102));
        jTProducts.setForeground(new java.awt.Color(255, 255, 255));
        jTProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME DO PRODUTO", "QUANTIDADE", "VALOR DE CUSTO", "VALOR DE VENDA", "LUCRO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProductsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTProducts);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(31, 31, 31)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 520));

        setSize(new java.awt.Dimension(1141, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void myProductsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProductsBtnMouseEntered
        myProductsBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myProductsBtnMouseEntered

    private void myProductsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProductsBtnMouseExited
        myProductsBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myProductsBtnMouseExited

    private void myMaterialsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myMaterialsBtnMouseEntered
        myMaterialsBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myMaterialsBtnMouseEntered

    private void myMaterialsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myMaterialsBtnMouseExited
        myMaterialsBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myMaterialsBtnMouseExited

    private void myAlertsBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAlertsBtnMouseEntered
        myAlertsBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myAlertsBtnMouseEntered

    private void myAlertsBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myAlertsBtnMouseExited
        myAlertsBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myAlertsBtnMouseExited

    private void myProfileBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBtnMouseEntered
        myProfileBtn.setForeground(new java.awt.Color(254,50,21));
    }//GEN-LAST:event_myProfileBtnMouseEntered

    private void myProfileBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myProfileBtnMouseExited
        myProfileBtn.setForeground(new java.awt.Color(0,0,0));
    }//GEN-LAST:event_myProfileBtnMouseExited

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

    private void myProductsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProductsBtnActionPerformed
        if(!pageTHandler.isPageOpen(new ProductPage(pageTHandler))) {
            pageTHandler.openPage(new ProductPage(pageTHandler));
        }
    }//GEN-LAST:event_myProductsBtnActionPerformed

    private void myMaterialsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myMaterialsBtnActionPerformed
        if(!pageTHandler.isPageOpen(new MaterialsPage(pageTHandler))) {
            pageTHandler.openPage(new MaterialsPage(pageTHandler));
        }
    }//GEN-LAST:event_myMaterialsBtnActionPerformed

    private void myAlertsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myAlertsBtnActionPerformed
        if(!pageTHandler.isPageOpen(new AlertsPage(pageTHandler))) {
            pageTHandler.openPage(new AlertsPage(pageTHandler));
        }
    }//GEN-LAST:event_myAlertsBtnActionPerformed

    private void myProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myProfileBtnActionPerformed
        if(!pageTHandler.isPageOpen(new ProfilePage(pageTHandler))) {
            pageTHandler.openPage(new ProfilePage(pageTHandler));
        }
    }//GEN-LAST:event_myProfileBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Deseja realmente sair da conta?", "Logout", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            pageTHandler.openPage(new LoginPage(pageTHandler));
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void deleteProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProdBtnActionPerformed
        if(jTProducts.getSelectedRow() != -1) {
            jTProducts.getSelectedRow();
            ProductDAO pDAO = new ProductDAO();
            ProdEntity updateP = new ProdEntity();
            
            updateP.setProd_id((int)jTProducts.getValueAt(jTProducts.getSelectedRow(), 0));
            boolean deletedP = pDAO.deleteProduct(updateP);
            
            if(deletedP) {
                JOptionPane.showMessageDialog(null, "Produto selecionado foi deletado com sucesso.");
                nameProdTf.setText("");
                qntProdTf.setText("");
                costProdTf.setText("");
                sellPriceProdTf.setText("");

                readTable();
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Falha deletar o produto selecionado.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto que deseja editar.");
        }
    }//GEN-LAST:event_deleteProdBtnActionPerformed

    private void deleteProdBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProdBtnMouseExited
        deleteProdBtn.setBackground(new java.awt.Color(187,187,187));
    }//GEN-LAST:event_deleteProdBtnMouseExited

    private void deleteProdBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProdBtnMouseEntered
        deleteProdBtn.setBackground(new java.awt.Color(217,217,217));
    }//GEN-LAST:event_deleteProdBtnMouseEntered

    private void editProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProdBtnActionPerformed
        if(jTProducts.getSelectedRow() != -1) {
            jTProducts.getSelectedRow();
            ProductDAO pDAO = new ProductDAO();
            ProdEntity updateP = new ProdEntity();
            
            updateP.setProd_name(nameProdTf.getText());
            updateP.setProd_qty(Integer.parseInt(qntProdTf.getText()));
            updateP.setProd_cost(Double.parseDouble(costProdTf.getText()));
            updateP.setProd_price(Double.parseDouble(sellPriceProdTf.getText()));
            updateP.setProd_id((int)jTProducts.getValueAt(jTProducts.getSelectedRow(), 0));
            boolean updatedP = pDAO.updateProduct(updateP);
            if(updatedP) {
                JOptionPane.showMessageDialog(null, "Produto editado com sucesso.");
                nameProdTf.setText("");
                qntProdTf.setText("");
                costProdTf.setText("");
                sellPriceProdTf.setText("");
            
                readTable();
            } else {
               JOptionPane.showMessageDialog(null, "Erro: Falha ao atualizar os dados do produto."); 
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto que deseja editar.");
        }
        
    }//GEN-LAST:event_editProdBtnActionPerformed

    private void editProdBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProdBtnMouseExited
        editProdBtn.setBackground(new java.awt.Color(187,187,187));
    }//GEN-LAST:event_editProdBtnMouseExited

    private void editProdBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProdBtnMouseEntered
        editProdBtn.setBackground(new java.awt.Color(217,217,217));
    }//GEN-LAST:event_editProdBtnMouseEntered

    private void registerProdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerProdBtnActionPerformed
        if (!nameProdTf.getText().isEmpty() && !qntProdTf.getText().isEmpty() && !costProdTf.getText().isEmpty() && !sellPriceProdTf.getText().isEmpty()) {
            ProductDAO pDAO = new ProductDAO();
            ProdEntity newProd = new ProdEntity(nameProdTf.getText(), Integer.parseInt(qntProdTf.getText()), Double.parseDouble(costProdTf.getText()), Double.parseDouble(sellPriceProdTf.getText()));
            boolean pCreated = pDAO.createNewProduct(newProd);
            if(pCreated) {
                JOptionPane.showMessageDialog(null, "Cadastro de produto realizado com sucesso.");
                nameProdTf.setText("");
                qntProdTf.setText("");
                costProdTf.setText("");
                sellPriceProdTf.setText("");

                readTable();
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Falha ao cadastrar o produto.");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos vazios antes de cadastrar o produto.");
        }
    }//GEN-LAST:event_registerProdBtnActionPerformed

    private void registerProdBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerProdBtnMouseExited
        registerProdBtn.setBackground(new java.awt.Color(187,187,187));
    }//GEN-LAST:event_registerProdBtnMouseExited

    private void registerProdBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerProdBtnMouseEntered
        registerProdBtn.setBackground(new java.awt.Color(217,217,217));
    }//GEN-LAST:event_registerProdBtnMouseEntered

    private void jTProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProductsMouseClicked
        if(jTProducts.getSelectedRow() != -1) {
            nameProdTf.setText(jTProducts.getValueAt(jTProducts.getSelectedRow(), 1).toString());
            qntProdTf.setText(jTProducts.getValueAt(jTProducts.getSelectedRow(), 2).toString());
            costProdTf.setText(jTProducts.getValueAt(jTProducts.getSelectedRow(), 3).toString());
            sellPriceProdTf.setText(jTProducts.getValueAt(jTProducts.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jTProductsMouseClicked

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ProductPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton calculateTaxBtn;
    private java.awt.Choice choice1;
    private javax.swing.JTextField costProdTf;
    private javax.swing.JButton deleteProdBtn;
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JButton editProdBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTProducts;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton myAlertsBtn;
    private javax.swing.JButton myMaterialsBtn;
    private javax.swing.JButton myProductsBtn;
    private javax.swing.JButton myProfileBtn;
    private javax.swing.JTextField nameProdTf;
    private javax.swing.JTextField qntProdTf;
    private javax.swing.JButton registerProdBtn;
    private javax.swing.JTextField sellPriceProdTf;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
