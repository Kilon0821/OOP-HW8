package fcu.iecs.oop.tiida;

public class NissanTiida {

	public void Nissantiida(int count) {
		for (int count1 = 0; count1 <= count; count1++) {
			for (int i = 1; i <= count1; i++) {
				for (int j = 1; j <= count1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.print("\n");
		}
		
	}
}
