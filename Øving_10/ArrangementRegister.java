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
            if(arrangementer.get(i).getSted().equals(sted)){
                tjener++;
                System.out.println("\nArrangement nummer: " + tjener);
                System.out.println(arrangementer.get(i).tostring());
            }
        }
    }





    public void finnArangementerVGD(String dato){
        int tjener=0;
        int size=arrangementer.size();
        for(int i=0;i<size;i++){
            String p = arrangementer.get(i).getTidspunkt().substring(0,arrangementer.get(i).getTidspunkt().length()-4);
            if(p.equals(dato)){
                tjener++;
                System.out.println("\nArrangement nummer: " + tjener);
                System.out.println(arrangementer.get(i).tostring());
            }
        }
    }









    public boolean registrerArrangement(String nummer, String sted, String arrangor, String type, String tidspunkt){
        int s =0;
        boolean statement = true;
        while(s==0){
            for(int i=0; i<arrangementer.size();i++){
                if(nummer.equals(arrangementer.get(i).getNummer())){
                    System.out.println("Dette Nummeret er i bruk");
                    boolean statement1=false;
                    s++;
                    return statement1;
                }
            }
            arrangementer.add(new Arrangement(nummer, sted, arrangor, type, tidspunkt));
            s++;
        }
        return statement;
    }


    public void sortering(){
        SorteringEtterTid sort = new SorteringEtterTid();
        Collections.sort(arrangementer, sort);
        int size = arrangementer.size();
        Collections.sort(this.arrangementer);
        for(int i=0; i<size;i++){
            System.out.println(arrangementer.get(i).tostring());
        }
    }








    public void finnArangementerTidsintervall(String dato1, String dato2){
        ArrayList<Arrangement> arrangementerNEW = new ArrayList<Arrangement>();
        int dato1INT = Integer.parseInt(dato1.substring(0,dato1.length()));
        int dato2INT = Integer.parseInt(dato2.substring(0,dato2.length()));
        for(int i=0;i<arrangementer.size();i++){
            int p = Integer.parseInt(arrangementer.get(i).getTidspunkt().substring(0,arrangementer.get(i).getTidspunkt().length()-4));
            if(p>dato1INT && p<dato2INT){
                arrangementerNEW.add(arrangementer.get(i));
            }
        }
        SorteringEtterTid sort = new SorteringEtterTid();
        Collections.sort(arrangementerNEW, sort);
        for(int i=0; i<arrangementerNEW.size();i++){
            System.out.println(arrangementerNEW.get(i).tostring());
        }
    }
}