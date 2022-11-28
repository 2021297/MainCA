/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainca;

import java.util.List;

/**
 *
 * @author jeffeandYuna
 */
public class MainCA {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // TODO code application logic here
       databaseWriter1 dataOutput = new databaseWriter1();
       System.out.println(dataOutput.databaseSetup());
       regularUser u1 = new regularUser (1, "sam", "smith", "12-10-2022", "23-11-2022", "Admin_user");
        System.out.println(u1.id);
            regularUser u2 = new regularUser (1, "jeff", "sousa", "12-11-2022", "26-11-2022", "Regular_user");
        System.out.println(u2.id);
////       
       
        System.out.println(dataOutput.outputData(u1));
        System.out.println(dataOutput.outputData(u2)); 

        List<regularUser> userList;
        databaseReader1 input = new databaseReader1();
        userList = input.inputData();
        System.out.println(userList.get(0).fname);
    }
    
}
