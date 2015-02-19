import java.util.ArrayList;

/**
 * Created by John Paul San Pedro on 2/16/2015.
 */
public class Shelf {
	private String name,
			location;
	private ArrayList<Book> book;

	public Shelf(String n, String l) {
		name = n;
		location = l;
		book = new ArrayList<Book>();
	}

	public ArrayList<Book> getBook() {
		return book;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public void addBook(Book x) {
		book.add(x);
	}

	public void displayBooks() {
		System.out.println(name + "\t" + location);
		for (Book x : book)
			System.out.println(x.getTitle() + "\t" + x.getAuthor() + "\t\t" + x.getYrPub());
	}

	public void displayRecent() {
		System.out.println(name + "\t" + location);
		for (Book x : book) {
			if (x.getYrPub() > 2000)
				System.out.println(x.getTitle() + "\t" + x.getAuthor() + "\t\t" + x.getYrPub());
		}
	}
}
