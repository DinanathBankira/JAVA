package apnacollege;

public class Human {
	String name;
	int age;
	double weight;
	Human(String n,int a,double w){
		name=n;
		age=a;
		weight=w;
	}
	void eat() {
		System.out.println(name+" is Eating");
	}
	void drink() {
		System.out.println(name+" is drinking *burp*");
	}
}
