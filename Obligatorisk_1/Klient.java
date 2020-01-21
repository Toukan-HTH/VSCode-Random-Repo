import java.util.ArrayList;
public class Klient{
    public static void main(String[] args){
        Deck test = new Deck();

        ArrayList<Card> news = test.assign();
        //test.filterOgForeach();
        //test.filterOgCollect();
        test.map(news);
        //int sum = test.reduce(news);
        //System.out.println(sum);
        //String queen = test.anyMatch(news);
        //System.out.println(test.anyMatch(news));
        System.out.println(test.pokerFlush(news));
    }
}