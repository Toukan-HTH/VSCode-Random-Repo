import java.util.ArrayList;
import java.util.Collections;



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
                arrangementer.get(i).toString();
            }
        }
    }





    public void finnArangementerVGD(String dato){
        int tjener=0;
        int size=arrangementer.size();
        for(int i=0;i<size;i++){
            if(arrangementer.get(i).getTidspunkt()==dato){
                tjener++;
                System.out.println("\nArrangement nummer: " + tjener);
                arrangementer.get(i).toString();
            }
        }
    }









    public void registrerArrangement(String nummer, String sted, String arrangor, String type, String tidspunkt){
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


    public void sort(){
        int size = arrangementer.size();
        Collections.sort(this.arrangementer);
        for(int i=0; i<size;i++){
            System.out.println(arrangementer.get(i).tostring());
        }
    }


    public void sort2(){
        SorteringEtterTid sort = new SorteringEtterTid();
        Collections.sort(arrangementer, sort);
        int size = arrangementer.size();
        for(int i=0; i<size;i++){
            System.out.println(arrangementer.get(i).tostring());
        }
    }
}