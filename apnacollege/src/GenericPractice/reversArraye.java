package GenericPractice;

public class reversArraye {
	public static void main(String[] args) {
		int arr[]= {12,13,14,15,16,17};
		int l=arr.length;
		int temp;
		int n=Math.floorDiv(l, 2);
		for(int i=0;i<n;i++) {
			// a b temp
			temp=arr[i];
			arr[i]=arr[l-i-1];
			arr[l-i-1]=temp;
		}
		for(int element:arr) {
			System.out.print(element+" ");
		}
	}
}
