package fmi.informatocs.homeworks;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class TestClass {

	public static void main(String[] args) {
		// create library
		Library newLibrary = new Library("����� ����������", new ArrayList<Book>());
		
		// add books
		newLibrary.addBook(new Book("��� �����", "����� �� ���������", "��������", new GregorianCalendar(2012,10,28), "123321"));
		newLibrary.addBook(new Book("������", "������ ����", "������", new GregorianCalendar(2001,05,8), "450001"));
		newLibrary.addBook(new Book("��� �����", "���� �����", "�������", new GregorianCalendar(2010,02,9), "123564"));
		newLibrary.addBook(new Book("��", "������ ����", "��������", new GregorianCalendar(2008,07,2), "154333"));
		
		// print all books
		printAllBooksInLibrary(newLibrary);
		
		// delete all books by Stephen King 
		newLibrary.deleteAllBooksBy("������ ����");
		
		// print the rest of books
		System.out.println("************************************************************************************");
		System.out.println("������ ����� ���� ���� �� ������� �� ������ ����:");
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
