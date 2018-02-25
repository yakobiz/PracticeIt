package variables;

import java.util.Scanner;

public class RobertPaulson {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your phrase? ");
		String phrase = sc.nextLine();
		
		System.out.print("How many times should I repeat it?");
		int times = sc.nextInt();
		
		for(int i=1; i<=times; i++){
			System.out.println(phrase);
		}
		sc.close();
		
	}
}
