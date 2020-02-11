class SitTribune extends Tribune{
    private int[] noBusy;
    public SitTribune(String tribuneName, int capacity, int price, int rows){
        super(tribuneName, capacity, price);
        this.noBusy = new int[rows];
    }

    public int findNumberOfSoldTickets(){
        int ticketsSold = 0;
        for(int i =0; i<noBusy.length;i++){
            ticketsSold += noBusy[i];
        }

        return ticketsSold;
    }

    public int findIncome(){
        int ticketsSold = 0;
        for(int i =0; i<noBusy.length;i++){
            ticketsSold += noBusy[i];
        }

        return ticketsSold*super.getPrice();
    }


    public void buyTicket(int requestedTickets){

    }

    public void buyTicket(String[] namesOfBuyers){

    }
}