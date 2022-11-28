/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainca;

import java.util.concurrent.atomic.AtomicInteger;
/**
 *
 * @author yjang
 */
public class regularUser {
    int id;
    String fname;   
    String lname;
    AtomicInteger NEXT_INT = new AtomicInteger(1);
    String create_date;
    String modify_date;
    String user_type;
    
    public regularUser (int id, String fname, String lname, String create_date, String modify_date, String user_type) {
        this.id = id;
        this.fname= fname;
        this.lname = lname;
        this.create_date = create_date;
        this.modify_date = modify_date;
        this.user_type = user_type;
    }

   

}
