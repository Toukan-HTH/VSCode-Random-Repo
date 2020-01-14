class Vare{
    public static final double MOMS = 24.0;
    public static final double MOMSFAKTOR = 1.0 + MOMS / 100.0;

    private final String varenavn;
    private final int varenr;
    private double pris; //* Pris pr kilo. alltid uten moms

    public Vare(String varenavn, int varenr, double pris){
        this.varenavn=varenavn;
        this.varenr=varenr;
        this.pris=pris;
    }
    public Vare(String varenavn, int varenr){
        this.varenavn=varenavn;
        this.varenr=varenr;
        this.pris=0.0;
    }

    public String getVareNavn(){
        return varenavn;
    }
    public int getVarenr(){
        return varenr;
    }
    public double getPris(){
        return pris;
    }
    public double setPris(){
        this.pris=pris;
        return pris;
    }
    public double beregnPrisUMva(double kilo){
        double totalPris =pris * kilo;
        if(kilo>5){
            totalPris=totalPris *0.8;
        }else if(kilo>3){
            totalPris=totalPris *0.9;
        }
        return totalPris;
    }

    /*public double beregnPrisMMva(double kilo){
        double totalPris =pris * kilo;
        if(kilo>5){
            totalPris=totalPris *0.8;
        ///}else if(kilo>3){
          //  totalPris=totalPris *0.9;
        //}
       // return totalPris * MOMSFAKTOR;
    //}*/
    public double beregnPrisMMva(double kilo){
        double totalPrisMM = beregnPrisUMva(kilo) * MOMSFAKTOR;
        return totalPrisMM;
    }

}
class Klient2{
    public static void main(String[] args){
        Vare morgenost = new Vare("Morgenost", 123, 79.50);
        double kilo = 4;
        double prisUMva = morgenost.beregnPrisUMva(kilo);
        double prisMMva = morgenost.beregnPrisMMva(kilo);
        System.out.println(morgenost.toString());

        System.out.println("Pris Uten UMVA" + " " + prisUMva);
        System.out.println("Pris Uten MMVA" + " " + prisMMva);
    }
 }