package parameters;

public class TriangleArea {
public static void main(String[] args) {
	triangleArea(8, 5.2, 7.1);
}
public static double triangleArea(double a, double b, double c){
	double area = 0;
	double s = (a+b+c)/2;
	area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
	System.out.println(area);
	return area;
}
}
//area = √ (s (s-a)(s-b)(s-c)) 
//where s = (a + b + c) / 2