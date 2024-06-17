package main.view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import main.controller.PageTransitionHandler;
import main.model.DAO.MaterialsDAO;
import main.model.entities.MatEntity;

public class MaterialsPage extends javax.swing.JFrame {
    private PageTransitionHandler pageTHandler;

    public MaterialsPage(PageTransitionHandler pageTransitionHandler) {
        initComponents();
        this.pageTHandler = pageTransitionHandler;
        
        DefaultTableModel model = (DefaultTableModel) jTMaterials.getModel();
        jTMaterials.setRowSorter(new TableRowSorter(model));
        readTable(); 
    }
    
    public MaterialsPage() {
        initComponents();
    }
    
    private void readTable() {
        DefaultTableModel model = (DefaultTableModel) jTMaterials.getModel();
        model.setNumRows(0);
        MaterialsDAO mDAO = new MaterialsDAO();

        for(MatEntity m: mDAO.readMaterials()) {
            model.addRow(new Object[]{
                m.getMat_id(),
                m.getMat_name(),
                m.getMat_cost(),
                m.getMat_qty(),
                m.getMat_qtyType()
            });
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterials = new javax.swing.JTable();
        buttonsPanel = new javax.swing.JPanel();
        registerMatBtn = new javax.swing.JButton();
        editMatBtn = new javax.swing.JButton();
        deleteMatBtn = new javax.swing.JButton();
        nameMatTf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        qtyMatTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costMatTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        qtyTypeTf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
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
        setMinimumSize(new java.awt.Dimension(1125, 600));
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
        headerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(261, 10, 860, -1));

        mainPanel.setBackground(new java.awt.Color(217, 217, 217));
        mainPanel.setPreferredSize(new java.awt.Dimension(870, 520));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEUS MATERIAIS");

        jTMaterials.setBackground(new java.awt.Color(102, 102, 102));
        jTMaterials.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jTMaterials.setForeground(new java.awt.Color(255, 255, 255));
        jTMaterials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NOME DO MATERIAL", "CUSTO DO MATERIAL", "QUANTIDADE", "TIPO DE MATERIAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTMaterials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTMaterialsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTMaterials);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        buttonsPanel.setBackground(new java.awt.Color(1, 8, 34));
        buttonsPanel.setPreferredSize(new java.awt.Dimension(870, 100));

        registerMatBtn.setBackground(new java.awt.Color(187, 187, 187));
        registerMatBtn.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        registerMatBtn.setForeground(new java.awt.Color(51, 51, 51));
        registerMatBtn.setText("Cadastrar");
        registerMatBtn.setBorder(null);
        registerMatBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerMatBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        registerMatBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        registerMatBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        registerMatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMatBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMatBtnMouseExited(evt);
            }
        });
        registerMatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerMatBtnActionPerformed(evt);
            }
        });

        editMatBtn.setBackground(new java.awt.Color(187, 187, 187));
        editMatBtn.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        editMatBtn.setForeground(new java.awt.Color(51, 51, 51));
        editMatBtn.setText("Editar");
        editMatBtn.setBorder(null);
        editMatBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editMatBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        editMatBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        editMatBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        editMatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMatBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMatBtnMouseExited(evt);
            }
        });
        editMatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMatBtnActionPerformed(evt);
            }
        });

        deleteMatBtn.setBackground(new java.awt.Color(187, 187, 187));
        deleteMatBtn.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        deleteMatBtn.setForeground(new java.awt.Color(51, 51, 51));
        deleteMatBtn.setText("Deletar");
        deleteMatBtn.setBorder(null);
        deleteMatBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteMatBtn.setMaximumSize(new java.awt.Dimension(55, 25));
        deleteMatBtn.setMinimumSize(new java.awt.Dimension(55, 25));
        deleteMatBtn.setPreferredSize(new java.awt.Dimension(55, 25));
        deleteMatBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteMatBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteMatBtnMouseExited(evt);
            }
        });
        deleteMatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMatBtnActionPerformed(evt);
            }
        });

        nameMatTf.setBackground(new java.awt.Color(187, 187, 187));
        nameMatTf.setForeground(new java.awt.Color(0, 0, 0));
        nameMatTf.setBorder(null);
        nameMatTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel2.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do Material:");

        qtyMatTf.setBackground(new java.awt.Color(187, 187, 187));
        qtyMatTf.setForeground(new java.awt.Color(0, 0, 0));
        qtyMatTf.setBorder(null);
        qtyMatTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel3.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");

        costMatTf.setBackground(new java.awt.Color(187, 187, 187));
        costMatTf.setForeground(new java.awt.Color(0, 0, 0));
        costMatTf.setBorder(null);
        costMatTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel4.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Valor de Custo:");

        qtyTypeTf.setBackground(new java.awt.Color(187, 187, 187));
        qtyTypeTf.setForeground(new java.awt.Color(0, 0, 0));
        qtyTypeTf.setBorder(null);
        qtyTypeTf.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabel6.setFont(new java.awt.Font("Inter", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipo da Quantidade:");

        javax.swing.GroupLayout buttonsPanelLayout = new javax.swing.GroupLayout(buttonsPanel);
        buttonsPanel.setLayout(buttonsPanelLayout);
        buttonsPanelLayout.setHorizontalGroup(
            buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsPanelLayout.createSequentialGroup()
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nameMatTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(registerMatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(editMatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteMatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costMatTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtyMatTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtyTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(buttonsPanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel6)))))
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
                        .addComponent(nameMatTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costMatTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtyMatTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(buttonsPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qtyTypeTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addGroup(buttonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerMatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editMatBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteMatBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(buttonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(buttonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
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
                    .addGap(0, 1, Short.MAX_VALUE)))
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

    private void registerMatBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMatBtnMouseEntered
        registerMatBtn.setBackground(new java.awt.Color(217,217,217));
    }//GEN-LAST:event_registerMatBtnMouseEntered

    private void registerMatBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMatBtnMouseExited
        registerMatBtn.setBackground(new java.awt.Color(187,187,187));
    }//GEN-LAST:event_registerMatBtnMouseExited

    private void registerMatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerMatBtnActionPerformed
        if (!nameMatTf.getText().isEmpty() && !costMatTf.getText().isEmpty() && !qtyMatTf.getText().isEmpty() && !qtyTypeTf.getText().isEmpty()) {
            MaterialsDAO mDAO = new MaterialsDAO();
            MatEntity newMat = new MatEntity(nameMatTf.getText(), Double.parseDouble(costMatTf.getText()), Integer.parseInt(qtyMatTf.getText()), qtyTypeTf.getText());
            boolean mCreated = mDAO.createNewMaterial(newMat);
            
            if(mCreated) {
                JOptionPane.showMessageDialog(null, "Cadastro de produto realizado com sucesso.");
                nameMatTf.setText("");
                costMatTf.setText("");
                qtyMatTf.setText("");
                qtyTypeTf.setText("");

                readTable();
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Falha ao cadastrar o produto.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos vazios antes de cadastrar o produto.");
        }
    }//GEN-LAST:event_registerMatBtnActionPerformed

    private void editMatBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMatBtnMouseEntered
        editMatBtn.setBackground(new java.awt.Color(217,217,217));
    }//GEN-LAST:event_editMatBtnMouseEntered

    private void editMatBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMatBtnMouseExited
        editMatBtn.setBackground(new java.awt.Color(187,187,187));
    }//GEN-LAST:event_editMatBtnMouseExited

    private void editMatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMatBtnActionPerformed
        if(jTMaterials.getSelectedRow() != -1) {
            jTMaterials.getSelectedRow();
            MaterialsDAO mDAO = new MaterialsDAO();
            MatEntity updateM = new MatEntity();

            updateM.setMat_name(nameMatTf.getText());
            updateM.setMat_cost(Double.parseDouble(qtyMatTf.getText()));
            updateM.setMat_qty(Double.parseDouble(qtyMatTf.getText()));
            updateM.setMat_qtyType(costMatTf.getText());
            updateM.setMat_id((int)jTMaterials.getValueAt(jTMaterials.getSelectedRow(), 0));
            boolean updatedM = mDAO.updateMaterials(updateM);
            if(updatedM) {
                JOptionPane.showMessageDialog(null, "Produto editado com sucesso.");
                nameMatTf.setText("");
                costMatTf.setText("");
                qtyMatTf.setText("");
                qtyTypeTf.setText("");

                readTable();
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Falha ao atualizar os dados do produto.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto que deseja editar.");
        }

    }//GEN-LAST:event_editMatBtnActionPerformed

    private void deleteMatBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMatBtnMouseEntered
        deleteMatBtn.setBackground(new java.awt.Color(217,217,217));
    }//GEN-LAST:event_deleteMatBtnMouseEntered

    private void deleteMatBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMatBtnMouseExited
        deleteMatBtn.setBackground(new java.awt.Color(187,187,187));
    }//GEN-LAST:event_deleteMatBtnMouseExited

    private void deleteMatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMatBtnActionPerformed
        if(jTMaterials.getSelectedRow() != -1) {
            jTMaterials.getSelectedRow();
            MaterialsDAO mDAO = new MaterialsDAO();
            MatEntity deleteM = new MatEntity();

            deleteM.setMat_id((int)jTMaterials.getValueAt(jTMaterials.getSelectedRow(), 0));
            boolean deletedM = mDAO.deleteMaterial(deleteM);

            if(deletedM) {
                JOptionPane.showMessageDialog(null, "Produto selecionado foi deletado com sucesso.");
                nameMatTf.setText("");
                costMatTf.setText("");
                qtyMatTf.setText("");
                qtyTypeTf.setText("");

                readTable();
            } else {
                JOptionPane.showMessageDialog(null, "Erro: Falha deletar o produto selecionado.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto que deseja editar.");
        }
    }//GEN-LAST:event_deleteMatBtnActionPerformed

    private void jTMaterialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTMaterialsMouseClicked
        if (jTMaterials.getSelectedRow() != -1) {
            nameMatTf.setText(jTMaterials.getValueAt(jTMaterials.getSelectedRow(), 1).toString());
            costMatTf.setText(jTMaterials.getValueAt(jTMaterials.getSelectedRow(), 2).toString());
            qtyMatTf.setText(jTMaterials.getValueAt(jTMaterials.getSelectedRow(), 3).toString());
            qtyTypeTf.setText(jTMaterials.getValueAt(jTMaterials.getSelectedRow(), 4).toString());
            
        }
    }//GEN-LAST:event_jTMaterialsMouseClicked

//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MaterialsPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton calculateTaxBtn;
    private javax.swing.JTextField costMatTf;
    private javax.swing.JButton deleteMatBtn;
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JButton editMatBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMaterials;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton myAlertsBtn;
    private javax.swing.JButton myMaterialsBtn;
    private javax.swing.JButton myProductsBtn;
    private javax.swing.JButton myProfileBtn;
    private javax.swing.JTextField nameMatTf;
    private javax.swing.JTextField qtyMatTf;
    private javax.swing.JTextField qtyTypeTf;
    private javax.swing.JButton registerMatBtn;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
