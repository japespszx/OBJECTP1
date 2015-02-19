public class Student extends Person {
	private double OBJECTP;
	private double DASALGO;
	private double GPA;
	
	public void setGrade(int n, double d) {
		switch(n) {
			case 1: this.OBJECTP = d; break;
			default: this.DASALGO = d;
		}
	}
	
	public double getGPA(boolean b) {
		this.GPA = (this.OBJECTP + this.DASALGO) / 2;
		
		if(b)
			System.out.println("Hello, my name is " + this.name + " and my GPA is " + this.GPA + ".");
		
		return this.GPA;
	}
}