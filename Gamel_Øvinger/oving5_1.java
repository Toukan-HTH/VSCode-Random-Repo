import java.util.Scanner;

   /* public void getMinus(int tellerinn, int nevnerinn){
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
        this.teller=nyteller;
        this.nevner=nynevner;
    }
    
    public void getGange(int tellerinn, int nevnerinn){
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
        this.teller=nyteller;
        this.nevner=nynevner;
    }

    public void getDeling(int tellerinn, int nevnerinn){
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
        this.teller=nyteller;
        this.nevner=nynevner;
    }

*/
class oving5_1{
    public static void main(String[] args){
        System.out.println("1: Pluss    2: Minus     3: Deling     4: Gange      5: Avslutt");
        Brok brok = new Brok(5, 2);
        Brok brok2Brok = new Brok(1, 2);
        Scanner sc = new Scanner(System.in);
        int menu=sc.nextInt();
        switch(menu){
            case 1:
            brok.getPlus(brok2Brok);
            int nevner=brok.getnevner();
            int teller=brok.getteller();
            System.out.println(teller);
            System.out.println(nevner);
            break;

            case 2:
            brok.getMinus(brok2Brok);
            int nevnerr=brok.getnevner();
            int tellerr=brok.getteller();
            System.out.println(tellerr);
            System.out.println(nevnerr);
            break;

            case 3:
            brok.getDeling(brok2Brok);
            int nevnerrr=brok.getnevner();
            int tellerrr=brok.getteller();
            System.out.println(tellerrr);
            System.out.println(nevnerrr);
            break;

            case 4:
            brok.getGange(brok2Brok);
            int nevnerrrr=brok.getnevner();
            int tellerrrr=brok.getteller();
            System.out.println(tellerrrr);
            System.out.println(nevnerrrr);
            break;

            case 5:
            break;
        }
    }
}


