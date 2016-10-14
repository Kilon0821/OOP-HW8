import java.util.Scanner;

public class StringComparator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int again=0;
		String str1="",str2="";
		
		do
		{
			if(again == 1)System.out.println("Try Again");
			System.out.print("insert str1:");
			str1 = scanner.next();
			System.out.print("insert str2:");
			str2 = scanner.next();
			again++;
		}while(str1.equals(str2) != true);
		
		System.out.print("thank for visit");
		
		}
}
