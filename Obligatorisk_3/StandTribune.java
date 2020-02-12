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
}