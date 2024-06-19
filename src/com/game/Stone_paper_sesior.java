package com.game;
import java.util.Random;
import java.util.Scanner;


class Computer
{
	int computerInput;
	int computerCount=0;
	int userInput;
	int userCount=0;
	
 
 
 
	
	public void userInput()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your hand \n1:paper \n2:stone \n3:Scisor ");
		userInput=sc.nextInt();
		Random ra=new Random();
		this.computerInput=ra.nextInt(3);

	
		
		if(this.computerInput==this.userInput)
		{
			System.out.println("Match Is Draw ");
		}else if(this.computerInput==1 && this.userInput==2||this.computerInput==3&&this.userInput==1||this.computerInput==2 &&this.userInput==3 )
		{
			this.computerCount++;
			System.out.println("Computer Won");
		}else
		{
			this.userCount++;
			System.out.println("User Win ");
		}
		if(this.computerInput==1)
		{
			System.out.println("Computer chose paper ");
			System.out.println("-------------------------------------------------------");
		}else if(this.computerInput==2)
		{
			System.out.println("Computer chose stone ");
			System.out.println("-------------------------------------------------------");
		}else
		{
			System.out.println("Computer chose scisor ");
			System.out.println("-------------------------------------------------------");
		}
		
		if(this.computerCount>this.userCount)
		{
			System.out.println("Computer is Won"+"User Count is"+this.userCount+"& Computer Count is  "+this.computerCount);
		}else if(this.computerCount<this.userCount)
		{
			System.out.println("User is Won  "+"User Count is   "+this.userCount+"& Computer Count is  "+this.computerCount);
		}else
		{
			

			System.out.println("Match is Drow  "+"User Count is  "+this.userCount+"& Computer Count is  "+this.computerCount);
			
		}
		
	}
	
}


public class Stone_paper_sesior {
	public static void main(String[] args) {
		Computer c=new Computer();
		for(int i=1;i<=4;i++)
		{
		
		c.userInput();
		}
	}

}
