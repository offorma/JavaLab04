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
public class Ascii {
      public static void main(String[] args) {
        // TODO code application logic here
        /*for (int i = 65; i <= 90; i++){
            char c = (char) i;
            System.out.println(c);
        }*/
        /*for (int i = 1; i <= 127; i++){
            char c = (char) i;
            if(i%10 == 0){
            System.out.println("\n");
            }
            System.out.print(c);
           
        }*/
       

        for (int i = 0; i<26; i++){
            
            for(int j = 0; j<10; j++){
                char c = (char)(10*i+j);
             System.out.print("\t"+c);
            }
            System.out.print("\n");
            
            
        }
      }
}
