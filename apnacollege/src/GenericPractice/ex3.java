package GenericPractice;

import java.util.ArrayList;

public class ex3 {
	public static void main(String[] args) {
		ArrayList aList=new ArrayList();
		
		aList.add("str");
		aList.add(54);
		aList.add(643);
		String i=(String)aList.get(0);
		
		System.out.println(i);
	}
}
