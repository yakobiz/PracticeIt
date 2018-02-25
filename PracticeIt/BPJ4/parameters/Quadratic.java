package parameters;

public class Quadratic {
	public static void main(String[] args) {
		quadratic(4, 10, 5);
	}
	
public static double quadratic (double a, double b, double c){
	
	double delta = Math.pow(b, 2)- 4*a*c;
	double result = (-b + Math.sqrt(delta))/(2*a);
	double result2 = (-b - Math.sqrt(delta))/(2*a);
	System.out.println("first root: "+result+ "\nsecond root: "+result2);
	return result + result2;
}
}
