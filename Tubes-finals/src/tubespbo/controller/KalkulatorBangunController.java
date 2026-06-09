package tubespbo.controller;

import tubespbo.model.*;
import java.util.ArrayList;
import static java.lang.Math.sqrt;

public class KalkulatorBangunController {

    private ArrayList<Double> inputs = new ArrayList<>();
    private int expectedInput = 0;
    private String selectedBangun = "";

    public void setBangun(String bangun){
        selectedBangun = bangun;
    }

    public void clearInputs(){
        inputs.clear();
    }

    public int getExpectedInput(){
        return expectedInput;
    }

    public void setExpectedInput(int value){
        expectedInput = value;
    }

    public boolean addInput(double value){
        inputs.add(value);
        return inputs.size() == expectedInput;
    }

    public String getPromptAwal(){

        return switch(selectedBangun){
            case "Bujur Sangkar", "Kubus" -> "Masukkan sisi";
            case "Persegi Panjang", "Balok" -> "Masukkan panjang";
            case "Segitiga" -> "Masukkan alas";
            case "Limas" -> "Masukkan sisi alas";
            default -> "";
        };
    }

    public String getPromptBerikutnya(){

        if(selectedBangun.equals("Persegi Panjang")){
            if(inputs.size()==1)
                return "Masukkan lebar";
        }

        if(selectedBangun.equals("Segitiga")){
            if(inputs.size()==1)
                return "Masukkan tinggi";
        }

        if(selectedBangun.equals("Balok")){
            if(inputs.size()==1)
                return "Masukkan lebar";

            if(inputs.size()==2)
                return "Masukkan tinggi";
        }

        if(selectedBangun.equals("Limas")){
            if(inputs.size()==1)
                return "Masukkan tinggi";
        }

        return "";
    }

    public String prosesBangun(){

        String hasil = "";

        switch(selectedBangun){

            case "Bujur Sangkar" -> {

                BujurSangkar bs = new BujurSangkar();
                bs.setSisi(inputs.get(0));

                hasil = bs.printDetail();
            }

            case "Persegi Panjang" -> {

                PersegiPanjang pp = new PersegiPanjang();

                pp.setPanjang(inputs.get(0));
                pp.setLebar(inputs.get(1));

                hasil = pp.printDetail();
            }

            case "Segitiga" -> {

                SegiTiga s = new SegiTiga();

                s.setAlas(inputs.get(0));
                s.setTinggi(inputs.get(1));

                hasil = s.printDetail();
            }

            case "Kubus" -> {

                BujurSangkar s = new BujurSangkar();
                s.setSisi(inputs.get(0));

                Kubus k = new Kubus(s);

                hasil = k.printDetail();
            }

            case "Balok" -> {

                PersegiPanjang sa = new PersegiPanjang();
                PersegiPanjang st = new PersegiPanjang();
                PersegiPanjang sd = new PersegiPanjang();

                sa.setPanjang(inputs.get(0));
                sa.setLebar(inputs.get(1));

                st.setPanjang(inputs.get(1));
                st.setLebar(inputs.get(2));

                sd.setPanjang(inputs.get(0));
                sd.setLebar(inputs.get(2));

                Balok b = new Balok(sa, st, sd);

                hasil = b.printDetail();
            }

            case "Limas" -> {

                BujurSangkar a = new BujurSangkar();
                SegiTiga s = new SegiTiga();

                double al = inputs.get(0);
                double tl = inputs.get(1);

                double ts =
                    sqrt((0.5 * al)*(0.5 * al) + tl*tl);

                a.setSisi(al);

                s.setAlas(al);
                s.setTinggi(ts);

                Limas l = new Limas(a, s);

                hasil = l.printDetail();
            }
        }

        inputs.clear();

        return hasil;
    }
}