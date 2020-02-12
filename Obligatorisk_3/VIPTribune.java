import java.util.*;
class VIPTribune extends SitTribune{
    private String[][] spectator;
    public VIPTribune(String tribuneName, int capacity, int price, int rows){
        super(tribuneName, capacity, price, rows);
        this.spectator= new String[rows][capacity/super.getnoBusy().length];
    }
    @Override
    public ArrayList<Ticket> buyTicket(int requestedTickets){
        return null;
    }
    @Override
    public ArrayList<Ticket> buyTicket(String[] namesOfBuyers){
        int capacatyPerRow = super.getCapacity()/super.getnoBusy().length;
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        for(int i =0;i<super.getnoBusy().length;i++){
            if(capacatyPerRow-super.getnoBusy()[i]>=namesOfBuyers.length){
                int row=i;
                int seatsTaken = super.getnoBusy()[i];
                for(int f =0;f<namesOfBuyers.length;f++){
                    result.add(new SittingTicket(super.getTribunename(), super.getPrice(), row, seatsTaken+1));
                    seatsTaken++;
                    spectator[row][seatsTaken-1]=namesOfBuyers[f];
                    //System.out.println(spectator[row][seatsTaken-1]);
                }
                super.setnoBusy(seatsTaken, i);
                break;
            }
        }
        return result;
    }
}