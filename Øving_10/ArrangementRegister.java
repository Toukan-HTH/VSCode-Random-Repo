import java.util.ArrayList;



class ArrangementRegister{
    ArrayList<Arrangement> arrangementer;
    public ArrangementRegister(){
        this.arrangementer=new ArrayList<Arrangement>();
    }



    public void finnArangementerVGS(String sted){
        int tjener=0;
        for(int i=0;i<arrangementer.size();i++){
            if(arrangementer.get(i).getSted()==sted){
                tjener++;
                System.out.println("\nArrangement nummer: " + tjener);
                System.out.println("Nummer id : " + arrangementer.get(i).getNummer() + "\nSted :" + arrangementer.get(i).getSted() + "\nArrangor :" + arrangementer.get(i).getArrangor()+ "\nType :" + arrangementer.get(i).getType() + "\nTidspunkt :" + arrangementer.get(i).getTidspunkt());
            }
        }
    }





    public void finnArangementerVGD(long dato){
        
    }









    public void registrerArrangement(long nummer, String sted, String arrangor, String type, long tidspunkt){
        int s =0;
        while(s==0){
            for(int i=0; i<arrangementer.size();i++){
                if(nummer==arrangementer.get(i).getNummer()){
                    System.out.println("Dette Nummeret er i bruk");
                    s++;
                }
            }
            arrangementer.add(new Arrangement(nummer, sted, arrangor, type, tidspunkt));
            s++;
        }
    }

}