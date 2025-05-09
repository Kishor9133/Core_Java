package prepinsta;

public class prime_num {

	public static void main(String[] args) {
int num = 12;
boolean isprime = true;
if(num < 2) {
	isprime = false;
}else {
	for( int i=2;i<num;i++) {
		if(num%i ==0) {
			isprime = false;
			break;
		}
	}
	
	}
String result = isprime ? "prime" : "Not prime"; // here ? is = if, and : = is else
System.out.println("The num " + num + " is " + result);
}
	}


