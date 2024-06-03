package main.app.pages;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainPage extends javax.swing.JFrame {
    public MainPage() {
        initComponents();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        logoHeader = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 8, 34));
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

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
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
        optDashboard.setText("Dashboard");

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

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optSettings))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(iconDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iconSell, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optDashboard)
                            .addComponent(optSell)))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(optProfile)
                            .addComponent(optAlert)))
                    .addComponent(iconProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(wellcome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(wellcome)
                .addGap(83, 83, 83)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(optDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(iconDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optSell)
                    .addComponent(iconSell, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconAlerts, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(optAlert))
                .addGap(30, 30, 30)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(optProfile)
                    .addComponent(iconProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(iconSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(99, Short.MAX_VALUE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(optSettings)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(menuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, 520));

        setSize(new java.awt.Dimension(1141, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void optProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optProfileMouseClicked

    }//GEN-LAST:event_optProfileMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel iconAlerts;
    private javax.swing.JLabel iconDashboard;
    private javax.swing.JLabel iconProfile;
    private javax.swing.JLabel iconSell;
    private javax.swing.JLabel iconSettings;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel optAlert;
    private javax.swing.JLabel optDashboard;
    private javax.swing.JLabel optProfile;
    private javax.swing.JLabel optSell;
    private javax.swing.JLabel optSettings;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
