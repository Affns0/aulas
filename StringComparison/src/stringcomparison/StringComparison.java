/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparison;

/**
 *
 * @author apola
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name1 = "Pedro";
        String name2 = "Pedro";
        String name3 = new String("Pedro");
        String result;
        result = name1.equals(name3)?"Yep, Same name":"Nop, Diferent name";
        System.out.println(result);
    }
    
}
