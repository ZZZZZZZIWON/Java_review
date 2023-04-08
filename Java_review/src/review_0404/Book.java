package review_0404;

public class Book {
	private String title;
	private String author;
	
	public Book() {
		System.out.println("Harry Potter Series");
	};
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		//System.out.println("title : "+title +"\nauthor : "+author);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("Harry Potter and the Philosopher's Stone");
		book.setAuthor("JK Rowling");
		System.out.println("Title : " + book.getTitle());
		System.out.println("Author : " + book.getAuthor());
		
		//Book book2 = new Book(book.title, book.author);
	}
	
}
