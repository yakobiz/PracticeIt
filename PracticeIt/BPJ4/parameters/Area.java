package parameters;

public class Area {
public static void main(String[] args) {
	area(2.0);
}
public static double area(double a){
	double result = 0;
	result = Math.PI*Math.pow(a, 2);
	System.out.println(result);
	return result;
}
}
