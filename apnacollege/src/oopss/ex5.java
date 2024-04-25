package oopss;
	//polimorphism
	//Inheritance
	//Encapsulation
	//Objacts
	//Class
	//Abstraction
class book{
	private String Book;
	public String getName() {
		return Book;
	}
	public void setName(String name) {
		Book=name;
	}
}
public class ex5 {
	public static void main(String[] args) {
		book b=new book();
		b.setName("The Story of Thaj Mahal");
		System.out.println(b.getName());
	}
}
