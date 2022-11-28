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
        stmt.execute(
                "CREATE TABLE IF NOT EXISTS maincadata ("
                        + "id INT(10) NOT NULL PRIMARY KEY,"
                        + "fname VARCHAR(30),"
                        + "lname VARCHAR(30),"
                        + "create_date VARCHAR(30),"
                        + "modify_date VARCHAR(30),"
                        + "user_type VARCHAR(30));"
        );
        return true;
      }catch (SQLException e) {
          e.printStackTrace();
                  return false;

      }}

    boolean outputData(regularUser user) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        
          Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            stmt.execute("USE mainca;");

            stmt.execute(
                    String.format("INSERT INTO maincadata (id, fname, lname, create_date, modify_date, user_type) "
                            + "VALUES ( %d, \"%s\", \"%s\", \"%s\", \"%s\", \"%s\") ;",
                            user.id, user.fname, user.lname, user.create_date, user.modify_date,user.user_type)
            );
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


