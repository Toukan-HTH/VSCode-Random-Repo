import java.util.Random;

import java.util.Arrays; 
import java.util.stream.IntStream; 
class oving6_1{
    public static void main(String[] args){




        int toCheckValue0=0;
        int checknumber0=0;
        int toCheckValue1=1;
        int checknumber1=0;
        int toCheckValue2=2;
        int checknumber2=0;
        int toCheckValue3=3;
        int checknumber3=0;
        int toCheckValue4=4;
        int checknumber4=0;
        int toCheckValue5=5;
        int checknumber5=0;
        int toCheckValue6=6;
        int checknumber6=0;
        int toCheckValue7=7;
        int checknumber7=0;
        int toCheckValue8=8;
        int checknumber8=0;
        int toCheckValue9=9;
        int checknumber9=0;



        Random generator = new Random();
        int[] Array = new int[5000];
        for(int i=0;i<5000; i++){
            int tall = generator.nextInt(10);
            Array[i]=tall;
        }
        System.out.println(Array[999]);






        


        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue0){
                checknumber0++;
            }else{
                checknumber0=checknumber0;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue1){
                checknumber1++;
            }else{
                checknumber1=checknumber1;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue2){
                checknumber2++;
            }else{
                checknumber2=checknumber2;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue3){
                checknumber3++;
            }else{
                checknumber3=checknumber3;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue4){
                checknumber4++;
            }else{
                checknumber4=checknumber4;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue5){
                checknumber5++;
            }else{
                checknumber5=checknumber5;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue6){
                checknumber6++;
            }else{
                checknumber6=checknumber6;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue7){
                checknumber7++;
            }else{
                checknumber7=checknumber7;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue8){
                checknumber8++;
            }else{
                checknumber8=checknumber8;
            }
        }

        for(int i=0; i<Array.length;i++){
            if(Array[i]==toCheckValue9){
                checknumber9++;
            }else{
                checknumber9=checknumber9;
            }
        }










        System.out.println("Number 0 appears " + checknumber0 + " Times in the Array");
        System.out.println("Number 1 appears " + checknumber1 + " Times in the Array");
        System.out.println("Number 2 appears " + checknumber2 + " Times in the Array");
        System.out.println("Number 3 appears " + checknumber3 + " Times in the Array");
        System.out.println("Number 4 appears " + checknumber4 + " Times in the Array");
        System.out.println("Number 5 appears " + checknumber5 + " Times in the Array");
        System.out.println("Number 6 appears " + checknumber6 + " Times in the Array");
        System.out.println("Number 7 appears " + checknumber7 + " Times in the Array");
        System.out.println("Number 8 appears " + checknumber8 + " Times in the Array");
        System.out.println("Number 9 appears " + checknumber9 + " Times in the Array");

    }
}