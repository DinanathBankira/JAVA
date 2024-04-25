package BasicPrograms;

public class break_using_dowhileLoop {
	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println("Dinanath Run "+i+" Raund");
			i++;
			if(i==3) {
				System.out.println("You Conpleat Your Round");
				break;
			}
		} while (i<=5);
	}
}
