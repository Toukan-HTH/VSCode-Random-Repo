/*
* En klasse som representerer en eiendom
* @version 1.0.0 2019-11-14
* @author Henrik Hafsø
*/

class Eiendom{
    private int kommunenummer;
    private String kommunenavn;
    private int gnr;
    private int bnr;
    private String bruksnavn;
    private double areal;
    private String eier;


    /**
     * Konstruktør for å lage et arraylist av objectet Eiendom
     * 
     * @param kommunenummer Kommunenummeret til eiendommen
     * @param kommunenavn Navnet til kommunen eiendommen er i
     * @param gnr Gårdsnummer til eienedommen
     * @param bnr Bruksnummer til eiendommen
     * @param bruksnavn Bruksnavn til eiendommen
     * @param areal Areal til eiendommen
     * @param eier Navnet på eieren av eiendommen
     */
    public Eiendom(int kommunenummer, String kommunenavn, int gnr, int bnr, String bruksnavn, double areal, String eier){
        this.kommunenummer=kommunenummer;
        this.kommunenavn=kommunenavn;
        this.gnr=gnr;
        this.bnr=bnr;
        this.bruksnavn=bruksnavn;
        this.areal=areal;
        this.eier=eier;
    }


    /**
     * 
     * @return returnerer kommunenummeret til eiendommen
     */

    public int getKommunenummer() {
        return kommunenummer;
    }

    /**
     * @param kommunenummer ny kommunenummer på eiendom
     */
    public void setKommunenummer(int kommunenummer) {
        this.kommunenummer = kommunenummer;
    }


    /**
     * 
     * @return kommunenavnet til eiendommen
     */
    public String getKommunenavn() {
        return kommunenavn;
    }


    /**
     * 
     * @param kommunenavn nytt kommunenavn på eiendommen
     */
    public void setKommunenavn(String kommunenavn) {
        this.kommunenavn = kommunenavn;
    }


    /**
     * 
     * @return gårdsnummer til eiendommen
     */
    public int getGnr() {
        return gnr;
    }

    /**
     * 
     * @param gnr nytt gårdsnummer på eiendommen
     */
    public void setGnr(int gnr) {
        this.gnr = gnr;
    }


    /**
     * 
     * @return bruksnummer til eiendommen
     */
    public int getBnr() {
        return bnr;
    }


    /**
     * 
     * @param bnr nytt bruksnummer på eiendommen
     */
    public void setBnr(int bnr) {
        this.bnr = bnr;
    }

    /**
     * 
     * @return bruksnummer til eiendommen
     */
    public String getBruksnavn() {
        return bruksnavn;
    }

    /**
     * 
     * @param bruksnavn nytt bruksnavn på eiendommen
     */
    public void setBruksnavn(String bruksnavn) {
        this.bruksnavn = bruksnavn;
    }

    /**
     * 
     * @return arealet til eiendommen
     */
    public double getAreal() {
        return areal;
    }

    /**
     * @return navnet på eier av eiendommen
     */
    public String getEier() {
        return eier;
    }

    /**
     * @param eier ny eier på eiendommen
     */
    public void setEier(String eier) {
        this.eier = eier;
    }

    /**
     * 
     * @return Samling av verdier som utgjør en unik ID av eiendommen
     */
    public String getID(){
        return kommunenummer + "-" + gnr + "/" + bnr;
    }

    public String toString(){
        return kommunenummer + " " + gnr + " " + bnr + " " + kommunenavn + " " + bruksnavn + " " + areal + " " + eier + "\n";
    }
}