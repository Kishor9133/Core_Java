package array_prblms;
import java.util.*;

public class all_zeros_toLast {

	public static void main(String[] args) {
Integer [] arr = {3,0,8,7,0,5,8,0,2,0,1,0};
Arrays.sort(arr,Collections.reverseOrder());
System.out.println(Arrays.toString(arr));
	}

}
