package GenericPractice;

import java.util.ArrayList;

public class ex1 {
	public static void main(String[] args) {
		ArrayList aList=new ArrayList();
		
		aList.add("str");
		aList.add(54);
		aList.add(643);
		int i=(int)aList.get(2);
		
		System.out.println(i);
	}
}
