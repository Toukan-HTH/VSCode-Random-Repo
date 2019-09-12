import static javax.swing.JOptionPane.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;

class Valuta{
    private double nok;
    private double sek;
    private double euro;
    private double dollar;

    public Valuta(double nok, double sek, double euro, double dollar){
        this.nok=nok;
        this.dollar=dollar;
        this.euro=euro;
        this.sek=sek;
    }
    public double getRegnOTNFE(double eurofraleser){
        double resultat=euro*eurofraleser;
        return resultat;
    }
}
    /*
    public double getRegnOTNFD(double resultat, double dollar, double nok){
        resultat=dollar*nok;
        return resultat;
    }
    public double getRegnOTNFS(double resultat, double sek, double nok){
        return resultat;
    }
    public double getRegnOFNTE(double resultat, double euro, double nok){
        return resultat;
    }
    public double getRegnOFNTD(double resultat, double dollar, double nok){
        return resultat;
    }
    public double getRegnOFNTS(double resultat, double sek, double nok){
        return resultat;
    }
}
*/










class oving4_1{
    public static void main(String[] args){
        /*double eurofraleser = 20;
        Valuta fraEuroTilNok = new Valuta(1, 0.92, 9.87, 8.95);
        double resultat = fraEuroTilNok.getRegnOTNFE(eurofraleser);
        System.out.println(resultat);*/
        int fraellertil=0;
        while(fraellertil!=1 && fraellertil!=2 && fraellertil !=3){
            Scanner lt = new Scanner(System.in);
            System.out.println("Vil du konvertere FRA eller TIL Norske Kroner?\n 1: Fra\n 2: Til\n 3: Avslutt");
            String konvertere = lt.nextLine();
            try{
                fraellertil = Integer.parseInt(konvertere);
            }catch (NumberFormatException nfe){
            }
            if(fraellertil !=1 && fraellertil !=2 && fraellertil !=3){
                System.out.println("Dette er ukke et valid tall");
            }
        }
        if(fraellertil==3){
            System.exit(1);
        }
        if(fraellertil==1){

        }else if(fraellertil==2){
            int valutavalgt=0;
            while(valutavalgt!=1 && valutavalgt!=2 && valutavalgt !=3 && valutavalgt!=4){
                System.out.println("Vilken Valuta vil du konvertere kroner til?\n 1: Dollar\n 2: Sek\n 3: Euro\n 4: Avslutt");
                Scanner lt = new Scanner(System.in);
                String valutafranok=lt.nextLine();
                try{
                    valutavalgt = Integer.parseInt(valutafranok);
                }catch (NumberFormatException nfe){
                }
                if(valutavalgt !=1 && valutavalgt !=2 && valutavalgt !=3 && valutavalgt !=4){
                    System.out.println("Dette er ukke et valid tall");
                }
            }
            if(valutavalgt==1){

            }else if(valutavalgt==2){

            }else if(valutavalgt==3){

            }else if(valutavalgt==4){
                System.exit(1);
            }
        }
    }   
}