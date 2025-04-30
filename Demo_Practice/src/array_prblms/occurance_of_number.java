package array_prblms;

public class occurance_of_number {

	public static void main(String[] args) {
int [] arr = {5,3,3,6,3,7,8,3,9,2,3,0};
int found =3;
 int occurance =0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==found) {
		occurance++;
		System.out.println(found);
	}
	
}

	}

}
