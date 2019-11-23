package edu.zolotarenko.HW5;

public class Book {
	private int id;
	private String bookTitle;
	            private String author;
	private String publisher;
	private int publicationDate;
	private int numberOfPages;
	private long price;
	private String bookCover;

	public Book(int id, String bookTitle, String author, String publisher, int publicationDate, int numberOfPages,
			long price, String bookCover) {
		this.id = id;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bookCover = bookCover;

	}

	public String toString() {
		return id + " " + bookTitle + " " + author + " " + publisher + " " + publicationDate + " " + publicationDate
				+ " " + numberOfPages + " " + price + " " + bookCover;

	}

	public int getId() {
		return id;
	}

	public void setId(int value) {
		value = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String value) {
		value = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String value) {
		value = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String value) {
		value = publisher;
	}

	public int getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(int value) {
		value = publicationDate;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int value) {
		value = numberOfPages;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long value) {
		value = price;
	}

	public String getBookCover() {
		return bookCover;
	}

	public void setBookCover(String value) {
		value = bookCover;
	}
}
