public abstract class Animal {
    public final String name;
    public final int animalID;
       
    public Animal(String name, int code) {
            this.name = name;
            this.animalID = code;
            if(name.equals("")||name.equals(null)||code==0||code<0){
                try{
                    throw new ZooException("Name cannot be empty or null, and the code cannot be a negative or 0 value");
                }catch(ZooException e){
                    e.printStackTrace();
                    System.exit(1);
                }catch(Exception e){
                    e.printStackTrace();
                    System.exit(1);
                }
            }
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", code=" + animalID + "]";
    }
}