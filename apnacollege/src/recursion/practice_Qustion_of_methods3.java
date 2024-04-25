package recursion;
//using Recursion Method 
//Sum off N number of natural number
public class practice_Qustion_of_methods3 {
	static int naturalNumberSum(int n) {
		if(n==1) {
			return 1;
		}else {
			return n+naturalNumberSum(n-1);
		}
	}
	public static void main(String[] args) {
		int x=naturalNumberSum(4);
		System.out.println(x);
	}
}
