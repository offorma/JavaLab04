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
public class HigherLower {
    public static void main(String [] args){
        int number = (int) (Math.random()*100);
        int inputs =0;
        char playAgain ='y';
        Scanner input  =new Scanner(System.in);
        
        while(playAgain == 'y'){
            do{
            System.out.println("guess a number between 1 and 100");
            inputs = input.nextInt();
            if (inputs>number){
                System.out.println("your guess is grater than the number");
            }
            else if(inputs<number){
            System.out.println("your guess is less than number");
            }
            else System.out.println("number found");
        }
        while(inputs != number);
            System.out.println("enter 'y if you want to play again and "
                    + 'n'+"to quit");
            playAgain =input.next().charAt(0);
           
      }
    }
    
}
