package cs201.edu;

/*
Bryce DeBilzan
HOMEWORK 3 PROBLEM 5- "Rock, Paper, Scissors Game"
Randomly generates a number 0, 1, or 2 representing rock, paper, or scissors.
Prompts user to enter a number 0, 1, or 2 and displays a message indicating 
whether the user or the computer wins, loses, or draws.
*/

import java.util.Scanner;
import java.util.Random;

public class HW03P05{
	public static void main(String[] args) {
		//Creates Scanner object
		Scanner in = new Scanner(System.in);
		
		//Generates random number between 0 and 2
		Random rand = new Random();
		int  n = rand.nextInt(2) + 0;
		
		//Asks user to enter a number between 0 and 2
		System.out.println("Enter a 0, 1, or 2 (representing rock, paper, or scissors): ");
		int x = in.nextInt();
		
		if (n == x)
		{
			System.out.println("It was a draw.");
		}
		
		if ((n == 0 && x == 1) || (n == 1 && x == 2) || (n == 2 && x == 0))
		{
			System.out.println("Congratulations! You won.");
		}
		else if ((x == 0 && n == 1) || (x == 1 && n == 2) || (x == 2 && n == 0))
		{
			System.out.println("Sorry, you lost.");
		}
		}
	}