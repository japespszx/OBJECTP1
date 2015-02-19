public class Driver2 {
	public static void main(String args[]) {
		Student s = new Student();
		
		s.setName("JP");
		s.setGrade(1, 4.0);
		s.setGrade(2, 3.5);
		s.getGPA(true);
	}
}