package BPJ4;

public class Range {

	public static void main(String[] args) {
		int[] a1 = { 8, 3, 5, 7, 2, 4 };
		int[] a2 = { 15, 22, 8, 19, 31 };
		int[] a3 = { 3, 10000000, 5, -29, 4 };
		int[] a4 = { 100, 5 };
		int[] a5 = { 32 };

		System.out.println("range a1 retruns " + range(a1));
		System.out.println("range a2 retruns " + range(a2));
		System.out.println("range a3 retruns " + range(a3));
		System.out.println("range a4 retruns " + range(a4));
		System.out.println("range a5 retruns " + range(a5));
		
		
	}

	public static int range(int[] a) {
		int result;
		int max = a[0];
		int min = a[0];

		for (int i = 0; i < a.length ; i++) {
			if (min > a[i]) {
				min = a[i];
			}
		}
		for (int i = 0; i < a.length ; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max: "+max+", min: "+min);
		result = max - min + 1;
		return result;
	}
}
