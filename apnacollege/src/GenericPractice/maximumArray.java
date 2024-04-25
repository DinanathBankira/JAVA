package GenericPractice;

import java.util.Iterator;

public class maximumArray {
	public static void main(String[] args) {
		int[] arr= {12,13,31,24,54,67,23,17,34};
		int max=0;
		for(int elemnt: arr) {
			if(elemnt>max) {
				max=elemnt;
			}
		}
		System.out.println("In this Array the Maximum value is = "+max);
	}
}
