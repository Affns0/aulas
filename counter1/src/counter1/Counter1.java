/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter1;

/**
 *
 * @author apola
 */
public class Counter1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 0;
        while(counter < 10) {
            counter++;
            if ( counter == 5 || counter == 7){
                continue;
            }
            if ( counter == 9){
                break;
            }
            System.out.println("BackFlip " + counter);
        }
    }
}
