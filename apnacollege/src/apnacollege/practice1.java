package apnacollege;

public class practice1 {
	public static void main(String[] args) {
		double now=System.currentTimeMillis();
		
		practice1 demo=new practice1();
		System.out.println(demo.findSum(999999));
		
		
		System.out.println("Time taken - "+(System.currentTimeMillis()-now)+"Millisecs.");
	}
	/*
	 * public int findSum(int n) { return n*(n+1)/2; }
	 */
	public int findSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
}
