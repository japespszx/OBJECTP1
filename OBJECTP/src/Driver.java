public class Driver {
	public static void main(String args[]) {
		Library l1 = new Library();
		Shelf[] s = new Shelf[3];
		Book[] b = new Book[5];
		Room[] r = new Room[2];

		r[0] = new Room("Room1", "Loc1");
		r[1] = new Room("Room2", "Loc2");

		s[0] = new Shelf("One", "Kek1");
		s[1] = new Shelf("Two", "Kek2");
		s[2] = new Shelf("Three", "Kek3");

		b[0] = new Book("Book1", "Author1", 1999);
		for (int i = 1; i <= 4; i++)
			b[i] = new Book("Book".concat(Integer.toString(i)), "Author".concat(Integer.toString(i)), 2001 + i);

		for (int i = 1; i < s.length; i++) {
			for (int j = 0; j <= i; j++) {
				s[i].addBook(b[j]);
			}
		}

		for (Room x : r) {
			for (Shelf y : s)
				x.addShelf(y);
		}

		for (Room x : r)
			l1.addRoom(x);



//	    l1.displayRooms2000();
//		l1.displayBookCount2000();
	    l1.displayWith2000();
	}
}