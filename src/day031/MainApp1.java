package day031;

import day032.Point3D_1;

import java.util.Scanner;

public class MainApp1 {
    public static <Contact2> void main(String[] args) {
        //CONTACT kurucu metot
        //parametresi olmayan kurucu metot varsayılan olarak
        //vardır.
/*        Contact1 kısı=new Contact1("suleyman",
                "5632147","sdursun@gmail.com");
        Contact1 kısı1=new Contact1();
        kısı.setName("suleyman");
        kısı.setEmaiAdress("sdursun@gmail.com");
        kısı.setPhonenumber("5632147");
        System.out.println(kısı.getName());
        kısı1.sendSMS();
        kısı1.sendEmal();
        Contact kısı2=new Contact( "hakan sukur",
                "256892314","hakan@gmail.com");
        kısı2.call();
        kısı2.sendSMS();*/
/*        Scanner scanner=new Scanner(System.in);
        Contact kısı=new Contact();
        System.out.println("ısım:");
        kısı.setName(scanner.nextLine());
        System.out.println("tel:");
        kısı.setPhoneNumber(scanner.nextLine());
        System.out.println("email:");
        kısı.setEmailAddress(scanner.nextLine());*/
 /*     Contact kısı=new Contact();
      kısı.inputFromKeyboard();
      kısı.showInfo();
      kısı.sendSMS();*/

/*      Dikdortgen d1=new Dikdortgen(7,4);
        System.out.println(d1.toString());
        System.out.println(d1);*/
        Point point1=new Point(5,7);
        point1.setX(8);
        Point p2=new Point();
           p2.setX(3);
           p2.setY(11);
           Point p3=new Point();



        System.out.println("("+point1.getX()+";"+point1.getY()+")");
        System.out.println("("+p2.getX()+";"+p2.getY()+")");
        System.out.println("("+p3.getX()+";"+p3.getY()+")");



    }
    }

