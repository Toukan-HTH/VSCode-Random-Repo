public class Pelican extends Oviparous implements Walkable, Flyable{
    public Pelican(String str, int in){
        super(str, in);
    }

    @Override
    public boolean fly(){
        return true;
    }

    @Override
    public boolean walk(){
        return true;
    }
}