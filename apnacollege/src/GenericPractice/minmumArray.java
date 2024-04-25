package GenericPractice;

public class minmumArray {
	public static void main(String[] args) {
		int []arr= {12,34,53,65,12,786,43,23,80};
		int min=Integer.MAX_VALUE;
		for(int e:arr) {
			if(e<min) {
				min=e;
			}
		}
		System.out.println("the minimum Value ia ="+min);
	}
}
