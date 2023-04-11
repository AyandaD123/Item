/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayanda
 */
public class largest {
    public static void main (String[] args){
        int [][] tests = {{30,45,25,67},
                         {70,21,34,17},
                         {80,60,45,97},
                         {20,50,95,10}};
        int row = 0;
            for (int col = 1; col < tests[row].length; col++){
                int sum = 0;
            for (int[] test : tests) {
                sum = sum + test[col];
          
            System.out.println("The sum of the second column " + (col + 1) + " = " + sum);
            }
        }    
    }
}  
