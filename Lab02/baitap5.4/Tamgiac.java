package tamgiac;

public class Tamgiac {
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void resolve() {
		System.out.println();
		for(int i = 1; i <= n; i ++) {
			for(int j = n - i; j >= 0 ; j--) {
				System.out.print(" ");
			}
			for(int k = 2; k <= i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
