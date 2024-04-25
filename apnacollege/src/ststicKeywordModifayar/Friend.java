package ststicKeywordModifayar;

public class Friend {
	
	String name;
	static int numberoffriends;
	
	Friend(String n) {
		name=n;
		numberoffriends++;
	}
	static void displayFriends() {
		System.out.println("You Have "+numberoffriends+" Friends");
	}
}

