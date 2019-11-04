class Klient{
    public static void main(String[] args){
        MenyRegister menyregister = new MenyRegister();


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
        menyregister.leggRettTilMeny("Meny1","Rett3");
        menyregister.leggRettTilMeny("Meny1","Rett2");

        menyregister.leggRettTilMeny("Meny2","Rett4");
        menyregister.leggRettTilMeny("Meny2","Rett5");
        menyregister.leggRettTilMeny("Meny2","Rett6");

        menyregister.leggRettTilMeny("Meny3","Rett7");
        menyregister.leggRettTilMeny("Meny3","Rett8");
        menyregister.leggRettTilMeny("Meny3","Rett9");


        //menyregister.getMenyInnenIntervall(1,90);

        //menyregister.getRettGittType("lunsj");

        //menyregister.getRettGittNavn("Rett1");

    }
}