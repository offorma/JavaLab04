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
public class ABCDv2 {
     public static void main(String args []){
        char user_input;
        double sum;
        double sumA = 0;
        double sumB = 0;
        double sumC = 0;
        int aInput;
        double unitCost;
        double totalCost = 0.0;
        boolean checks = true;
        do{
            System.out.println("please order a product 'A' 'B' 'C' or 'Q'to quit");
            Scanner input  = new Scanner(System.in);
            user_input = input.nextLine().charAt(0);
            
            switch(user_input){
                case'A':
                    checks = true;
                    unitCost = 5.67;
                    System.out.println("enter the quantity you want to oder");
                    aInput = input.nextInt();
                    
                    if(aInput > 0){
                        sumA = unitCost*aInput;
                        totalCost += sumA;
                    }
                    break;
                case'B':
                    checks = true;
                    unitCost = 6.78;
                    System.out.println("enter the quantity you want to oder");
                    aInput = input.nextInt();
                     if(aInput > 0){
                        sumB = unitCost*aInput;
                        totalCost += sumB;
                    }
                    break;
                case'C':
                    checks = true;
                     unitCost = 7.89;
                    System.out.println("enter the quantity you want to oder");
                    aInput = input.nextInt();
                     if(aInput > 0){
                        sumC = unitCost*aInput;
                        totalCost += sumC;
                    }
                    break;
                case'Q':
                    checks = false;
                    break;
        
            }                      
        }
        while(checks == true);
        System.out.println("A \t"+"B \t"+"C \t");
        System.out.println(sumA +"\t"+sumB+" \t"+sumC+" \t");
        System.out.println(totalCost);
    }
}
