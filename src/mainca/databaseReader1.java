/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author yjang
 */
public class databaseReader1 {
    String dbName ="mainca";
    String DB_URL ="jdbc:mysql://localhost/" + dbName;
    String USER = "root";
    String PASS = "root";
   
public List<regularUser> inputData() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute("USE mainca;");

           ResultSet rs = stmt.executeQuery("SELECT * from maincadata;");
           List<regularUser> userList = new ArrayList<>();
           rs.next();
           rs.next();
          
 int id = rs.getInt("id");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            String create_date = rs.getString("create_date");
            String modify_date = rs.getString("modify_date");
            String user_type = rs.getString("user_type");
            
            regularUser u1 = new regularUser(id, fname, lname, create_date, modify_date, user_type);
            userList.add(u1);
     
            return userList;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
