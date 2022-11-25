/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainca;

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
        
        regularUser u1 = new regularUser ("sam", "18/04/1993", "20/09/2021","fast");
        System.out.println(u1.id);
            regularUser u2 = new regularUser ("jeff", "18/11/2000", "30/09/2021","slow");
        System.out.println(u2.id);

    }
    
}
