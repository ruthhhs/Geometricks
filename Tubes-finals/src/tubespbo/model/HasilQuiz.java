package tubespbo.model;

import java.math.BigDecimal;

public class HasilQuiz {

    private String idHasil;
    private String idAccount;
    private BigDecimal nilai;
    private int waktu;

    public HasilQuiz() {
    }

    public HasilQuiz(String idHasil, String idAccount, BigDecimal nilai, int waktu) {
        this.idHasil = idHasil;
        this.idAccount = idAccount;
        this.nilai = nilai;
        this.waktu = waktu;
    }

    public String getIdHasil() {
        return idHasil;
    }

    public void setIdHasil(String idHasil) {
        this.idHasil = idHasil;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    public BigDecimal getNilai() {
        return nilai;
    }

    public void setNilai(BigDecimal nilai) {
        this.nilai = nilai;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }
}