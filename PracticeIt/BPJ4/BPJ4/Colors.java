package BPJ4;

import java.util.Scanner;

public class Colors {

	public static void main(String[] args) {

		metod();

	}

	public static void metod() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Podaj literę koloru r-red, g-gren, b-blue..");
		String ch = sc.next();
		if (ch.equalsIgnoreCase("b")) {
			System.out.println("You have chosen blue.");
			sc.close();
		} else if (ch.equalsIgnoreCase("r")) {
			System.out.println("You have chosen red.");
			sc.close();
		} else if (ch.equalsIgnoreCase("g")) {
			System.out.println("You have chosen green.");
			sc.close();
		} else {
			System.out.println("Unknown color: " + ch+"\n Wybierz kolor raz jeszcze..");
			metod();
		}
		
	}
}
