package parameters;

public class Reverse {
	public static void main(String[] args) {
		printReverse("Hello World");
	}

	public static String printReverse(String str) {
		StringBuilder sB = new StringBuilder(str).reverse();
		System.out.println(sB);
		return null;
	}
}
