package ThisSupper;
 class Ekclass{
	 int a;
	 
	 public int getA() {
		return a;
	}
	Ekclass(int v) {
		 a=v;
		// TODO Auto-generated constructor stub
	}
	 public int returnoun() {
		 return 1;
	 }
 }
public class ex1 {
	public static void main(String[] args) {
		Ekclass e=new Ekclass(65);
		System.out.println(e.getA());
	}
}
