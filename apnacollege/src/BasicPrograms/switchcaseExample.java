package BasicPrograms;

import java.util.Scanner;

public class switchcaseExample {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Gender");
//		male=M,female=F
		String gender=s.next();
		switch (gender) {
		case "F":
			System.out.println("Go to get Number 1 ");
			break;
		case "M":
			System.out.println("Go to get Number 2 ");
			break;

		default: System.out.println("Inviled");
			break;
		}
	}
}
