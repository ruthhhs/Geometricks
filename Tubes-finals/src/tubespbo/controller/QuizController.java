package tubespbo.controller;

import java.util.ArrayList;

public class QuizController {
    private ArrayList<String> soalList = new ArrayList<>();
    private ArrayList<Integer> jawabanBenar = new ArrayList<>();
    private ArrayList<Integer> jawabanUser = new ArrayList<>();
    private int currentIndex = 0;

    // ===== SET SOAL =====
    public void addSoal(String soal, int jawaban) {
        soalList.add(soal);
        jawabanBenar.add(jawaban);
    }

    // ===== GET SOAL =====
    public String getSoalSekarang() {
        if (currentIndex < soalList.size()) {
            return soalList.get(currentIndex);
        }
        return "Selesai";
    }

    // ===== INPUT JAWABAN USER =====
    public void submitJawaban(int jawaban) {
        jawabanUser.add(jawaban);
        currentIndex++;
    }

    // ===== CEK MASIH ADA SOAL =====
    public boolean hasNext() {
        return currentIndex < soalList.size();
    }

    // ===== HITUNG SKOR =====
    public int getSkor() {
        int skor = 0;

        for (int i = 0; i < jawabanBenar.size(); i++) {
            if (jawabanUser.get(i).equals(jawabanBenar.get(i))) {
                skor += 10; // tiap benar 10 poin
            }
        }

        return skor;
    }

    // ===== RESET QUIZ =====
    public void reset() {
        currentIndex = 0;
        jawabanUser.clear();
    }
}