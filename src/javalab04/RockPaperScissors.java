/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author offormachukwunonso
 */
public class RockPaperScissors {
    public static void main(String[]args){
        Random random = new Random();
        int computerScore = 0;
        int myScore = 0;
        char PlayAgain;
        
        
        Scanner input = new Scanner(System.in);
        
       do
        { 
            int randomChoice = random.nextInt(4);
        System.out.println(randomChoice);
        String computerChoice ="";
        
        switch (randomChoice){
            case 1:
                computerChoice="rock";
                break;
            case 2:
                computerChoice="paper";
                break;
            case 3:
                computerChoice="scissors";
                break;
            
        }
           
        System.out.println("choose rock,"
                + "paper or scissors");
        String myChoice = input.nextLine();
        if(computerChoice.equals(myChoice)){ 
            System.out.println("There is a tie "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
        }
        if (("rock".equals(computerChoice))&&("scissors".equals(myChoice))){
                 computerScore++;
                 System.out.println("Computer won "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
            }
            else if (("scissors".equals(computerChoice))&&("paper".equals(myChoice))){
                 computerScore++;
                 System.out.println("Computer won "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
            }
            else if (("paper".equals(computerChoice))&&("rock".equals(myChoice))){
                 computerScore++;
                 System.out.println("Computer won "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
            }
            else if (("rock".equals(myChoice))&&("scissors".equals(computerChoice))){
                 myScore++;
                 System.out.println("You won "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
            }
            else if (("scissors".equals(myChoice))&&("paper".equals(computerChoice))){
                 myScore++;
                 System.out.println("You won "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
            }
            else if (("paper".equals(myChoice))&&("rock".equals(computerChoice))){
                 myScore++;
                 System.out.println("You won "+
                    "comupter choose "
                    +computerChoice+" you choose "+myChoice);
            }
        
        System.out.println("Enter y if You want to play again");
         PlayAgain = input.nextLine().charAt(0);
       }
       while(PlayAgain =='y');
       System.out.println("computer score "+computerScore+" my score "+myScore);
    }
}
