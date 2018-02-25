package parameters;

public class LastDigit {
	
	public static void main(String[] args) {
		lastDigit(6789234);
	}
public static int lastDigit(int a){
	int result=0;
	result = Math.abs(a%10);
	System.out.println(result);
	return result;	
}
}
