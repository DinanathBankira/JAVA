package BasicPrograms;

public class Forlooppaterna {
	public static void main(String[] args) {
		int n=4;
		for(int i=n;i>0;i--) {
			for(int j=0;j<i;j++)
				System.out.print(i+" "+j);
			System.out.println();
		}
	}
}
