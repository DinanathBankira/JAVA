package InheritanceProgram;
class baap{
	public baap() {
		// TODO Auto-generated constructor stub
		System.out.println("Baap Bole toh apun");
	}
	public baap(String n) {
		System.out.println("My Name is ="+n);
	}
}
class beta extends baap{
	public beta() {
		// TODO Auto-generated constructor stub
		super("1201");
		System.out.println("Main Beta hun.");
	}
}
public class ex1 {
	public static void main(String[] args) {
		beta b1=new beta();
		
	}
}
