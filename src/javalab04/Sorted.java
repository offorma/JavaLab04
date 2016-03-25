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
public class Sorted {
    public static void main(String args[]){
    int numbers = 0;
    int previousNumber =0;
    int counter = 0;
    int sentinel = 0;
    Scanner input = new Scanner(System.in);
    
    while (sentinel == 0){
            System.out.println("Please enter numbers to be sorted and -1 to quit");
            numbers = input.nextInt();
            if (numbers == -1){
              sentinel = numbers;
            }
            else if(numbers > previousNumber){
                previousNumber=numbers; 
            }
            else if (numbers< previousNumber){
                counter= 1;
            }
        }
    if (counter ==1){
        System.out.println("UNSORTED");
        }
    else{
    System.out.println("SORTED");
    }
    }
}
