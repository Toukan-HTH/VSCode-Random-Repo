import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
public class ZooClient {
    public static void main(String[] args){
   
        Zoo zoo = new Zoo("Kristiansand Dyrepark");
   
        Collection<Animal> animals = new ArrayList<Animal>();
   


        animals.add(new Crocodile("s", 0100));


        animals.add(new Crocodile("test1", 1002));
        animals.add(new Crocodile("test2", 1101));
        animals.add(new Crocodile("test3", 1102));
        animals.add(new Pelican("Brown Pelican  ", 4001));
        animals.add(new Pelican("Dalmatian Pelican  ", 4101));
   
   
        animals.add(new Whale("s", 2001));
        animals.add(new Whale("Blue whale", 2002));
        animals.add(new Whale("Minke whale", 2101));
        animals.add(new Whale("Minke whale", 2102));
        animals.add(new Bat("Acerodon ", 3001));
        animals.add(new Bat("Cistugo  ", 3002));
        zoo.setAnimals(animals);   
        System.out.println("Settup done");

        try{  
            List<Object> flyers = zoo.getAnimals().stream().filter(p -> p instanceof Flyable).collect(Collectors.toList());
            flyers.stream().forEach(p -> {
                System.out.println(((Flyable)p).fly());;
            });
        }catch(ClassCastException e){
            e.printStackTrace();
            System.exit(1);
        }


        try{
            List<Object> mammals = zoo.getAnimals().stream().filter(p -> p instanceof Mammal).filter(p -> p instanceof Jumpable).collect(Collectors.toList());
            
            mammals.stream().forEach(p -> {
                System.out.println(((Jumpable)p).jump());
            });
        }catch(ClassCastException e){
            e.printStackTrace();
            System.exit(1);
        }

    }
}