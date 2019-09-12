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
    public double getRegnOTNFD(double dollarfraleser){
        double resultat=dollar*dollarfraleser;
        return resultat;
    }
    public double getRegnOTNFS(double sekfraleser){
        double resultat=sek*sekfraleser;
        return resultat;
    }
    public double getRegnFTVD(double nokfraleser){
        double resulatat = nokfraleser/dollar;
        return resulatat;
    }
    public double getRegnFTVS(double nokfraleser){
        double resulatat = nokfraleser/sek;
        return resulatat;
    }
    public double getRegnFTVE(double nokfraleser){
        double resulatat = nokfraleser/euro;
        return resulatat;
    }
}







class oving4_1{
    public static void main(String[] args){
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
                double nokfraleser=0;
                while(nokfraleser==0){
                    System.out.println("Hvor mange Kroner vil du konvertere til Doller?");
                    Scanner lt = new Scanner(System.in);
                    String noklestinn =lt.nextLine();
                    try{
                        nokfraleser = Double.parseDouble(noklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                Valuta dollarLestInn = new Valuta(1, 0.92, 9.87, 8.97);
                double resultat = dollarLestInn.getRegnFTVD(nokfraleser);
                System.out.println("Dette tilsvarer " + resultat + " Doller");
            }else if(valutavalgt==2){
                double nokfraleser=0;
                while(nokfraleser==0){
                    System.out.println("Hvor mange Kroner vil du konvertere til Sek?");
                    Scanner lt = new Scanner(System.in);
                    String noklestinn =lt.nextLine();
                    try{
                        nokfraleser = Double.parseDouble(noklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                Valuta sekLestInn = new Valuta(1, 0.92, 9.87, 8.97);
                double resultat = sekLestInn.getRegnFTVS(nokfraleser);
                System.out.println("Dette tilsvarer " + resultat + " Sek");
            }else if(valutavalgt==3){
                double nokfraleser=0;
                while(nokfraleser==0){
                    System.out.println("Hvor mange Kroner vil du konvertere til Euro?");
                    Scanner lt = new Scanner(System.in);
                    String noklestinn =lt.nextLine();
                    try{
                        nokfraleser = Double.parseDouble(noklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                Valuta euroLestInn = new Valuta(1, 0.92, 9.87, 8.97);
                double resultat = euroLestInn.getRegnFTVE(nokfraleser);
                System.out.println("Dette tilsvarer " + resultat + " Euro");
            }else if(valutavalgt==4){
                System.exit(1);
            }
        }else if(fraellertil==2){
            int valutavalgt=0;
            while(valutavalgt!=1 && valutavalgt!=2 && valutavalgt !=3 && valutavalgt!=4){
                System.out.println("Vilken Valuta vil du konvertere til kroner?\n 1: Dollar\n 2: Sek\n 3: Euro\n 4: Avslutt");
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
                double dollarfraleser=0;
                while(dollarfraleser==0){
                    System.out.println("Hvor mange Doller vil du konvertere til Kroner?");
                    Scanner lt = new Scanner(System.in);
                    String dollarlestinn =lt.nextLine();
                    try{
                        dollarfraleser = Double.parseDouble(dollarlestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                Valuta dollarLestInn = new Valuta(1, 0.92, 9.87, 8.97);
                double resultat = dollarLestInn.getRegnOTNFD(dollarfraleser);
                System.out.println("Dette tilsvarer " + resultat + " Kroner");
            }else if(valutavalgt==2){
                double sekfraleser=0;
                while(sekfraleser==0){
                    System.out.println("Hvor mange Sek vil du konvertere til Kroner?");
                    Scanner lt = new Scanner(System.in);
                    String seklestinn =lt.nextLine();
                    try{
                        sekfraleser = Double.parseDouble(seklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                Valuta sekLestInn = new Valuta(1, 0.92, 9.87, 8.97);
                double resultat = sekLestInn.getRegnOTNFS(sekfraleser);
                System.out.println("Dette tilsvarer " + resultat + " Kroner");
            }else if(valutavalgt==3){
                double eurofraleser=0;
                while(eurofraleser==0){
                    System.out.println("Hvor mange Euro vil du konvertere til Kroner?");
                    Scanner lt = new Scanner(System.in);
                    String eurolestinn =lt.nextLine();
                    try{
                        eurofraleser = Double.parseDouble(eurolestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                Valuta euroLestInn = new Valuta(1, 0.92, 9.87, 8.97);
                double resultat = euroLestInn.getRegnOTNFE(eurofraleser);
                System.out.println("Dette tilsvarer " + resultat + " Kroner");
            }else if(valutavalgt==4){
                System.exit(1);
            }
        }
    }   
}