public class Movie {
	private String title;
	private String director;
	private int runtime;
	
	public void setTitle(String s) {
		title = title == null || s.equals("") ? "Default" : s;
	}
	
	public void setDirector(String s) {
		director = title == null || s.equals("") ? "Default" : s;
	}
	
	public void setRun(int d) {
		runtime = d;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getRuntime() {
		return runtime;
	}
}