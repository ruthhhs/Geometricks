package tubespbo.view;
import tubespbo.model.Session;

public class MainMenu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainMenu.class.getName());

    // BUILD
    public MainMenu() {
        initComponents();
        if (Session.idAccount != -1) {
            labelMainMenu.setText("Selamat datang, " + Session.username + "!");
        }
    }
    
    // GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelMainMenu = new javax.swing.JLabel();
        jButtonKalkulatorBangun = new javax.swing.JButton();
        jButtonKuis = new javax.swing.JButton();
        jButtonAkun = new javax.swing.JButton();
        jLabelMainMenu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelMainMenu.setText("Kamu Belum Login");

        jButtonKalkulatorBangun.setText("Kalkulator Bangun");
        jButtonKalkulatorBangun.addActionListener(this::jButtonKalkulatorBangunActionPerformed);

        jButtonKuis.setText("Kuis");
        jButtonKuis.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonKuis.addActionListener(this::jButtonKuisActionPerformed);

        jButtonAkun.setText("Akun");
        jButtonAkun.addActionListener(this::jButtonAkunActionPerformed);

        jLabelMainMenu.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelMainMenu.setText("Main Menu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonKalkulatorBangun)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtonAkun)
                                    .addComponent(jButtonKuis)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabelMainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(labelMainMenu)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabelMainMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMainMenu)
                .addGap(44, 44, 44)
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
        if (Session.idAccount == -1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Silakan login terlebih dahulu!");
            return;
        }
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
    private javax.swing.JLabel jLabelMainMenu;
    private javax.swing.JLabel labelMainMenu;
    // End of variables declaration//GEN-END:variables
}
