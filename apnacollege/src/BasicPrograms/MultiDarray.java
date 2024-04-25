package BasicPrograms;

public class MultiDarray {
	public static void main(String[] args) {
		int[][] num= {{12,13,14,15,16},
					{22,23,24,25,26},
					{32,33,34,35,36}};
//		System.out.println(num[0][0]);
//		System.out.println(num[2][1]);//33
//		System.out.println(num[1][3]);//25
//		System.out.println(num.length);//3
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<num[i].length;j++) {
				System.out.print(num[i][j]);
				System.out.print(" ");				
			}
			System.out.println(" ");
		}
	}
}
