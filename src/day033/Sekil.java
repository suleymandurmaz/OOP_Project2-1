package day033;

public abstract class Sekil {
    public void bilgiGoster(){
        System.out.println("Geometrik şekil oluşturuldu.");
    }

    abstract double alanHesapla();
    abstract double cevreHesapla();
    abstract void ciz();
}
