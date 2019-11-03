class Rett{
    private String navn;
    private String type;
    private double pris;
    private String oppskrift;

    public Rett(String type, double pris, String navn, String oppskrift){
        this.type=type;
        this.pris=pris;
        this.navn=navn;
        this.oppskrift=oppskrift;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPris() {
        return pris;
    }

    public void setPris(double pris) {
        this.pris = pris;
    }

    public String getOppskrift() {
        return oppskrift;
    }

    public void setOppskrift(String oppskrift) {
        this.oppskrift = oppskrift;
    }
}