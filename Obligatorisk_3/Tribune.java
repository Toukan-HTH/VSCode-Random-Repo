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

    abstract public int findNumberOfSoldTickets();

    abstract public int findIncome();
}