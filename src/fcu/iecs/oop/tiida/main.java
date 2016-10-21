package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count;
		NissanTiida NT = new NissanTiida();
		
		while(true)
		{
			System.out.println("Please enter a number:");
			count = scanner.nextInt();
			NT.Nissantiida(count);
		}
	}

}
