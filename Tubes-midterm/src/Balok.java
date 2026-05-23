public class Balok extends BangunRuang implements IValidasi{
    // ====== ATRIBUT ======
    private PersegiPanjang sisiAlas;
    private PersegiPanjang sisiTegak;
    private PersegiPanjang sisiDepan;

    // ====== METHOD KONSTRUKTOR ======
    public Balok(){
        setJumlahSisi(6);
        setJumlahRusuk(12);
        this.sisiAlas = new PersegiPanjang();
        this.sisiTegak = new PersegiPanjang();
        this.sisiDepan = new PersegiPanjang();
    }
    
    public Balok(PersegiPanjang sisiAlas, PersegiPanjang sisiTegak, PersegiPanjang sisiDepan){
        super(6, 12);
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
        this.sisiDepan = sisiDepan;
        if (!isValid()) {
            throw new IllegalArgumentException("Ukuran balok tidak valid");
        }
    }

    // ====== METHOD SELEKTOR ======
    public PersegiPanjang getSisiAlas(){
        return sisiAlas;
    }

    public PersegiPanjang getSisiTegak(){
        return sisiTegak;
    }

    public PersegiPanjang getSisiDepan(){
        return sisiDepan;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisiAlas(PersegiPanjang sisiAlas){
        this.sisiAlas = sisiAlas;
    }

    public void setSisiTegak(PersegiPanjang sisiTegak){
        this.sisiTegak = sisiTegak;
    }

    public void setSisiDepan(PersegiPanjang sisiDepan){
        this.sisiDepan = sisiDepan;
    }

    // ====== METHOD LAINNYA ======
    public boolean isValid() {
        double p = this.sisiAlas.getPanjang();
        double l = sisiAlas.getLebar();
        double t = sisiTegak.getLebar();
        return (sisiTegak.getPanjang() == l &&
                sisiDepan.getPanjang() == p &&
                sisiDepan.getLebar() == t);
    }

    public double getDiagonalRuang(){
        return Math.sqrt(Math.pow(sisiAlas.getPanjang(), 2)
                        + Math.pow(sisiAlas.getLebar(), 2)
                        + Math.pow(sisiTegak.getLebar(), 2));
    }

    @Override
    public double getLuasPermukaan(){
        return 2 * (sisiAlas.getLuas() + sisiTegak.getLuas() + sisiDepan.getLuas());
    }

    @Override
    public double getVolume(){
        return sisiAlas.getLuas() * sisiTegak.getLebar();
    }

    @Override
    public void printDetail(){
        System.out.println("=== Print Detail Balok ===" );
        System.out.println("Sisi Panjang   = " + sisiAlas.getPanjang());
        System.out.println("Sisi Lebar     = " + sisiDepan.getLebar());
        System.out.println("Sisi Tegak     = " + sisiTegak.getLebar());
        System.out.println("Luas Permukaan = " + this.getLuasPermukaan());
        System.out.println("Volume         = "+ this.getVolume());
        System.out.println("Diagonal Ruang = " + this.getDiagonalRuang());
        System.out.println();
    }
}
