package day033;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
/*        Kare kare1=new Kare(5);
        kare1.bilgiGoster();
        kare1.ciz();
        System.out.println();
        Dikdortgen dikdortgen1=new Dikdortgen(5,3);
        dikdortgen1.ciz();*/


        //Bir ata sınıf, kendisinden türetilmiş alt sınıf örneklerine referans olabilir.


        Scanner input=new Scanner(System.in);
        System.out.println("Geometrik Şekilller");
        System.out.println("1. Kare");
        System.out.println("2. Dikdörtgen");
        System.out.println("3. Daire");
        System.out.print("Seçim : ");
        int secim= input.nextInt();
        Sekil sekil=null;

        switch (secim){
            case 1:
                System.out.print("Kenar : ");
                sekil=new Kare(input.nextDouble());
                break;
            case 2:
                System.out.print("Genişlik: ");
                double genislik= input.nextDouble();
                System.out.print("Yükseklik: ");
                double yukseklik=input.nextDouble();
                sekil=new Dikdortgen(genislik,yukseklik);
                break;
            case 3:
                System.out.print("Yarıçap: ");
                sekil=new Daire(input.nextDouble());
                break;
            default:
                break;
        }
        System.out.println(sekil);
        sekil.ciz();








    }
}
