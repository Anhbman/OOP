package vidu2;

public class test2 {
	public static void main(String args[]) {
		secondDegree se=new secondDegree();
		se.setA11(1);
		se.setA12(-5);
		se.setB1(19);
		se.setA21(3);
		se.setA22(2);
		se.setB2(6);
		System.out.println(se.resolve());
	}
}
