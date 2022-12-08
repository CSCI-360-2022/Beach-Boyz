package net.database;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import net.database.EventDao;

@WebServlet("/eventInventoryServlet")
public class eventInventoryServlet extends HttpServlet {
    private static final long serialVersionUID = 1;
    public Event event;
  
   public eventInventoryServlet() {
	   super();
   }
    

    public void doGet(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException {
    	
    	
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        boolean status = false;
    	try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://127.0.0.1:3306/ticketingsystem?allowPublicKeyRetrieval=true&useSSL=false", "root", "root1234!");
    			
                // Step 2:Create a statement using connection object
                PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE events SET COUNT=COUNT-? WHERE EventName = ? ")) {
    		String amTickets = request.getParameter("AmTickets");
			//String eventName = request.getParameter("eventName");
    		String eventName = request.getParameter("EventName");
    		eventName=eventName.replaceAll("\\r\\n\\r\\n", "");
			int amT = Integer.parseInt(amTickets);
            	  System.out.println(preparedStatement);
            	  System.out.println("hello");
                preparedStatement.setLong(1, amT);
                preparedStatement.setString(2, eventName);

                System.out.println(preparedStatement);
                int rs = preparedStatement.executeUpdate();
                
                //System.out.println(rs);
               
              //  status = rs.next();
              //  System.out.println(status);

            } catch (SQLException e) {
                // process sql exception
                printSQLException(e);
            }
    	RequestDispatcher reqd= request.getRequestDispatcher("eventPageServlet");
    	 reqd.forward(request, response);
    	
    	
    	
    	
    	
    }
    public void doPost(HttpServletRequest request,HttpServletResponse
    		  response)throws ServletException, IOException { 
    	doGet(request,response); }
    		  
    		  
    		  
    


private void printSQLException(SQLException ex) {
    for (Throwable e: ex) {
        if (e instanceof SQLException) {
            e.printStackTrace(System.err);
            System.err.println("SQLState: " + ((SQLException) e).getSQLState());
            System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
            System.err.println("Message: " + e.getMessage());
            Throwable t = ex.getCause();
            while (t != null) {
                System.out.println("Cause: " + t);
                t = t.getCause();
            }
        }
    }
}
}
 