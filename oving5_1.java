import java.util.Scanner;

class oving5_1{
private int nevner;
private int teller;
private int nynevner;

    public oving5_1(int teller, int nevner){
        this.teller = teller;
        this.nevner = nevner;
    }

    public oving5_1(int teller) {
        this.teller = teller;
        nevner=1;
    }
    public int getteller(){
        return teller;
    }
    public int getnevner(){
        return nevner;
    }

    public void getPlus(int tellerinn, int nevnerinn){
        this.teller=teller;
        this.nevner=nevner;
        if(nevner==0 || nevnerinn==0){
            throw new IllegalArgumentException("Nevner kan ikke vere 0");
        }
        nynevner=nevner*nevnerinn;
        tellerinn=tellerinn*nevner;
        teller=teller*nevnerinn;
        int nyteller=tellerinn+teller;
        if(nyteller!=0){
            System.out.println("\n PLUS : Svaret er " + nyteller + "\n"+ "                  " + nynevner);
        }else if(nyteller==0){
            System.out.println("\n PLUS : Svaret er " + nyteller);
        }

    }

    public void getMinus(int tellerinn, int nevnerinn){
        this.teller=teller;
        this.nevner=nevner;
        if(nevner==0 || nevnerinn==0){
            throw new IllegalArgumentException("Nevner kan ikke vere 0");
        }
        nynevner=nevner*nevnerinn;
        tellerinn=tellerinn*nevner;
        teller=teller*nevnerinn;
        int nyteller=teller-tellerinn;
        if(nyteller!=0){
            System.out.println("\n MINUS : Svaret er " + nyteller + "\n"+ "                   " + nynevner);
        }else if(nyteller==0){
            System.out.println("\n MINUS : Svaret er " + nyteller);
        }
    }
    
    public void getGange(int tellerinn, int nevnerinn){
        this.teller=teller;
        this.nevner=nevner;
        if(nevner==0 || nevnerinn==0){
            throw new IllegalArgumentException("Nevner kan ikke vere 0");
        }
        nynevner=nevner*nevnerinn;
        int nyteller=teller*tellerinn;
        if(nyteller!=0){
            System.out.println("\n GANGE : Svaret er " + nyteller + "\n"+ "                   " + nynevner);
        }else if(nyteller==0){
            System.out.println("\n GANGE : Svaret er " + nyteller);
        }
    }

    public void getDeling(int tellerinn, int nevnerinn){
        this.teller=teller;
        this.nevner=nevner;
        if(nevner==0 || nevnerinn==0){
            throw new IllegalArgumentException("Nevner kan ikke vere 0");
        }
        nynevner=nevner*tellerinn;
        int nyteller=teller*nevnerinn;
        if(nyteller!=0){
            System.out.println("\n DELING: Svaret er " + nyteller + "\n"+ "                   " + nynevner);
        }else if(nyteller==0){
            System.out.println("\n DELING: Svaret er " + nyteller);
        }
    }
    public static void main(String[] args){
        oving5_1 brok1 = new oving5_1(3, 6);
        oving5_1 brok2 = new oving5_1(3);
        brok1.getPlus(6, 3);
        brok1.getMinus(7, 6);
        brok1.getDeling(3, 3);
        brok1.getGange(3, 6);

        int teller=brok2.getteller();
        int nevner = brok2.getnevner();
        System.out.println(teller + "  " + nevner);


}
}


