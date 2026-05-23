public class BujurSangkar extends BangunDatar {
    // ====== ATRIBUT ======
    private double sisi;

    // ====== METHOD KONSTRUKTOR ======
    public BujurSangkar(){
        setJumlahSisi(4);
    }
    
    public BujurSangkar(String warna, double sisi){
        super(4, warna);
        this.sisi = sisi;
    }

    // ====== METHOD SELEKTOR ======
    public double getSisi(){
        return sisi;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // ====== METHOD LAINNYA ======
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    };

    public double getKeliling(){
        return 4 * sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }

    public void printDetail(){
        System.out.println("=== Print Detail Bujur Sangkar ===" );
        System.out.println("Warna    = " + this.getWarna());
        System.out.println("Sisi     = " + this.getSisi());
        System.out.println("Diagonal = " + this.getDiagonal());
        System.out.println("Keliling = " + this.getKeliling());
        System.out.println("Luas     = " + this.getLuas());
        System.out.println();
    }
}
