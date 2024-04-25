package oopss;
class student{
	private int RollNo;
	private String name;
	public void getInfo(int rn,String n) {
		RollNo=rn;
		name=n;
	}
	public void setInfo() {
		System.out.println("My Roll No. is "+RollNo+" My name is "+name);
	}
}
public class ex4 {
	 public static void main(String[] args) {
		student s=new student();
		s.getInfo(21, "Sanjeet Banra");
		s.setInfo(); 
	}
}
