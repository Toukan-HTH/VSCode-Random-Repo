import java.util.ArrayList;
import java.util.*;
public class Klient{
    public static void main(String[] args){
        boolean start = true;
        Scanner sc = new Scanner(System.in);
        Scanner bp = new Scanner(System.in);
        Deck news = new Deck();
        ArrayList<Card> boop=null;
        boolean assign = false;
        while(start){
            int svar =0;
            boolean inputrecieved = false;
            System.out.println("\nVelg alternativ:\n1: Assign, plukk tilfeldige kort\n2: Samle alle hjerter-kort i en ny liste\n3: Lage en ny liste med kortenes kortfarge\n4: Gi summen av kortverdiene\n5: Sjekk om spar dame finnes i listen\n6: Sjekk om listen er en poker-flush\n7: Skriv ut alle spar-kort\n9: Avslutt\n");
            String catchAns = sc.nextLine();
            try{
                svar = Integer.parseInt(catchAns);
                if(svar==8 || svar>9 || svar<=0){
                    System.out.println("Input er ikke et valid alternativ, vennligst input på nytt");
                }
                if(svar<=7 && svar>0 || svar==9){
                    inputrecieved=true;
                }
            }catch (Exception e){
                System.out.println("ERROR: Feil input. velg et nummer");
            }

            if(inputrecieved){
                if(svar==1){
                    System.out.println("Hvor mange kort skal trekkes?");
                    boop = news.assign(bp.nextInt());
                    assign=true;
                    inputrecieved=false;
                }

                if(svar==2 && assign){
                    news.filterOgCollect(boop);
                    inputrecieved=false;
                }

                if(svar==3 && assign){
                    news.map(boop);
                    inputrecieved=false;
                }

                if(svar==4 && assign){
                    System.out.println("Summen av kortverdiene er : " + news.reduce(boop));
                    inputrecieved=false;
                }

                if(svar==5 && assign){
                    System.out.println(news.anyMatch(boop));
                    inputrecieved=false;
                }

                if(svar==6 && assign){
                    System.err.println(news.pokerFlush(boop));
                    inputrecieved=false;
                }

                if(svar==7 && assign){
                    news.filterOgForeach(boop);
                    inputrecieved=false;
                }
                
                if(svar>1 && svar<8 && !assign){
                    System.out.println("Du må trekke et kortstokk før du kan gjøre dette");
                    inputrecieved=false;
                }

                if(svar==9){
                    start=false;
                }
            }
        }
    }
}