package array_prblms;

public class max_and_min_element {

	public static void main(String[] args) {
int []arr1 = {5,4,2,3,1,9,0};
int []arr2 = {4,3,6,8,9,76,4};
int max = arr1[0];
int min = arr2[0];
for (int i=1;i<arr1.length;i++) {
	if(max < arr1[i]) {
		max = arr1[i];
		System.out.println("The max element is : " + arr1[i]);
	}
} 
for(int j=1;j<arr2.length;j++) {
	if(min > arr2[j]) {
		min = arr2[j];
		System.out.println("The min element is : " + arr2[j]);
	}
}
	}

}
