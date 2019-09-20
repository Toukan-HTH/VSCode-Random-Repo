
import java.util.Scanner;

class Brok{
private int nevner;
private int teller;

    public Brok(int teller, int nevner) {
        this.teller = teller;
        this.nevner = nevner;
        if(nevner==0){
            throw new IllegalArgumentException("Nevner kan ikke vere 0");
        }
    }

    public Brok(int teller) {
        this.teller = teller;
        nevner = 1;
    }

    public void getPlus(Brok brok2Brok) {
        teller=(brok2Brok.getteller()*nevner)+(brok2Brok.getnevner()*teller);
        nevner = brok2Brok.getnevner() * nevner;
        System.out.println(teller);
        System.out.println("_____");
        System.out.println(nevner);
        this.teller=teller;
        this.nevner=nevner;

}






public void getMinus(Brok brok2Brok) {
    teller=(brok2Brok.getteller()*nevner)-(brok2Brok.getnevner()*teller);
    nevner = brok2Brok.getnevner() * nevner;
    System.out.println(teller);
    System.out.println("_____");
    System.out.println(nevner);
    this.teller=teller;
    this.nevner=nevner;

}




public void getGange(Brok brok2Brok) {
    teller=brok2Brok.getteller()*teller;
    nevner = brok2Brok.getnevner() * nevner;
    System.out.println(teller);
    System.out.println("_____");
    System.out.println(nevner);
    this.teller=teller;
    this.nevner=nevner;

}





public void getDeling(Brok brok2Brok) {
    teller=teller*brok2Brok.getnevner();
    nevner = brok2Brok.getteller() * nevner;
    System.out.println(teller);
    System.out.println("_____");
    System.out.println(nevner);
    this.teller=teller;
    this.nevner=nevner;

}

    public int getteller() {
        return teller;
    }

    public int getnevner() {
        return nevner;
    }
}