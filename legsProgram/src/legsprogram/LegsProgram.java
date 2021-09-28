/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package legsprogram;

import java.util.Scanner;

/**
 *
 * @author apola
 */
public class LegsProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many Legs?");
        int legs = keyboard.nextInt();
        String type;
        System.out.println("It is an");
        switch (legs){
            case 1:
                type = "Saci";
                break;
            case 2:
                type = "Biped";
                break;
            case 4:
                type = "Quadruped";
                break;
            case 6:
                type = "Spider";
                break;
            default:
                type = "ET";
        }
        System.out.println(type);
    }
    
}
