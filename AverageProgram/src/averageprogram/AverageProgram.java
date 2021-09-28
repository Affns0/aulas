/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averageprogram;

import java.util.Scanner;

/**
 *
 * @author apola
 */
public class AverageProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your first grade: ");
        float number1 = keyboard.nextFloat();
        System.out.print("Enter your second grade: ");
        float number2 = keyboard.nextFloat();
        float average = (number1 + number2) / 2;
        System.out.println("Your average was "+ average);
        if (average > 9) {
            System.out.println("Congratulations");
        }
    }
}
