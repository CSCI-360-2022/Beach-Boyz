
public class Ticket {
    public int qty;
    public int ticketID;
    public int eventID;


    public Ticket(int qty, int ticketID, int eventID) {
        this.qty = qty;
        this.ticketID = ticketID;
        this.eventID = eventID;
    }

    public int getQty() {
        return qty;
    }

    public int getTicketID() {
        return ticketID;
    }

    public int getEventID() {
        return eventID;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "qty=" + qty +
                ", ticketID=" + ticketID +
                ", eventID=" + eventID +
                '}';
    }

    public static void main(String Args) {
        try {
            Ticket ticket1 = new Ticket(2, 10, 15);
        } catch (Exception e) {
            System.out.println("Exception: " + e + "\nEnter integer for all parameters:");
        }
        limitTicketAmount(ticket1.getQty());
    }
//        public static boolean limitTicketAmount(int qty){
//            int ticketLimit = 9;
//            if(qty>ticketLimit) { return false; }
//            return true;
//        }


        public String ticketConfirmation(Ticket t){
        System.out.println("Youre tickets are secured, please present your ticket ids upon arrival at the event. a confirmation email has been sent to ensure the security of you tickets");
       return t.toString();
    }
    }





