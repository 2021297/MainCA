/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author yjang
 */
public class databaseWriter1 {
    String dbName ="mainca";
   String DB_URL ="jdbc:mysql://localhost/" + dbName;
   String USER = "root";
   String PASS = "root";
    
    public boolean databaseSetup() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
      try{
        Connection conn = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement stmt = conn.createStatement();
        
        stmt.execute("CREATE SCHEMA IF NOT EXISTS " + dbName + ";");
        stmt.execute("USE mainca");
        /*
        fname VARCHAR(30)
        lname VARCHAR(30)
        id INTEGER PRIMARY KEY
        birth VARCHAR(30)
        admission VARCHAR(30)
        info TEXT(1000)
        
        */
        stmt.execute(
                "CREATE TABLE IF NOT EXISTS maincadata ("
                        + "name VARCHAR(30),"
                        + "id INT(10) NOT NULL PRIMARY KEY,"
                        + "DOB VARCHAR(30),"
                        + "admission VARCHAR(30),"
                        + "info TEXT(1000));"
        );
        return true;
      }catch (SQLException e) {
          e.printStackTrace();
                  return false;

      }
}
}

