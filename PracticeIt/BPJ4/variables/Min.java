package variables;

public class Min {

	public static void main(String[] args){
		min(3, -2, 7);
		min(19, 27, 6);
		
	}		
		public static int min(int a, int b, int c) {
	int result = Math.min(Math.min(a,b),c);
	System.out.println("min =" + result);
	return result;
}

}
