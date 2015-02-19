import java.util.*;

public class Sudoku{

	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] box = new int[3][3];
		for(int i = 0; i<3; i++)
		{
		for(int j = 0; j<3; j++)
		{
			box[i][j] = sc.nextInt();
		}
		}
		
		for(int i = 0; i<3; i++)
		Arrays.sort(box[i]);
		
		System.out.println(Arrays.deepToString(box));
		
		sc.close();
	
	}
}
