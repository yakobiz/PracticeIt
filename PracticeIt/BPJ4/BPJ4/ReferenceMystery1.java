package BPJ4;

import java.util.*; // for Arrays class

public class ReferenceMystery1 {
	public static void main(String[] args) {
		int x = 0;
		int[] a = new int[4];
		x++;

		mystery(x, a);
		System.out.println(x + " " + Arrays.toString(a));

		x++;
		mystery(x, a);
		System.out.println(x + " " + Arrays.toString(a));
	}

	public static void mystery(int x, int[] a) {
		x++;
		a[x]++;
		System.out.println(x + " " + Arrays.toString(a));
	}
}
