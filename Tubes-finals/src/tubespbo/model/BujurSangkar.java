package tubespbo.model;

public class BujurSangkar extends BangunDatar {
    // ====== ATRIBUT ======
    private double sisi;

    // ====== KONSTRUKTOR ======
    public BujurSangkar(){
        setJumlahSisi(4);
    }
    
    public BujurSangkar(String warna, double sisi){
        super(4, warna);
        this.sisi = sisi;
    }

    // ====== SELEKTOR ======
    public double getSisi(){
        return sisi;
    }

    // ====== MUTATOR  ======
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    // ====== METHOD LAINNYA ======
    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    };

    @Override
    public double getKeliling(){
        return 4 * sisi;
    }

    @Override
    public double getLuas(){
        return sisi * sisi;
    }

    @Override
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
