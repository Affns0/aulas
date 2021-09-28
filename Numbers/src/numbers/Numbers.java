/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbers;

import java.util.Scanner;

/**
 *
 * @author apola
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number, sum = 0;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter one number: ");
            number = keyboard.nextInt();
            sum += number;
            System.out.print("Would you like to keep going? [S/N]");
            answer = keyboard.next();
        } while (answer.equals("S"));
        System.out.println("The sum of all values is " + sum);
    }
    
}
