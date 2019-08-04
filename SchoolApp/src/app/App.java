package app;

import java.awt.Point;
import java.util.Date;
public class App {


    public static void main(String[] args) throws Exception {
        byte myAge = 30;
        long viewsCount = 3_212_345_678L;
        float price =10.99F;
        char letter = 'A';
        boolean isEligible = false;






        byte age = 30;
        Date now = new Date();
        System.out.println(now); 
        
        



        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        






        Point point1 = new Point(1,1);
        Point point2 = point1;
        point1.x = 3;
        point1.y = 3;
        System.out.println(point2);




        String message = "Hello World" + "!!";
        message.endsWith("!!");
        System.out.println(message.replace("!", "*"));
    }
}