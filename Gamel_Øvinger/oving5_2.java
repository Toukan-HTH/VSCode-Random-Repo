import java.util.Random;

class MinRandom{

    Random generator = new Random();
    public MinRandom(){

    }
    public int nesteHeltall(int nedre, int ovre){
        int randomint=generator.nextInt(ovre - nedre) + nedre;
        return randomint;
    }
    public double nesteDesimaltall(double nedre, double ovre){ //* Intervallet >nedre, ovre>
        double randomdouble=nedre+(ovre-nedre)*generator.nextDouble();
        return randomdouble;
    }
    }
class oving5_2{
    public static void main(String[] args){
        MinRandom MinRandom=new MinRandom();
        //double test=MinRandom.nesteDesimaltall(0.0,1.0);
        //System.out.println(test);
        int i=0;
        int j =0;
        while(i<10){
            double test=MinRandom.nesteDesimaltall(0.0,10.0);
            System.out.println(test);
            i++;
        }
        while(j<10){
            int test=MinRandom.nesteHeltall(10, 20);
            System.out.println(test);
            j++;
        }
}
}