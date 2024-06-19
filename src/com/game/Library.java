package com.game;

import java.util.Scanner;

class LibraryManagment {
	String[] books;
	int No_ofBooks=0;
	
	LibraryManagment(){
		this.books=new String[100];
		this.No_ofBooks=0;

		
		
	}
	
public void addBook(String Books)
{
	this.books[No_ofBooks]=Books;
	No_ofBooks++;
	System.out.println(Books+"is Add Succesfully in Record");
	
}
public void issueBook(String book)
{
	for(int i=0;i<this.books.length;i++)
	{
	
		if( this.books[i].equals(book))
		{
			System.out.println("Book has been isuued");
			this.books[i]=null;
			return;
		}
		System.out.println("This Book Doesnot exixst");
		}
	}



public void returnBook(String book)
{
	addBook(book);
}
public void showAvilableBook()
{
System.out.println("Avilable Books are");	
for(String book:books) {
	if(book==null)
	{
		continue;
	}
	
	System.out.println("# "+book);
}
}

}
class Operat extends LibraryManagment
{
	int ch;
	Scanner sc=new Scanner(System.in);
	LibraryManagment LM=new LibraryManagment();
	public void userInput() {
		
	System.out.println("Enter Your choice ");
	System.out.println("\n1:Show Books");
	System.out.println("\n2:Borrow Book");
	System.out.println("\n3:Add Book");
	System.out.println("\n4:return Book");
	System.out.println("\n0: Exit");
	
	 ch=sc.nextInt();
	}
	
	public  void Operat1()
	{
		
		if(this.ch==1)
		{
			LM.showAvilableBook();
			
		}else if(ch==2){
			System.out.println("Select Your Book Name");
			String Sel=sc.next();
			LM.issueBook(Sel);
			
			
		}else if(ch==3)
		{
			System.out.println("Add Book");
			String add=sc.next();
			LM.addBook(add);
		}else if(ch==4)
		{
			System.out.println("Return Book");
			String add1=sc.next();
			LM.returnBook(add1);
		
			
		}else
		{
			System.out.println("Please Select valid No");
		}
		
		
	
	
	}
	

	boolean isCorrect(int ch)
	{
		
		if(ch==0) {
			return true;
		}
		return false;
	}

	
	
	
}

public class Library{
	public static void main(String[] args) {
		Operat Op=new Operat();
		Op.userInput();
		Op.Operat1();
		
		
		
	} 

}
