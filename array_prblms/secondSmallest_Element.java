package array_prblms;
import java.util.Arrays;
public class secondSmallest_Element {

	public static void main(String[] args) {
Integer  [] arr = {4,6,1,3,4,8,9,2};
int size = arr.length;
Arrays.sort(arr);
for( int i=1;i<arr.length;i++) {
	if(arr[i+1] != arr[i]) {
	System.out.println("The Second Smallest number is : " + arr[i]);
	return;
	}
}

		


}

	}


