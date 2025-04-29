package array_prblms;
import java.util.Arrays;
import java.util.Collections;
public class descending_Order {

	public static void main(String[] args) {
Integer [] arr = {4,6,3,6,8,5,0};
Arrays.sort(arr,Collections.reverseOrder());
System.out.println(Arrays.toString(arr));
	}

}
