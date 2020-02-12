import java.util.*;
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


    public ArrayList<Ticket> buyTicket(int requestedTickets){
        int capacatyPerRow = super.getCapacity()/noBusy.length;
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        for(int i =0;i<noBusy.length;i++){
            if(capacatyPerRow-noBusy[i]>=requestedTickets){
                int row=i;
                int seatsTaken = noBusy[i];
                for(int f =0;f<requestedTickets;f++){
                    result.add(new SittingTicket(super.getTribunename(), super.getPrice(), row, seatsTaken+1));
                    seatsTaken++;
                }
                setnoBusy(seatsTaken, i);
                break;
            }
        }
        return result;
    }

    public ArrayList<Ticket> buyTicket(String[] namesOfBuyers){
        int capacatyPerRow = super.getCapacity()/noBusy.length;
        ArrayList<Ticket> result = new ArrayList<Ticket>();
        for(int i =0;i<noBusy.length;i++){
            if(capacatyPerRow-noBusy[i]>=namesOfBuyers.length){
                int row=i;
                int seatsTaken = noBusy[i];
                for(int f =0;f<namesOfBuyers.length;f++){
                    result.add(new SittingTicket(super.getTribunename(), super.getPrice(), row, seatsTaken+1));
                    seatsTaken++;
                }
                setnoBusy(seatsTaken, i);
                break;
            }
        }
        return result;
    }


    public String getTribunename(){
        return super.getTribunename();
    }

    public int getPrice(){
        return super.getPrice();
    }

    public int getCapacity(){
        return super.getCapacity();
    }

    public int[] getnoBusy(){
        return noBusy;
    }

    public void setnoBusy(int newValue, int row){
        this.noBusy[row] = newValue;
    }
}