package com.unicash.app.pages;

import javax.swing.JOptionPane;

public class MainDashboard extends javax.swing.JFrame {
    public MainDashboard() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(1, 8, 34));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerPanel.setBackground(new java.awt.Color(1, 8, 34));
        headerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoHeader.setIcon(new javax.swing.ImageIcon("./src/com/unicash/app/assets/images/unicash-icon-removebg.png"));
        logoHeader.setText("Imagem");
        headerPanel.add(logoHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 0, 90, 80));

        titleLabel.setFont(new java.awt.Font("Inter", 1, 48)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("UniCash");
        headerPanel.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, -1, -1));

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

        setSize(new java.awt.Dimension(1141, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel divisorPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel logoHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
