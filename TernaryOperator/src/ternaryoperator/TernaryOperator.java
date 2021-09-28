/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ternaryoperator;

/**
 *
 * @author apola
 */
public class TernaryOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1, number2, result;
        number1 = 10;
        number2 = 50;
        result = Math.abs(number1 > number2 ? number1+number2:number1-number2);
        System.out.println(result);
    }
    
}
