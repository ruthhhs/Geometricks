package tubespbo.controller;

import tubespbo.model.HasilQuiz;
import tubespbo.model.Koleksi;
import tubespbo.model.Session;
import tubespbo.model.SoalQuiz;
import tubespbo.service.MysqlHasilQuizService;
import tubespbo.service.MysqlSoalQuizService;

public class QuizController {
    // ===== ATRIBUT ======
    private Koleksi<SoalQuiz> daftarSoal = new Koleksi<>();
    private long waktuMulai;
    private int indexSoal = 0;
    private int skor = 0;

    // ===== INIT: load soal dari DB =====
    public void loadSoal() {
        MysqlSoalQuizService service = new MysqlSoalQuizService();
        daftarSoal = service.getAllSoal();
        indexSoal = 0;
        skor = 0;
        waktuMulai = System.currentTimeMillis();
    }

    // ===== GET soal sekarang =====
    public SoalQuiz getSoalSekarang() {
        return daftarSoal.get(indexSoal);
    }

    // ===== SUBMIT jawaban user (a/b/c/d), return true jika benar =====
    public boolean submitJawaban(String jawabanUser) {
        SoalQuiz soal = daftarSoal.get(indexSoal);
        boolean benar = jawabanUser.equalsIgnoreCase(soal.getJawaban());
        if (benar) skor++;
        indexSoal++;
        return benar;
    }

    // ===== CEK apakah masih ada soal berikutnya =====
    public boolean hasNext() {
        return indexSoal < daftarSoal.size();
    }

    // ===== GET nomor soal sekarang (1-based untuk tampilan) =====
    public int getNomorSoal() {
        return indexSoal + 1;
    }

    // ===== GET total soal =====
    public int getTotalSoal() {
        return daftarSoal.size();
    }

    // ===== GET skor akhir =====
    public int getSkor() {
        return skor;
    }

    // ===== GET selisih waktu =====
    public int getWaktuDetik() {
        long waktuSelesai = System.currentTimeMillis();
        return (int) ((waktuSelesai - waktuMulai) / 1000);
    }
    
    // ===== SIMPAN hasil ke DB =====
    public void simpanHasil() {
        MysqlHasilQuizService service = new MysqlHasilQuizService();
        HasilQuiz hasil = new HasilQuiz(Session.idAccount, skor, getWaktuDetik());
        service.add(hasil);
    }

    // ===== RESET untuk main ulang =====
    public void reset() {
        indexSoal = 0;
        skor = 0;
    }
}