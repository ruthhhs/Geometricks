package tubespbo;

import tubespbo.modul.*;
import javax.swing.ButtonGroup;

public class Quiz extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Quiz.class.getName());

    // ATRIBUTS
    int current = 0;
    int score = 0;
    Koleksi<SoalQuiz> daftarSoal = new Koleksi<>();
    ButtonGroup bg = new ButtonGroup();

    // BUILD
    public Quiz() {
        initComponents();
        
        bg.add(jRadioButton1);
        bg.add(jRadioButton2);
        bg.add(jRadioButton3);
        bg.add(jRadioButton4);
        
        generateSoal();
        tampilkanSoal();
    }
    
    // LOGICS
    void generateSoal() {
        BujurSangkar bs = new BujurSangkar();
        PersegiPanjang pp = new PersegiPanjang();
        PersegiPanjang sa = new PersegiPanjang();
        PersegiPanjang st = new PersegiPanjang();
        PersegiPanjang sd = new PersegiPanjang();
        SegiTiga s = new SegiTiga();
        Kubus k = new Kubus(bs);
        Balok b = new Balok(sa, st, sd);
        Limas l = new Limas(bs, s);
        
        // === SOAL 1 ===
        bs.setSisi(3.8);
        daftarSoal.tambah(new SoalQuiz(
                "Berapakah luas persegi dengan sisi 3.8 cm?",
                new String[] {"11,4", "12,4", "13,4",
                    String.format("%.1f", bs.getLuas())},
                3)
        );
        
        // === SOAL 2 ===
        pp.setPanjang(33);
        pp.setLebar(44);
        daftarSoal.tambah(new SoalQuiz(
                "<html> Berapa panjang diagonal persegi panjang dengan <br>"
                        + "panjang 33 cm dan lebar 44 cm ? </html>",
                new String [] {"54,0",
                    String.format("%.1f", pp.getDiagonal()),
                    "56,0", "57,0"},
                1)
        );
        
        // === SOAL 3 ===
        bs.setSisi(13);
        daftarSoal.tambah(new SoalQuiz(
                "Berapakah luas permukaan kubus dengan sisi 13 cm?",
                new String[] {"674,0", "844,0",
                    String.format("%.1f", k.getLuasPermukaan()),
                    "1204,0"},
                2)
        );
        
        // === SOAL 4 ===
        bs.setSisi(10);
        s.setTinggi(12);
        daftarSoal.tambah(new SoalQuiz(
                "<html> Berapa volume limas dengan luas alas 100 dan <br> "
                        + "tinggi 12 cm ? </html>",
                new String[] {"326,0",
                    String.format("%.1f", l.getVolume()),
                    "397,4", "418,0"},
                1)
        );
        
        // === SOAL 5 ===
        sa.setPanjang(10);
        sa.setLebar(12.5);
        st.setPanjang(12.5);
        st.setLebar(5);
        sd.setPanjang(10);
        sd.setLebar(5);
        daftarSoal.tambah(new SoalQuiz(
                "<html> Berapa luas permukaan balok dengan panjang 10 cm, <br> "
                        + "lebar 12,5 cm, dan tinggi 5 cm ? </html>",
                new String[] {String.format("%.1f", b.getLuasPermukaan()),
                    "525,0", "575,0", "625,0"},
                0)
        );
    }
    
    void tampilkanSoal(){
        SoalQuiz s = daftarSoal.get(current);

        jLabel1.setText(s.getPertanyaan());
        jRadioButton1.setText(s.getOpsi()[0]);
        jRadioButton2.setText(s.getOpsi()[1]);
        jRadioButton3.setText(s.getOpsi()[2]);
        jRadioButton4.setText(s.getOpsi()[3]);
        
        bg.clearSelection();
    }
    
    boolean cekJawaban(){
        SoalQuiz s = daftarSoal.get(current);
        if (s.getJawabanBenar() == 0 && jRadioButton1.isSelected()) {
            return true;
        }
        if (s.getJawabanBenar() == 1 && jRadioButton2.isSelected()) {
            return true;
        }
        if (s.getJawabanBenar() == 2 && jRadioButton3.isSelected()) {
            return true;
        }
        if (s.getJawabanBenar() == 3 && jRadioButton4.isSelected()) {
            return true;
        }
        
        return false;
    }

    // GUI
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Soal");

        jButton1.setText("Next");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Result");
        jButton2.setEnabled(false);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jRadioButton1.setText("Opsi 1");

        jRadioButton2.setText("Opsi 2");

        jRadioButton3.setText("Opsi 3");

        jRadioButton4.setText("Opsi 4");

        jButton3.setText("Home");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 49, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (cekJawaban()){
            score++;
        }
        current++;
        if (current == daftarSoal.size() - 1) {
            jButton1.setText("Submit");
        }
        if (current < daftarSoal.size()) {
            tampilkanSoal();
        } else {
            jButton1.setEnabled(false);
            jButton2.setEnabled(true);
            javax.swing.JOptionPane.showMessageDialog(this, "Score : " + score);
//            System.exit(0);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this, "Score : " + score);    
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
