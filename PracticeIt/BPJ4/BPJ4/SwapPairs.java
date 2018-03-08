package BPJ4;

import java.util.Arrays;

public class SwapPairs {
	public static void main(String args[]) {
		String[] any = { "four", "score", "and", "seven", "years", "ago" };
		swapPairs(any);
	}

	public static void swapPairs(String[] a) {
		int upperBorder = ((a.length / 2) * 2);
		for (int i = 0; i < upperBorder; i++) {
			if (i % 2 == 0) {
				 String replace = a[i];
				a[i] = a[i + 1];
				 a[i+1] = replace;
			}
		}
		
		System.out.println(upperBorder);
		System.out.println(Arrays.toString(a));
	}

}
