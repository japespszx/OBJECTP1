import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Please input an integer: ");
		
		if (s.hasNextInt()){
			int n = s.nextInt();
			System.out.println("You entered: " + n);
		}
		else {
			System.out.println("Invalid input.");
		}
		
		s.close();
	}
}