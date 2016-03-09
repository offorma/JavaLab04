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
public class ABCD {
    public static void main(String args []){
        char user_input;
        boolean checks;
        do{
            System.out.println("please enter a letter 'A' 'B' 'C' 'Q'");
            Scanner input  = new Scanner(System.in);
            user_input = input.nextLine().charAt(0);
            
            switch(user_input){
                case'A':
                    checks = true;
                    break;
                case'B':
                    checks = true;
                    break;
                case'C':
                    checks = true;
                    break;
                case'Q':
                    checks = true;
                    break;
                default:
                    checks = false;
            }                      
        }
        while(checks == false);
    }
}
