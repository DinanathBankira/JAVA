package apnacollege;

import java.util.Scanner;

public class swetchcase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a Number :");
		int a=s.nextInt();
		switch(a) {
		case 1:System.out.println("1");
		break;
		case 2:System.out.println("2");
		break;
		case 3:System.out.println("3");
		break;
		case 4:System.out.println("4");
		break;
		case 5:System.out.println("5");
		break;
		default:
			System.out.println("Not in 1 , 2 , 3 , 4 or 5");
		
		}
	}
}
