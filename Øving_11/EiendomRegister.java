import java.util.*;

/*
* Klassen EiendomRegister
* @version 1.0.0 2019-11-14
* @author Henrik Hafsø
*/
class EiendomRegister{
    private ArrayList<Eiendom> eiendomList;

    /**
     * Standardkonstruktør for å opprette object uten å gi initiell størrelse på eiendomregisterert
     */
    public EiendomRegister(){
        eiendomList = new ArrayList<Eiendom>();
    }


    /**
     *  Metode som registrer en ny eiendom i eiendomsregisteret 
     *  Metoden sjekker om kommunenummeret er innenfor terskelen gitt i oppgaven
     * 
     * @param kommunenummer som skal leggest til
     * @param kommunenavn   som skal leggest til
     * @param gnr   som skal leggest til
     * @param bnr   som skal leggest til
     * @param bruksnavn som skal leggest til
     * @param areal som skal leggest til
     * @param eier  som skal leggest til
     * @return void
     */
    public void registrerEiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier){
        if(kommunenummer<5055 && kommunenummer>100){
            eiendomList.add(new Eiendom(kommunenummer,kommunenavn,gnr,bnr,bruksnavn,areal,eier));
            System.out.println("Registrert!");
            return;
        }else{
            System.out.println("Error! kommunenummer out of border!");
            return; 
        }
    }



    /**
     * Metoden skriver ut alle eiendommene i eiendomsregisteret
     * @return void
     */
    public void getAlleEiendommene(){
        for(int i=0;i<eiendomList.size();i++){
            System.out.println(eiendomList.get(i).getID());
        }
    }


    /**
     * Metoden går gjennom arealet til alle eiendommene og deler summen på antall for å få gjennomsnitt
     * Printer ut gjennomsnittsarealet
     * @return void
     */
    public void getgjennomsnittareal(){
        double total=0;
        for(int i = 0;i<eiendomList.size();i++){
            total = total + eiendomList.get(i).getAreal();
        }
        System.out.println("Gjennomsnittsarealet er : " + total/eiendomList.size());
    }

    /**
     *  Metoden går gjennom eiendomsregisteret og ser etter en match for parameterene
     *  Metoden printer ut id til eiendommen hvis den finner en match
     * @param kommunenummer kommunenummeret til eiendommen en ønsker å finne
     * @param gnr gårdsnummer til eiendommen en ønsker å finne
     * @param bnr bruksnummer til eiendommen en ønsker å finne
     * @return void
     */
    public void getEiendomVedSearch(int kommunenummer,int gnr, int bnr){
        for(int i =0;i<eiendomList.size();i++){
            if(eiendomList.get(i).getKommunenummer()==kommunenummer){
                if(eiendomList.get(i).getGnr()==gnr){
                    if(eiendomList.get(i).getBnr()==bnr){
                        System.out.println(eiendomList.get(i).getID());
                    }
                }
            }
        }
    }


    /**
     * Metoden går gjennom eiedomsregisteret og finner en match, finnes den blir den slettet fra registeret
     * @param kommunenummer kommunenummer til eiendommen en ønsker å fjerne
     * @param gnr gårdsnummer til eiendommen en ønsker å fjerne
     * @param bnr bruksnummer til eiendommen en ønsker å fjerne
     * @return void
     */
    public void removeEiendom(int kommunenummer,int gnr, int bnr){
        for(int i =0;i<eiendomList.size();i++){
            if(eiendomList.get(i).getKommunenummer()==kommunenummer){
                if(eiendomList.get(i).getGnr()==gnr){
                    if(eiendomList.get(i).getBnr()==bnr){
                        eiendomList.remove(i);
                    }
                }
            }
        }
    }

    /**
     * 
     * @return størrelsen på arraylisten, altså antall eiendommer
     */
    public int getAntallEiendom(){
        return eiendomList.size();
    }

    /**
     * Metoden går gjennom eiendomsregisteret for å finne en match for parameter gnr
     * finnes en match så printes id til eiendommen ut
     * @param gnr gitt gårdnummer fra klient
     * @return void
     */
    public void getEiendomMedGnr(int gnr){
        for(int i =0;i<eiendomList.size();i++){
            if(eiendomList.get(i).getGnr()==gnr){
                System.out.println(eiendomList.get(i).getID());
            }
        }
    }
}