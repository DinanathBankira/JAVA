package apnacollege;

import java.util.Scanner;

public class ifelseifExample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Your Marks :");
		int marks=s.nextInt();
		if(marks<=30) {
			System.out.println("D Gread");
		}else if(marks>30 && marks<=50) {
			System.out.println("C Gread");
		}else if(marks>50 && marks<=70) {
			System.out.println("B Gread");
		}else if (marks>70 && marks<=80) {
			System.out.println("A Gread");
		}else if (marks>80) {
			System.out.println("A+ Gread");
		}
	}
}
