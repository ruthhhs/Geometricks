package tubespbo.model;

public class PersegiPanjang extends BangunDatar {
    // ====== ATRIBUT ======
    private double panjang;
    private double lebar;

    // ====== KONSTRUKTOR ======
    public PersegiPanjang(){
        setJumlahSisi(4);
    }

    public PersegiPanjang(String warna, double panjang, double lebar){
        super(4, warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // ====== SELEKTOR ======
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    // ====== MUTATOR  ======
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }

    public void setLebar(double lebar){
        this.lebar = lebar;
    }

    // ====== METHOD LAINNYA ======
    public double getDiagonal(){
        return Math.sqrt(Math.pow(panjang, 2) + Math.pow(lebar, 2));
    };
    
    @Override
    public double getKeliling(){
        return 2 * (panjang + lebar);
    }

    @Override
    public double getLuas(){
        return panjang * lebar;
    }

    @Override
    public String printDetail(){
        return
            "--- Detail Persegi Panjang ---" +
            "\nPanjang  : " + this.getPanjang() +
            "\nLebar    : " + this.getLebar() +
            "\n" +
            "\nDiagonal :  " + this.getDiagonal() +
            "\nKeliling : " + this.getKeliling() +
            "\nLuas     : " + this.getLuas();
    }
}
