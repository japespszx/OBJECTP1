import static java.lang.System.out;
import java.util.Scanner;

public class HappyThurs{
	public static void main(String[] args){
		char c;
		boolean shot;
		int i = 0;
		Scanner sc = new Scanner(System.in);

		out.print("Shot? "); c = sc.findWithinHorizon(".", 0).charAt(0);
		switch(c){
			case 'Y': shot = true; i++; break;
			default: shot = false;
		}
		while(shot && i<5){
			out.println("*chug* *chug* *chug*");
			out.print("Shot? "); c = sc.findWithinHorizon(".", 0).charAt(0);
			switch(c){
				case 'Y': shot = true; i++; break;
				default: shot = false;
			}
			if(i==5){
				out.println("You are drunk.~");
			}
		}
	}
}