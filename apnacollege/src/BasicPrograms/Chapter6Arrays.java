package BasicPrograms;

public class Chapter6Arrays {
	public static void main(String[] args) {
		//classroom of 500 student Enter thair marks
		/*[] marks=new int[5]; //type 1.
		marks[0]=100;
		marks[1]=63;
		marks[2]=80;
		marks[3]=93;
		marks[4]=97;
		System.out.println(marks[4]);*/
		
		
		//type 2
		/*int marks[]= {12,45,67,80,90};
		System.out.println(marks.length);
		System.out.println(marks[2]);*/
		
//		System.out.println("Printing Using For Loop");
//		String[] student= {"mohit","Rajesh","Lucky","Ganesh","Ankit","Abhiram","Kanak"};
//		System.out.println(student.length);
//		for(int i=0;i<=student.length;i++) {
//			System.out.println(student[i]);
//		}*/
		
		/*System.out.println("Print in Revers Model");
		String[] student= {"mohit","Rajesh","Lucky","Ganesh","Ankit","Abhiram","Kanak"};
		for(int i=student.length-1;i>=0;i--) {
			System.out.println(student[i]);
		}*/
		
		System.out.println("Using For-each Loop");
		String[] student= {"mohit","Rajesh","Lucky","Ganesh","Ankit","Abhiram","Kanak"};
		for (String string : student) {
			System.out.println(string);
		}
	}
}
