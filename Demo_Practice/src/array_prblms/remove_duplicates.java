package array_prblms;
import java.util.*; // here we can use (*) instead of Arrays 
public class remove_duplicates {

	public static void main(String[] args) {
		int arr[] = {4,5,7,5,9,2,4,7,0};
		Arrays.sort(arr);

		int size =arr.length;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] != arr[i+1]) {
				System.out.println(arr[i] );
			}

		}
		System.out.println(arr[size-1]);
	}
}



