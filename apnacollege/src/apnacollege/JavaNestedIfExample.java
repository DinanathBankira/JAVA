package apnacollege;

import java.util.Scanner;

public class JavaNestedIfExample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		int age=s.nextInt();
		System.out.println("Enter Your Weight :");
		int weight=s.nextInt();
		if(age>=18) {
			if (weight>=50) {
				System.out.println("You Are Eligible to donate blood");
			}
			else {
				System.out.println("You Are Not Aligable");
			}
		}else {
			System.out.println("You Are Not Aligable");
		}
		
	}
}
