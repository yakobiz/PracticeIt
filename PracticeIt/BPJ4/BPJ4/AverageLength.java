package BPJ4;

public class AverageLength {

	public static void main(String[] args) {
		String[] data1 = { "belt", "hat", "jelly", "bubble gum" };
		averageLength(data1);
	}

	public static double averageLength(String[] data) {
		double result = 0;
		for(int i=0; i<data.length; i++){
			result += data[i].length();
			
		}
		result = result/(data.length);
		System.out.println(result);
		return result;
	}
}
