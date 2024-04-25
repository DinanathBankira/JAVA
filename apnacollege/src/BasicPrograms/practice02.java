package BasicPrograms;

import java.util.Scanner;

public class practice02 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int num1=s.nextInt();
		System.out.print("Enter Second Number : ");
		int num2=s.nextInt();
		System.out.print("Enter Action :(+,-,*,/,%) ");
		String ch=s.next();
		
		switch (ch) {
		case "+":
			System.out.println("Sum of two Number :"+(num1+num2));
			break;
		case "-":
			System.out.println("Minus of two Number :"+(num1-num2));
			break;
		case "*":
			System.out.println("Multifly of two Number :"+(num1*num2));
			break;
		case "/":
			System.out.println("Devide of two Number :"+(num1/num2));
			break;
		case "%":
			System.out.println("Mod of two Number :"+(num1%num2));
			break;

		default:
			break; 
		}
		
	}
}
