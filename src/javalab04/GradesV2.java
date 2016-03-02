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
public class GradesV2 {
    public static void main(String[] args) {
        double mark =0;
        int numberA =0;
        int numberB=0;
        int numberC=0;
        int numberD=0;
        Scanner input = new Scanner(System.in);
    
            do{
                System.out.println("enter a score");
                mark = input.nextDouble();
                if ((mark >=0)&&(mark <=39)){
                numberD +=1;
                }
                 if ((mark >=40)&&(mark <=50)){
                numberC +=1;
                }
                  if ((mark >=60)&&(mark <=79)){
                numberB +=1;
                }
                   if ((mark >=80)&&(mark <=100)){
                numberA +=1;
                }
            }
        while(mark != -1);

        System.out.println("No of A's = "+numberA+" No of B's = "
                +numberB+" No of C's = "+numberC+" No of D's = "+numberD);
        
    if (numberA > 0){
           System.out.print("A");
           for (int i =1;  i <= numberA; i++){
               System.out.print('*');
           }
        }
   if (numberB > 0){
            System.out.println();
            System.out.print("B");
            for (int j =1;  j <= numberB; j++){
               System.out.print('*');
           }
       }
    if (numberC > 0){
            System.out.println();
             System.out.print("C");
            for (int k =1;  k <= numberC; k++){
                System.out.print('*');
            }
        }
     if (numberD > 0){
            System.out.println();
             System.out.print("D");
            for (int l =1;  l <= numberD; l++){
                System.out.print('*');
            }
        }
    }    
}
