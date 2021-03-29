package hust.soict.hedspi.test.utils;

import hust.soict.hedspi.aims.utils.MyDate;
import hust.soict.hedspi.aims.utils.*;

public class DateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(13,4,2000);
		MyDate date2 = new MyDate("First", "May", 2000);
		MyDate date3 = new MyDate(18, 9, 2009);
		MyDate arr[] = new MyDate[3];
	    arr[1] = date1;
	    arr[0] = date2;
	    arr[2] = date3;
	    
        DateUtils.sortDate(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].viewDate("yyyy-mm-dd"));
        }
	}
}
