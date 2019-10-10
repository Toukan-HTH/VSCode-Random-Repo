import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
class Oving_8_1{
    public static void main(String[] args){
        Person person = new Person("Andre", "Bjerk", "1999");
        ArbTaker boop = new ArbTaker(person, "123ABCDEFG", "1998", 38000, 0.22);
        int whilee = 0;
        while(whilee==0){
            Object[] options = { "Set Fornavn", "Set Etternavn", "ToString", "Set Montly Pay", "Set Tax Percent","Get metoder", "Avslutt" }; //* Hva vil du gjøre?
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            int response = JOptionPane.showOptionDialog(null, "What do you want to do?", "Title",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, options, options[0]);
            if(response==0){
                String name = JOptionPane.showInputDialog(frame, "Set fornavn til hva?");
                //boop.setFornavn(name);
            }
            else if(response==1){
                String etternavn = JOptionPane.showInputDialog(frame, "Set etternavn til hva?");
                //boop.setEtternavn(etternavn);
            }
            else if(response==2){
                System.out.println(boop.toString());
            }
            else if(response==3){
                String monthlypay = JOptionPane.showInputDialog(frame, "Set Montly pay til hva?");
                double monthlypayy = Double.parseDouble(monthlypay);
                boop.setMonthlyPay(monthlypayy);

            }
            else if(response==4){
                String tax = JOptionPane.showInputDialog(frame, "Set Tax til hva?");
                double taxx = Double.parseDouble(tax);
                boop.setTaxPercent(taxx);
            }





            else if(response==5){
                Object[] getMetoder ={"Tax per month", "Brutto", "Tax per year", "Name", "Age", "Number of years hired", "Compare", "Avslutt"};
                int svar = JOptionPane.showOptionDialog(null, "What do you want to do?", "Title",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,null, getMetoder, getMetoder[0]);
                if(svar==0){
                    JOptionPane.showMessageDialog(frame, boop.getTaxMoney());
                }
                else if(svar==1){
                    JOptionPane.showMessageDialog(frame, boop.getBrutto());
                }
                else if(svar==2){
                    JOptionPane.showMessageDialog(frame, boop.getSkatteTrekk());
                }
                else if(svar==3){
                    JOptionPane.showMessageDialog(frame, boop.getNavn());
                }
                else if(svar==4){
                    JOptionPane.showMessageDialog(frame, boop.getAlder());
                }
                else if(svar==5){
                    JOptionPane.showMessageDialog(frame, boop.getAnsattAge());
                }
                else if(svar==6){
                    String compare = JOptionPane.showInputDialog(frame, "Compare to what?");
                    int s = Integer.parseInt(compare); 
                    JOptionPane.showMessageDialog(frame, boop.getCompare(s));

                }
                else if(svar==7){
                    whilee++;
                    System.exit(1);
                }






                
            }
            else if(response==6){
                whilee++;
                System.exit(1);
            }
        }
























        /*

        //boop.setFornavn("TEST");
        //boop.setEtternavn("BEEP");
        //boop.setBirthday("1997");           Tester at set metoder fungerer //
        //boop.setMonthlyPay(100000);
        //boop.setTaxPercent(0.20);



        //* Kaller inn get metodene fra ArbTaker.java //*
        double skattPerMonth = boop.getTaxMoney();    //*
        double brutto = boop.getBrutto();             //*
        double skattePerYear = boop.getSkatteTrekk(); //*
        String navn = boop.getNavn();                 //*
        int alder = boop.getAlder();                  //*
        int antallYearAnsatt = boop.getAnsattAge();   //*
        String compare = boop.getCompare(2);       //*
        //* -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-///*


        //! Printer ut alle verdiene vi fÃ¥r inn ////////////////////////////////////////////////////////////////!
        System.out.println("\n" + skattPerMonth + " Hvor mange kroner arbeidstakeren trekkes i skatt per maned\n");  //!
        System.out.println(brutto + " Bruttolonn per ar\n");                                                  //!
        System.out.println(skattePerYear + " Skattetrekk per ar\n");                                          //!
        System.out.println(navn + " Navn po formen: etternavn, fornavn\n");                                   //!
        System.out.println(alder + " Alder\n");                                                               //!
        System.out.println(antallYearAnsatt + " Antall ar ansatt i bedriften\n");                             //!
        System.out.println(compare + "\n"); //!
        //! -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/- //!
        */
    }
}