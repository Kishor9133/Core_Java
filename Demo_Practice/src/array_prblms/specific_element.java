package array_prblms;
import java.util.*;
public class specific_element {

	public static void main(String[] args) {
		System.out.println("Enter the element to be found : ");
		Scanner sc = new Scanner (System.in);
int arr[] = {5,4,7,3,9,0,3};
int n =sc.nextInt();
for(int i=0;i<arr.length;i++) {
	if(n == arr[i]) {
		
		System.out.println("The element is found");
		
	}else {
		System.out.println("The element is  not found");
	}
	return;
	}
	
}
	}


