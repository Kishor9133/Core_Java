package array_prblms;

public class smallest_element {

	public static void main(String[] args) {
		
			int [] arr = {3,4,55,6,781,1};
			int min = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(min>arr[i]) {
					min = arr[i];
				}
			}
			System.out.println(min);
		}

	
	}


