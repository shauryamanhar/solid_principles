package com.shaurya.solid.single_resposibility_principle;

public class BookPrinter {
	Book book;

	BookPrinter(Book book) {
		this.book = book;
	}

	void printToConsole() {
		System.out.println(book.toString());
	}
}
