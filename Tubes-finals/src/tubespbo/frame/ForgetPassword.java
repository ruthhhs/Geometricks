package tubespbo.frame;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import tubespbo.jdbc.service.MysqlService;

public class ForgetPassword extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ForgetPassword.class.getName());
    static MysqlService userService = new MysqlService();
    private boolean userFound = false;
    private String foundUsername = "";
    
    public ForgetPassword() {
        initComponents();
        
        jButtonUpdate.setEnabled(false);
        jPasswordFieldNewPassword.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldNewPassword = new javax.swing.JPasswordField();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonExit1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 540));
        setMinimumSize(new java.awt.Dimension(720, 540));
        setPreferredSize(new java.awt.Dimension(720, 540));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("New Password");

        jPasswordFieldNewPassword.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPasswordFieldNewPassword.setPreferredSize(new java.awt.Dimension(100, 35));

        jTextFieldUsername.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(100, 35));

        jButtonUpdate.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);

        jButtonDone.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonDone.setText("Done");
        jButtonDone.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonDone.addActionListener(this::jButtonDoneActionPerformed);

        jButtonSearch.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonSearch.setText("Search");
        jButtonSearch.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonSearch.addActionListener(this::jButtonSearchActionPerformed);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jButtonExit1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonExit1.setText("Back");
        jButtonExit1.addActionListener(this::jButtonExit1ActionPerformed);

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Forget Password?");
        jLabel3.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonExit1)
                .addGap(175, 175, 175)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(237, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed

        String username = jTextFieldUsername.getText().trim();
        
        if (username.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Username tidak boleh kosong!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (userService.isUsernameExist(username)) {
            userFound = true;
            foundUsername = username;
            
            jPasswordFieldNewPassword.setEnabled(true);
            jButtonUpdate.setEnabled(true);
            jTextFieldUsername.setEnabled(false); 
            jButtonSearch.setEnabled(false);
            
            JOptionPane.showMessageDialog(this, 
                "Username '" + username + "' ditemukan!\nSilahkan masukkan password baru.", 
                "User Ditemukan", 
                JOptionPane.INFORMATION_MESSAGE);
            
            jPasswordFieldNewPassword.requestFocus();
        } else {
            userFound = false;
            JOptionPane.showMessageDialog(this, 
                "Username '" + username + "' tidak ditemukan!\nSilahkan coba lagi.", 
                "User Tidak Ditemukan", 
                JOptionPane.ERROR_MESSAGE);
            
            // Reset fields
            jTextFieldUsername.setText("");
            jTextFieldUsername.requestFocus();
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        
        if (!userFound) {
            JOptionPane.showMessageDialog(this, 
                "Silahkan cari username terlebih dahulu!", 
                "Peringatan", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String newPassword = new String(jPasswordFieldNewPassword.getPassword()).trim();
        
        // Validate new password
        if (newPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Password baru tidak boleh kosong!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if (newPassword.length() < 6) {
            JOptionPane.showMessageDialog(this, 
                "Password minimal 6 karakter!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Confirm update
        int confirm = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda yakin ingin mengupdate password untuk username '" + foundUsername + "'?", 
            "Konfirmasi Update", 
            JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                // Get user by username
                userService.updatePasswordByUsername(foundUsername, newPassword);
                
                JOptionPane.showMessageDialog(this, 
                    "Password berhasil diupdate!\nSilahkan login dengan password baru Anda.", 
                    "Sukses", 
                    JOptionPane.INFORMATION_MESSAGE);
                
                resetForm();
                openLogInPage();
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(this, 
                    "Gagal mengupdate password: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed

        int confirm = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda ingin kembali ke halaman Log In?", 
            "Konfirmasi", 
            JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            openLogInPage();
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

    private void jButtonExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit1ActionPerformed
        LogIn login = new LogIn();
        login.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonExit1ActionPerformed

    private void resetForm() {
        // Reset all fields and states
        jTextFieldUsername.setText("");
        jTextFieldUsername.setEnabled(true);
        jPasswordFieldNewPassword.setText("");
        jPasswordFieldNewPassword.setEnabled(false);
        jButtonUpdate.setEnabled(false);
        jButtonSearch.setEnabled(true);
        userFound = false;
        foundUsername = "";
    }
    
    private void openLogInPage() {
        try {
            this.dispose();
            
            LogIn login = new LogIn();
            login.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Gagal membuka halaman Sign In: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
    private javax.swing.JButton jButtonDone;
    private javax.swing.JButton jButtonExit1;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldNewPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
