/*
@author : Govindavasan S
Date    : 11/08/2022
Title   : Guessing the correct Number Game.
Question: Write a program called NumberGuess to play the number guessing game.
*/
import java.util.Scanner;
class GuessNum
{
	 public static void main(String[]args)
	 { 
	  
	  int userGuessNum;
	  
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Your Guess Number Between 0 to 100:");
	  userGuessNum= sc.nextInt();
	  
	  if(50>100)
	  {
	     System.out.println("Guess the number which is Lower !");// enter lower number
	  }
	  else if(userGuessNum < 50)                           
	  { 
	     System.out.println("Guess the number which is Higher ! ");// enter higher number
	  }
	  
      else
	  { 
	     System.out.println("You Guessed Corrrectly! Great Work!  ");// enter it was correct
	  }
}
}