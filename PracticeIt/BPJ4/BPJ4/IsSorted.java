package BPJ4;

import java.util.Arrays;

public class IsSorted {
	
// NALEŻY SPRAWDZIĆ, CZY PODANA TABLICA JEST JUŻ POSORTOWANA
	
	public static void main(String[] args) {
		double[] list1 = { 16.1, 12.3, 22.2, 14.4 };
		double[] list2 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };
		double[] list3 = { 1.5, 4.3, 7.0, 19.5, 7.8, 25.1, 46.2 };
		isSorted(list1);
		isSorted(list2);
		isSorted(list3);
	}

	public static boolean isSorted(double[] list) {
boolean result = false;
		double[] b = new double[list.length];
		for (int i = 0; i < list.length; i++) {
			b[i] = list[i];
		}
		Arrays.sort(b);
		
		System.out.println("list : " + Arrays.toString(list));
		System.out.println("b:     " + Arrays.toString(b));

			if (Arrays.equals(b,list)) {  
				result = true;
			} else {
				result = false;
			}
			System.out.println(result);
			return result;
	}

}
