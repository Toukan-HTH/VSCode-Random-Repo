import java.util.Scanner;
class oving1_2{
    public static void main(String[] args){
        //* Øving 1 Oppgave 1 //
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





        //* Øving 2 Oppgave 1//
                System.out.println("Enter arstall");
                double arstall = yt.nextDouble();
                double tesst = arstall/100;
                if (arstall >= 100 && tesst == 0){
                    if (arstall%400 == 0){
                        System.out.println("Arstallet er et skuddar");
                        }else{
                        System.out.println("Arstaller er ikke et skuddar");
                        }
                    }
                if (tesst != 0){
                     if (arstall%4 == 0){
                         System.out.println("Arstallet er et skuddar");
                        }else{
                         System.out.println("Arstaller er ikke et skuddar");
                          }
                  }  

                        
        
        
                    /* Øving 2 Oppgave 2*/
                    Scanner ot = new Scanner(System.in);
                    double kjottdeiga = 79.78; //! Kilopris
                    double kjottdeigb = 79.00; //! Kilopris
                    System.out.println("Enter Antall Kilo Kjottdeig");
                    double kilo = ot.nextDouble();
                    double prisa = kilo*kjottdeiga;
                    double prisb = kilo*kjottdeigb;
                    if(prisa>prisb){
                        System.out.println("Kjottdeig A er billigst, Den koster til sammen " + prisa + "Kr");
                    }else if (prisa==prisb){
                        System.out.println("Prisene er like");
                    }else{
                        System.out.println("Kjottdeig B er billigst, Den Koster til sammen " + prisb + "Kr");
                    }

    }

}