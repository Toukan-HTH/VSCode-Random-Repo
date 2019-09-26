public class Tekstanalyse{
    int[] antallTegn = new int[30];

    String alfabetet = "abcdefghijklmnopqrstuvwxyzæøå";
    int notChar=29;

    public Tekstanalyse(String tekst){
        //char[] charArray = tekst.toCharArray();
        char[] testarray = tekst.toCharArray();
        //* Tenk du har et array: {a,a,c,b,d,e,g,j,k} //
        //* hvordan få dette til å telle "opp" i rette lokasjon i "antallTegn" arrayet? //
        for(int i=0;i<testarray.length;i++){
            
        }
        System.out.println(antallTegn[0]);

    }
}