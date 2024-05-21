package com.unicash.app.pages.component;

public class MenuPanel extends javax.swing.JPanel {
    public MenuPanel() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        wellcome = new javax.swing.JLabel();
        profileOp = new javax.swing.JLabel();
        settingsOp = new javax.swing.JLabel();
        sellOp = new javax.swing.JLabel();
        alertsOp = new javax.swing.JLabel();
        sellOp1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(217, 217, 217));
        setForeground(new java.awt.Color(0, 0, 0));
        setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(250, 500));

        wellcome.setBackground(new java.awt.Color(68, 68, 68));
        wellcome.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        wellcome.setForeground(new java.awt.Color(32, 32, 138));
        wellcome.setText("BEM-VINDO");

        profileOp.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        profileOp.setForeground(new java.awt.Color(0, 0, 0));
        profileOp.setText("Perfil");

        settingsOp.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        settingsOp.setForeground(new java.awt.Color(0, 0, 0));
        settingsOp.setText("Configurações");

        sellOp.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        sellOp.setForeground(new java.awt.Color(0, 0, 0));
        sellOp.setText("Vendas");

        alertsOp.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        alertsOp.setForeground(new java.awt.Color(0, 0, 0));
        alertsOp.setText("Alertas");

        sellOp1.setFont(new java.awt.Font("Inter", 0, 20)); // NOI18N
        sellOp1.setForeground(new java.awt.Color(0, 0, 0));
        sellOp1.setText("Dashboard");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/dashboard.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/icons/sale.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/icons/bell.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/icons/user.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/unicash/app/assets/icons/setting.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(wellcome)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sellOp)
                            .addComponent(sellOp1)
                            .addComponent(alertsOp)
                            .addComponent(profileOp)
                            .addComponent(settingsOp))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(wellcome)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sellOp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellOp)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alertsOp)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(profileOp)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(settingsOp)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alertsOp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel profileOp;
    private javax.swing.JLabel sellOp;
    private javax.swing.JLabel sellOp1;
    private javax.swing.JLabel settingsOp;
    private javax.swing.JLabel wellcome;
    // End of variables declaration//GEN-END:variables
}
