import java.util.ArrayList;
class MenyRegister{
    ArrayList<Rett> rettList = new ArrayList<Rett>();
    ArrayList<Meny> menyList = new ArrayList<Meny>();
    public MenyRegister(){
    }

    public void rettRegisterAdd(String type, double pris, String navn, String oppskrift){
        int s =0;
        while(s==0){
            for(int i=0; i<rettList.size();i++){
                if(rettList.get(i).getNavn().equals(navn)){
                    System.out.println("Name is in use");
                    s++;
                }
            }
            rettList.add(new Rett(type,pris, navn, oppskrift));
            s++;
        }
    }

 



    public void leggRettTilMeny(String navnMeny, String navnRett){
        boolean ermenyregistrert=false;
        boolean errettalleredeimeny=false;
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
                                    errettalleredeimeny=true;
                                    System.out.println("ERROR: Rett allerede i meny!");
                                }
                            }
                        }
                    }
                    ermenyregistrert=true;
                    timer++;
                }
            }
            if(!errettalleredeimeny){
                for(int i=0;i<menyList.size();i++){
                    if(navnMeny.equals(menyList.get(i).getNavn())){
                        int meny = i;
                        for(int k=0;k<rettList.size();k++){
                            if(navnRett.equals(rettList.get(k).getNavn())){
                                System.out.println("RETT LAGT TIL MENY: " + navnMeny);
                                menyList.get(meny).leggTilRett(rettList.get(k));
                            }
                        }
                        ermenyregistrert=true;
                        timer++;
                    }
                }
            }
            timer++;
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


    public void TEST(){
        System.out.println((((menyList.get(0)).getRettArray()).get(0)).getNavn());
        System.out.println((((menyList.get(0)).getRettArray()).get(1)).getNavn());
        System.out.println((((menyList.get(0)).getRettArray()).get(2)).getNavn());
    }
}