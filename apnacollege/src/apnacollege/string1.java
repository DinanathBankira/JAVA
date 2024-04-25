package apnacollege;

public class string1 {
	//instance variable
	 public String myVar="instance variable";
	 
	 public void myMethod() {
		 //local variable
		 String myVar="Inside Method";
		 System.out.println(myVar);
	 }
	 public static void main(String[] args) {
		string1 obj=new string1();
		System.out.println("Colling Method");
		obj.myMethod();
		System.out.println(obj.myVar);
	}
}
