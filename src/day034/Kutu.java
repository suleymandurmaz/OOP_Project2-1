package day034;

public class Kutu extends Sekil3B{
    private String renk;
    private double agirlik;

    public Kutu(double derinlik, double yukseklik, double genislik, String renk, double agirlik) {
        super(derinlik, yukseklik, genislik);
        this.renk = renk;
        this.agirlik = agirlik;
    }

    public Kutu() {
    }

    public double getHacim(){

    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(double agirlik) {
        this.agirlik = agirlik;
    }
}
