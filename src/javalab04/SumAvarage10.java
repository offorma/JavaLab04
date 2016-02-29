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
public class SumAvarage10 {
    public static void main(String[] args) {
    double n;
    Scanner input = new Scanner(System.in);
    double count = 0.0;
    double sum =0;
    
    do{
        System.out.println();
        n = input.nextDouble();
        sum +=n;
        count++;
    }
    while(n !=0.0);
        System.out.println(sum/count);
    }
    
}
