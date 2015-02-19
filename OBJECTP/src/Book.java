/**
 * Created by John Paul San Pedro on 2/11/2015.
 */
public class Book {
	private String title,
			author;
	private int yrpub;

	public Book(String title, String author, int yrpub) {
		this.title = title;
		this.author = author;
		this.yrpub = yrpub;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYrPub() {
		return yrpub;
	}
}
