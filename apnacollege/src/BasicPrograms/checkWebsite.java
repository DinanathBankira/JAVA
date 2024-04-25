package BasicPrograms;

import java.util.Scanner;

public class checkWebsite {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String website=s.next();
		if(website.endsWith(".org"))
		{
			System.out.println("This is Organaization Website !");
		}else if(website.endsWith(".com")) {
			System.out.println("This is Commercial Website");
		}else if(website.endsWith(".in")) {
			System.out.println("This is the Indian Website ");
		}
	}
}
