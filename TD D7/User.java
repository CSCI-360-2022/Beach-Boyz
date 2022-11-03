package net.database;

import net.datbase.Ticket;

public class User {
    public String name;
    public String email;
    public String password;
    
    
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return password;
    }

    

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", email=" + email +
                ", password=" + password +
                '}';
    }

    public static void main(String Args) {
        try {
            User user1 = new User("Cooper", "desmarteauc@hardie.com", "teamEverest");
        } catch (Exception e) {
            System.out.println("Exception: " + e + "\nEnter integer for all parameters:");
        }

    }
        public String ticketConfirmation(Ticket t){
        System.out.println("Youre tickets are secured, please present your ticket ids upon arrival at the event. a confirmation email has been sent to ensure the security of you tickets");
       return t.toString();
    }
    }


