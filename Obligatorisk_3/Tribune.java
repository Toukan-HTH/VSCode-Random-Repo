import java.util.*;
abstract class Tribune{
    private final String tribuneName;
    private final int capacity;
    private final int price;
    public Tribune(String tribuneName, int capacity, int price){
        this.tribuneName=tribuneName;
        this.capacity=capacity;
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public int getCapacity(){
        return capacity;
    }

    public String getTribunename(){
        return tribuneName;
    }

    abstract public int findNumberOfSoldTickets();

    abstract public int findIncome();

    abstract public ArrayList<Ticket> buyTicket(int tickets);

    abstract public ArrayList<Ticket> buyTicket(String[] names);
}