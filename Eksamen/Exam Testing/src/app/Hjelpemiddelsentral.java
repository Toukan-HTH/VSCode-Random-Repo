package app;
import java.util.ArrayList;
import java.util.Collections;
/**
 * @author Henrik Tengs Hafsø
 * @version 12.12.2019
 */
class Hjelpemiddelsentral{
    private String navn;
    private ArrayList<Hjelpemiddel> hjelpemiddelList;

    /**
     * Konstruktør
     * @param Nynavn navn på Hjelpemiddelsentralen
     */
    public Hjelpemiddelsentral(String Nynavn){
        this. navn = Nynavn;
        hjelpemiddelList = new ArrayList<Hjelpemiddel>();
    }

    /**
     * Registrering av nytt hjelpemiddel
     * @param nyId Ny id til den nye hjelpemiddelet
     * @param nyType Ny type til den nye hjelpemiddelet
     */
    public void registrerHelpemiddel(String nyId, String nyType){
        try{
            int integerID = Integer.parseInt(nyId);
            boolean alleredeRegistrert=false;
            for(int i = 0;i<hjelpemiddelList.size();i++){
                //Sjekker om den iden som er gitt er allerede registrert eller ei
                int idFraAndreHjelpemiddler = hjelpemiddelList.get(i).getIntId();;
                if(idFraAndreHjelpemiddler==integerID){
                    alleredeRegistrert=true;
                    return;
                }
            }
            //sjekker om iden gitt er mellom den gitte terskelen for id i oppgaveteksten
            if(integerID>1000 && integerID<10000){
                if(!alleredeRegistrert){
                    hjelpemiddelList.add(new Hjelpemiddel(nyId, nyType, false, null));
                    return;
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
    }

    /**
     * Metode for å registrere en eier til et hjelpemiddel
     * @param nyNavn Navn på eieren av hjelpemiddelet
     * @param Id    Id-ed til hjelpemiddelet som eieren leier
     */
    public void registrerEier(String nyNavn, String Id){
        try{
            boolean utleidStatus=false;
            int index=0;
            for(int i = 0; i<hjelpemiddelList.size();i++){
                //Sjekker om det hjelpemiddelet er allerede leid ut
                if(Id.equals(hjelpemiddelList.get(i).getId())){
                    utleidStatus=hjelpemiddelList.get(i).getUtlåntstatus();
                    index = i;
                }
            }
            if(!utleidStatus){
                hjelpemiddelList.get(index).setNavn(nyNavn);
                hjelpemiddelList.get(index).setUtlåntstatus(true);
            }
        }catch(Exception e){
            e.getMessage();
        }
    }

    /**
     * Metode for å avslutte leie
     * @param Id Id-en til hjelpemiddelet som leien avsluttes
     */
    public void avsluttLeie(String Id){
        try{
            for(int i = 0; i<hjelpemiddelList.size();i++){
                if(Id.equals(hjelpemiddelList.get(i).getId())){
                    hjelpemiddelList.get(i).setNavn(null);
                    hjelpemiddelList.get(i).setUtlåntstatus(false);
                }
            }
        }catch(Exception e){
            e.getMessage();
        }
    }

    /**
     * metode som returnerer  informasjon om alle registrerte hjelpemidler og deres utleieforhold.
     * @return informasjon String som returneres
     */
    public String getInformasjon(){
        Collections.sort(this.hjelpemiddelList);
        String informasjon = navn + "\nRegistrerte hjelpemidler";
        String info="";
        for(int i = 0; i<hjelpemiddelList.size();i++){
            info= info + hjelpemiddelList.get(i).toString() + "\n";
        }
        return informasjon + "\n" + info;
    }

    /**
     * metode som returnerer alle ledige Hjelpemidler av en gitt type (feks alle høreapparater)
     * @param gittType typen som metoden skal returnere
     * @return String info som returneres
     */
    public String getLedigAvGittType(String gittType){
        String info = "";
        Collections.sort(this.hjelpemiddelList);
        for(int i = 0; i<hjelpemiddelList.size();i++){
            if(hjelpemiddelList.get(i).getType().equals(gittType) && hjelpemiddelList.get(i).getUtlåntstatus()==false){
                info = info + hjelpemiddelList.get(i).toString() + "\n";
            }
        }
        return "\n" + info;
    }
}