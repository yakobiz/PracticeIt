package BPJ4;

import java.util.Arrays;

public class FiveByTenArray {

	public static void main(String[] args) {

		int [][] table = new int [5][10];
		for (int i =0; i<5; i++){
		    for (int j=0; j<10; j++){
		        table [i][j] = i*j;
		    }
		}
	System.out.print(Arrays.deepToString(table));
	}

}
