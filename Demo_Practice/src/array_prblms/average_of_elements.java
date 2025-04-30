package array_prblms;

public class average_of_elements {

	public static void main(String[] args) {
		int [] arr = {3,5,8,2,9,30,7};
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}

		System.out.println(sum /arr.length);

	}

}

