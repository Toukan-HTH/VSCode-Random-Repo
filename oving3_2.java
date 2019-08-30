import java.util.Scanner;
class oving3_2{
    public static void main(String[] args){
        for(int i=10; i>1; i++){
            Scanner in = new Scanner(System.in);
            int answer = 0;

            while(answer==0){           //! Første sjekk, gir du input som f,eks "k", kjører denne igjen //
                System.out.println("Do You Want To Analyse A Number? [1 = Yes / 2 = No]");
                String svarstring = in.nextLine();
                try{
                    answer = Integer.parseInt(svarstring);
                }catch (NumberFormatException nfe){
                    System.out.println("Dette er ikke et valid input");
                }
            }
            if(answer != 2 && answer != 1){ //! Gir du svar som er en int men ikke 1 | 2 går koden ned her //
                int answerr = 0;
                System.out.println("Dette er ikke et valid input");
                System.out.println("Do You Want To Analyse A Number? [1 = Yes / 2 = No]");
                String svarstringg = in.nextLine();
                try{
                    answerr = Integer.parseInt(svarstringg);
                }catch (NumberFormatException nfe){
                    System.out.println("Dette er ikke et valid input");
                }
                //*                     SPACE                         //
                //*                     SPACE                         //
                //*                     SPACE                         //
                //*                     SPACE                         //
                //*                     SPACE                         //
                //*                     SPACE                         //
                if(answerr != 2 && answerr != 1){
                    System.out.println("Dette er ikke et valid input");
                }
                if(answerr == 2){
                    break;
                }else if(answerr == 1){
                    System.out.println("Enter Number For Analysis");
                    String input = ("");
                    input = in.nextLine();
                    try{
                        double numbers = Double.parseDouble(input);
                        if(numbers%2 == 0 && numbers != 2){
                            System.out.println("The Entered Number Is Not A Prime Number");
                        }else if((numbers%2 != 0 && numbers>1) || numbers==2){
                            System.out.println("The Entered Number Is A Prime Number");
                        }else{
                            System.out.println("The Entered Number Is Not A Prime Number");
                        }
                    }catch (NumberFormatException nfe){
                        System.out.println("Dette er ikke et valid input");
                    }
                }
            }
            //*                     SPACE                         //
            //*                     SPACE                         //
            //*                     SPACE                         //
            //*                     SPACE                         //
            //*                     SPACE                         //
            //*                     SPACE                         //
            //*                     SPACE                         //
            if(answer == 2){
                break;
            }else if(answer == 1){
                System.out.println("Enter Number For Analysis");
                String input = ("");
                input = in.nextLine();
                try{
                    double numbers = Double.parseDouble(input);
                    if(numbers%2 == 0 && numbers != 2){
                        System.out.println("The Entered Number Is Not A Prime Number");
                    }else if((numbers%2 != 0 && numbers>1) || numbers==2){
                        System.out.println("The Entered Number Is A Prime Number");
                    }else{
                        System.out.println("The Entered Number Is Not A Prime Number");
                    }
                }catch (NumberFormatException nfe){
                    System.out.println("Dette er ikke et valid input");
                }
            }
        }
    }
}