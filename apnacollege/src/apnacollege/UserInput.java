package apnacollege;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("What is your name ?");
		String name=s.nextLine();
		System.out.println("How old are You ?");
		int age=s.nextInt();
		s.nextLine();
		System.out.println("What is Your Favrate Food ?");
		String food=s.nextLine();
		
		
		
		
		
		System.out.println("Hello "+name);
		System.out.println("You are "+age+" Year old.");
		System.out.println("You Like "+food);
	}
}
