package net.database;


import java.io.Serializable;

public class User implements Serializable {
    private String username;
    private String email;
    private String password;
    private static final long serialVersionUID = 1 ;
    
	/*
	 * public User(String username,String password,String Email) { this.email =
	 * email; this.password = password; this.username=username; }
	 */

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return password;
    }
    public void setUsername(String username) {
        this.username=username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    

    @Override
    public String toString() {
        return "User{" +
                "name=" + username +
                ", email=" + email +
                ", password=" + password +
                '}';
    }

    public static void main(String Args) {
        try {
        //    User user1 = new User("Cooper", "desmarteauc@hardie.com", "teamEverest");
        } catch (Exception e) {
            System.out.println("Exception: " + e + "\nEnter integer for all parameters:");
        }

    }
        public String ticketConfirmation(Ticket t){
        System.out.println("Youre tickets are secured, please present your ticket ids upon arrival at the event. a confirmation email has been sent to ensure the security of you tickets");
       return t.toString();
    }
    }


