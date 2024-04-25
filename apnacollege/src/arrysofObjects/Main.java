package arrysofObjects;

public class Main {
	public static void main(String[] args) {
//		
//		int[] number =new int[3];
//		char[] characters=new char[4];
//		String[] string =new String[5];
		
		
//		food[] refrigerator=new food[3];
		
		
		food f1 =new food("pizza");
		food f2 =new food("hamburger");
		food f3 =new food("hotdog");
		
		food[] refrigerator= {f1,f2,f3};
		
//		refrigerator[0]=f1;
//		refrigerator[1]=f2;
//		refrigerator[2]=f3;
		
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
	}
}
