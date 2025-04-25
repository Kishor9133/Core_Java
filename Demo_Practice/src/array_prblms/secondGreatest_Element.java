package array_prblms;
import java.util.Arrays;
public class secondGreatest_Element {

	public static void main(String[] args) {
int[] arr = {5,6,3,4,8,9,0};
Arrays.sort(arr);
int size = arr.length;
for(int i = size-2;i>0;i--) {
	if(arr[i] != arr[size-1]) {
		System.out.println("The second greatest element is : " + arr[i]);
		return;
	}
	
}

	}

}
