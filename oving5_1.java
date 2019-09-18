class oving5_1{
private int nevner;
private int teller;
private int nynevner;

    public oving5_1(int teller, int nevner) {
        this.teller = teller;
        this.nevner = nevner;
    }

    public oving5_1(int teller) {
        this.teller = teller;
        nevner=1;
    }

    public void getPlus(int teller, int nevner, int nynevner, int nevnerinn, int tellerinn){
        this.teller=teller;
        this.nevner=nevner;
        nynevner=nevner*nevnerinn;
        tellerinn=tellerinn*nevner;
        teller=teller*nevnerinn;
        int nyteller=teller+tellerinn;
        System.out.println("Svaret er" + nyteller + "\n"+ "         " + nynevner);

    }

    public void getMinus(int teller, int nevner){
        this.teller=teller;
        this.nevner=nevner;
    }
    
    public void getGange(int teller, int nevner){
        this.teller=teller;
        this.nevner=nevner;
    }

    public void getDeling(int teller, int nevner){
        this.teller=teller;
        this.nevner=nevner;
    }
    public static void main(String[] args){
        int teller=0;
        int nevner=0;
        oving5_1 brok1 = new oving5_1(teller, nevner); //!int teller, int nevner, int nynevner, int nevnerinn, int tellerinn//
        brok1.getPlus(2, 3, 0, 6, 3);
    }
}

