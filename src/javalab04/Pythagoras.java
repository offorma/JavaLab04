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
public class Pythagoras {
    public static void main(String []args){
        int x, z;
        int y = 2;
        int leftHand;
        int rightHand;
        
        for(x=2; x<=1000; x++){
            y++;
            for(z=2; z<=1000; z++){
               leftHand = x*x + z*z;
               rightHand = y*y;
               if (leftHand == rightHand){
               System.out.println(x+","+z+","+y);
               }
            }
        }
    }
}
