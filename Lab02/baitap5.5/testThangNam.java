package thang;

import java.util.Scanner;

import thang.CheckInput;
import thang.OutPut;

public class testThangNam {
	public static void main(String args[]) {
		CheckInput check = new CheckInput();
		OutPut out1 = new OutPut();
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Nhap vao thang: ");
		String thang = keyboard.nextLine();
		System.out.print("Nhap vao nam: ");
		int nam = keyboard.nextInt();
		check.setMonth(thang);
		if(check.Check() == -1) {
			System.out.println("Dau vao khong hop le!");
		}else{
			out1.setNam(nam);
			out1.setTha(check.Check());
			System.out.println(out1.SoNgay());
		}
	}
}
