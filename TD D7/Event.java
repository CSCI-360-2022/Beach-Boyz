package net.database;



public class Event {
    public String name;
    public String date;
    public int eventID;


    public Event(String name, String date, int eventID) {
        this.name = name;
        this.date = date;
        this.eventID = eventID;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getEventID() {
        return eventID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public void setDate(String date) {
        this.date = name;
    }

    @Override
    public String toString() {
        return "Event{" +
                "Name=" + name +
                ", Date=" + date  +
                ", eventID=" + eventID +
                '}';
    }
    
    public Event Search(String Name) {
    	private Event event;
    	return event;
    }
    
      public Ticket Purchase(int EventID, int qty) {
    	  int ticketID = new random();
    	  Ticket t = new Ticket(qty,ticketID,EventID);
      }
      

    public static void main(String Args) {
        try {
           Event Event1= new Event("The Beatles", "12/12/2022", 15);
           Search("Kendrick Lamar");
           Purchase(event1);
        } catch (Exception e) {
            System.out.println("Exception: " + e + "\nEnter integer for all parameters:");
        }
       
    }



     
    }
