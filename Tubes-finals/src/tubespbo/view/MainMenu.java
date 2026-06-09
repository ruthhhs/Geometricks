package tubespbo.view;

public class MainMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenu.class.getName());

    // BUILD
    public MainMenu() {
        initComponents();
    }

    // GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMainMenu = new javax.swing.JLabel();
        jButtonKalkulatorBangun = new javax.swing.JButton();
        jButtonKuis = new javax.swing.JButton();
        jButtonAkun = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geometricks");
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusTraversalPolicyProvider(true);
        setMaximumSize(new java.awt.Dimension(720, 540));
        setMinimumSize(new java.awt.Dimension(720, 540));
        setPreferredSize(new java.awt.Dimension(720, 540));
        setResizable(false);
        setSize(new java.awt.Dimension(720, 540));

        labelMainMenu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        labelMainMenu.setText("Kamu Belum Login");

        jButtonKalkulatorBangun.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonKalkulatorBangun.setText("Kalkulator Bangun");
        jButtonKalkulatorBangun.setMaximumSize(new java.awt.Dimension(200, 35));
        jButtonKalkulatorBangun.setMinimumSize(new java.awt.Dimension(200, 35));
        jButtonKalkulatorBangun.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonKalkulatorBangun.addActionListener(this::jButtonKalkulatorBangunActionPerformed);

        jButtonKuis.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonKuis.setText("Kuis");
        jButtonKuis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonKuis.setMaximumSize(new java.awt.Dimension(200, 35));
        jButtonKuis.setMinimumSize(new java.awt.Dimension(200, 35));
        jButtonKuis.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonKuis.addActionListener(this::jButtonKuisActionPerformed);

        jButtonAkun.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonAkun.setText("Pengaturan Akun");
        jButtonAkun.setMaximumSize(new java.awt.Dimension(200, 35));
        jButtonAkun.setMinimumSize(new java.awt.Dimension(200, 35));
        jButtonAkun.setName(""); // NOI18N
        jButtonAkun.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonAkun.addActionListener(this::jButtonAkunActionPerformed);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GEOMETRICKS");
        jLabel1.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(206, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(186, 186, 186))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonKuis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonKalkulatorBangun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelMainMenu)
                        .addGap(286, 286, 286))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(labelMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButtonKalkulatorBangun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonKuis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButtonAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKalkulatorBangunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKalkulatorBangunActionPerformed
        KalkulatorBangun kal = new KalkulatorBangun();
        kal.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButtonKalkulatorBangunActionPerformed

    private void jButtonKuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKuisActionPerformed
        Quiz q = new Quiz();
        q.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButtonKuisActionPerformed

    private void jButtonAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAkunActionPerformed
        LogIn l = new LogIn();
        l.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButtonAkunActionPerformed

    // RUN
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainMenu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAkun;
    private javax.swing.JButton jButtonKalkulatorBangun;
    private javax.swing.JButton jButtonKuis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelMainMenu;
    // End of variables declaration//GEN-END:variables
}
