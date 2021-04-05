package matrix;

import java.util.Scanner;

public class InputMatrix {
	public static void main(String args[]) {
		AddMatrix am = new AddMatrix();
		
		Scanner keyboard = new Scanner(System.in);
		int m,n;
		System.out.print("Nhap m: ");
		m = keyboard.nextInt();
		System.out.print("Nhap n: ");
		n = keyboard.nextInt();
		
		int matr1[][] = new int[m][n];
		int matr2[][] = new int[m][n];
		
		for(int k = 0; k < 2; k++) {
			System.out.println("matr" + (k+1));
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print("a[" + i + "][" + j +"] = ");
					if(k==0) {
						matr1[i][j] = keyboard.nextInt();
					}else {
						matr2[i][j] = keyboard.nextInt();
					}
				}
			}
		}
		for(int k = 0; k < 2; k++) {
			System.out.println("matr" + (k+1));
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					if(k==0) {
						System.out.print(" 	" + matr1[i][j]);
					}else {
						System.out.print("	" + matr2[i][j]);
					}
				}
				System.out.println();
			}
			System.out.println();
		}
		
		am.setMatrix1(matr1);
		am.setMatrix2(matr2);
		System.out.println("Tong 2 ma tran la: ");
		am.AddMatrix();
	}
}
