import java.util.Random;

public class MinRandom{
    Random generator = new Random();
    public int nesteHeltall(int nedre, int ovre){
        int randomint=generator.nextInt(ovre);
        return randomint;
    }
    public double nesteDesimaltall(double nedre, double ovre){ //* Intervallet >nedre, ovre>
        double randomdouble=generator.nextDouble()*((ovre-nedre)+1)+nedre;
        return randomdouble;
    }
    }