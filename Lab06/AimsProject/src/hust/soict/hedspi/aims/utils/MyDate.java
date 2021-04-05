package hust.soict.hedspi.aims.utils;

public class MyDate {
	String DAYS[] = {"First", "Ninth", "Seventeenth", "Twenty fifth", "Second", "Tenth", "Eighteenth", "Twent sixth", "Third", "Eleventh", "Nineteenth", "Twenty seventh", "Fourth", "Twelfth", "Twentieth", "Twenty eighth", "Fifth", "Thirteenth", "Twenty first", "Twenty ninth", "Sixth", "Fourteenth", "Twenty second", "Thirtieth", "Seventh", "Fifteenth", "Twenty third", "Thirty first", "Eighth", "Sixteenth", "Twenty fourth"};

    public int day;
    public int month;
    public int year = 2000;

    private DateUtils[] Arr;
    
    

    public DateUtils[] getArr() {
		return Arr;
	}

	public void setArr(DateUtils[] arr) {
		Arr = arr;
	}

	public MyDate(String day,String month,int year){
    	super();
        this.setMonth(month);
        this.setDay(day);
        this.setYear(year);
    }
    
    public MyDate(int day, int month, int year) {
    	super();
    	this.day = day;
    	this.month = month;
    	this.year = year;
    }
    
    public int getDay() {
        return day;
    }

    public void setDay(String day) {
        for (int i = 0; i < DAYS.length; i++) {
            if (DAYS[i].compareTo(day) == 0) {
                this.day = i + 1;
                return;
            }
        }
        System.out.println("Dau vao khong hop le!!");
        this.day = 0;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(String month) {
        switch (month) {
            case "January":
            case "Jan":
                this.month = 1;
                break;
            case "February":
            case "Feb":
                this.month = 2;
                break;
            case "March":
            case "Mar":
                this.month = 3;
                break;
            case "April":
            case "Apr":
                this.month = 4;
                break;
            case "May":
                this.month = 5;
                break;
            case "June":
            case "Jun":
                this.month = 6;
                break;
            case "July":
            case "Jul":
                this.month = 7;
                break;
            case "August":
            case "Aug":
                this.month = 8;
                break;
            case "September":
            case "Sep":
                this.month = 9;
                break;
            case "October":
            case "Oct":
                this.month = 10;
                break;
            case "November":
            case "Nov":
                this.month = 11;
                break;
            case "December":
            case "Dec":
                this.month = 12;
                break;
            default:
                System.out.println("Tham so khong hop le");
                this.month = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String viewDate(String format) {
        if(day == 0 || year == 0 || month == 0){
            System.out.println("Tham so khong hop le");
            return "error";
        }
        switch (format) {
            case "yyyy-mm-dd":
                return (year + "-" + (month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day));

            case "dd-mm-yyyy":
                return (day + "-" + month + "-" + year);

            case "mm-dd-yyyy":
                return ((month < 10 ? "0" + month : month) + "-" + (day < 10 ? "0" + day : day) + "-" + year);

            default:
                return "error";
        }
}
}
