package array_prblms;

public class avg_of_2D_array {

	public static void main(String[] args) {
		int [] [] arr = {{3,4,3},{5,6,1},{2,3,9}};
		int sum=0;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum += arr[i][j];
				count ++;
			}
		}
		System.out.println(sum/count);
	}
}
