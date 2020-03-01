public class Crocodile extends Oviparous implements Walkable, Swimmable{
    public Crocodile(String str, int in){
        super(str, in);
    }

    @Override
    public boolean walk(){
        return true;
    }

    @Override
    public boolean swim(){
        return true;
    }
}