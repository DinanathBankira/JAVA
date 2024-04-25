package BasicPrograms;

import java.util.Scanner;

//else-if
public class practice01 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=s.nextInt();
		
		if(age<18) {
			System.out.println("Enter Chaild Line || Gate No.1");
		}else if(age>18) {
			System.out.println("Enter Adults Line || Gate No.2");
		}else {
			System.out.println("Wrong Input");
		}
	}
}
