public class Kubus extends BangunRuang {
    // ====== ATRIBUT ======
    private BujurSangkar sisi;

    // ====== METHOD KONSTRUKTOR ======
    public Kubus(){
        setJumlahSisi(6);
        setJumlahRusuk(12);
        this.sisi = new BujurSangkar();
    }
    
    public Kubus(BujurSangkar sisi){
        super(6, 12);
        this.sisi = sisi;
    }

    // ====== METHOD SELEKTOR ======
    public BujurSangkar getSisi(){
        return sisi;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisi(BujurSangkar sisi){
        this.sisi = sisi;
    }

    // ====== METHOD LAINNYA ======
    public double getDiagonalRuang(){
        return sisi.getSisi() * Math.sqrt(3);
    }

    @Override
    public double getLuasPermukaan(){
        return 6 * Math.pow(sisi.getSisi(), 2);
    }

    @Override
    public double getVolume(){
        return Math.pow(sisi.getSisi(), 3);
    }

    @Override
    public void printDetail(){
        System.out.println("=== Print Detail Kubus ===" );
        System.out.println("Sisi           = " + sisi.getSisi());
        System.out.println("Luas Permukaan = " + this.getLuasPermukaan());
        System.out.println("Volume         = "+ this.getVolume());
        System.out.println("Diagonal Ruang = " + this.getDiagonalRuang());
        System.out.println();

    }

}
