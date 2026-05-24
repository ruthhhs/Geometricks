package tubespbo;

public class SegiTiga extends BangunDatar {
    // ====== ATRIBUT ======
    private double alas;
    private double tinggi;

    // ====== METHOD KONSTRUKTOR ======
    public SegiTiga(){
        setJumlahSisi(4);
    }

    public SegiTiga(String warna, double alas, double tinggi){
        super(4, warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    // ====== METHOD SELEKTOR ======
    public double getAlas(){
        return alas;
    }

    public double getTinggi(){
        return tinggi;
    }

    // ====== METHOD MUTATOR  ======
    public void setAlas(double alas){
        this.alas = alas;
    }

    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    // ====== METHOD LAINNYA ======
    public double getKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
        return alas + 2 * sisiMiring; 
    }

    public double getLuas(){
        return 0.5 * alas * tinggi;
    }

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
