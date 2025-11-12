// Scenario:
// A person can board the bus if their ticket number is in the passenger list.
// Task:
// Use a membership operator (in) to check if the entered ticket number is in the list of valid ticket numbers.


class Bus{
    private int [] passengerTickets;
    
    Bus(int []passengerTickets){
        this.passengerTickets=passengerTickets;
    }
    public boolean checkTicket(int ticketNumber){
        for(int ticket:passengerTickets){
            if(ticket==ticketNumber){
                return true;
            }
        }
        return false;
    }
} 
class BusTicketCheck{
    public static void main (String[] args) {
        int []passengersList={101,102,103,104,106};
        Bus bus=new Bus(passengersList);
        int myTicket=102;
        
        if(bus.checkTicket(myTicket)){
            System.out.println("Ticket Verified! you can board the bus");
        }else{
            System.out.println("Invelid ticket! You Cannot Board the bus");
        }
    }
}