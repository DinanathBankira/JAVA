package apnacollege;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double x;
		double y;
		double z;
		System.out.println("Enter Side x : ");
		x=s.nextDouble();
		System.out.println("Enter Side y : ");
		y=s.nextDouble();
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("The side z is : => "+z);		
		s.close();
	}
}
