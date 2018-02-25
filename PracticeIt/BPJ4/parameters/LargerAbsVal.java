package parameters;

public class LargerAbsVal {
public static void main(String[] args) {
	int val1 = -5;
	int val2 = 7;
	
	largerAbsVal(val1, val2);
}
public static int largerAbsVal(int a, int b){
	int result = 0; 
    if (Math.abs(a)>=Math.abs(b)){
		result = (int)Math.abs(a);
	} else {
	 result = (int)Math.abs(b);
	}
    System.out.println(result);
    return result;
}
}
