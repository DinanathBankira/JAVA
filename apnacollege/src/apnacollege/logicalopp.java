package apnacollege;

import java.util.Scanner;

public class logicalopp {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Your Are playing game ||| want to Quit press q or Q");
		String response=s.next();
		
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("Your are still playing ------->>>>> pew  pew");
		}else {
			System.out.println("You are Quit");
		}
	}
}
