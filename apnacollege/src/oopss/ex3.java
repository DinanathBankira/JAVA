package oopss;
//privet
class MyEmployee{
	private int id;
	private String name;
	
	public void setID(int i) {
		id=i;
	}
	public int getID() {
		return id;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
	}
}
public class ex3 {
	public static void main(String[] args) {
		MyEmployee e=new MyEmployee();
		e.setID(01);
		e.setName("Dinanath");
		System.out.println("ID : "+e.getID()+"\nName :"+e.getName());
	}
}
