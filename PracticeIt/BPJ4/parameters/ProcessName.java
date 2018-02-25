package parameters;

import java.util.Scanner;
public class ProcessName {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	processName(sc);
	
}
	
	public static void processName(Scanner input){
		System.out.print("Please enter your full name: ");
		String name = input.nextLine();
		String [] parts = new String [2];
		parts = name.split(" ");
		String firstName = parts[0];
		String surName = parts[1];
		String revSurName = new StringBuffer(surName).reverse().toString();
		String revFirstName = new StringBuffer(firstName).reverse().toString();
		System.out.println("Your name in reverse order is "+revSurName+", "+ revFirstName);
	}

}
