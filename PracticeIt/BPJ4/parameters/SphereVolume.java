package parameters;

public class SphereVolume {
	public static void main(String[] args) {
		sphereVolume(2.0);
	}
public static double sphereVolume(double radius){
	double volume=0;
	
	volume = 4*Math.PI*Math.pow(radius, 3)/3;
	System.out.println(volume);
	return volume;
}
}
