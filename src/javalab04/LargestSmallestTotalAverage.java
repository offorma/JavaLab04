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
public class LargestSmallestTotalAverage {
     public static void main(String[] args) {
         double num;
         double total = 0;
         double average;
         int n = 5;
         double max =0;
         double min =0;
   
         
         for (int count = 1; count <= n; ++count){
             Scanner input =  new Scanner(System.in);
             num = input.nextDouble();            
             total +=num;
             
             if (count == 1) {
                     max = num;
                     min = num;
             }
             else{
                 max = Math.max(max, num);
                 min = Math.min(max, num);
             }    
             
         }
         average = total/n;
         System.out.println(total+"\t"+average);
         System.out.println(min+"\t"+max);
         
         
     
     }
}
