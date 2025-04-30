package array_prblms;
import java.util.Arrays;
public class duplicate_elements {

	public static void main(String[] args) {
int [] arr = {4,2,6,4,7,9,1,9,2};
Arrays.sort(arr);
for(int i=0;i<arr.length-1;i++) {
	if (arr[i] == arr[i+1]) {
		System.out.println(arr[i]);
		
		
	}
}
	}

}
