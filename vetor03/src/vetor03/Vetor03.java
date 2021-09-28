/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author apola
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double vetor[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(vetor);
        for (double valor : vetor){
            System.out.print(valor + " ");
        }
    }
    
}
