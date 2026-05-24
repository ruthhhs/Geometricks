package tubespbo;

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMainMenu.setText("Kamu Belum Login");

        jButtonKalkulatorBangun.setText("Kalkulator Bangun");
        jButtonKalkulatorBangun.addActionListener(this::jButtonKalkulatorBangunActionPerformed);

        jButtonKuis.setText("Kuis");
        jButtonKuis.addActionListener(this::jButtonKuisActionPerformed);

        jButtonAkun.setText("Akun");
        jButtonAkun.addActionListener(this::jButtonAkunActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAkun)
                    .addComponent(jButtonKuis)
                    .addComponent(jButtonKalkulatorBangun)
                    .addComponent(labelMainMenu))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelMainMenu)
                .addGap(34, 34, 34)
                .addComponent(jButtonKalkulatorBangun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonKuis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAkun)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonKalkulatorBangunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKalkulatorBangunActionPerformed
        KalkulatorBangun kal = new KalkulatorBangun();
        kal.setVisible(true);

        this.dispose(); 
    }//GEN-LAST:event_jButtonKalkulatorBangunActionPerformed

    private void jButtonKuisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKuisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonKuisActionPerformed

    private void jButtonAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAkunActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JLabel labelMainMenu;
    // End of variables declaration//GEN-END:variables
}
