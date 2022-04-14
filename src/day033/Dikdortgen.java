package day033;

public class Dikdortgen extends Sekil{
    private double genislik;
    private double yukseklik;

    public Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }

    public Dikdortgen() {
    }

    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    @Override
    double alanHesapla() {
        return yukseklik*genislik;
    }

    @Override
    double cevreHesapla() {
        return 2*(yukseklik+genislik);
    }

    @Override
    void ciz() {
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
    }

    @Override
    public String toString() {
        return String.format("Genişlik: %5.2f\tYükseklik: %5.2f\tAlan: %5.2f\tÇevre: %5.2f",
                genislik,yukseklik,alanHesapla(),cevreHesapla());
    }
}
