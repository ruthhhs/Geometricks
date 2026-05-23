public abstract class BangunRuang {
    // ====== ATRIBUT ======
    private int jumlahSisi;
    private int jumlahRusuk;
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
