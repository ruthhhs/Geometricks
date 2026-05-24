/*
Anggota Kelompok :
1. Ruth Septriana Sipangkar   (24060124120024)
2. Sarifa Nuha Ardanti Jusmar (24060124130082)
3. Syafira Azka Ramadhani     (24060124130088)
4. Yasmina Syahidah           (24060124130116)

Kelas : C
*/

public abstract class BangunRuang {
    // ====== ATRIBUT ======
    protected int jumlahSisi;
    protected int jumlahRusuk;
    private static int counterBangunRuang;

    // ====== METHOD KONSTRUKTOR ======
    public BangunRuang() {
        this(0, 0);
    }
    
    public BangunRuang(int jumlahSisi, int jumlahRusuk) {
        this.jumlahSisi = jumlahSisi;
        this.jumlahRusuk = jumlahRusuk;
        counterBangunRuang ++;
    }

    // ====== METHOD SELEKTOR ======
    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public int getJumlahRusuk() {
        return jumlahRusuk;
    }

    static public int getCounterBangunRuang() {
        return counterBangunRuang;
    }

    // ====== METHOD MUTATOR  ======
    public void setJumlahSisi (int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public void setJumlahRusuk (int jumlahRusuk) {
        this.jumlahRusuk = jumlahRusuk;
    }

    // ====== METHOD LAINNYA ======
    abstract public double getLuasPermukaan();
    abstract public double getVolume();
    abstract public void printDetail();
}
