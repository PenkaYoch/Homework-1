package fmi.informatocs.homeworks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Library {
	private String libraryName;
	private ArrayList<Book> books;
	
	public Library(String libraryName, ArrayList<Book> books) {
		super();
		this.libraryName = libraryName;
		this.books = books;
	}
	
	public void addBook(Book newBook) {
		this.books.add(newBook);
	}
	
	public Book findBook(int indexInList) {
		return books.get(indexInList);
	}
	
	public void printBookInfo(Book currentBook) {
		System.out.println("---------------------------------------------------");		
		System.out.println("Book title:" + currentBook.getTitle());
		System.out.println("Book author:" + currentBook.getAuthor());
		System.out.println("Book publisher:" + currentBook.getPublisher());
		Calendar calendar = currentBook.getPublicationDate();
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
		System.out.println("Book publicationDate:" + sdf.format(calendar.getTime()));
		System.out.println("Book ISBN:" + currentBook.getIsbn());
		System.out.println("---------------------------------------------------");		
	}
	
	public void deleteAllBooksBy(String author) {
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getAuthor() == author) {
				books.remove(i);
			}
		}
	}
	
	public int getNumberOfBooks() {
		return books.size();
	}
}
