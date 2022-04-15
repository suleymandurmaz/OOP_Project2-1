package day031;

public class Dıkdortgen1 {
    private int uzunKenar;
    private int kısaKenar;


    public Dıkdortgen1(int uzunKenar, int kısaKenar) {
        this.uzunKenar = uzunKenar;
        this.kısaKenar = kısaKenar;
    }

    public Dıkdortgen1() {
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

    public int getKısaKenar() {
        return kısaKenar;
    }

    public void setKısaKenar(int kısaKenar) {
        this.kısaKenar = kısaKenar;
    }

    public int alanHeapla() {
        return kısaKenar * uzunKenar;

    }

    public int cevreHesapla() {
        return 2 * (kısaKenar + uzunKenar);
    }
}
