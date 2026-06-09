package tubespbo.model;

public class HasilQuiz {
    private int idHasil;
    private int idAccount;
    private float nilai;
    private int waktu;

    public HasilQuiz() {
    }

    public HasilQuiz(int idAccount, float nilai, int waktu) {
        this.idHasil = idHasil;
        this.idAccount = idAccount;
        this.nilai = nilai;
        this.waktu = waktu;
    }

    public int getIdHasil() {
        return idHasil;
    }

    public void setIdHasil(int idHasil) {
        this.idHasil = idHasil;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public float getNilai() {
        return nilai;
    }

    public void setNilai(float nilai) {
        this.nilai = nilai;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }
}