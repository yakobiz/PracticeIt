package BPJ4;

import java.util.Arrays;

public class IsPalindrome {

	public static void main(String[] args) {

		String[] palin = { "alpha", "beta", "gamma", "delta", "gamma", "beta", "alpha" };
		String[] palin2 = { "one", "two", "three" };
		String[] palin3 = {};
		isPalindrome(palin3);
		isPalindrome(palin2);
		isPalindrome(palin);
	}

	public static boolean isPalindrome(String[] data) {
		boolean result = false;

		String[] dataRev = new String[data.length];
		for (int i = 0; i < data.length; i++) {
			dataRev[i] = data[(data.length - i - 1)];
		}
		if (Arrays.equals(dataRev, data)) {
			result = true;
		} else {
			result = false;
		}
		System.out.println(result);
		return result;
	}

}
