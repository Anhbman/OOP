package hust.soict.hedspi.aims.utils;

public class DateUtils {
	
	private MyDate[] Arr;
	
	
	public MyDate[] getArr() {
		return Arr;
	}

	public void setArr(MyDate[] arr) {
		this.Arr = arr;
	}

	public static int compareTowDate(MyDate date1, MyDate date2) {
		String str1  = date1.viewDate("yyyy-mm-dd");
		String str2  = date2.viewDate("yyyy-mm-dd");
		return str1.compareTo(str2);
	}
	
	public static void sortDate(MyDate[] Arr) {
		for(int i = 0; i < Arr.length - 1; i++) {
			for(int j = i + 1; j < Arr.length; j++) {
				if(compareTowDate(Arr[i], Arr[j]) > 0) {
					MyDate temp = Arr[i];
					Arr[i] = Arr[j];
					Arr[j] = temp;
				}
			}
		}
	}

}
