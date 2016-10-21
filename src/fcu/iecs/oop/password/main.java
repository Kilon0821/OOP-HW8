package fcu.iecs.oop.password;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str="";
		PasswordEncorder PE = new PasswordEncorder();
		
		while(true)
		{
			System.out.print("Please enter a str:");
			str = scanner.next();
			if(str.equalsIgnoreCase("exit"))System.exit(1);
			
			PE.Passwordencorder(str);
		}

	}

}
