package app;
import java.util.Scanner;

class Klient{
    public static void main(String[] args){
        Hjelpemiddelsentral hjelpemiddelsentral = new Hjelpemiddelsentral("NTNU-sentralen");        
        boolean menu = true;
        boolean menuValgt = false;
        int menuValg =0;
        while(menu){
            System.out.println("1. Registrer nytt hjelpemiddel");
            System.out.println("2. Skriv ut all informasjon");
            System.out.println("3. Registrer nytt leieforhold");
            System.out.println("4. Avslutt leieforhold");
            System.out.println("5. Skriv ut alle ledige Hjelpemidler av en gitt type (feks alle høreapparater)");
            System.out.println("9. Avslutt");
            System.out.println("\nVennligst velg fra menyen\n");

            Scanner sc = new Scanner(System.in);
            if(sc.hasNextInt()){
                menuValg=sc.nextInt();
                menuValgt=true;
            }else{
                System.out.println("Du er nødt for å skrive inn et tall, ikke bokstaver");
            }

            if(menuValg>5 && menuValg<9 || menuValg==0){
                System.out.println("Disse nummerene har ikke en assosierende menyvalg\nVennligst velg et valid nummer");
                menuValgt=false;
            }
            if(menuValgt){
                if(menuValg==1){
                    Scanner st = new Scanner(System.in);
                    System.out.println("Hvilken type er hjelpemiddelet?");
                    String hjelpemiddel = st.nextLine();
                    System.out.println("Hvilken ID har hjelpemiddelet?");
                    Scanner st1 = new Scanner(System.in);
                    String id = st1.nextLine();
                    hjelpemiddelsentral.registrerHelpemiddel(id, hjelpemiddel);

                }else if(menuValg==2){
                    System.out.println(hjelpemiddelsentral.getInformasjon());
                }else if(menuValg==3){
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("ID på hjelpemiddelet?");
                    String id = sc1.nextLine();
                    System.out.println("Navn på ny eier?");
                    hjelpemiddelsentral.registrerEier(sc1.nextLine(), id);
                }else if(menuValg==4){
                    Scanner sc2 = new Scanner(System.in);
                    System.out.println("ID på hjelpemiddelet?");
                    String id = sc2.nextLine();
                    hjelpemiddelsentral.avsluttLeie(id);
                }else if(menuValg==5){
                    Scanner kl = new Scanner(System.in);
                    System.out.println("Hvilken type?");
                    System.out.println(hjelpemiddelsentral.getLedigAvGittType(kl.nextLine()));
                }else if(menuValg==9){
                    menu=false;
                }
            }
        }
            
    }
}