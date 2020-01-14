import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;
public class Deck{
    ArrayList<Card> kortstokk;
    public Deck(){
        this.kortstokk = new ArrayList<Card>();
        for(int i=1;i<5;i++){
            char result=0;
            if(i==1){
                result='S';
            }
            else if(i==2){
                result='H';
            }
            else if(i==3){
                result='D';
            }
            else if(i==4){
                result='C';
            }
            for(int f=1;f<14;f++){
                kortstokk.add(new Card(result, f));
            }
        }
        //kortstokk.forEach(s -> System.out.println(s.getFace() + " " + s.getSuit()));
    }



    public ArrayList<Card> assign(){
        ArrayList<Card> newKortstokk = new ArrayList<Card>();
        //Kopierer kortstokken
        for(int i = 0; i<52; i++){
            newKortstokk.add(kortstokk.get(i));
        }



        //finner n antall tilfeldige plukket ut kort & konverterer til int
        double tilfeldigeDouble = (Math.random() * ((52 - 1) + 1)) + 1;
        int tilfedige = (int)tilfeldigeDouble;

        //lager endelige return arraylist
        ArrayList<Card> newnewKortstokk = new ArrayList<Card>();
        for(int i =0 ; i<=tilfedige;i++){
            double tilfeldigeDouble2 = (Math.random() * ((51-newnewKortstokk.size() - 1) + 1)) + 1;
            int tilfedige2 = (int)tilfeldigeDouble2;
            newnewKortstokk.add(newKortstokk.get(tilfedige2));
            newKortstokk.remove(tilfedige2);
        }

        newnewKortstokk.forEach(s -> System.out.println(s.getFace() + " " + s.getSuit()));

        return newnewKortstokk;
    }



    public void filterOgForeach(){
        kortstokk.stream().filter(s -> s.getSuit()=='S').forEach(s -> System.out.println(s.getFace()+" "+s.getSuit()));
    }




    public void filterOgCollect(){
        List<Card> hjerterkort = kortstokk.stream().filter(s -> s.getSuit()=='H').collect(Collectors.toList());
        hjerterkort.forEach(s -> System.out.println(s.getFace()+ " " + s.getSuit()));
    }



    
}