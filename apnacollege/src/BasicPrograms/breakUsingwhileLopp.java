package BasicPrograms;

public class breakUsingwhileLopp {
	public static void main(String[] args) {
		int i=0;
		while (i<=5) {
			System.out.println("Java is best : "+i);
			i++;
			if (i==2) {
				break;
			}
		}
	}
}
