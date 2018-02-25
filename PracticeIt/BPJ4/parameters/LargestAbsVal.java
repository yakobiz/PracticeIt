package parameters;

public class LargestAbsVal {
public static void main(String[] args) {
	largestAbsVal(3, -5, -6);
}
	public static int largestAbsVal(int a, int b, int c){
		int result = 0;	
		result = (int)(Math.max(Math.max(Math.abs(b),Math.abs(c)), Math.max(Math.abs(a),Math.abs(b))));
		System.out.println(result);
		return result;
	}
}
