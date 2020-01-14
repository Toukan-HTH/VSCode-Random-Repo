            while(scanner==0){
                System.out.println("\nAlternativer\n 1: Registrere nytt arrangement\n 2: Finne alle arrangementene gitt en dato\n 3: Finne alle arrangementene gitt et sted\n 4: Finne alle arrangementene innenfor et tidsintervall\n 5: Lage liste over alle arrangementene og sortere\n 6: Avslutt");
                String svarstring = sc.nextLine();
                Scanner skanner = new Scanner(svarstring);
                if(skanner.hasNextInt()){
                    svar=Integer.parseInt(svarstring);
                    scanner++;
                }else{
                    System.out.println("Ikke valid input");
                }
            }