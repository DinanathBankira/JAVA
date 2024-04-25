package ststicKeywordModifayar;

public class Main {
	public static void main(String[] args) {
		//static =modifier. A single copy of a variable/method is created and shared.
		//the class "owns" the static member
		
		Friend f1=new Friend("Mohit");
		Friend f2=new Friend("Ankit");
		Friend f3=new Friend("Lakhan");
		Friend f4=new Friend("Arun");
		
		
//		System.out.println(Friend.numberoffriends);
		
		Friend.displayFriends();
	}

}
