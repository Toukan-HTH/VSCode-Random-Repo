import java.util.*;
class Klient{
    public static void main(String[] args){
        EiendomRegister doot = new EiendomRegister();
        Scanner sc = new Scanner(System.in);
        Scanner meny = new Scanner(System.in);
        doot.registrerEiendom(1445,"Gloppen",77,631,"",1017.6,"Jens Olsen");
        doot.registrerEiendom(1445,"Gloppen",77,131,"Syningom",661.3,"Nicolay Madsen");
        doot.registrerEiendom(1445,"Gloppen",75,19,"Fugletun",650.6,"Evilyn Jensen");
        doot.registrerEiendom(1445,"Gloppen",74,188,"",1457.2,"Karl Ove Bråten");
        doot.registrerEiendom(1445,"Gloppen",69,47,"Høiberg",1339.4,"Elsa Indregård");
        int teller =0;
        int svarint=0;
        boolean f = false;
        while(teller==0){

            //Første Meny med 5 alternativ
            System.out.println("Alternativ\n 1: Registrere inn eiendom\n 2: Skrive ut alle eiendommer som er registrert\n 3: Søke etter eiendom\n 4: Regne ut gjennomsnittsarealet\n 5: Avslutt");
            String svar = meny.nextLine();
            try{
                svarint = Integer.parseInt(svar);
            }catch (NumberFormatException nfe){
                System.out.println("Error! Please input valid number");
                f = true;
            }
            if(svarint<1 && !f || svarint>5 && !f){
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
                teller++;
                break;
            }
        }
    }
}