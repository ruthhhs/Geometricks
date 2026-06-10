package tubespbo.view;

import tubespbo.controller.QuizController;
import tubespbo.model.SoalQuiz;

public class Quiz extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Quiz.class.getName());
    
    private QuizController controller = new QuizController();

    public Quiz () {
        initComponents();
        groupJawaban.add(rbA);
        groupJawaban.add(rbB);
        groupJawaban.add(rbC);
        groupJawaban.add(rbD);
        controller.loadSoal();
        tampilSoal();
    }
    
    // ===== TAMPIL SOAL dari controller =====
    public void tampilSoal() {
        SoalQuiz soal = controller.getSoalSekarang();
        lblNomorSoal.setText("Soal " + controller.getNomorSoal() + " / " + controller.getTotalSoal());
        lblPertanyaan.setText("<html>" + soal.getPertanyaan() + "</html>");
        rbA.setText(soal.getOpsiA());
        rbB.setText(soal.getOpsiB());
        rbC.setText(soal.getOpsiC());
        rbD.setText(soal.getOpsiD());
        groupJawaban.clearSelection();
        btnNext.setEnabled(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupJawaban = new javax.swing.ButtonGroup();
        btnNext = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblPertanyaan = new javax.swing.JLabel();
        rbD = new javax.swing.JRadioButton();
        rbC = new javax.swing.JRadioButton();
        rbB = new javax.swing.JRadioButton();
        rbA = new javax.swing.JRadioButton();
        lblNomorSoal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(720, 540));
        setResizable(false);

        btnNext.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        btnNext.setText("Next");
        btnNext.setMaximumSize(new java.awt.Dimension(200, 35));
        btnNext.setMinimumSize(new java.awt.Dimension(200, 35));
        btnNext.setPreferredSize(new java.awt.Dimension(200, 35));
        btnNext.addActionListener(this::btnNextActionPerformed);

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
                .addGap(220, 220, 220)
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

        lblPertanyaan.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        lblPertanyaan.setText("Soal");

        rbD.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        rbD.setText("Opsi 4");
        rbD.setMaximumSize(null);

        rbC.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        rbC.setText("Opsi 3");
        rbC.setMaximumSize(null);

        rbB.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        rbB.setText("Opsi 2");
        rbB.setMaximumSize(null);

        rbA.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        rbA.setText("Opsi 1");
        rbA.setMaximumSize(null);
        rbA.addActionListener(this::rbAActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPertanyaan, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbB, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbC, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbD, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbA, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPertanyaan, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rbD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        lblNomorSoal.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        lblNomorSoal.setText("Soal 1 / 3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(lblNomorSoal, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNomorSoal)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
         // ===== ambil pilihan user =====
        String jawabanUser = "";
        if (rbA.isSelected()) jawabanUser = "a";
        else if (rbB.isSelected()) jawabanUser = "b";
        else if (rbC.isSelected()) jawabanUser = "c";
        else if (rbD.isSelected()) jawabanUser = "d";
 
        if (jawabanUser.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Pilih jawaban dulu!");
            return;
        }
 
        // ===== serahkan ke controller =====
        controller.submitJawaban(jawabanUser);
 
        if (controller.hasNext()) {
            tampilSoal();
        } else {
            // ===== quiz selesai =====
            controller.simpanHasil();
 
            lblNomorSoal.setText("Quiz Selesai!");
            lblPertanyaan.setText("<html><b>Skor kamu: " + controller.getSkor()
                    + " / " + controller.getTotalSoal() + "</b></html>");
            rbA.setVisible(false);
            rbB.setVisible(false);
            rbC.setVisible(false);
            rbD.setVisible(false);
            btnNext.setEnabled(false);
            controller.simpanHasil();
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.ButtonGroup groupJawaban;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblNomorSoal;
    private javax.swing.JLabel lblPertanyaan;
    private javax.swing.JRadioButton rbA;
    private javax.swing.JRadioButton rbB;
    private javax.swing.JRadioButton rbC;
    private javax.swing.JRadioButton rbD;
    // End of variables declaration//GEN-END:variables
}
