package parameters;

public class Distance {
public static void main(String[] args) {
	distance(-2,4,5,3);
	distance(1, 0, 4, 4);
	distance(10, 2, 3, 5);
}
	public static double distance(int x1, int y1, int x2, int y2){
		double result = 0;
		
		result = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
		System.out.println(result);
		return result;
	}
}
