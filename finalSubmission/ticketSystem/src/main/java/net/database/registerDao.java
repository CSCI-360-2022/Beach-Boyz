package net.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;

import net.database.User;

public class registerDao {

    public boolean validate(User user) throws ClassNotFoundException {
        boolean status = false;
      //  final String SQL_INSERT = "IF NOT EXISTS(SELECT username FROM login WHERE username=('username')VALUES(?))";
        final String SQL_INSERT = "INSERT IGNORE INTO login (`username`, `password`, `email`) VALUES (?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://127.0.0.1:3306/ticketingsystem?allowPublicKeyRetrieval=true&useSSL=false", "root", "root1234!");
        		
            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT)) {
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPass());
            preparedStatement.setString(3, user.getEmail());

            System.out.println(preparedStatement);
            //ResultSet rs = preparedStatement.executeQuery();
            preparedStatement.executeUpdate();
            //System.out.println(rs);
           status=true;
            //status = rs.next();
            System.out.println(status);

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return status;
    }

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