package vidu3;

public class secondDegreeEquation {
	private int a;
	private int b;
	private int c;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public String resolve() {
		int delta=(int) (Math.pow(b, 2)-4*a*c);
		if(delta==0) {
			return ("Phuong trinh co nghiem kep: x=" + (double)-b/(2*a));
		}
		else if(delta>0) {
			return ("phuong trinh co 2 ngiem phan biet: x1="+(double)(-b+Math.sqrt(delta))/(2*a)
					+ " x2="+ (double)(-b-Math.sqrt(delta))/(2*a));
		}
		else {
			return ("Phuong trinh vo ngiem");
		}
	}
}
