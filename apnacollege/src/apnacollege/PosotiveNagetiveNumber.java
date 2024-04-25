package apnacollege;

import java.util.Scanner;

public class PosotiveNagetiveNumber {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Please Enter Your Number : ");
		int a=s.nextInt();
		if (a>0) {
			System.out.println("Positive Number");
		}else if (a<0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("ZERO");
		}
	}
}
