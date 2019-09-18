import java.util.Random;
class player1{
    private int terningkast;
    private int sumPoeng;
    private int erFerdig=0;

    public player1(int terningkast, int sumPoeng, int erFerdig) {
        this.terningkast=terningkast;
        this.sumPoeng=sumPoeng;
        this.erFerdig=erFerdig;
    }

    public int getSumPoeng(int roll11, int roll12, int roll13, int roll14, int roll15, int roll16){
        sumPoeng=roll11*1+roll12*2+roll13*3+roll14*4+roll15*5+roll16*6;
        return sumPoeng;
    }

    public int kastTerning(){
        java.util.Random terning= new java.util.Random();
        terningkast=terning.nextInt(6);
        terningkast++;
        return terningkast;
    }

    public int erFerdig(){
        erFerdig++;
        return erFerdig;
    }
}

//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
class player2{
    private int terningkast;
    private int sumPoeng;
    private int erFerdig;

    public player2(int terningkast, int sumPoeng, int erFerdig) {
        this.terningkast=terningkast;
        this.sumPoeng=sumPoeng;
        this.erFerdig=erFerdig;
    }

    public int getSumPoeng(int roll21, int roll22, int roll23, int roll24, int roll25, int roll26){
        sumPoeng=roll21*1+roll22*2+roll23*3+roll24*4+roll25*5+roll26*6;
        return sumPoeng;
    }

    public int kastTerning(){
        java.util.Random terning= new java.util.Random();
        terningkast=terning.nextInt(6);
        terningkast=terningkast+1;
        return terningkast;
    }

    public int erFerdig(){
        erFerdig++;
        return erFerdig;
    }
}


//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------
//! --------------------------------------------------------------------------------------------------------------

class oving4_2{
    public static void main(String[] args){
        int erFerdig=0;
        int sumPoeng1=0;
        int sumPoeng2=0;
        int roll11=0;
        int roll12=0;
        int roll13=0;
        int roll14=0;
        int roll15=0;
        int roll16=0;
        int roll21=0;
        int roll22=0;
        int roll23=0;
        int roll24=0;
        int roll25=0;
        int roll26=0;
        int runde=0;

        while(erFerdig==0){
            runde++;
            System.out.println("Runde :" + runde + "\n");
            player1 kastTerning1 = new player1(0, 0, 0);
            int terningkast1 = kastTerning1.kastTerning();
            System.out.println("Player 1 :" + terningkast1);
            player2 kastTerning2 = new player2(0, 0, 0);
            int terningkast2 = kastTerning2.kastTerning();
            System.out.println("Player 2 :" + terningkast2);
            if(terningkast1==1 && sumPoeng1<100){
                roll11++;
            }else if(terningkast1==2 && sumPoeng1<100){
                roll12++;
            }else if(terningkast1==3 && sumPoeng1<100){
                roll13++;
            }else if(terningkast1==4 && sumPoeng1<100){
                roll14++;
            }else if(terningkast1==5 && sumPoeng1<100){
                roll15++;
            }else if(terningkast1==6 && sumPoeng1<100){
                roll16++;
            }

            if(terningkast1==1 && sumPoeng1>100){
                roll11--;
            }else if(terningkast1==2 && sumPoeng1>100){
                roll12--;
            }else if(terningkast1==3 && sumPoeng1>100){
                roll13--;
            }else if(terningkast1==4 && sumPoeng1>100){
                roll14--;
            }else if(terningkast1==5 && sumPoeng1>100){
                roll15--;
            }else if(terningkast1==6 && sumPoeng1>100){
                roll16--;
            }












            if(terningkast2==1 && sumPoeng2<100){
                roll21++;
            }else if(terningkast2==2 && sumPoeng2<100){
                roll22++;
            }else if(terningkast2==3 && sumPoeng2<100){
                roll23++;
            }else if(terningkast2==4 && sumPoeng2<100){
                roll24++;
            }else if(terningkast2==5 && sumPoeng2<100){
                roll25++;
            }else if(terningkast2==6 && sumPoeng2<100){
                roll26++;
            }

            if(terningkast2==1 && sumPoeng2>100){
                roll21--;
            }else if(terningkast2==2 && sumPoeng2>100){
                roll22--;
            }else if(terningkast2==3 && sumPoeng2>100){
                roll23--;
            }else if(terningkast2==4 && sumPoeng2>100){
                roll24--;
            }else if(terningkast2==5 && sumPoeng2>100){
                roll25--;
            }else if(terningkast2==6 && sumPoeng2>100){
                roll26--;
            }








            

            sumPoeng1=kastTerning1.getSumPoeng(roll11, roll12, roll13, roll14, roll15, roll16);
            System.out.println(sumPoeng1 + " Sum");
            sumPoeng2=kastTerning2.getSumPoeng(roll21, roll22, roll23, roll24, roll25, roll26);
            System.out.println(sumPoeng2 + " Sum\n");
            if(sumPoeng2==100){
                System.out.println("\nPlayer 2 wins");
                erFerdig=kastTerning1.erFerdig();
            }
            if(sumPoeng1==100){
                System.out.println("\nPlayer 1  wins");
                erFerdig=kastTerning2.erFerdig();
            }

    }
}
}