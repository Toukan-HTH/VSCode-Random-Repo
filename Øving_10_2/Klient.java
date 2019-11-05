import java.util.*;
class Klient{
    public static void main(String[] args){
        MenyRegister menyregister = new MenyRegister();

        //! SETTER INN TEST RETTER OG TEST MENYER ///////////////////////////////////////////////
        menyregister.rettRegisterAdd("frokost",89.29,"Rett1","Dette er en oppskrift");
        menyregister.rettRegisterAdd("middag",50.00,"Rett2","Dette er en oppskrift");
        menyregister.rettRegisterAdd("lunsj",20.00,"Rett3","Dette er en oppskrift");
        menyregister.rettRegisterAdd("frokost",60.00,"Rett4","Dette er en oppskrift");
        menyregister.rettRegisterAdd("middag",20.00,"Rett5","Dette er en oppskrift");
        menyregister.rettRegisterAdd("lunsj",10.00,"Rett6","Dette er en oppskrift");
        menyregister.rettRegisterAdd("frokost",5.20,"Rett7","Dette er en oppskrift");
        menyregister.rettRegisterAdd("middag",4.20,"Rett8","Dette er en oppskrift");
        menyregister.rettRegisterAdd("lunsj",69.69,"Rett9","Dette er en oppskrift");

        menyregister.leggRettTilMeny("Meny1","Rett1");
        menyregister.leggRettTilMeny("Meny1","Rett1");
        menyregister.leggRettTilMeny("Meny1","Rett3");
        menyregister.leggRettTilMeny("Meny1","Rett2");

        menyregister.leggRettTilMeny("Meny2","Rett4");
        menyregister.leggRettTilMeny("Meny2","Rett5");
        menyregister.leggRettTilMeny("Meny2","Rett6");

        menyregister.leggRettTilMeny("Meny3","Rett7");
        menyregister.leggRettTilMeny("Meny3","Rett8");
        menyregister.leggRettTilMeny("Meny3","Rett9");
        //! /////////////////////////////////////////////////////////////////////////////////////





        Scanner sc = new Scanner(System.in);
        int teller = 0;
        while(teller==0){
            int svar =0;
            int scanner=0;
            while(scanner==0){
                System.out.println("Hva vil du gjøre?\n 1: Registrere Ny Rett\n 2: Finne en rett, gitt navn\n 3: Finne alle retter gitt en type\n 4: Registrere ny meny eller legge til retter til menyer\n 5: Finne alle menyer med totalpris innen et intervall\n 6: Avslutt");
                String svarstring = sc.nextLine();
                Scanner skanner = new Scanner(svarstring);
                if(skanner.hasNextInt()){
                    svar=Integer.parseInt(svarstring);
                    if(svar>6){
                        System.out.println("Denne verdien er ikke valid");
                    }else if(svar<0){
                        System.out.println("Denne verdien er ikke valid");
                    }else{
                        scanner++;
                    }
                }else{
                    System.out.println("Ikke valid input");
                }
            }

            if(svar==1){
                System.out.println("Hvilken type er den nye retten?");
                String type = sc.nextLine();
                System.out.println("Hvilken pris har retten?");
                String priss = sc.nextLine();
                double pris = Double.parseDouble(priss);
                System.out.println("Hva heter retten?");
                String navn = sc.nextLine();
                System.out.println("Hva er oppskriften?");
                String oppskrift = sc.nextLine();
                boolean statement=menyregister.rettRegisterAdd(type, pris, navn, oppskrift);
                if(!statement){
                    System.out.println("Error ikke registrert");
                }else{
                    System.out.println("Registrert");
                }
            }else if(svar==6){
                teller++;
            }else if(svar==2){
                System.out.println("Hvilket navn har retten?");
                String navn = sc.nextLine();
                menyregister.getRettGittNavn(navn);
            }else if(svar==3){
                System.out.println("Hvilken type retter leter du etter?");
                String type = sc.nextLine();
                menyregister.getRettGittType(type);
            }else if(svar==5){
                System.out.println("Hva er high verdien?");
                String highprisString = sc.nextLine();
                double highpris = Double.parseDouble(highprisString);
                System.out.println("Hva er minste verdien?");
                String lavprisString = sc.nextLine();
                double lavpris = Double.parseDouble(lavprisString);
                menyregister.getMenyInnenIntervall(lavpris, highpris);
            }else if(svar==4){
                menyregister.leggRettTilMeny("Meny1","Rett1");
                System.out.println("Input Menynavn, ny eller tilstedet");
                String menynavn =sc.nextLine();
                System.out.println("Input Rettnavn");
                String rettnavn =sc.nextLine();
                System.out.println(menynavn + " Meny " + rettnavn + " Rett");
                menyregister.leggRettTilMeny(menynavn,rettnavn);
                menyregister.test();
                menyregister.leggRettTilMeny("Meny1","Rett1");
            }

        }


        //menyregister.getMenyInnenIntervall(1,90);

        //menyregister.getRettGittType("lunsj");

        //menyregister.getRettGittNavn("Rett1");

    }
}