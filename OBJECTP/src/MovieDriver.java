public class MovieDriver {
	public static void main(String args[]) {
		Movie m = new Movie();
		m.setDirector("Sir");
		m.setTitle("");
		m.setRun(40);
		
		System.out.println(m.getTitle());
		System.out.println(m.getRuntime());
	}
}