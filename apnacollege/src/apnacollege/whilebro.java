package apnacollege;

import java.util.Scanner;

public class whilebro {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name="";
		
		while(name.isBlank()) {
			System.out.print("Enter your Name : ");
			name=s.nextLine();
		}
		System.out.println("Hello "+name);
	}
}
