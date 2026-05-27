package tubespbo.frame;

import tubespbo.modul.*;
import static java.lang.Math.sqrt;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;

public class KalkulatorBangun extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(KalkulatorBangun.class.getName());
    
    // === VARIABLES ===
    private ArrayList<Double> inputs = new ArrayList<>();
    private int expectedInput = 0;
    private String selectedBangun = "";
    private boolean initDone = false;
    
    // === BUILD ===
    public KalkulatorBangun() {
        initComponents();
        
        comboBangun.removeAllItems();
        
        comboBangun.addItem("Pilih Bangun");
        comboBangun.addItem("Bujur Sangkar");
        comboBangun.addItem("Persegi Panjang");
        comboBangun.addItem("Segitiga");
        comboBangun.addItem("Kubus");
        comboBangun.addItem("Balok");
        comboBangun.addItem("Limas");
        
        jButtonAdd.setEnabled(false);
        
        initDone = true;
    }

    // === LOGICS===
    private void tampilPromptBerikutnya(){
        if(selectedBangun.equals("Persegi Panjang")){
            if(inputs.size()==1)
                txtOutput.setText("\nMasukkan lebar");
        }
        if(selectedBangun.equals("Segitiga")){
            if(inputs.size()==1)
                txtOutput.setText("\nMasukkan tinggi");
        }
        if(selectedBangun.equals("Balok")){
            if(inputs.size()==1)
                txtOutput.setText("\nMasukkan lebar");
            else if(inputs.size()==2)
                txtOutput.setText("\nMasukkan tinggi");
        }
        if(selectedBangun.equals("Limas")){
            if(inputs.size()==1)
                txtOutput.setText("\nMasukkan tinggi");
        }
    }
    
    private void prosesBangun(){

        switch(selectedBangun){
            case "Bujur Sangkar" -> {
                BujurSangkar bs = new BujurSangkar();
                bs.setSisi(inputs.get(0));
                txtBoxOutput.append(bs.printDetail());
            }
            case "Persegi Panjang" -> {
                PersegiPanjang pp = new PersegiPanjang();
                pp.setPanjang(inputs.get(0));
                pp.setLebar(inputs.get(1));
                txtBoxOutput.append(pp.printDetail());
            }
            case "Segitiga" -> {
                SegiTiga s = new SegiTiga();
                s.setAlas(inputs.get(0));
                s.setTinggi(inputs.get(1));
                txtBoxOutput.append(s.printDetail());
            }
            case "Kubus" -> {
                BujurSangkar s = new BujurSangkar();
                s.setSisi(inputs.get(0));
                Kubus k = new Kubus(s);
                txtBoxOutput.append(k.printDetail());
            }
            case "Balok" -> {
                PersegiPanjang sa = new PersegiPanjang();
                PersegiPanjang st = new PersegiPanjang();
                PersegiPanjang sd = new PersegiPanjang();
                
                sa.setPanjang(inputs.get(0));
                sa.setLebar(inputs.get(1));
                st.setPanjang(inputs.get(1));
                st.setLebar(inputs.get(2));
                sd.setPanjang(inputs.get(0));
                sd.setLebar(inputs.get(2));
                
                Balok b = new Balok(sa, st, sd);
                txtBoxOutput.append(b.printDetail());
            }
            case "Limas" -> {
                BujurSangkar a = new BujurSangkar();
                SegiTiga s = new SegiTiga();
                
                double al = inputs.get(0);
                double tl = inputs.get(1);
                double ts = sqrt( (0.5 * al)*(0.5 * al) + tl*tl );
                        
                a.setSisi(al);
                s.setAlas(inputs.get(0));
                s.setTinggi(ts);
                
                Limas l = new Limas(a, s);
                txtBoxOutput.append(l.printDetail());
            }
        }
        
        txtOutput.setText("Bangun sukses ditambahkan!");
        jButtonAdd.setEnabled(false);
    }
    
    // === GUI ===
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        txtInput = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        comboBangun = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBoxOutput = new javax.swing.JTextArea();
        txtOutput = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonBackToMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Geometricks");
        setMaximumSize(new java.awt.Dimension(720, 540));
        setMinimumSize(new java.awt.Dimension(720, 540));
        setPreferredSize(new java.awt.Dimension(720, 540));
        setSize(new java.awt.Dimension(720, 540));

        txtInput.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtInput.setMaximumSize(new java.awt.Dimension(200, 35));
        txtInput.setMinimumSize(new java.awt.Dimension(200, 35));
        txtInput.setPreferredSize(new java.awt.Dimension(200, 35));
        txtInput.addActionListener(this::txtInputActionPerformed);

        jButtonAdd.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonAdd.setText("Tambah");
        jButtonAdd.setMaximumSize(new java.awt.Dimension(200, 35));
        jButtonAdd.setMinimumSize(new java.awt.Dimension(200, 35));
        jButtonAdd.setPreferredSize(new java.awt.Dimension(200, 35));
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        comboBangun.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        comboBangun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBangun.setMaximumSize(new java.awt.Dimension(200, 35));
        comboBangun.setMinimumSize(new java.awt.Dimension(200, 35));
        comboBangun.setPreferredSize(new java.awt.Dimension(200, 35));
        comboBangun.addActionListener(this::comboBangunActionPerformed);

        jScrollPane1.setToolTipText("");

        txtBoxOutput.setColumns(20);
        txtBoxOutput.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtBoxOutput.setRows(5);
        jScrollPane1.setViewportView(txtBoxOutput);

        txtOutput.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        txtOutput.setText("Pilih Bangun");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalkulator Bangun");
        jLabel1.setAlignmentY(0.0F);

        jButtonBackToMainMenu.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButtonBackToMainMenu.setText("Home");
        jButtonBackToMainMenu.addActionListener(this::jButtonBackToMainMenuActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtonBackToMainMenu)
                .addGap(154, 154, 154)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButtonBackToMainMenu))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtOutput))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(comboBangun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(comboBangun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(txtOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        try{
            double val = Double.parseDouble(txtInput.getText());
            inputs.add(val);

            txtInput.setText("");

            if(inputs.size() == expectedInput){
                prosesBangun();
                inputs.clear();
            }else{
                tampilPromptBerikutnya();
            }
            
        } catch(Exception e){
            txtOutput.setText("\nInput harus angka!");
        }
    }//GEN-LAST:event_txtInputActionPerformed

    private void comboBangunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBangunActionPerformed
        if (!initDone) return;
        
        selectedBangun = comboBangun.getSelectedItem().toString();
        //inputs.clear();

        switch(selectedBangun){
            case "Bujur Sangkar" -> {
                expectedInput = 1;
                txtOutput.setText("Masukkan sisi");
            }
            case "Persegi Panjang" -> {
                expectedInput = 2;
                txtOutput.setText("Masukkan panjang");
            }
            case "Segitiga" -> {
                expectedInput = 2;
                txtOutput.setText("Masukkan alas");
            }
            case "Kubus" -> {
                expectedInput = 1;
                txtOutput.setText("Masukkan sisi");
            }
            case "Balok" -> {
                expectedInput = 3;
                txtOutput.setText("Masukkan panjang");
            }
            case "Limas" -> {
                expectedInput = 2;
                txtOutput.setText("Masukkan sisi alas");
            }
        }
        txtBoxOutput.setText("");
        jButtonAdd.setEnabled(true);
    }//GEN-LAST:event_comboBangunActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try{
            double angka = Double.parseDouble(txtInput.getText());

            inputs.add(angka);
            txtInput.setText("");

            if(inputs.size() == expectedInput){
                prosesBangun();
                inputs.clear();
            } else {
                tampilPromptBerikutnya();
            }

        }catch(NumberFormatException e){
            txtOutput.setText("Input harus angka!\n");
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonBackToMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackToMainMenuActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jButtonBackToMainMenuActionPerformed

    // === RUN ===
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> comboBangun;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonBackToMainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBoxOutput;
    private javax.swing.JTextField txtInput;
    private javax.swing.JLabel txtOutput;
    // End of variables declaration//GEN-END:variables
}
