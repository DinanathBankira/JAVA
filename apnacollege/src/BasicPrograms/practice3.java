package BasicPrograms;

import javax.management.loading.MLet;

public class practice3 {
	public static void main(String[] args) {
		String name="Narendra Modi";
		//problen 1
		System.out.println(name.toLowerCase());
		//problem 2
		System.out.println(name.replace(' ', '_'));
		
		//problem 3
		String letter="Dear <|name|>, Thanks a lot!";
		System.out.println(letter.replace("<|name|>","Banku"));
		
		//problem 4
		String myString="This String contains  double and treeple space";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		//problem 5
		String myLetter="Dear Banku, \n\tThis Java course is Nice.\n\t Thanks";
		System.out.println(myLetter);
		
	}
}
