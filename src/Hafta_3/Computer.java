package Hafta_3;
public class Computer {
    public boolean condition;
    public GameController gameController;
    public void open() throws Exception{
        if(condition){
            throw new Exception("ERROR! Because the computer was turned on before.");
        }
        System.out.println("Device Turned On.");
        condition=true;
    }
    public void shutDown() throws Exception{
        if(condition==false){
            throw new Exception("ERROR! Because the computer was turned off before.");
        }
        System.out.println("Device Turned Off.");
        condition=false;
    }
    public void playGame() throws Exception{
        if(condition==false){
            throw new RuntimeException("Device is not turned on!");
        }else if(gameController==null){
            throw new Exception("Device is not connected to any device.");
        }
        System.out.println("Game has started!");


    }
    public void addController (GameController gameController) throws Exception{
        if((this.gameController!=gameController)&&(this.gameController!=null)&&(gameController!=null)){
            throw new Exception("Device are not compatible.");
        } else if(this.gameController!=null){
            throw new Exception("Device already connected.");
        }
        this.gameController= gameController;
        System.out.println("Device connection made.");

    }




}
