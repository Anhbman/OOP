package tamgiac;

import java.util.Scanner;

import tamgiac.Tamgiac;

public class TestTamgiac {
	public static void main(String args[]) {
		Tamgiac tg = new Tamgiac();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Nhap do cao tam giac: ");
		int n = keyboard.nextInt();
		tg.setN(n);
		tg.resolve();
	}
}
