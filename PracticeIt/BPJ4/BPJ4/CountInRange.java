package BPJ4;

public class CountInRange {

	public static void main(String[] args) {
		int[] a = { 14, 1, 22, 17, 36, 7, -43, 5,6,7,8,9 };
		int min = 4;
		int max = 17;
		countInRange(a, min, max);
	}

	public static int countInRange(int[] a, int min, int max) {

		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (min <= a[i] && a[i] <= max) {
				count++;
			}
		}
		System.out.println(count);
		return count;
	}
}