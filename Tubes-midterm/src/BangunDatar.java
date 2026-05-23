public abstract class BangunDatar {
    // ====== ATRIBUT ======
    private int jumlahSisi;
    private String warna;
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
