import java.util.*;
class EiendomRegister{
    ArrayList<Eiendom> eiendomList = new ArrayList<Eiendom>();
    public EiendomRegister(){
    }



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



    public void getAlleEiendommene(){
        for(int i=0;i<eiendomList.size();i++){
            System.out.println(eiendomList.get(i).getKommunenummer() + "-" + eiendomList.get(i).getGnr() + "/" + eiendomList.get(i).getBnr());
        }
    }



    public void getgjennomsnittareal(){
        double total=0;
        for(int i = 0;i<eiendomList.size();i++){
            total = total + eiendomList.get(i).getAreal();
        }
        System.out.println("Gjennomsnittsarealet er : " + total/eiendomList.size());
    }


    public void getEiendomVedSearch(int kommunenummer,int gnr, int bnr){
        for(int i =0;i<eiendomList.size();i++){
            if(eiendomList.get(i).getKommunenummer()==kommunenummer){
                if(eiendomList.get(i).getGnr()==gnr){
                    if(eiendomList.get(i).getBnr()==bnr){
                        System.out.println(eiendomList.get(i).getKommunenummer() + "-" + eiendomList.get(i).getGnr() + "/" + eiendomList.get(i).getBnr());
                    }
                }
            }
        }
    }
}