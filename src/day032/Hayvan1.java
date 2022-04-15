package day032;

public class Hayvan1 extends Canlı1{
    private int yası;
    private double agırlık;
    private String tur;

    public Hayvan1() {
        System.out.println("hayvan nesnesi olusturuldu.");
    }

    public Hayvan1(int yası, double agırlık, String tur) {
        this("tur");
        this.yası = yası;
        this.agırlık = agırlık;
       //this.tur = tur;
        System.out.println("uclu constructur ile nesne olusturuldu.");
    }



    public Hayvan1(String tur) {
        this.tur=tur;
        System.out.println("tek parametrelı nesne olusturuldu.");

    }
}
