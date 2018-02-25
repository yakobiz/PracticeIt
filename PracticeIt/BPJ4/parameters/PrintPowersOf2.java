package parameters;

import java.util.Scanner;

public class PrintPowersOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj liczbę całkowitą");
		int numSc = sc.nextInt();
		printPowersOf2(numSc);
		sc.close();
	}

	public static void printPowersOf2(int num) {
		for (int i = 0; i <= num; i++){
			double result = Math.pow(2,i);
			int resultFin = (int) (result);
			System.out.print(resultFin +" ");
		}
	}
}