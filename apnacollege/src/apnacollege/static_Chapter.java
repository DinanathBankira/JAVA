package apnacollege;

public class static_Chapter {
	int x; //instance variable
	static int y =6; // static member variable
	
	public void fun1() {
		// Instance member function
		System.out.println("Hellow Everyone This is Instance member variable");
	}
	public static void fun2() {
		//static member function
		System.out.println("This is static member function "+y);
		
	}
	public static void main(String[] args) {
		static_Chapter sc1=new static_Chapter();
		static_Chapter sc2=new static_Chapter();
		static_Chapter sc3=new static_Chapter();
		System.out.println(y);
		sc1.fun1();
		static_Chapter.fun2();
	}
}
