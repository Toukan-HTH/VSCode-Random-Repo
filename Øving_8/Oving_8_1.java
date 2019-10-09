class Oving_8_1{
    public static void main(String[] args){
        ArbTaker boop = new ArbTaker("123ABCDEFG", "1998", 38000, 0.22);


        //* Kaller inn get metodene fra ArbTaker.java //*
        double skattPerMonth = boop.getTaxMoney();    //*
        double brutto = boop.getBrutto();             //*
        double skattePerYear = boop.getSkatteTrekk(); //*
        String navn = boop.getNavn();                 //*
        int alder = boop.getAlder();                  //*
        int antallYearAnsatt = boop.getAnsattAge();   //*
        String compare = boop.getCompare(2);       //*
        //* -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-///*


        //! Printer ut alle verdiene vi får inn ////////////////////////////////////////////////////////////////!
        System.out.println("\n" + skattPerMonth + " Hvor mange kroner arbeidstakeren trekkes i skatt per maned\n");  //!
        System.out.println(brutto + " Bruttolonn per ar\n");                                                  //!
        System.out.println(skattePerYear + " Skattetrekk per ar\n");                                          //!
        System.out.println(navn + " Navn po formen: etternavn, fornavn\n");                                   //!
        System.out.println(alder + " Alder\n");                                                               //!
        System.out.println(antallYearAnsatt + " Antall ar ansatt i bedriften\n");                             //!
        System.out.println(compare + "\n"); //!
        //! -/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/- //!
    }
}