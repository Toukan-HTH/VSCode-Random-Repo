import java.util.*;
class StandTribune extends Tribune{
    private int noSoldTickets;
    public StandTribune(String tribuneName, int capacity, int price){
        super(tribuneName, capacity, price);
    }
    public int getNoSoldTickets(){
        return noSoldTickets;
    }

    public int findNumberOfSoldTickets(){
        return noSoldTickets;
    }

    public int findIncome(){
        return noSoldTickets*super.getPrice();
    }


    public ArrayList<Ticket> buyTicket(int requestedTickets){
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        if(noSoldTickets<getCapacity() && requestedTickets<=getCapacity()-noSoldTickets){
            int added =0;
            while(added<requestedTickets){
                result.add(new StandingTicket(super.getTribunename(), super.getPrice()));
                added++;
                noSoldTickets++;
            }
        }
        return result;
    }


    
    public ArrayList<Ticket> buyTicket(String[] namesOfBuyers){
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        int requestedTickets=namesOfBuyers.length;
        if(noSoldTickets<getCapacity() && requestedTickets<=getCapacity()-noSoldTickets){
            int added =0;
            while(added<requestedTickets){
                result.add(new StandingTicket(super.getTribunename(), super.getPrice()));
                added++;
                noSoldTickets++;
            }
        }
        return result;
    }
}