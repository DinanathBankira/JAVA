package apnacollege;

public class reversenumber {
	public static void main(String[] args) {
		int num=6543;
		int rnum=0;
		System.out.println("Number : "+num);
		
		while(num !=0) {
			int reminder=num%10;
			rnum=rnum*10+reminder;
			num=num/10;
		}
		System.out.println("Reverse : "+rnum);
	}
}
 