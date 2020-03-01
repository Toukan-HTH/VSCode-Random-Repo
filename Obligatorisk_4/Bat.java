public class Bat extends Mammal implements Flyable{
    public Bat(String st, int in){
        super(st, in);
    }

    @Override
    public boolean fly(){
        return true;
    }
}