import java.util.*;
abstract class Tribune implements Comparable<Tribune>{
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

    public int compareTo(Tribune obj){
        if(this.findIncome()<obj.findIncome()){
            return 1;
        }
        else if(this.findIncome()>obj.findIncome()){
            return -1;
        }
        else if(this.findIncome()==obj.findIncome()){
            return 0;
        }else{
            return 0;
        }
    }


    public String toString(){
        return getTribunename() + " " + getCapacity() + " " + findNumberOfSoldTickets() + " " + findIncome();
    }
}