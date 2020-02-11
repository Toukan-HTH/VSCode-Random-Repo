class test{
    public static void main(String[] args){
        Tribune standingtribune1 = new StandTribune("Standing tribune 1", 60, 100);
        Tribune standingtribune2 = new StandTribune("Standing tribune 2", 80, 120);
        Tribune sittingtribune = new SitTribune("Sitting tribune", 50, 20, 10);
        Tribune viptribune = new VIPTribune("VIP Tribune", 20, 200, 5);

        Tribune[] tribunes = new Tribune[4];
        tribunes[0]=standingtribune1;
        tribunes[1]=standingtribune2;
        tribunes[2]=sittingtribune;
        tribunes[3]=viptribune;


        

    }
}