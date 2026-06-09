package tubespbo.view;
import tubespbo.model.Koleksi;
import tubespbo.model.Session;
import tubespbo.model.*;
import tubespbo.jdbc.service.MysqlSoalQuizService;
import tubespbo.jdbc.service.MysqlHasilQuizService;

public class Quiz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Quiz.class.getName());

    Koleksi<SoalQuiz> daftarSoal = new Koleksi<>();
    int indexSoal = 0;
    int skor = 0;

    public Quiz() {
        initComponents();
        groupJawaban.add(rbA);
        groupJawaban.add(rbB);
        groupJawaban.add(rbC);
        groupJawaban.add(rbD);
        MysqlSoalQuizService service = new MysqlSoalQuizService();
        daftarSoal = service.getAllSoal();
        tampilSoal();
    }
    
    public void tampilSoal() {
        SoalQuiz soal = daftarSoal.get(indexSoal);
        lblPertanyaan.setText(soal.getPertanyaan());
        rbA.setText(soal.getOpsiA());
        rbB.setText(soal.getOpsiB());
        rbC.setText(soal.getOpsiC());
        rbD.setText(soal.getOpsiD());
        groupJawaban.clearSelection();
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupJawaban = new javax.swing.ButtonGroup();
        lblPertanyaan = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        rbA = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        rbD = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblPertanyaan.setText("Soal");

        btnNext.setText("Next");
        btnNext.addActionListener(this::btnNextActionPerformed);

        rbA.setText("Opsi 1");
        rbA.addActionListener(this::rbAActionPerformed);

        rbB.setText("Opsi 2");

        rbC.setText("Opsi 3");

        rbD.setText("Opsi 4");

        jButton3.setText("Home");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(lblPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbD, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(lblPertanyaan)
                .addGap(18, 18, 18)
                .addComponent(rbA)
                .addGap(18, 18, 18)
                .addComponent(rbB)
                .addGap(18, 18, 18)
                .addComponent(rbC)
                .addGap(18, 18, 18)
                .addComponent(rbD)
                .addGap(26, 26, 26)
                .addComponent(btnNext)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        String jawabanUser = "";
        if(rbA.isSelected()) {
            jawabanUser = "a";
        }
        else if(rbB.isSelected()) {
            jawabanUser = "b";
        }
        else if(rbC.isSelected()) {
            jawabanUser = "c";
        }
        else if(rbD.isSelected()) {
            jawabanUser = "d";
        }
        
        SoalQuiz soal = daftarSoal.get(indexSoal);
        if (jawabanUser.equalsIgnoreCase(soal.getJawaban())) {
            skor++;
        }
        indexSoal++;
        if (indexSoal < daftarSoal.size()) {
            tampilSoal();
        } else {
            lblPertanyaan.setText("Quiz selesai. Skor: " + skor);
            rbA.setVisible(false);
            rbB.setVisible(false);
            rbC.setVisible(false);
            rbD.setVisible(false);
            btnNext.setEnabled(false);
            MysqlHasilQuizService service =  new MysqlHasilQuizService();
            HasilQuiz hasil = new HasilQuiz(Session.idAccount, skor, 120);
            service.add(hasil);
            javax.swing.JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan!");
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void rbAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAActionPerformed

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
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup groupJawaban;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel lblPertanyaan;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JRadioButton rbD;
    // End of variables declaration//GEN-END:variables
}
