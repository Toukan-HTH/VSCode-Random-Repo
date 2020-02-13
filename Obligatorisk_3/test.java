import java.util.*;

class test{
    public static void main(String[] args){
        Tribune standingtribune1 = new StandTribune("Standing tribune 1", 60, 100);
        Tribune standingtribune2 = new StandTribune("Standing tribune 2", 80, 120);
        Tribune sittingtribune = new SitTribune("Sitting tribune", 400, 250, 20);
        Tribune viptribune = new VIPTribune("VIP Tribune", 80, 200, 10);

        Tribune[] tribunes = new Tribune[4];
        String[] names = {"TEST1","TEST2"};
        String[] names2 = {"TEST3","TEST4"};
        String[] names3 = {"TEST5","TEST6"};
        System.out.println(viptribune.buyTicket(names));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names));
        System.out.println(standingtribune2.buyTicket(5));
        System.out.println(standingtribune2.buyTicket(5));
        System.out.println(standingtribune2.buyTicket(5));
        System.out.println(standingtribune2.buyTicket(5));
        System.out.println(standingtribune2.buyTicket(5));
        System.out.println(sittingtribune.buyTicket(names));
        System.out.println(standingtribune1.buyTicket(names));
        System.out.println(standingtribune1.buyTicket(names));
        System.out.println(sittingtribune.buyTicket(names));
        System.out.println(sittingtribune.buyTicket(names));
        System.out.println(sittingtribune.buyTicket(names));
        System.out.println(sittingtribune.buyTicket(names));
        System.out.println(standingtribune1.buyTicket(names));
        System.out.println(standingtribune1.buyTicket(names));
        System.out.println(standingtribune1.buyTicket(names));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names2));
        System.out.println(viptribune.buyTicket(names2));
        

        tribunes[0]=standingtribune1;
        tribunes[1]=standingtribune2;
        tribunes[2]=sittingtribune;
        tribunes[3]=viptribune;

        Arrays.sort(tribunes);
        System.out.println(tribunes[0].findIncome() + " " + tribunes[0].getTribunename());
        System.out.println(tribunes[1].findIncome() + " " + tribunes[1].getTribunename());
        System.out.println(tribunes[2].findIncome() + " " + tribunes[2].getTribunename());
        System.out.println(tribunes[3].findIncome() + " " + tribunes[3].getTribunename());
        System.out.println();
        System.out.println(tribunes[0]);
        System.out.println(tribunes[1]);
        System.out.println(tribunes[2]);
        System.out.println(tribunes[3]);

        

    }
}