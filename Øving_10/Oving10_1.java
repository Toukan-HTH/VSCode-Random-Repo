import java.util.*; 
class Oving10_1{
    public static void main(String[] args){
        ArrangementRegister doot = new ArrangementRegister();
        doot.registrerArrangement("111345", "by1", "Henrik", "fest", "201911301800");
        doot.registrerArrangement("222234", "by1", "Geir", "ikke fest", "201911301700");
        doot.registrerArrangement("333253", "by2", "Henrik", "ikke fest", "201908301300");
        doot.registrerArrangement("334123", "by1", "Henrik", "fest", "201905301100");
        doot.registrerArrangement("335764", "by1", "Henrik", "fest", "201907251800");
        doot.registrerArrangement("112345", "by2", "Geir", "ikke fest", "201906191700");
        doot.registrerArrangement("113223", "by2", "Henrik", "ikke fest", "201902011900");
        doot.registrerArrangement("115674", "by1", "Geir", "ikke fest", "201910291500");
        doot.registrerArrangement("245623", "by2", "Geir", "fest", "201910281300");
        doot.registrerArrangement("225234", "by2", "Henrik", "fest", "201904031500");
        doot.registrerArrangement("226456", "by1", "Geir", "fest", "201904021600");

        //doot.finnArangementerVGS("by1");
        //doot.sort2();
        //System.out.println("");
        //doot.sortering();


        //doot.finnArangementerVGD("20191130");


        //doot.finnArangementerTidsintervall("20180101", "20200101");





        //* MENYSTYRT KLIENTPROGRAM //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        int program = 0;
        Scanner sc = new Scanner(System.in);
        while(program==0){
            int scanner = 0;
            int svar=0;
            //* Scanner input fra valgmeny ///////////////////////////////////////////////////////////////////////////
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



            switch(svar){
                case 1:
                System.out.println("Input valid nummer : 6 siffre for eksempel 123456");
                String nummer = sc.nextLine();
                System.out.println("Input valid sted : for eksempel by1");
                String sted = sc.nextLine();
                System.out.println("Input valid arrangor : for eksempel Geir");
                String arrangor = sc.nextLine();
                System.out.println("Input valid type : for eksempel fest");
                String type = sc.nextLine();
                System.out.println("Input valid tidspunkt : i format [YYYYMMDDTTTT]");
                String tidspunkt = sc.nextLine();
                boolean statement=doot.registrerArrangement(nummer, sted, arrangor, type, tidspunkt);
                if(statement==true){
                    System.out.println("Registrert!");
                }else{
                    System.out.println("ERROR!");
                }
                break;


                case 2:
                System.out.println("Finn alle arrangementene ved hvilken dato? : [YYYYMMDD]");
                String svarDato = sc.nextLine();
                doot.finnArangementerVGD(svarDato);
                break;


                case 3:
                System.out.println("Finn alle arrangementene ved hvilket sted?");
                String stedSvar = sc.nextLine();
                doot.finnArangementerVGS(stedSvar);
                break;

                case 4:
                System.out.println("Finn alle arrangementene innen tidsintervallet:");
                System.out.println("Fra dato? [YYYYMMDD]");
                String fraDato = sc.nextLine();
                System.out.println("Til dato? [YYYYMMDD]");
                String tilDato = sc.nextLine();
                doot.finnArangementerTidsintervall(fraDato, tilDato);
                break;


                case 5:
                doot.sortering();
                break;


                case 6:
                program++;
                break;
            }




        }








    }
}