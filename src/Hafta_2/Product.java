package Hafta_2;

public class Product extends SmartPhone {
    SmartPhone s2;
    String id;
    String name;
    double price;
    Product(){

    }
    Product(SmartPhone s2){ //SmartPhone class içindeki bilgileri s2 nesnesi ile çektik.
        this.id= s2.id;
        this.name=s2.name;
        this.price=s2.price;


    }
    double TotalPrice(SmartPhone[] arr){   //Girilen nesnelerin price değerleri toplamını verdi.
        double total=0.0;
        for (int i=0;i<arr.length;i++){
            total+=(arr[i].price);

        }
        return total;


    }
}
