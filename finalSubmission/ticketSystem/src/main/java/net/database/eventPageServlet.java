package net.database;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.*;
import net.database.EventDao;

@WebServlet("/eventPageServlet")
public class eventPageServlet extends HttpServlet {
    private static final long serialVersionUID = 1;
    public Event event;
  
   public eventPageServlet() {
	   super();
   }
    

    public void doGet(HttpServletRequest request,HttpServletResponse response )throws ServletException, IOException {
    	
    	
    	
    	request.setAttribute("EventList", new EventDao().getEventResultSet());
    	
    
    	
    	//RequestDispatcher rd = getServletConfig().getServletContext().getRequestDispatcher("/loginsuccess.jsp");
    	RequestDispatcher rd = request.getRequestDispatcher("loginsuccess.jsp");
    	
    	//RequestDispatcher rd = request.findForward("loginsuccess.jsp");
    	rd.forward(request, response); 
    //	response.sendRedirect("loginsuccess.jsp");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse
    		  response)throws ServletException, IOException { 
    	doGet(request,response); }
    		  
    		  
    		  }
    


 
  
 