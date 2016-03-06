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
public class BankAccount {
    public static void main(String []args){
         double total =0;
        double deposit;
        double debit;
         char action;
         Scanner input = new Scanner(System.in);
         System.out.println("enter inital deposit amount");
         double openingBalance = input.nextDouble();
         
       do{
           System.out.println("enter 'c' if you want a deposit 'd' if you want a withdrawal and 'q' to quit");
            action = input.next().charAt(0);
           if(action == 'c'){
               System.out.println("enter the amount you want to deposit");
               deposit = input.nextDouble();
               total = openingBalance + deposit;  
           }
           if(action == 'd'){
               System.out.println("enter the amount you want to debit");
               debit = input.nextDouble();
               total = total - debit;  
           }
       }
       while(action != 'q');
       System.out.println("your balance is "+total);
    } 
}
