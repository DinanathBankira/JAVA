package apnacollege;
class Student{
	int rollno;
	String name;
	
	void insertRecord(int r,String n) {
		rollno=r;
		name=n;
	}
	void displayInformation() {
		System.out.println(rollno+" "+name);
	}
}
public class ex1 {
	public static void main(String[] args) {
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		
		s.insertRecord(11, "Dinanath");
		s1.insertRecord(12, "Mohan");
		s2.insertRecord(13, "Chanda");
		
		s.displayInformation();
		s1.displayInformation();
		s2.displayInformation();
	}
}
