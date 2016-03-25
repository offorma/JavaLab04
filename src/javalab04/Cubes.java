/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab04;

/**
 *
 * @author offormachukwunonso
 */
public class Cubes {
    public static void main(String args []){
        int cube =0;
        int count =0;
        while(cube < 20000){
            ++count;
            cube = count*count*count;        
    }
       int number = count -1;
        System.out.println("The largest number whose cube is less than 2000 is  "+number);
  }   
}
