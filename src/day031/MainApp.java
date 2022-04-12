package day031;

public class MainApp {
    public static void main(String[] args) {
        //Constructor: Kurucu metot
        //Parametresi olmayan kurucu metot
        //varsayılan olarak vardır.
        Contact kisi=new Contact("Ahmet Dursun","+905422541212",
                "adursun@gmail.com");
        System.out.println(kisi.getName());



    }
}
