public class Limas extends BangunRuang implements IValidasi{
    // ====== ATRIBUT ======
    private BujurSangkar sisiAlas;
    private SegiTiga sisiTegak;

    // ====== METHOD KONSTRUKTOR ======
    public Limas(){
        setJumlahSisi(5);
        setJumlahRusuk(9);
        this.sisiAlas = new BujurSangkar();
        this.sisiTegak = new SegiTiga();
    }
    
    public Limas(BujurSangkar sisiAlas, SegiTiga sisiTegak){
        super(5, 9);
        this.sisiAlas = sisiAlas;
        this.sisiTegak = sisiTegak;
        if (!isValid()) {
            throw new IllegalArgumentException("Ukuran prisma tidak valid");
        }
    }

    // ====== METHOD SELEKTOR ======
    public BujurSangkar getSisiAlas(){
        return sisiAlas;
    }

    public SegiTiga getSisiTegak(){
        return sisiTegak;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisiAlas(BujurSangkar sisiAlas){
        this.sisiAlas = sisiAlas;
    }

    public void setSisiTegak(SegiTiga sisiTegak){
        this.sisiTegak = sisiTegak;
    }

    // ====== METHOD LAINNYA ======
    public boolean isValid(){
        return sisiAlas.getSisi() == sisiTegak.getAlas();

    }
    public double getTinggi(){
        return Math.sqrt(Math.pow(sisiTegak.getTinggi(), 2)-Math.pow(sisiAlas.getSisi()/2, 2));
    }
    @Override
    public double getLuasPermukaan(){
        return (sisiAlas.getLuas()) + 4*(sisiTegak.getLuas());
    }

    @Override
    public double getVolume(){
        return sisiAlas.getLuas()/3 * getTinggi();
    }

    
    @Override
    public void printDetail(){
        System.out.println("=== Print Detail Limas ===" );
        System.out.println("Sisi Alas Limas   = " + sisiAlas.getSisi());
        System.out.println("Sisi Tinggi Limas = " + getTinggi());
        System.out.println("Luas Permukaan    = " + getLuasPermukaan() );
        System.out.println("Volume            = " + getVolume());
        System.out.println();

    }
}
