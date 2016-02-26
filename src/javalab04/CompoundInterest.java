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
public class CompoundInterest {
 
     public static void main(String[] args) {
         double p;
         double r;
         
         Scanner input = new Scanner(System.in);
         System.out.println("enter the total principal amount");
         p = input.nextDouble();
         System.out.println("enter the rate in percent");
         r = input.nextDouble();
         for (int i = 1; i <=25; i++){
             double investment = p * (1+(r/100));
             p = investment;
             System.out.println("Year = "+i+" investment = "+investment);
           
         }
     }
}
