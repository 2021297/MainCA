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
    String name;
    AtomicInteger NEXT_INT = new AtomicInteger(1);
    int id;
    String DOB;
    String admission;
    String info;
    
    public regularUser (String name, String DOB, String admission, String info) {
        this.name = name;
        this.DOB = DOB;
        this.admission = admission;
        this.info = info;
//        this.id = NEXT_INT.getAndAdd(1);
        this.id = id;
    }
}
