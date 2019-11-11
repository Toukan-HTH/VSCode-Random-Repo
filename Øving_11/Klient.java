import java.util.*;
class Klient{
    public static void main(String[] args){
        EiendomRegister doot = new EiendomRegister();
        Scanner sc = new Scanner(System.in);
        doot.registrerEiendom(1445,"Gloppen",77,631,"",1017.6,"Jens Olsen");
        doot.registrerEiendom(1445,"Gloppen",77,131,"Syningom",661.3,"Nicolay Madsen");
        doot.registrerEiendom(1445,"Gloppen",75,19,"Fugletun",650.6,"Evilyn Jensen");
        doot.registrerEiendom(1445,"Gloppen",74,188,"",1457.2,"Karl Ove Bråten");
        doot.registrerEiendom(1445,"Gloppen",69,47,"Høiberg",1339.4,"Elsa Indregård");
        //doot.registrerEiendom(1445,"Gloppen",77,631,"",500.6,"Jens Olsen");
        //String test = sc.nextLine();
        //doot.registrerEiendom(1445,"Gloppen",77,631,test,1017.6,"Jens Olsen");
        //doot.getAlleEiendommene();
        //doot.getgjennomsnittareal();
        //doot.getEiendomVedSearch(1445,77,631);
    }
}