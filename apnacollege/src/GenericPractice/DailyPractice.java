package GenericPractice;

public class DailyPractice {
	static int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	static int multi(int a,int b) {
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		int x=23;
		int y=4;
		int s=sum(x, y);
		int m=multi(x,y);
		System.out.println(s);
		System.out.println(m);
	}
}
