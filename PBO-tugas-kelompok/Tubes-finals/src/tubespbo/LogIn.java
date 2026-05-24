/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tubespbo;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import tubespbo.jdbc.model.Account;
import tubespbo.jdbc.service.MysqlService;

/**
 *
 * @author sarifa
 */
public class LogIn extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(LogIn.class.getName());
    static MysqlService userService = new MysqlService();
    
    public LogIn() {
        initComponents();
    }

    // METHOD LOGIN - Untuk masuk ke MainMenu
    private void login() {
        String username = jTextFieldUsername.getText().trim();
        String password = new String(jPasswordFieldPassword.getPassword()).trim();
        
        // Validasi input tidak boleh kosong
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Username dan Password tidak boleh kosong!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Cek login ke database
        boolean loginSuccess = userService.login(username, password);
        
        if (loginSuccess) {
            JOptionPane.showMessageDialog(this, 
                "Selamat datang, " + username + "!", 
                "Login Berhasil", 
                JOptionPane.INFORMATION_MESSAGE);
            
            // Buka MainMenu
            try {
                MainMenu mainMenu = new MainMenu();
                mainMenu.setVisible(true);
                this.dispose(); // Tutup form login
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, 
                    "Gagal membuka Main Menu: " + e.getMessage(), 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, 
                "Username atau Password salah!\nSilahkan coba lagi.", 
                "Login Gagal", 
                JOptionPane.ERROR_MESSAGE);
            
            // Clear password field
            jPasswordFieldPassword.setText("");
            jTextFieldUsername.requestFocus();
        }
    }
    
    // METHOD REGISTER - Untuk menyimpan username dan password ke database
    private void register() {
        String username = jTextFieldUsername.getText().trim();
        String password = new String(jPasswordFieldPassword.getPassword()).trim();
        
        // Validasi input tidak boleh kosong
        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Username dan Password tidak boleh kosong!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Validasi panjang username minimal 3 karakter
        if (username.length() < 3) {
            JOptionPane.showMessageDialog(this, 
                "Username minimal 3 karakter!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Validasi panjang password minimal 6 karakter
        if (password.length() < 6) {
            JOptionPane.showMessageDialog(this, 
                "Password minimal 6 karakter!", 
                "Validasi Error", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        // Cek apakah username sudah terdaftar
        if (userService.isUsernameExist(username)) {
            JOptionPane.showMessageDialog(this, 
                "Username '" + username + "' sudah terdaftar!\nSilahkan gunakan username lain.", 
                "Validasi Error", 
                JOptionPane.ERROR_MESSAGE);
            jTextFieldUsername.requestFocus();
            return;
        }
        
        // Simpan ke database 
        String id = String.valueOf(System.currentTimeMillis());
        try {
            Account newAccount = new Account(id, username, password);
            userService.add(newAccount);

            JOptionPane.showMessageDialog(this, 
                "Registrasi berhasil!\nSilahkan login dengan akun Anda.", 
                "Sukses", 
                JOptionPane.INFORMATION_MESSAGE);

            jTextFieldUsername.setText("");
            jPasswordFieldPassword.setText("");
            jTextFieldUsername.requestFocus();

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, 
                "Registrasi gagal: " + e.getMessage() + "\nSilahkan coba lagi.", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelLogIn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldUsername = new javax.swing.JTextField();
        ForgetPassword = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonLogIn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelLogIn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelLogIn.setText("Log In");

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        ForgetPassword.setText("Forget Password");
        ForgetPassword.addActionListener(this::ForgetPasswordActionPerformed);

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(this::jButtonSaveActionPerformed);

        jButtonLogIn.setText("Log In");
        jButtonLogIn.addActionListener(this::jButtonLogInActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogIn)
                .addGap(177, 177, 177))
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ForgetPassword)
                    .addComponent(jButtonSave)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonLogIn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldUsername)
                                .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelLogIn)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonLogIn))
                .addGap(11, 11, 11)
                .addComponent(ForgetPassword)
                .addContainerGap(160, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ForgetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ForgetPasswordActionPerformed
        try {
            ForgetPassword forgetPassword = new ForgetPassword();
            forgetPassword.setVisible(true);
            this.dispose(); // Tutup form login
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Gagal membuka halaman Forget Password: " + e.getMessage(), 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ForgetPasswordActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        register();
    }//GEN-LAST:event_jButtonSaveActionPerformed
    
    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        login();
    }//GEN-LAST:event_jButtonLogInActionPerformed
    
    
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
        java.awt.EventQueue.invokeLater(() -> new LogIn().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgetPassword;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogIn;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
