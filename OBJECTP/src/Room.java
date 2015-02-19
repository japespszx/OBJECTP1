import java.util.ArrayList;

/**
 * Created by John Paul San Pedro on 2/17/2015.
 */
public class Room {
	private String name,
			location;
	private ArrayList<Shelf> shelf;

	public Room(String n, String l) {
		name = n;
		location = l;
		shelf = new ArrayList<Shelf>();
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public ArrayList<Shelf> getShelf() {
		return shelf;
	}

	public void addShelf(Shelf x) {
		shelf.add(x);
	}

	public void displayShelves() {
		System.out.println(name + "\t" + location);
		for (Shelf x : shelf) {
			x.displayBooks();
			System.out.println();
		}
	}

	public void displayRecent() {
		System.out.println(name + "\t" + location);
		for (Shelf x : shelf) {

			x.displayRecent();
			System.out.println();
		}
	}

	public void displayBookCount2000() {
		System.out.println(name + "\t" + location);
		for (Shelf x : shelf) {
			int j = 0;
			System.out.println(x.getName() + "\t" + x.getLocation());
			for (Book y : x.getBook()) {
				if (y.getYrPub() > 2000)
					j++;
			}
			System.out.println("Number of Books >2000: " + j);
		}
	}

	public void displayAtLstTwo() {
		boolean weh;
		for (Shelf x : shelf) {
			if (x.getBook().size() >= 2) {
				System.out.println(x.getName() + "\t" + x.getLocation());
				x.displayRecent();
			}
		}
	}
}
