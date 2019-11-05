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
        boolean ermenyregistrert=false;
        int errettalleredeimeny=0;
        int timer = 0;
        while(timer==0){
            for(int i=0;i<menyList.size();i++){
                if(navnMeny.equals(menyList.get(i).getNavn())){
                    int meny = i;
                    ArrayList<Rett> menyretter = (menyList.get(meny)).getRettArray();
                    for(int k=0;k<rettList.size();k++){
                        if(navnRett.equals(rettList.get(k).getNavn())){
                            for(int ming =0;ming<menyretter.size();ming++){
                                if((menyretter.get(ming)).getNavn()==navnRett){
                                    errettalleredeimeny++;
                                    System.out.println("ERROR: Rett allerede i meny!");
                                }
                            }
                        }
                    }
                    ermenyregistrert=true;
                    timer++;
                }
            }
            timer++;
        }

        if(errettalleredeimeny==0){
            for(int i=0;i<menyList.size();i++){
                if(navnMeny.equals(menyList.get(i).getNavn())){
                    int meny = i;
                    for(int k=0;k<rettList.size();k++){
                        if(navnRett.equals(rettList.get(k).getNavn())){
                            System.out.println("RETT LAGT TIL MENY: " + navnMeny + " Rett: " + rettList.get(k).getNavn());
                            menyList.get(meny).leggTilRett(rettList.get(k));
                        }
                    }
                }
            }
        }
        if(!ermenyregistrert){
            System.out.println("NY MENY REGISTRERT");
            menyList.add(new Meny(navnMeny));
            for(int i=0;i<menyList.size();i++){
                if(navnMeny.equals(menyList.get(i).getNavn())){
                    int meny = i;
                    for(int k=0;k<rettList.size();k++){
                        if(navnRett.equals(rettList.get(k).getNavn())){
                            menyList.get(meny).leggTilRett(rettList.get(k));
                        }
                    }
                }
            }
        }
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