package variables;

import java.util.Scanner;

public class SumNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Low: ");
		int low = sc.nextInt();
		System.out.print("High: ");
		int high = sc.nextInt();
		Sum(low,high);
		
		sc.close();
	}
	public static int Sum(int a, int b){
		int sum =0;
		for (int i = a; i <= b; i++) {
			sum += i;
			}
		System.out.println("sum = " + sum);
		return sum;
		
	}
}

