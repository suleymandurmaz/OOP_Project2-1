package day031;

import java.util.Scanner;

public class Contact1 {
private String name;
private String phonenumber;
private String emaiAdress;
public Contact1(){

}

public Contact1(String name,String phonenumber
        ,String emaiAdresst){
   this.name=name;
   this.phonenumber=phonenumber;
   this.emaiAdress=emaiAdresst;


}
public void showİnfo(){
    System.out.println(this.getName());
    System.out.println(this.getEmaiAdress());
    System.out.println(this.getPhonenumber());

}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmaiAdress() {
        return emaiAdress;
    }

    public void setEmaiAdress(String emaiAdress) {
        this.emaiAdress = emaiAdress;
    }
    public void sendSMS(){
        System.out.println(this.phonenumber+"numaraya sms gönderiliyor.");
    }
    public  void sendEmal(){
        System.out.println(this.emaiAdress+"email gönderiliyor.");
    }
    public void scannerFromKeybord(){
        Scanner scanner=new Scanner(System.in);

        System.out.println("ısım:");
        this.setName(scanner.nextLine());
        System.out.println("tel:");
        this.setPhonenumber(scanner.nextLine());
        System.out.println("email:");
        this.setEmaiAdress(scanner.nextLine());
    }
}
