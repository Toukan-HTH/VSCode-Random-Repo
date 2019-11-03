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
}