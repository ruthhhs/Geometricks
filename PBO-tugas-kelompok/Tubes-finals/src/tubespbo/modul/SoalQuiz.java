package tubespbo.modul;

public class SoalQuiz {
    private String pertanyaan;
    private String[] opsi;
    private int jawabanBenar;

    public SoalQuiz(String pertanyaan, String[] opsi, int jawabanBenar) {
        this.pertanyaan = pertanyaan;
        this.opsi = opsi;
        this.jawabanBenar = jawabanBenar;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String[] getOpsi() {
        return opsi;
    }

    public int getJawabanBenar() {
        return jawabanBenar;
    }
}