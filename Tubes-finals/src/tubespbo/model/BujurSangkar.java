package tubespbo.model;

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

    public String printDetail(){
        return
            "--- Detail Bujur Sangkar ---" +
            "\nSisi     : " + this.getSisi() +
            "\n" +
            "\nDiagonal : " + this.getDiagonal() +
            "\nKeliling : " + this.getKeliling() +
            "\nLuas     : " + this.getLuas();
    }
}
