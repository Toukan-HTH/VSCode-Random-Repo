import java.util.ArrayList;
class MenyRegister{
    ArrayList<Rett> rettList = new ArrayList<Rett>();
    ArrayList<Meny> menyList = new ArrayList<Meny>();
    public MenyRegister(){
    }

    public boolean rettRegisterAdd(String type, double pris, String navn, String oppskrift){
        int s =0;
        boolean statement=false;
        while(s==0){
            for(int i=0; i<rettList.size();i++){
                if(rettList.get(i).getNavn().equals(navn)){
                    System.out.println("Name is in use");
                    s++;
                    statement= false;
                }
            }
            if(s==0){
                rettList.add(new Rett(type,pris, navn, oppskrift));
                s++;
                statement= true;
            }
        }

        return statement;
    }

 



    public void leggRettTilMeny(String navnMeny, String navnRett){
    }


    public void getMenyInnenIntervall(double lavpris, double highpris){
        for(int i =0;i<menyList.size();i++){
            if((menyList.get(i)).getTotalPris()>lavpris && (menyList.get(i)).getTotalPris()<highpris){
                System.out.println((menyList.get(i)).getNavn() + " Er Innenfor Intervallet");
                //System.out.println((menyList.get(i)).getTotalPris());
            }
        }
    }



    public void getRettGittType(String type){
        for(int i =0;i<rettList.size();i++){
            if((rettList.get(i)).getType().equals(type)){
                System.out.println((rettList.get(i)).getNavn() + " Er en rett med typen : " + type);
            }
        }
    }



    public void getRettGittNavn(String navn){
        for(int i =0;i<rettList.size();i++){
            if((rettList.get(i)).getNavn().equals(navn)){
                System.out.println((rettList.get(i)).getNavn() + " Navn");
                System.out.println((rettList.get(i)).getPris() + " Pris");
                System.out.println((rettList.get(i)).getOppskrift() + " Oppskrift");
                System.out.println((rettList.get(i)).getType() + " Type");
            }
        }
    }

    public void test(){
        System.out.println(menyList.get(0).getRettArray().get(3).getNavn());
    }
}