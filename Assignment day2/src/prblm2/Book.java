package prblm2;

class Book {
	 private String bookTitle;
	 private String author;
	 private  String ISBN ;
	 private int numOfCopies;
	 public Book(String bookTitle, String author, String ISBN, int numOfCopies){
		 
	 }
	public void display()
	{
	 System.out.println("Title -"+ bookTitle +" Author –"+author+" ISBN – "+ISBN+"Quantity - "+numOfCopies);	
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getNumOfCopies() {
		
		return numOfCopies;
	}
	public void setNumOfCopies(int numOfCopies) {
		if(numOfCopies>=0)
		{this.numOfCopies = numOfCopies;}
	}
	 

}
