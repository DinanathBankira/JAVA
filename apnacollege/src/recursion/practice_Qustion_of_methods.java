package recursion;

public class practice_Qustion_of_methods {
	static void multiflication(int n) {
		for(int i=1;i<=10;i++) {
			System.out.format("%d X %d = %d\n", n,i,n*i);
		}
	}
	public static void main(String[] args) {
		multiflication(4);
	}
}
