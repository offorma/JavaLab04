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
public class StarryBox {
     public static void main(String[] args) {
         /*Scanner input  = new Scanner(System.in);
         System.out.println("Enter a number");
         int n =input.nextInt();
         for(int i = 1; i <= n; i++){
             System.out.print('*');
         }*/
     Scanner input  = new Scanner(System.in);
         System.out.println("Enter a number");
         int x =input.nextInt();
         System.out.println("Enter a number");
         int y =input.nextInt();
         for(int i = 1; i <= x; i++){
             for(int j = 1; j <= y; j++){
                 System.out.print('*'+"\t");
             }
             System.out.print("\n\n");
         }
     }
    
}
