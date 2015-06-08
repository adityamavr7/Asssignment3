
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aditya7
 */
public class database {
    
     public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://localhost/products";
            String user = "root";
            String pass = "";
            conn = DriverManager.getConnection(jdbc, user, pass);
            System.out.println("Connected");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection failed");
        }
        return conn;
    }

}
