package BPJ4;

public class ArrayMystery {

	public static void main(String[] args) {
		int[]a= {5};
		int[]b= {3, 12};
		int[]c={4, 2, 10, 8};
		int[]d={1, 9, 3, 5, 7};
		int[]e= {8, 2, 10, 4, 10, 9};
		
		arrayMystery4(a);
		 arrayMystery4(b);
		 arrayMystery4(c);	
		 arrayMystery4(d);	
		 arrayMystery4(e);
	}

	public static int arrayMystery4(int[] list) {
		int x = 0;
		for (int i = 1; i < list.length; i++) {
			int y = list[i] - list[0];
			if (y > x) {
				x = y;
			}
		}
		System.out.println(x+"; ");
		return x;
	}
}
