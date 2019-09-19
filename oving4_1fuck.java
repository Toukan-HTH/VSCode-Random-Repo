import java.util.Scanner;
class oving4_1fuck{
    public static void main(String[] args){
        double sek=0.92;
        double dollar=8.92;
        double euro=9.88;
        Valuta vsek = new Valuta(sek);
        Valuta vvdollar = new Valuta(dollar);
        Valuta veuro = new Valuta(euro);
        Valuta vdollar = new Valuta(dollar);
        Valuta vvsek = new Valuta(sek);
        Valuta vveuro = new Valuta(euro);
        Scanner lt = new Scanner(System.in);
        int fraellertil=0;
        while(fraellertil!=1 && fraellertil!=2 && fraellertil !=3){
            System.out.println("Vil du konvertere FRA eller TIL Norske Kroner?\n 1: Fra\n 2: Til\n 3: Avslutt");
            String konvertere = lt.nextLine();
            try{
                fraellertil = Integer.parseInt(konvertere);
            }catch (NumberFormatException nfe){
            }
            if(fraellertil !=1 && fraellertil !=2 && fraellertil !=3){
                System.out.println("Dette er ukke et valid tall");
            }
        if(fraellertil==1){
            int valutavalgt=0;
            while(valutavalgt!=1 && valutavalgt!=2 && valutavalgt !=3 && valutavalgt!=4){
                System.out.println("Vilken Valuta vil du konvertere kroner til?\n 1: Dollar\n 2: Sek\n 3: Euro\n 4: Avslutt");
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
                    String noklestinn =lt.nextLine();
                    try{
                        nokfraleser = Double.parseDouble(noklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                double resultat=vvdollar.ToValue(nokfraleser);
                System.out.println("Resultatet er " + resultat + " Dollar");

            }else if(valutavalgt==2){
                double nokfraleser=0;
                while(nokfraleser==0){
                    System.out.println("Hvor mange Kroner vil du konvertere til Sek?");
                    String noklestinn =lt.nextLine();
                    try{
                        nokfraleser = Double.parseDouble(noklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                double resultat=vsek.ToValue(nokfraleser);
                System.out.println("Resultatet er " + resultat + " sek");

            }else if(valutavalgt==3){
                double nokfraleser=0;
                while(nokfraleser==0){
                    System.out.println("Hvor mange Kroner vil du konvertere til euro?");
                    String noklestinn =lt.nextLine();
                    try{
                        nokfraleser = Double.parseDouble(noklestinn);
                    }catch (NumberFormatException nfe){
                    }
                }
                double resultat=veuro.ToValue(nokfraleser);
                System.out.println("Resultatet er " + resultat + " euro");

            }else if(valutavalgt==4){
                System.exit(1);
            }



        }else if(fraellertil==2){
            int valutavalgt=0;
            while(valutavalgt!=1 && valutavalgt!=2 && valutavalgt !=3 && valutavalgt!=4){
                System.out.println("Vilken Valuta vil du konvertere til kroner?\n 1: Dollar\n 2: Sek\n 3: Euro\n 4: Avslutt");
                String valutafranok=lt.nextLine();
                try{
                    valutavalgt = Integer.parseInt(valutafranok);
                }catch (NumberFormatException nfe){
                }
                if(valutavalgt !=1 && valutavalgt !=2 && valutavalgt !=3 && valutavalgt !=4){
                    System.out.println("Dette er ukke et valid tall");
                }
                if(valutavalgt==1){
                    double nokfraleser=0;
                    while(nokfraleser==0){
                        System.out.println("Hvor mange Doller vil du konvertere til Nok?");
                        String noklestinn =lt.nextLine();
                        try{
                            nokfraleser = Double.parseDouble(noklestinn);
                        }catch (NumberFormatException nfe){
                        }
                    }
                    double resultat=vdollar.toNok(nokfraleser);
                    System.out.println("Resultatet er " + resultat + " Nok");
                }else if(valutavalgt==2){
                    double nokfraleser=0;
                    while(nokfraleser==0){
                        System.out.println("Hvor mange sek vil du konvertere til Nok?");
                        String noklestinn =lt.nextLine();
                        try{
                            nokfraleser = Double.parseDouble(noklestinn);
                        }catch (NumberFormatException nfe){
                        }
                    }
                    double resultat=vvsek.toNok(nokfraleser);
                    System.out.println("Resultatet er " + resultat + " sek");
                }else if(valutavalgt==3){
                    double nokfraleser=0;
                    while(nokfraleser==0){
                        System.out.println("Hvor mange euro vil du konvertere til Nok?");
                        String noklestinn =lt.nextLine();
                        try{
                            nokfraleser = Double.parseDouble(noklestinn);
                        }catch (NumberFormatException nfe){
                        }
                    }
                    double resultat=vveuro.toNok(nokfraleser);
                    System.out.println("Resultatet er " + resultat + " euro");
                }else if(valutavalgt==4){
                    System.exit(1);
              }
}
}else if(fraellertil==3){
    System.exit(1);
}
}
}
}    


class Valuta{
    private double rate;
    private double nok;
    private double resultat;
    private double value;
    public Valuta(double rate){
        this.rate=rate;
    }

    public double ToValue(double nok){
        resultat=nok/rate;
        return  resultat;
    }

    public double toNok(double value){
        resultat=value*rate;
        return resultat;
    }
}