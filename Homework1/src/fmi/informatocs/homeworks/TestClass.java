package fmi.informatocs.homeworks;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TestClass {

	public static void main(String[] args) {
		// create library
		Library newLibrary = new Library("Моята библиотека", new ArrayList<Book>());
		
		// add books
		newLibrary.addBook(new Book("Дон Кихот", "Мигел де Сервантес", "Просвета", new GregorianCalendar(2012,10,28), "123321"));
		newLibrary.addBook(new Book("Сияние", "Стивън Кинг", "Хермес", new GregorianCalendar(2001,05,8), "450001"));
		newLibrary.addBook(new Book("Под игото", "Иван Вазов", "Хеликон", new GregorianCalendar(2010,02,9), "123564"));
		newLibrary.addBook(new Book("То", "Стивън Кинг", "Просвета", new GregorianCalendar(2008,07,2), "154333"));
		
		// print all books
		printAllBooksInLibrary(newLibrary);
		
		// delete all books by Stephen King 
		newLibrary.deleteAllBooksBy("Стивън Кинг");
		
		// print the rest of books
		System.out.println("************************************************************************************");
		System.out.println("Всички книги след като са изтрити от Стивън Кинг:");
		printAllBooksInLibrary(newLibrary);
	}
	 
	private static void printAllBooksInLibrary(Library newLibrary) {
		int numberOfBooks = newLibrary.getNumberOfBooks();
		for(int i = 0; i < numberOfBooks; i++) {
			Book currentBook = newLibrary.findBook(i);
			newLibrary.printBookInfo(currentBook);
		}
	}
	
}
