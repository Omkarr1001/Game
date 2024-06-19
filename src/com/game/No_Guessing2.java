package com.game;

import java.util.Random;
import java.util.Scanner;

class Logic
{
	int userInput;
	int computerInput;
	int no_OfGuess=0;
	int noOfGuess()
	{
		return no_OfGuess;
	}
	public int getNo_OfGuess() {
		return no_OfGuess;
	}
	public void setNo_OfGuess(int no_OfGuess) {
		this.no_OfGuess = no_OfGuess;
	}
	Logic()
	{
		Random ra=new Random();
		this.computerInput=ra.nextInt(100);
	}
	public void takeUserInput()
	{
		System.out.println("Enter Your Guessed No ");
		Scanner sc=new Scanner(System.in);
		userInput=sc.nextInt();
	}
	
	boolean isCorrectNo()
	{
		no_OfGuess++;
		if(userInput==computerInput)
		{
			System.out.format("You Guess Right No,\n& you guess this no in %d Attempts ",no_OfGuess);
			return true;
		}else if(userInput<computerInput)
		{
			System.out.println("Your Guessed no is low...");
		}else if(userInput>computerInput)
		{
			System.out.println("Your Guessed no is high...");
		}return false;
		
		
	}
}

public class No_Guessing2 {
	public static void main(String[] args) {
		boolean b=false;
		Logic L=new Logic();
		while(!b)
		{
			
			L.takeUserInput();
			b=L.isCorrectNo();
		}
	}

}
