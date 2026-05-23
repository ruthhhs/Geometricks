public class PersegiPanjang extends BangunDatar {
    // ====== ATRIBUT ======
    private double panjang;
    private double lebar;

    // ====== METHOD KONSTRUKTOR ======
    public PersegiPanjang(){
        setJumlahSisi(4);
    }

    public PersegiPanjang(String warna, double panjang, double lebar){
        super(4, warna);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // ====== METHOD SELEKTOR ======
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }

    // ====== METHOD MUTATOR  ======
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

    public double getKeliling(){
        return 2 * (panjang + lebar);
    }

    public double getLuas(){
        return panjang * lebar;
    }

    public void printDetail(){
        System.out.println("=== Print Detail Persegi Panjang ===" );
        System.out.println("Warna    = " + this.getWarna());
        System.out.println("Panjang  = " + this.getPanjang());
        System.out.println("Lebar    = " + this.getLebar());
        System.out.println("Diagonal =  " + this.getDiagonal());
        System.out.println("Keliling = " + this.getKeliling());
        System.out.println("Luas     = " + this.getLuas());
        System.out.println();
        
    }
}
