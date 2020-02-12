import java.util.ArrayList;

class test{
    public static void main(String[] args){
        Tribune standingtribune1 = new StandTribune("Standing tribune 1", 60, 100);
        Tribune standingtribune2 = new StandTribune("Standing tribune 2", 80, 120);
        Tribune sittingtribune = new SitTribune("Sitting tribune", 4, 20, 1);
        Tribune viptribune = new VIPTribune("VIP Tribune", 8, 200, 2);

        Tribune[] tribunes = new Tribune[4];
        String[] names = {"TEST1","TEST2"};
        String[] names2 = {"TEST3","TEST4"};
        String[] names3 = {"TEST5","TEST6"};
        System.out.println(viptribune.buyTicket(names));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(5));
        System.out.println(viptribune.buyTicket(names3));
        System.out.println(viptribune.buyTicket(names3));
        System.out.println(viptribune.buyTicket(names3));
        System.out.println(viptribune.buyTicket(names3));
        System.out.println(viptribune.buyTicket(names3));
        System.out.println(viptribune.buyTicket(names3));
        System.out.println(viptribune.buyTicket(names3));
        

        tribunes[0]=standingtribune1;
        tribunes[1]=standingtribune2;
        tribunes[2]=sittingtribune;
        tribunes[3]=viptribune;



        

    }
}