package parameters;

import java.util.Scanner;

public class PrintPowersOfN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("podaj podstawę");
		int numSc = sc.nextInt();
		System.out.println("podaj wykładnik");
		int numSc2=sc.nextInt();
		printPowersOfN(numSc,numSc2);
		sc.close();
	}

	public static void printPowersOfN(int num1,int num2) {
		for (int i = 0; i <= num2; i++){
			double result = Math.pow(num1,i);
			int resultFin = (int) (result);
			System.out.print(resultFin +" ");
		}
	}
}
