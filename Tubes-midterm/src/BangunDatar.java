/*
Anggota Kelompok :
1. Ruth Septriana Sipangkar   (24060124120024)
2. Sarifa Nuha Ardanti Jusmar (24060124130082)
3. Syafira Azka Ramadhani     (24060124130088)
4. Yasmina Syahidah           (24060124130116)

Kelas : C
*/

public abstract class BangunDatar {
    // ====== ATRIBUT ======
    protected int jumlahSisi;
    protected String warna;
    private static int counterBangunDatar;

    // ====== METHOD KONSTRUKTOR ======
    public BangunDatar() {
        this(0, "Putih");
    }
    
    public BangunDatar(int jumlahSisi, String warna) {
        this.jumlahSisi = jumlahSisi;
        this.warna = warna;
        counterBangunDatar ++;
    }

    // ====== METHOD SELEKTOR ======
    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public String getWarna() {
        return warna;
    }

    static public int getCounterBangunDatar() {
        return counterBangunDatar;
    }

    // ====== METHOD MUTATOR  ======
    public void setJumlahSisi (int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    // ====== METHOD LAINNYA ======
    abstract public double getKeliling();
    abstract public double getLuas();
    abstract public void printDetail();
}
