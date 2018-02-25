package parameters;

public class CylinderSurfaceArea {
public static void main(String[] args) {
	cylinderSurfaceArea(3.0, 4.5);
	
}
public static double cylinderSurfaceArea(double radius, double hight){
	double surface = 0;
	surface = 2*Math.PI*Math.pow(radius, 2)+2*Math.PI*radius*hight;
	//surface area = 2πr2 + 2πrh
	System.out.println(surface);
	return surface;
}
}
