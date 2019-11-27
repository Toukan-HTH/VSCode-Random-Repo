import java.util.*;
/*
* Klassen Klient
* Klasse som lage en menystyrt program for bruker av eiendomregisteret.
* @version 1.0.0 2019-11-14
* @author Henrik Hafs�
*/
class Klient{
    public static void main(String[] args){
        EiendomRegister doot = new EiendomRegister();

        // Testdata ----------------------------------------------------------------------------
        doot.registrerEiendom(1445,"Gloppen",77,631,"",1017.6,"Jens Olsen");
        doot.registrerEiendom(1445,"Gloppen",77,131,"Syningom",661.3,"Nicolay Madsen");
        doot.registrerEiendom(1445,"Gloppen",75,19,"Fugletun",650.6,"Evilyn Jensen");
        doot.registrerEiendom(1445,"Gloppen",74,188,"",1457.2,"Karl Ove BrÃĨten");
        doot.registrerEiendom(1445,"Gloppen",69,47,"HÃļiberg",1339.4,"Elsa IndregÃĨrd");
        // Testdata ----------------------------------------------------------------------------


        int teller =0;
        while(teller==0){
            Scanner sc = new Scanner(System.in);
            Scanner meny = new Scanner(System.in);
            int svarint=0;
            boolean f = false;  
            System.out.println("\nAlternativ\n 1: Registrere inn eiendom\n 2: Skrive ut alle eiendommer som er registrert\n 3: lete etter eiendom\n 4: Regne ut gjennomsnittsarealet\n 5: Slett en eiendom\n 6: antall eiendommer\n 7: let ved gnr\n 9: Avslutt");
            String svar = meny.nextLine();
            try{
                svarint = Integer.parseInt(svar);
            }catch (NumberFormatException nfe){
                System.out.println("Error! Please input valid number");
                f = true;
            }
            if(svarint<1 && !f || svarint>9 && !f){
                System.out.println("Error! Please input valid number");
            }


            switch(svarint){
                case 1:



                System.out.println("Input kommunenummer <101-5054>");
                String kommunenummerinput = sc.nextLine();
                int kommunenummer;
                String kommunenavn;
                int gnr;
                int bnr;
                double areal;
                String eier;
                String bruksnavn;
                try{
                    kommunenummer = Integer.parseInt(kommunenummerinput);
                }catch (NumberFormatException nfe){
                    System.out.println("Error! Please input tall");
                    break;
                }
                System.out.println("Input kommunenavn");
                kommunenavn = sc.nextLine();
                System.out.println("Input gnr");
                String gnrinput = sc.nextLine();
                try{
                    gnr = Integer.parseInt(gnrinput);
                }catch (NumberFormatException nfe){
                    System.out.println("Error! Please input tall");
                    break;
                }
                System.out.println("Input bnr");
                String bnrinput = sc.nextLine();
                try{
                    bnr = Integer.parseInt(bnrinput);
                }catch (NumberFormatException nfe){
                    System.out.println("Error! Please input tall");
                    break;
                }
                System.out.println("Input bruksnavn");
                bruksnavn = sc.nextLine();
                System.out.println("Input areal");
                String arealinput = sc.nextLine();
                try{
                    areal = Double.parseDouble(arealinput);
                }catch (NumberFormatException nfe){
                    System.out.println("Error! Please input tall");
                    break;
                }
                System.out.println("Input eier");
                eier = sc.nextLine();
                doot.registrerEiendom(kommunenummer,kommunenavn,gnr,bnr,bruksnavn,areal,eier);
                break;



                case 2:
                doot.getAlleEiendommene();
                break;


                case 3:
                System.out.println("Kommunenummer");
                int searchkommunenr = sc.nextInt();
                System.out.println("gnr");
                int searchgnr = sc.nextInt();
                System.out.println("bnr");
                int searchbnr = sc.nextInt();
                doot.getEiendomVedSearch(searchkommunenr,searchgnr,searchbnr);
                break;



                case 4:
                doot.getgjennomsnittareal();
                break;


                case 5:
                System.out.println("Kommunenummer");
                int slettkommnr = sc.nextInt();
                System.out.println("gnr");
                int slettgnr = sc.nextInt();
                System.out.println("bnr");
                int slettbnr = sc.nextInt();
                doot.removeEiendom(slettkommnr,slettgnr,slettbnr);
                break;

                case 6:
                System.out.println(doot.getAntallEiendom());
                break;

                case 7:
                System.out.println("gnr?");
                int letvedgnr = sc.nextInt();
                doot.getEiendomMedGnr(letvedgnr);
                break;

                
                case 9:
                teller++;
                break;
            }
        }
    }
}

/*
-encoding utf8 -docencoding utf8 -charset utf8
 */