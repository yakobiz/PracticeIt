package parameters;

import java.util.Scanner;

public class TheNameGame {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Podaj imię i nazwisko \n");
		String name = scan.nextLine();

		String[] sname = name.split(" ");

		theNameGame(sname);
		scan.close();
	}

	public static String theNameGame(String[] str) {

		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " " + str[i] + ", bo-"
					+ str[i].replace(str[i].charAt(0), 'B'));
			System.out.println("Banana-fana fo-" + str[i]);
			System.out.println("Fee-fi-mo-"
					+ str[i].replace(str[i].charAt(0), 'M'));
			System.out.println(str[i].toUpperCase() + "!");

		}
		return null;
	}

}
// System.out.println(name);
// for (String sname: name.split(" ")) {
// System.out.println(sname);
// }