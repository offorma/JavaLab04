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
public class TimesTable {
    public static void main(String[] args) {
   
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
           int n = input.nextInt();
           for(int i = 0; i<=12; i++){
           
            System.out.println(i+"*"+n +"= "+(n * i));
           }
                
    }
    
}
