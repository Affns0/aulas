/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticoperators;

/**
 *
 * @author apola
 */
public class ArithmeticOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* int number1 = 10;
        int number2 = 9;
        float average = (number1 + number2) / 2;
        System.out.println("My college average is " + average);*/
        
        /*int number = 5;
        int value = 5 + ++ number;
        System.out.println(value);*/
        
        /*int number = 5;
        number += 5; // it's same as number = number + 5
        System.out.println(number);
        number -= 2; // it's same as number = number - 2
        System.out.println(number);*/
        
        /*float value = -500;
        int rounding = (int)Math.abs(value);
        System.out.println(rounding);*/
        
        double random = Math.random();
        int number = (int) (0 + random * (10 - 0));
        System.out.println(number);
    }
    
}
