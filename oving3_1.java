import java.util.Scanner;
class oving3_1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter tall fra multiplikasjonstabellen");
        int gange = in.nextInt();
        int resultat;
            for (int i = 0; i<11; i++){
                resultat=gange*i;
                System.out.println(resultat);
            
        }
    }
}