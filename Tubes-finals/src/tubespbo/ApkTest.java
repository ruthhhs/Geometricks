package tubespbo;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.ArrayList;

public class ApkTest extends javax.swing.JFrame {
    
    private static final Logger logger = Logger.getLogger(ApkTest.class.getName());
    
    // === VARIABLES ===
    private ArrayList<Double> inputs = new ArrayList<>();
    private int expectedInput = 0;
    private String selectedBangun = "";
    private boolean initDone = false;
    
    // === BUILD ===
    public ApkTest() {
        initComponents();
        
        comboBangun.removeAllItems();
        
        comboBangun.addItem("Bujur Sangkar");
        comboBangun.addItem("Persegi Panjang");
        comboBangun.addItem("Segitiga");
        comboBangun.addItem("Kubus");
        comboBangun.addItem("Balok");
        
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
    }
    
    private void prosesBangun(){

        switch(selectedBangun){
            case "Bujur Sangkar" -> {
                BujurSangkar bs = new BujurSangkar();
                bs.setSisi(inputs.get(0));
                txtBoxOutput.append("\n" + bs.printDetail());
                txtOutput.setText("Bangun sukses ditambahkan!");
            }
            case "Persegi Panjang" -> {
                PersegiPanjang pp = new PersegiPanjang();
                pp.setPanjang(inputs.get(0));
                pp.setLebar(inputs.get(1));
                txtBoxOutput.append("\n" + pp.printDetail());
                txtOutput.setText("Bangun sukses ditambahkan!");
            }
            case "Segitiga" -> {
                SegiTiga s = new SegiTiga();
                s.setAlas(inputs.get(0));
                s.setTinggi(inputs.get(1));
                txtBoxOutput.append("\n" + s.printDetail());
                txtOutput.setText("Bangun sukses ditambahkan!");
            }
        }
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInput.addActionListener(this::txtInputActionPerformed);

        jButtonAdd.setText("Tambah");
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        comboBangun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboBangun.addActionListener(this::comboBangunActionPerformed);

        jScrollPane1.setToolTipText("");

        txtBoxOutput.setColumns(20);
        txtBoxOutput.setRows(5);
        jScrollPane1.setViewportView(txtBoxOutput);

        txtOutput.setText("Pilih Bangun");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBangun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInput)
                    .addComponent(txtOutput)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(comboBangun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(txtOutput)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAdd)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            case "Balok" -> {
                expectedInput = 3;
                txtOutput.setText("Masukkan panjang");
            }
            case "Kubus" -> {
                expectedInput = 1;
                txtOutput.setText("Masukkan sisi");
            }
        }
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
        java.awt.EventQueue.invokeLater(() -> new ApkTest().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> comboBangun;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtBoxOutput;
    private javax.swing.JTextField txtInput;
    private javax.swing.JLabel txtOutput;
    // End of variables declaration//GEN-END:variables
}
