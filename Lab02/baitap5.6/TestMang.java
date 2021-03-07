package mang;

import java.util.Scanner;

public class TestMang {
	public static void main(String[] args) {	
		SapXepMang sx = new SapXepMang();
		
		int n;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Nhap vao kich thuoc mang: ");
		n = keyboard.nextInt();
		int arr[] = new int[n] ;
		for(int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "] = ");
			arr[i] = keyboard.nextInt();
		}
		
		sx.setMang(arr);
		sx.Sort();
		sx.tinh();
	}

}
