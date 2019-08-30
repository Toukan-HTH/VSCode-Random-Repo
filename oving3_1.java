import java.util.Scanner;
class oving3_1{
    public static void main(String[] args){
        int gange = 0;
        int gangee = 0;
        while(gange==0){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 1 Tall fra multiplikasjonstabellen");
            String input = in.nextLine();
            try{
                gange = Integer.parseInt(input);
            }catch (NumberFormatException nfe){
                System.out.println("Dette er ikke et valid tall");
            }
        }
        while(gangee==0){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter 2 Tall fra multiplikasjonstabellen");
            String inputt = in.nextLine();
            try{
                gangee = Integer.parseInt(inputt);
            }catch (NumberFormatException nfe){
                System.out.println("Dette er ikke et valid tall");
        }
    }
        int resultat;
        int resultatt;
        int i = 0;
        int u = 0;
        int g = 0;
            
            while(i<10){
                i++;
                resultat=gange*i;
                System.out.println(gange + " * " + i + " = " + resultat);
            }
            while(i>=10 && u<10){
                u++;
                resultatt=gangee*u;
                System.out.println(gangee + " * " + u + " = " + resultatt);
            }
    }
}