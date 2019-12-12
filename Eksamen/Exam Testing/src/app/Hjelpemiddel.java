package app;
/**
 * @author Henrik Tengs Hafsø
 * @version 12.12.2019
 */
class Hjelpemiddel implements Comparable<Hjelpemiddel>{
    private String id;
    private String type;
    private boolean utlåntstatus;
    private String navn;

    /**
     * Konstruktør
     * @param nyId Id-en til hjelpemiddelet
     * @param nyType typen hjelpemiddel
     * @param nyUtlåntstatus status for utlåning
     * @param nyNavn navnet på den som er nåverende eier av hjelpemiddelet
     */
    public Hjelpemiddel(String nyId, String nyType, boolean nyUtlåntstatus, String nyNavn){
        this.id=nyId;
        this.type=nyType;
        this.utlåntstatus=nyUtlåntstatus;
        this.navn=nyNavn;
    }

    //Get metode for utlånstatus
    public boolean getUtlåntstatus() {
        return utlåntstatus;
    }

    /**
     * Set metode for utlånstatus
     * @param utlåntstatus status en setter på hjelpemiddelet
     */
    public void setUtlåntstatus(boolean utlåntstatus) {
        this.utlåntstatus = utlåntstatus;
    }

    //Get metode for type
    public String getType(){
        return type;
    }

    //Get metode for navn
    public String getNavn() {
        return navn;
    }

    /**
     * set metode for navnet til eieren av hjelpemiddelet
     * @param navn
     */
    public void setNavn(String navn) {
        this.navn = navn;
    }

    //Get metode for id i String format
    public String getId() {
        return id;
    }

    //Get metode for id i int format
    public int getIntId(){
        //Gjør om String til int
        return Integer.parseInt(id);
    }

    //compareTo metode for å sammenligne 2 instanser av Hjelpemiddel
    public int compareTo(Hjelpemiddel id1){
        int result;
        result = this.id.compareTo(id1.getId());
        return result;
    }

    //toString metode
    public String toString(){
        if(!utlåntstatus){
            return id + " " + type + " ledig";
        }else{
            return id + " " + type + " utleid til " + navn;
        }
    }
}