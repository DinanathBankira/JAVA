package BasicPrograms;

import java.util.Scanner;

public class practice4 {
	public static void main(String[] args) {
//		Qustion1
//		int a=10;
//		if(a==11) {
//			System.out.println("I am 11");
//		}else {
//			System.out.println("I am not 11");
//		}
		
		
//		Qustion2
//		byte m1,m2,m3;
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter your marks iin Physics");
//		m1=s.nextByte();
//		System.out.println("Enter your marks iin Math");
//		m2=s.nextByte();
//		System.out.println("Enter your marks iin Chemestry");
//		m3=s.nextByte();
//		
//		float avg=(m1+m2+m3)/3.0f;
//		
//		if(avg>=40 && m1>=33 && m2>=33 &&m3>=33) {
//			System.out.println("You are promoted");
//		}else {
//			System.out.println("You are not Formeted");
//		}
		
		
		
		
//		Qustion4
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Day");
		int day=s.nextInt();
		switch (day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("Sunday");
		
		
		
		default -> System.out.println("Unexpected value: " + day);
		}

		
		
		
		
	}
}
