package app;

import java.awt.Point;
import java.util.Arrays;
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




        String message = "   Hello World" + "!!";
        message.endsWith("!!");
        System.out.println(message.trim());
        System.out.println(message);

        //c:\Windows\...
        String story = "c:\tWindows\\...";
        System.out.println(story);







        //! ARRAYS //

        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));




        int[] numbers1 = {2, 3, 5, 1, 4};
        System.out.println(numbers1.length);

        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));





        int[][] numbers2 = { {1, 2, 3},{4, 5, 6}};
        System.out.println(Arrays.deepToString(numbers2));


        //*-----------------------------------------//
        //*-----------------------------------------//
        //*-----------------------------------------//
        //*-----------------------------------------//
        //*-----------------------------------------//


        final float pi = 3.14F;



        double result = (double)10 / (double)3;
        System.out.println(result);

        
    }
}