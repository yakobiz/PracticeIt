package parameters;

public class PadString {
	public static void main(String[] args) {
		padString("hellox", 9);
		padString("congratulations", 18);
	}

	public static String padString(String str, int a) {
		String abc = "abc";
		int s = a - str.length();
		StringBuilder sb = new StringBuilder(str);
		if (s > 0) {
			for (int i = 1; i <= s; i++) {
				sb.insert(0," ");
			} 
		} else {
		abc.equals(str);
		}
		abc = sb.toString();
		System.out.println(abc);
		
		return abc;
	}
}
