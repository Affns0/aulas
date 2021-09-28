/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ageprogram;

import java.util.Scanner;

/**
 *
 * @author apola
 */
public class AgeProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("What year were you born? ");
        int year = keyboard.nextInt();
        int age = 2015 - year;
        if (age >= 18) {
            System.out.println("Adult " + age);
        } else {
            System.out.println("Under age " + age);
        }
    }
    
}
