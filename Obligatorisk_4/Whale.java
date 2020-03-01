public class Whale extends Mammal implements Jumpable, Swimmable{
    public Whale(String st, int in){
        super(st, in);
    }
    @Override
    public boolean jump(){
        return true;
    }

    @Override
    public boolean swim(){
        return true;
    }
}