package vidu1;


public class FirstDegreeEquation {
	private int a;
	private int b;
	
	public int getA() {		
		return this.a;
	}
	public void setA(int a) {
		this.a=a;
	}
	public int getB() {
		return this.b;
	}
	public void setB(int b) {
		this.b=b;
	}
	public String resolve() {
		if(a==0 && b==0)
			return ("Co vo so nghiem");
		if(a==0 && b!=0) {
			return ("Phuong trinh vo nghiem");
		}
		if(a!=0) {
			return ("Phuong trinh co nghiem la: " + (double) -b/a);
		}
		return null;
	}
}
