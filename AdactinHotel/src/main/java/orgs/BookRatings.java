package orgs;

public class BookRatings {

	private String book_title;
	private int price;
	private short page_count;
	private char rating;

	public BookRatings(String book, int cost, short p_count, char rate) {
		this.book_title = book;
		this.price = cost;
		this.page_count = p_count;
		this.rating = rate;
	}

	public void displayAllDetails() {
		System.out.println("Book Title: " + book_title);
		System.out.println("Book Price: " + price);
		System.out.println("Book Page Count: " + page_count);
		System.out.println("Book Rating: " + rating);
	}

	public static void main(String[] args) {
		BookRatings demos = new BookRatings("Hello", 100, (short) 2.0, 'A');
		demos.displayAllDetails();
	}
}
