import java.util.Scanner;

class Valuta{
    public static void main(String[] args){
        /* Øving 1 Oppgave 1 */

        Scanner in = new Scanner(System.in);
        System.out.println("Enter tommer");
        double tommer = in.nextDouble();
        double centimeter = (tommer*2.54);
        System.out.println(centimeter + " CM");
        


        /* Øving 1 Oppgave 2 */

        Scanner ut = new Scanner(System.in);
        System.out.println("Enter Timer");
        double timer = ut.nextDouble();
        System.out.println("Enter Minutt");
        double minutt = ut.nextDouble();
        System.out.println("Enter Sekund");
        double sekund = ut.nextDouble();

        sekund = sekund + timer*60*60 + minutt*60;
        System.out.println("Dette er totalt: " + sekund + " Sek");


        /* Øving 1 Oppgave 3*/
        Scanner yt = new Scanner(System.in);
        System.out.println("Enter Sekund total");
        int sek = yt.nextInt();
        int timerr = sek / 3600;
        sek = sek - timerr*3600;
        int minuttt = sek / 60;
        sek = sek - minuttt*60;

        System.out.println(timerr + " h " + minuttt + " m " + sek + " s ");
    }
}