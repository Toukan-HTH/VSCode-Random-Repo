class Oving7_2{
    public static void main(String[] args){
        String enTekst = "Hei på deg! Jeg har det, som du ser, utrolig bra, hva med deg?";
        TekstBehandling test = new TekstBehandling(enTekst);


        //* --------------Innhenting fra metoder------------ //*
        int a = test.getAntallOrd();                         //*
        String b = test.getEnTekst();                        //*
        String c = test.getEnTekstMedStoreBokstaver();       //*
        double d = test.getGjennomsnittOrdLengdeiPeriode();  //*
        double e = test.getGjennomsnittOrdlengde();          //*
        String f = test.getSkifteUtOrd("deg","hurra");       //*
        //* ------------------------------------------------ //*



        //! -----------------Output av metoder--------------------- //!
        System.out.println(a + " Antall Ord");                      //!
        System.out.println(b);                                      //!
        System.out.println(c + " Store bokstaver");                 //!
        System.out.println(d + " Average ordlengde per periode");   //!
        System.out.println(e + " average ordlengde");               //!
        System.out.println(f + " Skiftet ut deg med hurra");        //!
        //! ------------------------------------------------------- //!



    }
}