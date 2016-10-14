import java.util.Scanner;

public class homework2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice, a;
		float b;
		String c = "", d = "";

		
		while (true) {
			System.out.print(
					"1.KeyboardScanner.class\n2.CheckOddEven.class\n3.StringComparator.class\n4.PrintNumberInWord.class\n5.Exit\ninsert Choice:");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Insert Integer:");
				a = scanner.nextInt();
				System.out.print("Insert Float Point Number:");
				b = scanner.nextFloat();
				System.out.print("Insert Name:");
				c = scanner.next();
				KeyboardScanner(a, b, c);
				break;
			case 2:
				System.out.print("Insert Integer:");
				a = scanner.nextInt();
				CheckOddEven(a);
				break;
			case 3:
				System.out.print("Insert str1:");
				c = scanner.next();
				System.out.print("Insert str2:");
				d = scanner.next();
				StringComparator(c, d);
				break;
			case 4:
				System.out.print("Insert Integer:");
				a = scanner.nextInt();
				PrintNumberInWord(a);
				break;
			case 5:
				System.out.println("thank you for visit");
				System.exit(1);
			default:
				System.out.println("Insert wrong,try again...");
			}
		}
	}

	public static void KeyboardScanner(int num1, float num2, String name) {
		int plus = 0;
		float num3 = (float) num1 * num2;

		while (num3 > 10) {
			num3 = num3 / 10;
			plus++;
		}

		System.out.print("Hi " + name + " ,the multiplication of " + num1 + " and " + num2 + " is ");
		System.out.printf("%.2fe+%d\n", num3, plus);
	}

	public static void CheckOddEven(int num1) {
		if (num1 % 2 == 0) {
			System.out.println("The input integer is Even Number.");
		} else {
			System.out.println("The input integer is Odd Number.");
		}
	}

	public static void StringComparator(String str1, String str2) {
		if ((str1.equalsIgnoreCase(str2)) == true) {
			System.out.println("The two strings are the same.");
		} else {
			System.out.println("The two strings are not the same.");
		}
	}

	public static void PrintNumberInWord(int num) {
		switch (num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		case 4:
			System.out.println("FOUR");
			break;
		case 5:
			System.out.println("FIVE");
			break;
		case 6:
			System.out.println("SIX");
			break;
		case 7:
			System.out.println("SEVEN");
			break;
		case 8:
			System.out.println("EIGHT");
			break;
		case 9:
			System.out.println("NINE");
			break;
		default:
			System.out.println("OTHER");
			break;
		}
	}
}
