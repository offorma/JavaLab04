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
public class UpsidedownTriangle {
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = input.nextInt();
        for (int i=x; i >= 1; i--){
            
             for (int k =((x-i)-1); k >=0; k--){
                    System.out.print(" ");
                    }
             
            for (int j= i*2; j >=1; j--){
                        System.out.print("*");
                }
            System.out.print("\n"); 
        }
    }
}
