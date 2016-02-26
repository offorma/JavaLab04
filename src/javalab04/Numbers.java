/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab04;

import java.util.Scanner;

/**
 *
 * @author offormachukwunonso
 */
public class Numbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* for (int i =1;i <=100; i++){
            System.out.println(i);
        }  */
       
       /*Scanner input = new Scanner(System.in);
       System.out.println("Enter a number");
       int number =  input.nextInt();
       for(int i = 1; i <= number; i++){
           System.out.println(i);
       }*/
       int sum = 0;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a number");
       int number =  input.nextInt();
       for(int i = 1; i <= number; i++){
           sum += i;
            System.out.print(i +"\t"+ sum + "\n");
            
       }
           
    }
    
}
