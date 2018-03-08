package BPJ4;

import java.util.Arrays;

public class ArrayMystery5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 8 };
		int[] b = { 14, 7 };
		int[] c = { 7, 1, 3, 2, 0, 4 };
		int[] d = { 10, 8, 9, 5, 5 };
		int[] e = { 12, 11, 10, 10, 8, 7 };
		arrayMystery5(a);
		arrayMystery5(b);
		arrayMystery5(c);
		arrayMystery5(d);
		arrayMystery5(e);
	}

	public static int[] arrayMystery5(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				nums[i + 1]++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;
	} 
}
