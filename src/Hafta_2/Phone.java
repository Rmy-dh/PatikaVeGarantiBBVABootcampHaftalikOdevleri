package Hafta_2;

public class Phone extends SmartPhone {
    SmartPhone s1;
    String id;
    String name;
    double price;
    String phoneNumber;
    Phone(){
    }
    Phone(SmartPhone s1){ //SmartPhone class içindeki blgileri s1 nesnesi ile çektik.
        this.id= s1.id;
        this.name=s1.name;
        this.price=s1.price;
        this.phoneNumber=s1.phoneNumber;
    }

}
