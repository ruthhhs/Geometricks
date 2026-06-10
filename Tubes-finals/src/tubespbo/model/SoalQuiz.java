package tubespbo.model;

public class SoalQuiz {
    // ====== ATRIBUT ======
    private int idSoal;
    private String pertanyaan;
    private String opsiA;
    private String opsiB;
    private String opsiC;
    private String opsiD;
    private String jawaban;

    // ====== KONSTRUKTOR ======
    public SoalQuiz(
            int idSoal,
            String pertanyaan,
            String opsiA,
            String opsiB,
            String opsiC,
            String opsiD,
            String jawaban
    ) {
        this.idSoal = idSoal;
        this.pertanyaan = pertanyaan;
        this.opsiA = opsiA;
        this.opsiB = opsiB;
        this.opsiC = opsiC;
        this.opsiD = opsiD;
        this.jawaban = jawaban;
    }

    // ====== SELEKTOR ======
    public int getIdSoal() {
        return idSoal;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String getOpsiA() {
        return opsiA;
    }

    public String getOpsiB() {
        return opsiB;
    }

    public String getOpsiC() {
        return opsiC;
    }

    public String getOpsiD() {
        return opsiD;
    }

    public String getJawaban() {
        return jawaban;
    }
}