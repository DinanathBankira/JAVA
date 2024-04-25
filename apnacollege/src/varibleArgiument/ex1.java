package varibleArgiument;
//Variabel Argument
public class ex1 {
	static int sum(int ...arr) {
		int result=0;
		for(int a:arr) {
			result+=a;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(sum(2,3,4,5,6,7,1,4,5));
		System.out.println("Sum of nothing :"+sum());
	}
}
