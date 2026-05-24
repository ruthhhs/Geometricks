package tubespbo;

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
    public String printDetail(){
        return
            "--- Detail Kubus ---" +
            "\nSisi           : " + this.getSisi().getSisi() +
            "\n" +
            "\nLuas Sisi      : " + this.getSisi().getLuas() +  
            "\nDiagonal Ruang : " + this.getDiagonalRuang() +
            "\nLuas Permukaan : " + this.getLuasPermukaan() +
            "\nVolume         : "+ this.getVolume();
    }

}
