/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivetypes;

import java.util.Scanner;

/**
 *
 * @author apola
 */
public class PrimitiveTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Studant name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter the Studant grade: ");
        float grade = keyboard.nextFloat();
        System.out.printf("The grade of %s is %.1f \n", name, grade);
    }
    
}
