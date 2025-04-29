package array_prblms;

public class max_and_min_element {

	public static void main(String[] args) {
int [] arr1 = {6,4,9,2,6,0};
int [] arr2 = {5,3,7,8,9,4,7};
int max =arr1[0];
int min =arr2[0];
for(int i=1;i<arr1.length;i++) {
	if(max < arr1[i]) {
		max = arr1[i];
		System.out.println(arr1[i]);
	}

	}
for(int j=1;j<arr2.length;j++) {
	if(min >arr2[j]) {
		min =arr2[j];
		System.out.println(arr2[j]);
	}
}
	}
}
