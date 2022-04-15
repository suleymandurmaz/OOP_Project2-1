package day034;

public class Sekil3B {
    private double derinlik;
    private double yukseklik;
    private double genislik;

    public Sekil3B(double derinlik, double yukseklik, double genislik) {
        this.derinlik = derinlik;
        this.yukseklik = yukseklik;
        this.genislik = genislik;
    }

    public Sekil3B() {
        this(1.0,1.0,1.0);
    }

    public double getDerinlik() {
        return derinlik;
    }

    public void setDerinlik(double derinlik) {
        this.derinlik = derinlik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double hacimHesapla(){
        return genislik*derinlik*yukseklik;
    }

    @Override
    public String toString() {
        return String.format("(%5.2fx%5.2fx%5.2f)",derinlik,yukseklik,genislik);
    }
}
