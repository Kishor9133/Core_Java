package prepinsta;

public class greatest_of_3_numbers {

	public static void main(String[] args) {
 int num1 = 10, num2 = 20, num3 = 30;
if(num1 > num2 && num1 > num3) {
	System.out.println(num1);
}else {
	if(num2 > num1 && num2 > num3) {
		System.out.println(num2);
	}else {
		if(num3 > num1 && num3 > num2) {
			System.out.println(num3);
		}
	}
}
	}

}
