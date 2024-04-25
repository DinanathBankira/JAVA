package BasicPrograms;

import java.util.Scanner;

//Print <name> have a good day;
public class WAP1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter Your Name : ");
		String name=s.next();
		System.out.println("Hello "+name+" Have a Good Day");
		}
}
