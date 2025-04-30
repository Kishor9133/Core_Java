package array_prblms;

import java.util.Arrays;

public class copy_elements {

	public static void main(String[] args) {
int[] Mainarr = {5,4,2,9,0,1,3};
int[] Destination = new int[Mainarr.length];
for(int i=0;i<Mainarr.length;i++) {
	Destination[i] = Mainarr[i] ;// for each index[i] , the main array index elements are assigned to the index of Destination array
	}
	System.out.println("Mainarr : " + java.util.Arrays.toString(Mainarr)); 
	System.out.println("Destination : " +java.util. Arrays.toString(Destination));
	
}
	}


