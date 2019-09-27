import java.util.Scanner;

class NyString{
    final String text = "Dette er en eksempeltekst";

    public NyString(){
        
    }




    public String getNyString(String innText){
        String[] parts =innText.split(" ");
        String str="";
        for(int i=0;i<parts.length;i++){
            str +=parts[i].charAt(0);

        }
        return str;
    }






    public String getText(){
        return text;
    }




    



    public String getFjernTegn(String innText, char c){
        int j, count = 0, n = innText.length(); 
        char []t = innText.toCharArray(); 
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






    public static void main(String[] args){
        NyString test = new NyString();
        String innText = test.getText();
        char c = 'e';
        String fjerne = test.getFjernTegn(innText, c);
        String ferdig = test.getNyString(fjerne);
        System.out.println(innText);
        System.out.println(fjerne);
        System.out.println(ferdig);
        //System.out.println(innText.indexOf( 'e' ));

    
    }

}