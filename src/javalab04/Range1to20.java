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
public class Range1to20 {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.println("enter a number between 1 and 20");
            number = input.nextInt();
            if((number>0) && (number<=20)){
                System.out.println("the number you entered is "+number);
            }
            else{
                System.out.println("the number u entered is not within the range");
            }
        }
        while((number>0) && (number<=20));
        
    }
    
}
