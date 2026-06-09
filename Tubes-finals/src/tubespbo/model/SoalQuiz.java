package tubespbo.model;

import tubespbo.jdbc.model.*;

public class SoalQuiz {
    private int id;
    private String pertanyaan;
    private String opsiA;
    private String opsiB;
    private String opsiC;
    private String opsiD;
    private String jawaban;

    public SoalQuiz(
            int id,
            String pertanyaan,
            String opsiA,
            String opsiB,
            String opsiC,
            String opsiD,
            String jawaban
    ) {
        this.id = id;
        this.pertanyaan = pertanyaan;
        this.opsiA = opsiA;
        this.opsiB = opsiB;
        this.opsiC = opsiC;
        this.opsiD = opsiD;
        this.jawaban = jawaban;
    }

    public int getId() {
        return id;
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