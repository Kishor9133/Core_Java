package array_prblms;

public class greatest_element {

	public static void main(String[] args) {
int [] arr = {4,3,5,8,9,2,0};
int max = 0;
for (int i=1;i<arr.length;i++) {
	if(max < arr[i]) {
		max = arr[i];
		
	}
}
System.out.println(max);
	}

}
