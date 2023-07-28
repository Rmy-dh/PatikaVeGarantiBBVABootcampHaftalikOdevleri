package Hafta_3;

public class Main {
    public static void main(String[] args) {
        Computer c1=new Computer();
        GameController n1=new XBOX();
        GameController n2=new Playstation();
        GameController n3=new Playstation();
        try {
            c1.open();
            c1.open();
            c1.addController(n3);
            c1.shutDown();
            c1.shutDown();
            c1.playGame();
        }catch (Exception e){
            System.out.println("ERROR CATCHING....");
            System.out.println(e.toString());
        }
    }
}
