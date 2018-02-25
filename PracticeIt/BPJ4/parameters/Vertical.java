package parameters;

public class Vertical {
	public static void main(String[] args) {
		vertical("hey now");
	}

	public static String vertical(String str) {
		int s = str.length();
		for (int i = 0; i < s; i++) {
			System.out.println(str.charAt(i));
		}
		return null;
	}
}
