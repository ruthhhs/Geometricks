public class Main {
    public static void main(String[] args) {
         System.out.println("=== IMPLEMENTASI SISTEM GEOMETRIK BANGUN DATAR DAN RUANG ===\n");

        // BANGUN DATAR
        System.out.println("=== IMPLEMENTASI BANGUN DATAR ===\n");

        // Bujur Sangkar 
        BujurSangkar BS1 = new BujurSangkar();
        BS1.setSisi(7);
        BS1.setWarna("Kuning");
        // System.out.println("Diagonal BS1 =  " + BS1.getDiagonal());
        // System.out.println("Keliling BS1 = " + BS1.getKeliling());
        // System.out.println("Luas BS1     = " + BS1.getLuas());
        BS1.printDetail();

        //Persegi Panjang dengan Parameter
        PersegiPanjang PP1 = new PersegiPanjang("Biru", 16, 9 );
        // System.out.println("Diagonal PP1 =  " + PP1.getDiagonal());
        // System.out.println("Keliling PP1 = " + PP1.getKeliling());
        // System.out.println("Luas PP1     = " + PP1.getLuas());
        PP1.printDetail();

        PersegiPanjang PP2 = new PersegiPanjang();
        PP2.setWarna("Hijau");
        PP2.setLebar(15);
        PP2.setPanjang(20);
        // System.out.println("Diagonal PP2 =  " + PP2.getDiagonal());
        // System.out.println("Keliling PP2 = " + PP2.getKeliling());
        // System.out.println("Luas PP2     = " + PP2.getLuas());
        PP2.printDetail();

        // Segitiga
        SegiTiga S1 = new SegiTiga();
        S1.setAlas(10);
        S1.setTinggi(12);
        S1.setWarna("Kuning");
        // System.out.println("Keliling S1 = " + S1.getKeliling());
        // System.out.println("Luas S1     = " + S1.getLuas());
        S1.printDetail();

        // BANGUN RUANG
        System.out.println("=== IMPLEMENTASI BANGUN RUANG ===\n");

        //Kubus
        Kubus K1 = new Kubus(new BujurSangkar("Hitam", 8));
        // System.out.println("Sisi K1           = " + K1.getSisi().getSisi());
        // System.out.println("Luas Permukaan K1 = " + K1.getLuasPermukaan());
        // System.out.println("Volume K1         = " + K1.getVolume());
        // System.out.println("Diagonal Ruang K1 = " + K1.getDiagonalRuang());
        // System.out.println("Diagonal Sisi K1  = " + K1.getSisi().getDiagonal());
        K1.printDetail();

        Kubus K2 = new Kubus(BS1);
        // System.out.println("Luas Permukaan K2 = " + K2.getLuasPermukaan());
        // System.out.println("Volume K2         = " + K2.getVolume());
        // System.out.println("Diagonal Ruang K2 = " + K2.getDiagonalRuang());
        // System.out.println("Diagonal Sisi K2  = " + K2.getSisi().getDiagonal());
        K2.printDetail();

        // Balok dengan parameter
        Balok B1 = new Balok(new PersegiPanjang("Hitam", 20, 5),
                            new PersegiPanjang("Hitam", 5, 8),
                            new PersegiPanjang("Hitam", 20, 8));
        // System.out.println("Luas Permukaan K2 = " + B1.getLuasPermukaan());
        // System.out.println("Volume K2         = " + B1.getVolume());
        // System.out.println("Diagonal Ruang K2 = " + B1.getDiagonalRuang());
        // System.out.println("Diagonal Sisi K2  = " + B1.getSisiAlas().getDiagonal());
        B1.printDetail();

        // Balok tanpa parameter
        Balok B2 = new Balok();
        B2.setSisiAlas(new PersegiPanjang("Hitam", 20, 2));
        B2.setSisiTegak(new PersegiPanjang("Hitam", 2, 2));
        B2.setSisiDepan(new PersegiPanjang("Hitam", 20, 2));
        // System.out.println(B2.getVolume());
        // System.out.println(B2.getDiagonalRuang());
        // System.out.println(B2.getSisiAlas().getDiagonal());
        // System.out.println(B2.isValid());
        B2.printDetail();

        // Limas
        Limas L1 = new Limas(new BujurSangkar("Biru", 10), new SegiTiga("Biru", 10, 13));
        L1.printDetail();

        // Interface
        System.out.println("\n=== Implementasi Interface ===");
        System.out.println("Apakah Limas L1 valid? : " + L1.isValid());
        System.out.println("Apakah Balok B1 valid? : " + B1.isValid());
        System.out.println("Apakah Balok B2 valid? : " + B1.isValid());

        // Method Statis
        System.out.println("\n=== Implementasi Methode Static ===");
        System.out.println("Jumlah Bangun Datar : " + BangunDatar.getCounterBangunDatar());
        System.out.println("Jumlah Bangun Ruang : " + BangunRuang.getCounterBangunRuang());

        // Contoh implementasi Exception
        System.out.println("\n=== Implementasi Methode dengan Exception ===");
        Balok B3 = new Balok(new PersegiPanjang("Hitam", 12, 4), 
                            new PersegiPanjang("Hitam", 4, 6),
                            new PersegiPanjang("Hitam", 12, 4));
        Limas L2 = new Limas(new BujurSangkar("Putih", 5), new SegiTiga("Putih", 6, 12));
    }
}
