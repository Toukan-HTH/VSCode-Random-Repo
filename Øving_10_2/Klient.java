class Klient{
    public static void main(String[] args){
        MenyRegister menyregister = new MenyRegister();


        menyregister.rettRegisterAdd("frokost",89.29,"Rett1","Dette er en oppskrift");
        menyregister.rettRegisterAdd("middag",50.00,"Rett2","Dette er en oppskrift");
        menyregister.rettRegisterAdd("lunsj",20.00,"Rett3","Dette er en oppskrift");

        menyregister.leggRettTilMeny("Meny1","Rett1");
        menyregister.leggRettTilMeny("Meny1","Rett3");
        menyregister.leggRettTilMeny("Meny1","Rett3");
        menyregister.leggRettTilMeny("Meny1","Rett2");
        menyregister.leggRettTilMeny("Meny1","Rett3");

        menyregister.TEST();



    }
}