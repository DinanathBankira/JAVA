package apnacollege;

public class LeefyearExample {
	public static void main(String[] args) {
		int year=2010;
		if (((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("LEAP YEAR");
		}
		else {
			System.out.println("COMMON YEAR");
		}
	}
}
