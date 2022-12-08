package net.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import net.database.Event;

import net.login.LoginBean;

public class EventDao {

	
	public ArrayList<Event> getEventResultSet() {
		ArrayList<Event> events= new ArrayList<Event>();
		
	
		
		try {
			System.out.println("helloooooo");
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ticketingsystem","root","root1234!");
			
			Statement stmt = con.createStatement();
			
			ResultSet rs= stmt.executeQuery("select * from events");
			System.out.println(stmt);
			while(rs.next()) {
				Event event = new Event();
				event.setName(rs.getString(1));
				event.setDate(rs.getString(2));
				event.setEventID(rs.getInt(3));
				event.setCount(rs.getInt(4));
				
				//add to arraylist
				events.add(event);
			}
		}
			catch (SQLException e) {
	            // process sql exception
	            System.out.println(e);
	        } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return events;
		
		
	
	
	
	 
	
	
}
}

