import java.util.Random;

class MinRandom{

    Random generator = new Random();
    public MinRandom(){

    }
    public int nesteHeltall(int nedre, int ovre){
        int randomint=generator.nextInt(ovre);
        return randomint;
    }
    public double nesteDesimaltall(double nedre, double ovre){ //* Intervallet >nedre, ovre>
        double randomdouble=generator.nextDouble()*((ovre-nedre)+1)+nedre;
        return randomdouble;
    }
    }
class oving5_2{
    public static void main(String[] args){
        MinRandom MinRandom=new MinRandom();
       double test=MinRandom.nesteDesimaltall(0.0,1.0);
        System.out.println(test);
}
}