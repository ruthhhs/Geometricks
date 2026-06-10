package tubespbo.model;

public class HasilQuiz {
    // ====== ATRIBUT ======
    private int idHasil;
    private int idAccount;
    private double nilai;
    private int waktu;

    // ====== KONSTRUKTOR ======
    public HasilQuiz() {
    }

    public HasilQuiz(int idAccount, double nilai, int waktu) {
        this.idAccount = idAccount;
        this.nilai = nilai;
        this.waktu = waktu;
    }
    
    public HasilQuiz(int idHasil, int idAccount, double nilai, int waktu) {
        this.idHasil = idHasil;
        this.idAccount = idAccount;
        this.nilai = nilai;
        this.waktu = waktu;
    }

    // ====== SELEKTOR ======
    public int getIdHasil() {
        return idHasil;
    }
    
    public int getIdAccount() {
        return idAccount;
    }

    public double getNilai() {
        return nilai;
    }
    
    public int getWaktu() {
        return waktu;
    }
    
    // ====== MOTATOR ======
    public void setIdHasil(int idHasil) {
        this.idHasil = idHasil;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }
}