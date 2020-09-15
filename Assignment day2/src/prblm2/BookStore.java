package prblm2;

import java.util.ArrayList;
import java.util.Scanner;

class BookStore {
	private ArrayList<Book> books = new ArrayList<Book>();

	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	private Book SearchBookByTitle(String bookTitle) {
		for (Book book : books) {
			if (book != null && book.getBookTitle().equals(bookTitle)) {
				return book;
			}
		}
		return new Book("Null book", "", "", 0);

	}

	private Book SearchBookByIsbn(String Isbn) {
		for (Book book : books) {
			if (book != null && book.getISBN().equals(Isbn)) {
				return book;
			}
		}
		return new Book("Null book", "", "", 0);

	}

	public void sell(String isbn, int noOfCopies) {
		Book bookrequired = SearchBookByIsbn(isbn);
		if (bookrequired.getBookTitle().equals("Null book")) {
			System.out.println("Book not found");
		} else {
			if (bookrequired.getNumOfCopies() > noOfCopies) {
				bookrequired.setNumOfCopies(bookrequired.getNumOfCopies() - noOfCopies);
			} else
				bookrequired.setNumOfCopies(0);

		}

	}

	public void order(String booktitle, int noOfCopies) {
		Book bookrequired = SearchBookByTitle(booktitle);
		if (bookrequired.getBookTitle().equals("Null book")) {
			System.out.println("Enter the isbn of book");
			Scanner sc = new Scanner(System.in);
			String isbn, author;
			isbn = sc.nextLine();
			System.out.println("Enter the author of book");

			author = sc.nextLine();

			Book addedbook = new Book(booktitle, author, isbn, noOfCopies);
			books.add(addedbook);

		} else {
			bookrequired.setNumOfCopies(bookrequired.getNumOfCopies() + noOfCopies);

		}

	}

	public void display() {
		for (Book book : books) {
			if (book != null && book.getNumOfCopies() != 0)
				book.display();
		}
	}

}
