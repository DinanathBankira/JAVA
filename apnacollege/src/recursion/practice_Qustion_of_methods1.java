package recursion;
//patern
public class practice_Qustion_of_methods1 {
	static void pattern(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		pattern(5);
	}
}
