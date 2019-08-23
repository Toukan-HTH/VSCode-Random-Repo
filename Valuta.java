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


        //* Workshop 22.08.2019 //

        //! Double Version //
        Scanner pt = new Scanner(System.in);
        System.out.println("Lengde i Meter");
        double lengde = pt.nextDouble();
        System.out.println("Bredde i Meter");
        double bredde = pt.nextDouble();
        double areal = lengde * bredde;
        System.out.println("Arealet er : " + areal + " m^2");
    
        //! Integer Version //
        /*Scanner pt = new Scanner(System.in);*/
        System.out.println("Lengde i Meter");
        int lengdee = pt.nextInt();
        System.out.println("Bredde i Meter");
        int breddee = pt.nextInt();
        int areall = lengdee * breddee;
        System.out.println("Arealet er : " + areall + " m^2");


        /* Øving 2 Oppgave 1*/
        System.out.println("Enter arstall");
        double arstall = pt.nextDouble();
        if (arstall >= 100){
            double deling = arstall / 400;
            if (arstall%400 == 0){
                System.out.println("Arstallet er et skuddar");
                }else{
                System.out.println("Arstaller er ikke et skuddar");
                }
            }
            if (arstall <= 99){
                double deling = arstall / 4;
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
            }else{
                System.out.println("Kjottdeig B er billigst, Den Koster til sammen " + prisb + "Kr");
            }

            /*Øving 3 Oppgave 1*/
            System.out.println("Enter tall fra multiplikasjonstabellen");
            int gange = ot.nextInt();
            int resultat;
                for (int i = 0; i<11; i++){
                    resultat=gange*i;
                    System.out.println(resultat);
                
            }


            /*Øving 3 Oppgave 2*/
            int prim = 1;
            for(int prim = 1;){
                System.out.println("Enter Nummer til Analyse");
                double primtall = ot.nextDouble();
                if()
            }
        }
} 