package Hafta_2;

public class PhoneApp {
    public static void main(String[] args) {
        SmartPhone t1=new SmartPhone("01","telefon_1",12.0,"555",5,4,"1");
        SmartPhone t2=new SmartPhone("02","telefon_2",12.1,"000",8,9,"2");
        SmartPhone t3=new SmartPhone("03","telefon_3",12.2,"111",6,3,"4");
        SmartPhone t4=new SmartPhone("04","telefon_4",12.3,"222",9,5,"8");
        SmartPhone t5=new SmartPhone("05","telefon_5",12.6,"333",5,9,"4");
        SmartPhone[] smartPhoneArray={t1,t2,t3,t4,t5};
        Product n1=new Product();
        Phone n2=new Phone(t1);
        //System.out.println(n2.name);


        System.out.println("Total Price: "+n1.TotalPrice(smartPhoneArray));


    }
}
