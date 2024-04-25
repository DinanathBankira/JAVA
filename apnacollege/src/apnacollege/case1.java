package apnacollege;

import java.util.Scanner;

public class case1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Date Month :");
		int month=s.nextInt();
		switch(month) {
		case 1:System.out.println("Junwary");
		break;
		case 2:System.out.println("Febrowary");
		break;
		case 3:System.out.println("Murch");
		break;
		case 4:System.out.println("Aprail");
		break;
		case 5:System.out.println("May");
		break;
		case 6:System.out.println("June");
		break;
		case 7:System.out.println("Julay");
		break;
		case 8:System.out.println("August");
		break;
		case 9:System.out.println("September");
		break;
		case 10:System.out.println("October");
		break;
		case 11:System.out.println("November");
		break;
		case 12:System.out.println("December");
		break;
		}
	}
}
