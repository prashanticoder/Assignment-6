import java.util.*;
public class Question3 {
	public static void main(String[] args) {
		Book book1 = new Book(1, "head first java", "kathy");
		Book book2 = new Book(4, "let us c", "Yaswanth");
		Book book3 = new Book(12, "c", "balaguruswamy");
		BookCollection bookCollection = new BookCollection();
		bookCollection.bookList.add(book1);
		bookCollection.bookList.add(book2);
		bookCollection.bookList.add(book3);
		printBooks(bookCollection.bookList);
		
		
		Book bookUpdate = new Book("Java in depth", "agarwal");
		bookCollection.hasBook(bookUpdate);
		
		System.out.println("Sorting by book title");
		bookCollection.sortByBookName();

		System.out.println("Sorting by author name");
		bookCollection.sortByAuthor();
	}

	private static void printBooks(List<Book> bookList) {
		for(Book book: bookList) {
			System.out.println(book);
		}
	}
}
