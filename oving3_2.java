import java.util.Scanner;
class oving3_2{
    public static void main(String[] args){
        for(int i=10; i>1; i++){
            Scanner in = new Scanner(System.in);
            System.out.println("Do You Want To Analyse A Number? [1 = Yes / 2 = No]");
            int answer = in.nextInt();
            if(answer == 2){
                break;
            }else if(answer == 1){
                System.out.println("Enter Number For Analysis");
                double number = in.nextDouble();
                if(number%2 == 0){
                    System.out.println("The Entered Number Is Not A Prime Number");
                }else if(number%2 != 0 && number>1){
                    System.out.println("The Entered Number Is A Prime Number");
                }else{
                    System.out.println("The Entered Number Is Not A Prime Number");
                }
            }
        }
    }
}