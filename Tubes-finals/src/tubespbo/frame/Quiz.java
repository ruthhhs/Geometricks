package tubespbo.frame;

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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(720, 540));
        setMinimumSize(new java.awt.Dimension(720, 540));
        setPreferredSize(new java.awt.Dimension(720, 540));
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton1.setText("Next");
        jButton1.setMaximumSize(new java.awt.Dimension(200, 35));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 35));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 35));
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton2.setText("Result");
        jButton2.setEnabled(false);
        jButton2.setMaximumSize(new java.awt.Dimension(200, 35));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 35));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 35));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Kuis");
        jLabel2.setAlignmentY(0.0F);

        jButton3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jButton3.setText("Home");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(203, 203, 203)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addComponent(jLabel2))
                .addGap(12, 12, 12))
        );

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel1.setText("Soal");
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(null);

        jRadioButton4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jRadioButton4.setText("Opsi 4");
        jRadioButton4.setMaximumSize(null);

        jRadioButton3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jRadioButton3.setText("Opsi 3");
        jRadioButton3.setMaximumSize(null);

        jRadioButton2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jRadioButton2.setText("Opsi 2");
        jRadioButton2.setMaximumSize(null);

        jRadioButton1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jRadioButton1.setText("Opsi 1");
        jRadioButton1.setMaximumSize(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
