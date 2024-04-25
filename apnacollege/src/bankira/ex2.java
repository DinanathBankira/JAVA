package bankira;

import java.util.Random;
import java.util.Scanner;

public class ex2 {
//	0 Rock
//	1 Paper
//	2 Scissor
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter\n0 for Rock,\n1 for Paper\n2 for Scissor \n=");
		int userInput=s.nextInt();
		Random r=new Random();
		int ComputerInput=r.nextInt(3);
		if(userInput==ComputerInput) {
			System.out.println("Drow");
		}else if(userInput==0 && ComputerInput==2 || userInput==1&& ComputerInput==0|| userInput==2&& ComputerInput==1) {
			System.out.println("You Win");
		}else {
			System.out.println("Computer Win!");
		}
		System.out.println("Computer ="+ComputerInput+" UserInput="+userInput);
	}
	
}
