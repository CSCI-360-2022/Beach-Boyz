package net.database;
import java.util.*;


public class Event {
    public String name;
    public String date;
    public int eventID;
	public int Count;
	
    
	/*
	 * public Event get(Event e) { return e; }
	 */

    public String GetName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getEventID() {
        return eventID;
    }
    
    public int getCount() {
        return Count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public void setCount(int Count) {

    	this.Count=Count;
    		//error message here
    		// unfinished,, if user 
    	}
    	
   

    @Override
    public String toString() {
        return "Event{" +
                "Name=" + name +
                ", Date=" + date  +
                ", eventID=" + eventID +
                '}';
    }
    
	/*
	 * public Event Search(String Name) { private Event event; return event; }
	 * 
	 * public Ticket Purchase(int EventID, int qty) { int ticketID = new random();
	 * Ticket t = new Ticket(qty,ticketID,EventID); }
	 */
      // 10 mock event objects
      
    
		/*
		 * public static ArrayList<Event> getAllEvents() { ArrayList<Event> allEvents =
		 * new ArrayList<Event>(); Event event1 = new
		 * Event("x1","10/01/2022",78990,1000); Event event2 = new
		 * Event("x2","10/02/2022",78910,10000); allEvents.add(event1);
		 * allEvents.add(event2); return allEvents; }
		 */




     
    }
