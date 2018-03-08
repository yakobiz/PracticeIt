package BPJ4;

import java.util.Arrays;

public class Jagged {

	
	public static void main(String[] args) {

		int[][] jagged = new int [5][];
		jagged[0] = new int [1];
		jagged[1] = new int [2];
		jagged[2] = new int [3];
		jagged[3] = new int [4];
		jagged[4] = new int [5];
		int i=0;
		int j=0;
		int k=1;
		for ( i =0; i<jagged.length; i++){
		    for ( j=0; j<=i; j++){
		        jagged [i][j] = k;
		    k++;
		    }	   
		}
		 System.out.print(Arrays.deepToString(jagged)+"\n");
	}
}

