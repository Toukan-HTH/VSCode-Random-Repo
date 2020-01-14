import java.util.Scanner;
final class NyString{

    //* Object variabler //
    private String text;



    //* Innhenter text fra main metode (Klientprogram) //
    public NyString(String inntext){
        this.text=inntext;
    }





    //! Metoder //


    public String getNyString(){
        String[] parts =text.split(" ");
        String str="";
        for(int i=0;i<parts.length;i++){
            str +=parts[i].charAt(0);

        }
        return str;
    }




    public String getText(){
        return text;
    }



    public String getFjernTegn(char c){
        int j, count = 0, n = text.length(); 
        char []t = text.toCharArray(); 
        for (int i = j = 0; i < n; i++) 
        { 
            if (t[i] != c) 
            t[j++] = t[i]; 
            else
                count++; 
        } 
          
        while(count > 0) 
        { 
            t[j++] = '\0'; 
            count--; 
        } 
        String fikset = new String(t);
        return fikset;




    }
}