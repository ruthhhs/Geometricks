package tubespbo.model;

public class SegiTiga extends BangunDatar {
    // ====== ATRIBUT ======
    private double alas;
    private double tinggi;

    // ====== KONSTRUKTOR ======
    public SegiTiga(){
        setJumlahSisi(4);
    }

    public SegiTiga(String warna, double alas, double tinggi){
        super(4, warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // ====== SELEKTOR ======
    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    // ====== MUTATOR  ======
    public void setAlas(double alas){
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    // ====== METHOD LAINNYA ======
    @Override
    public double getKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
        return alas + 2 * sisiMiring; 
    }

    @Override
    public double getLuas(){
        return 0.5 * alas * tinggi;
    }

    @Override
    public String printDetail(){
        return
            "--- Detail Segitiga ---" +
            "\nAlas     : " + this.getAlas() +
            "\nTinggi   : " + this.getTinggi() +
            "\n" +
            "\nKeliling : " + this.getKeliling() +
            "\nLuas     : " + this.getLuas();
    }
}
