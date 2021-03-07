package thang;

import thang.OutPut;

public class CheckInput {
	String thang[] = {"January","February","March","April","May","June","Julyy",
			"August","September","October","November","December"};
		
	private String Month;
	
	OutPut out = new OutPut();

	public String getMonth() {
		return Month;
	}

	public void setMonth(String month) {
		Month = month;
	}
	
	public static boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	public int Check() {
		
		boolean t = isNumeric(Month);
		
		if(t) {
			int Mon = Integer.parseInt(Month);
			if(Mon > 0 && Mon <= 12) {
				return Mon;
			}
		}
		else {
		int n = Month.length();
		char ch = Month.charAt(n-1);
		for(int i = 0;i < 12; i++) {
			int m1 = thang[i].length();
			if(ch == '.') {
				if(m1 < n) {
					String temp =  thang[i].substring(0,m1);
					String m = Month.substring(0,n-1);
					if(m.equals(temp)) {
						return i+1;
					}
				}else {
					String temp =  thang[i].substring(0,n-1);
					String m = Month.substring(0,n-1);
					if(m.equals(temp)) {
						return i+1;
					}
				}
			}else {
				if(m1 < n) {
					String temp =  thang[i].substring(0,m1);
					String m = Month.substring(0,n-1);
					if(m.equals(temp)) {
						return i + 1;
					}
				}else {
				String temp =  thang[i].substring(0,n);
				if(Month.equals(temp)) {
					return i + 1 ;
				}	
				}
			}
		}
	}
		return -1;
	}
} 
