package review_0404;

public class Movie {

	public String title;
	public String date;
	public double rating;
	
	Movie(){
		System.out.println("[Harry Potter Series]");
	};

	Movie(String title, String date, double rating) {
		this.title = title;
		this.date = date;
		this.rating = rating;
	};
	
	void printMovie() {
		System.out.println(title + "\n" + date + "\n" + rating);
		System.out.println("-----------------------------");
	}
	
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.title = "Harry Potter and the Philosopher's Stone";
		movie.date = "2001.12.14";
		movie.rating = 9.40;
		movie.printMovie();
	}
}
