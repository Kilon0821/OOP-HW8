import java.util.Scanner;

public class Continue {
	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		int i;
		
		for(i=0;i<5;i++)
		{
			if(i != 1 && i != 3)
			{
				continue;
			}
			System.out.println(i);
		}
		
		}
}
