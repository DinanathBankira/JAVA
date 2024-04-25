package BasicPrograms;

import java.util.Scanner;

public class userInputSumTreeNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter there number");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		int sum=a+b+c;
		System.out.println("Sum of Tree Number is : "+sum);
	}
}
