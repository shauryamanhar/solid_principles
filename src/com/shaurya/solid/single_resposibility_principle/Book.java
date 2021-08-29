package com.shaurya.solid.single_resposibility_principle;

/*

A class should have a one and only one reason to change.
Meaning that a class should have only one job.

*/
public class Book {
	String bookName;
	String auther;
	String text;

	boolean findByAuther(String auther) {
		return this.auther.contains(auther);
	}

	boolean findByBookName(String bookName) {
		return this.bookName.contains(bookName);
	}
	  
	// Print book details to console. Remove this from class
	// void printToConsole()
	  

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", auther=" + auther + ", text=" + text + "]";
	}

}
