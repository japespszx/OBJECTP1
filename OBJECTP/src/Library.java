import java.util.ArrayList;

/**
 * Created by John Paul San Pedro on 2/11/2015.
 */
public class Library {
	private ArrayList<Room> room;

	public Library() {
		room = new ArrayList<Room>();
	}

	public ArrayList<Room> getRoom() {
		return room;
	}

	public void addRoom(Room x) {
		room.add(x);

	}

	public void displayRooms() {
		for (Room x : room) {
			System.out.println(x.getName() + "\t" + x.getLocation());
			x.displayShelves();
		}
	}

	public void displayRooms2000() {
		for (Room x : room) {
			System.out.println(x.getName() + "\t" + x.getLocation());
			x.displayRecent();
		}
	}

	public void displayBookCount2000() {
		for (Room x : room) {
			System.out.println(x.getName() + "\t" + x.getLocation());
			int ctr = 0;
			for (Shelf y : x.getShelf()) {
				for (Book z : y.getBook()) {
					if (z.getYrPub() > 2000)
						ctr++;
				}
			}
			System.out.println("Number of Books >2000: " + ctr);
		}
	}

	public void displayWith2000() {
		for (Room x : room) {
			System.out.println(x.getName() + "\t" + x.getLocation());
			System.out.println("These are the shelves in this room with books published >2000: ");
			for (Shelf y : x.getShelf()) {
				boolean weh = false;
				for (Book z : y.getBook()) {
					if (z.getYrPub() > 2000) {
						weh = true;
						break;
					}
				}
				if (weh) {
					System.out.println(y.getName() + "\t" + y.getLocation());
				}
			}
			System.out.println();
		}
	}
}
