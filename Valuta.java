class Valuta{
    private double rate;
    private double nok;
    private double resultat;
    private double value;
    public Valuta(double rate){
        this.rate=rate;
    }

    public double ToValue(double nok){
        resultat=nok/rate;
        return  resultat;
    }

    public double toNok(double value){
        resultat=value*rate;
        return resultat;
    }
}
}