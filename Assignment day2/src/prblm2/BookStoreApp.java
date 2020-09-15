package prblm2;

import java.util.Scanner;

public class BookStoreApp {
	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
		boolean exit = true;

		while (exit) {
			System.out.println("Enter \"1\", to display the Books: Title - Author - ISBN - Quantity");
			System.out.println("Enter \"2\", to order new books.");
			System.out.println("Enter \"3\", to sell books.");
			System.out.println("Enter \"0\", to exit the system.");

			System.out.println("Enter a choice");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				bookstore.display();
				break;
			case 2:
				boolean anotherbook = true;
				while (anotherbook) {
					String booktitle;
					int noOfCopies;

					Scanner scan = new Scanner(System.in);
					System.out.println("enter booktitle");
					booktitle = scan.nextLine();
					System.out.println("enter no of copies");
					noOfCopies = scan.nextInt();
					bookstore.order(booktitle, noOfCopies);
					System.out.println("Do you want to order another book? y/n");
					String anotherorder = scan.nextLine();
					if (anotherorder.equals("n")) {
						anotherbook = false;
						break;
					}

				}
				break;
			case 3:
				boolean anothersell = true;
				while (anothersell) {
					String isbn;
					int noOfCopies;
					Scanner scan = new Scanner(System.in);
					isbn = scan.nextLine();
					noOfCopies = scan.nextInt();
					bookstore.order(isbn, noOfCopies);
					System.out.println("Do you want to order another book? y/n");
					String anotherbooksell = scan.nextLine();
					if (anotherbooksell.equals("n")) {
						anothersell = false;
						break;
					}

				}
				break;
			case 0:
				exit = false;
				break;

			}

		}
		System.out.println("exiting");
		
	}

}
