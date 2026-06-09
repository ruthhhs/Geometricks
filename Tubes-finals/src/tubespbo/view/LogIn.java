package tubespbo.view;

import tubespbo.model.Session;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import tubespbo.model.Account;
import tubespbo.service.MysqlService;
import static tubespbo.view.LogIn.userService;

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
        try {
            Account newAccount = new Account(username, password);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jTextFieldUsername = new javax.swing.JTextField();
        ForgetPassword = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        jButtonLogIn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 540));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel2.setText("Password");

        jPasswordFieldPassword.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPasswordFieldPassword.setMinimumSize(new java.awt.Dimension(64, 35));
        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(64, 35));

        jTextFieldUsername.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextFieldUsername.setMinimumSize(new java.awt.Dimension(64, 35));
        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(64, 35));

        ForgetPassword.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        ForgetPassword.setText("Forget Password");
        ForgetPassword.setPreferredSize(new java.awt.Dimension(150, 35));
        ForgetPassword.addActionListener(this::ForgetPasswordActionPerformed);

        jButtonSave.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonSave.setText("Sign Up");
        jButtonSave.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonSave.addActionListener(this::jButtonSaveActionPerformed);

        jButtonLogIn.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonLogIn.setText("Log In");
        jButtonLogIn.setPreferredSize(new java.awt.Dimension(100, 35));
        jButtonLogIn.addActionListener(this::jButtonLogInActionPerformed);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jButtonExit.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonExit.setText("Home");
        jButtonExit.addActionListener(this::jButtonExitActionPerformed);

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Log In");
        jLabel3.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButtonExit)
                .addGap(235, 235, 235)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jLabel3))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ForgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                                .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90)
                .addComponent(ForgetPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
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

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ForgetPassword;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
