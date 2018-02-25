package variables;

import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj liczbę całkowitą");
		int numSc = sc.nextInt();
		printNumbers(numSc);
		sc.close();
	}

	public static void printNumbers(int num) {
		for (int i = 1; i <= num; i++){
			System.out.print("[" + i + "] ");
		}
	}
}
