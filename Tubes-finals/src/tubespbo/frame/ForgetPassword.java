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

        jLabelSignUp = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldNewPassword = new javax.swing.JPasswordField();
        jTextFieldUsername = new javax.swing.JTextField();
        jButtonUpdate = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonDone = new javax.swing.JButton();
        jButtonSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSignUp.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelSignUp.setText("Forget Password?");

        jLabel1.setText("Username");

        jLabel2.setText("New Password");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);

        jButtonExit.setText("Back");
        jButtonExit.addActionListener(this::jButtonExitActionPerformed);

        jButtonDone.setText("Done");
        jButtonDone.addActionListener(this::jButtonDoneActionPerformed);

        jButtonSearch.setText("Search");
        jButtonSearch.addActionListener(this::jButtonSearchActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldUsername)
                                    .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonUpdate)
                                .addGap(121, 121, 121)
                                .addComponent(jButtonDone))
                            .addComponent(jLabelSignUp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSearch)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonExit)
                .addGap(18, 18, 18)
                .addComponent(jLabelSignUp)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonDone))
                .addContainerGap(106, Short.MAX_VALUE))
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

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        LogIn l = new LogIn();
        l.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDoneActionPerformed

        int confirm = JOptionPane.showConfirmDialog(this, 
            "Apakah Anda ingin kembali ke halaman Log In?", 
            "Konfirmasi", 
            JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            openLogInPage();
        }
    }//GEN-LAST:event_jButtonDoneActionPerformed

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
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelSignUp;
    private javax.swing.JPasswordField jPasswordFieldNewPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
