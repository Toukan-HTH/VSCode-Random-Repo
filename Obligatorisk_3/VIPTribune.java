class VIPTribune extends SitTribune{
    private String[][] spectator;
    public VIPTribune(String tribuneName, int capacity, int price, int rows){
        super(tribuneName, capacity, price, rows);
    }

    @Override
    public void buyTicket(int requestedTickets){

    }
    @Override
    public void buyTicket(String[] namesOfBuyers){
        
    }
}