package bankira;
class Calculator{
	public void calculate(int a,int b) {
		System.out.println("Your Result is : "+a+b);
	}
}
class ScCalculator{
	public void calculate(int a,int b) {
		System.out.println("Your Result is : "+Math.sin(a+b));
	}
}
class HyCalculator{
	public void calculate(int a,int b) {
		System.out.println("Your Result is : "+a+b);
		System.out.println("Your Result is : "+Math.sin(a+b));
	}
}
public class ex1 {
	public static void main(String[] args) {
		System.out.println("I am main method !");
	}
}
