package ObjectPassAsAArgument;

public class Main {
	public static void main(String[] args) {
		Garage g=new Garage();
		
		Car car=new Car("BMW");
		Car car2=new Car("Tesla");
		
		g.park(car);
		g.park(car2);
	}
}
