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



    public ArrayList<Card> assign(int n){
        ArrayList<Card> newKortstokk = new ArrayList<Card>();
        //Kopierer kortstokken
        for(int i = 0; i<52; i++){
            newKortstokk.add(kortstokk.get(i));
        }



        //finner n antall tilfeldige plukket ut kort & konverterer til int
        //double tilfeldigeDouble = (Math.random() * ((52 - 1) + 1)) + 1;
        //int tilfedige = (int)tilfeldigeDouble;

        //lager endelige return arraylist
        ArrayList<Card> newnewKortstokk = new ArrayList<Card>();
        for(int i =0 ; i<n;i++){
            int tilfedige2 = (int)(Math.random() * ((51-newnewKortstokk.size()-0+1)))+0;
            newnewKortstokk.add(newKortstokk.get(tilfedige2));
            newKortstokk.remove(tilfedige2);
        }

        newnewKortstokk.forEach(s -> System.out.println(s.getFace() + " " + s.getSuit()));

        return newnewKortstokk;
    }



    public void filterOgForeach(ArrayList<Card> beep){
        beep.stream().filter(s -> s.getSuit()=='S').forEach(s -> System.out.println(s.getFace()+" "+s.getSuit()));
    }




    public void filterOgCollect(ArrayList<Card> beep){
        List<Card> hjerterkort = beep.stream().filter(s -> s.getSuit()=='H').collect(Collectors.toList());
        hjerterkort.forEach(s -> System.out.println(s.getFace()+ " " + s.getSuit()));
    }


    public void map(ArrayList<Card> news){
        news.stream().map(Card::getSuit).forEach(s -> System.out.println(s));
    }


    public int reduce(ArrayList<Card> news){
        return news.stream().map(Card::getFace).reduce(0, (a,b) ->  a+b);
    }


    public String anyMatch(ArrayList<Card> news){
        boolean isPresent = news.stream().anyMatch(Card -> Card.getFace() == 12 && Card.getSuit()=='S');
        if(isPresent){
            return "Spar dame er i listen";
        }else{
            return "Spar dame er ikke i listen";
        }
    }


    public String pokerFlush(ArrayList<Card> news){
        int S1=(int)news.stream().filter(s -> s.getSuit()=='S').count();
        int H1=(int)news.stream().filter(s -> s.getSuit()=='H').count();
        int C1=(int)news.stream().filter(s -> s.getSuit()=='C').count();
        int D1=(int)news.stream().filter(s -> s.getSuit()=='D').count();

        if(S1>=5||H1>=5||D1>=5||C1>=5){
            return "Lista er en poker-flush";
        }else{
            return "Lista er ikke en poker-flush";
        }
    }
}