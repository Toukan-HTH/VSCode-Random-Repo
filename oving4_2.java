import java.util.Random;

class Player1{
    private double antallKast;
    private double poeng;
    private double ferdig;
    private double terningkast;

    public Player1(double antallKast, double poeng, double ferdig) {
        this.antallKast=antallKast;
        this.poeng=poeng;
        this.ferdig=ferdig;
    }
    public double getSumPoeng(double terningkast, double sum){
        sum=sum+terningkast;
        return sum;
    }
    public int kastTerning(int terningkast){
        return terningkast;
    }
    public double erFerdig(double sum){
        return sum;
    }
}


class Player2{
    private double antallKast;
    private double poeng;
    private double ferdig;

    public Player2(double antallKast, double poeng, double ferdig) {
        this.antallKast=antallKast;
        this.poeng=poeng;
        this.ferdig=ferdig;
    }
}