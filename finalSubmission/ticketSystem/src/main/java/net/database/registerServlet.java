package net.database;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.database.*;



@WebServlet("/RegistrationForm")
public class registerServlet extends HttpServlet {
    private static final long serialVersionUID = 1 ;
    private User user;
    private registerDao registerDao;
    
    public void init() {
        registerDao = new registerDao();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);

        try {
            if (registerDao.validate(user)) {
            	System.out.println("1");
                HttpSession session = request.getSession();
              //   session.setAttribute("username",username);
                response.sendRedirect("login.jsp");
            } else {
            	//System.out.println("2");
                HttpSession session = request.getSession();
              //  session.setAttribute("user", username);
                response.sendRedirect("login.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}