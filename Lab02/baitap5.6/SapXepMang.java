package mang;

public class SapXepMang {
	private int mang[];

	public int[] getMang() {
		return mang;
	}

	public void setMang(int[] mang) {
		this.mang = mang;
	}
	
	public void Sort() {
		int temp = mang[0];
		for(int i = 0; i< mang.length; i++) {
			for(int j = i + 1; j < mang.length; j++) {
				if(mang[i] > mang[j]) {
					temp = mang[j];
					mang[j] = mang[i];
					mang[i] = temp;
				}
			}
		}
		for(int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + " ");
		}
		System.out.println();
	}
	
	public void tinh() {
		int sum = 0;
		for(int i = 0; i < mang.length; i++) {
			sum += mang[i];
		}
		
		System.out.println("Tong cac phan tu cua mang la: " + sum);
		System.out.println("Trung binh la: " + (double)sum/mang.length);
	}
}
