package vidu1;

import vidu1.FirstDegreeEquation;

public class test {
	public static void main(String args[]) {
		FirstDegreeEquation eq = new FirstDegreeEquation();
		eq.setA(7);
		eq.setB(4);
		System.out.println(eq.resolve());
	}
}
