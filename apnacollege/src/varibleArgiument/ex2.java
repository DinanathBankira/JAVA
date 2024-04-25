package varibleArgiument;

public class ex2 {
	static int sum(int x,int ...asd) {
		int result=x;
		for(int a:asd) {
			result+=a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sum(12,32,45,65,76));
//		System.out.println(sum());   this give erorr ,it needs atlist one argument
	}
}
