package oopss;
class Employee{
	int id;
	String name;
	int salary;
	public void ShowDetail(){
		System.out.println("My Employee ID is "+id);
		System.out.println("My Name is "+name);
		System.out.println("***********************");
	}
	public int getSalary() {
		return salary;
	}
}
public class ex2 {
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee d=new Employee();
		e.id=12;
		e.name="Banku";
		e.salary=10000;
		d.id=13;
		d.name="Sachin";
//		System.out.println(e.id+" "+e.name);
		e.ShowDetail();
		System.out.println(e.salary);
		d.ShowDetail();
	}
}
