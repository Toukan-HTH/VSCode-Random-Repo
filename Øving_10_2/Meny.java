import java.util.ArrayList;
class Meny{
    private String navn;
    ArrayList<Rett> rettArray;
    public Meny(String navn){
        this.navn=navn;
        this.rettArray= new ArrayList<Rett>();
    }

    public String getNavn(){
        return navn;
    }


    public void leggTilRett(Rett nyrett){
        rettArray.add(nyrett);
    }

    public ArrayList<Rett> getRettArray(){
        return rettArray;
    }


    public double getTotalPris(){
        double pris=0;
        for(int i =0;i<rettArray.size();i++){
            pris=pris + rettArray.get(i).getPris();
        }
        return pris;
    }
}
