package recursion;

public class ex2 {
	public static void main(String[] args) {
		int result=sum(10);
		System.out.println(result);
	}
	public static int sum(int k) {
		//recursion
		if(k>0) {
			return k+sum(k-1);
		}else {
			return 0;
		}
	}
}
