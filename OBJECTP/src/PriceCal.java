import static java.lang.System.out;
import java.util.Scanner;

public class PriceCal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s[] = {"apple", "orange", "grapes", "mango"};
		double x[] = {10, 20, 30, 40}, buy = 0;
		
		out.print("What item would you like to buy? ");
		String item = sc.nextLine();
		for(int i=0; i < 4; i++){
			if(item.equals(s[i])){
				buy = x[i];
				break;
			}
		}
		
		out.print("What is the discount rate in percentage? ");
		double disc = sc.nextDouble();
		out.write('\n'); out.print(disc);
		
		out.println("The total amount you shall pay is: " + (buy-buy*disc/100) + " PHP");
	}
}