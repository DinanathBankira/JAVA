package GenericPractice;

import java.util.Scanner;

public class Methods {
	static int calculate(int a,int b) {
		int c=a*b;
		return c;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter m : ");
		int m=scanner.nextInt();
		System.out.print("Enter n : ");
		int n=scanner.nextInt();
		int o=calculate(m, n);
		System.out.println("Multifli of m * n = "+o);
	}
}
