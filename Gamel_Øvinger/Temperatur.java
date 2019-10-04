import java.util.Random;
class Temperatur{
    public Temperatur(){
    }







    //* get metode for Middeltemperatur for hver dag i måneden //
    public int[] getMidTempFHDIM(int[][] array){






        int[] a = {1,2,3,4,5};
        return a;
    }

/*








    //* get metode for Middeltemperatur for hver time i døgnet i måneden //

    public double getMidTempFHTIDIM(){

    }










    //* get metode for Middeltemperatur for hele måneden //

    public double getMidTempFHM(){

    }










    //* get metode for Antall Døgn med middeltemperatur innen følgene grupper: [Mindre enn -5 grader]
    //* get metode for Antall Døgn med middeltemperatur innen følgene grupper: [Mellom -5 og 0 grader]
    //* get metode for Antall Døgn med middeltemperatur innen følgene grupper: [Mellom 0 og 5 grader]
    //* get metode for Antall Døgn med middeltemperatur innen følgene grupper: [Mellom 5 og 10 grader]
    //* get metode for Antall Døgn med middeltemperatur innen følgene grupper: [Over 10 grader]









    public int getADMMMEMFG(){  //* [Mindre enn -5 garder]

    }







    public int getADMMMMFO0G(){  //* [Mellom -5 og 0 grader]

    }







    public int getADMMM0OFG(){  //* [Mellom 0 og 5 grader]

    }







    public int getADMMMFOTG(){  //* [Mellom 5 og 10 grader]

    }







    public int getADMMOTG(){  //* [Over 10 grader]

    }



*/

    public static void main(String[] args){

        int[][] Arr = new int[4][7];
        //! Array Values /////////////
        Arr[0][0]=-3;              //!
        Arr[0][1]=2;               //!
        Arr[0][2]=5;               //!
        Arr[0][3]=20;              //!
        Arr[0][4]=12;              //!
        Arr[0][5]=-7;              //!
        Arr[0][6]=8;               //!
                                   //!
        Arr[1][0]=-3;              //!
        Arr[1][1]=-4;              //!
        Arr[1][2]=3;               //!
        Arr[1][3]=21;              //!
        Arr[1][4]=-13;             //!
        Arr[1][5]=10;              //!
        Arr[1][6]=-8;              //!
                                   //!
        Arr[2][0]=8;               //!
        Arr[2][1]=-9;              //!
        Arr[2][2]=2;               //!
        Arr[2][3]=3;               //!
        Arr[2][4]=4;               //!
        Arr[2][5]=-5;              //!
        Arr[2][6]=-6;              //!
                                   //!
        Arr[3][0]=2;               //!
        Arr[3][1]=6;               //!
        Arr[3][2]=7;               //!
        Arr[3][3]=2;               //!
        Arr[3][4]=-8;              //!
        Arr[3][5]=-15;             //!
        Arr[3][6]=-7;              //!
                                   //!
        //!-/////////////////////////





        //* Object av classen Temperatur ////*
        Temperatur Temp = new Temperatur();//*
        //* /////////////////////////////////*



        System.out.println(Arr[2][6]);


        int[] a=Temp.getMidTempFHDIM(Arr);

        System.out.println(a[1]);
    }
}