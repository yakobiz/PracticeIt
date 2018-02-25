package parameters;

public class Scientific {
	public static void main(String[] args) {
		scientific(6.23, 5.0);
		scientific(1.9, -2.0);
	}
public static double scientific(double base, double exponent){
	double result = 0;
	result = base * Math.pow(10,exponent);
	System.out.println(result);
	return result;
}
}
