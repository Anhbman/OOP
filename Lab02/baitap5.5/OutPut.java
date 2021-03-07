package thang;

public class OutPut {
	private int tha;
	private int nam;
	public int getTha() {
		return tha;
	}
	public void setTha(int tha) {
		this.tha = tha;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	
	public int SoNgay() {
		
		int chia4 = nam % 4;
		int chia100 = nam % 100;
		int chia400 = nam % 400;
		
		if(tha == 1 || tha == 3 || tha == 5 || tha == 7 || tha == 8 || tha == 10 || tha ==12) {	
			return 31;
		}else if( tha == 2 && chia100 == 0 && chia400 !=0) {
			return 28;
		}else if(tha == 2) {
			return 29;
		}else {
			return 30;
		}
	}
}
