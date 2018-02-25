import java.util.Scanner;

public class Spending {

	public static void main(String[] args) {
		spending( null, "John");
		spending( null, "Jane");
		
		
	}

	public static void spending(Scanner console, String name) {
		console = new Scanner(System.in);
		System.out.print("How much will " + name + " be spending? ");
		double amount = console.nextDouble();

		System.out.println();

		int numBills = (int) (amount / 20.0);
		if ((numBills * 20.0) < amount) {
			numBills++;
		}
		
		if (name.equals("John")) {
			int numBills1 = numBills;
			
		}
		else if (name.equals("Jane")) {
			int numBills2 = numBills;
			
		}
		System.out.println("John needs " + numBills1 + " bills.");
		System.out.println("Jane needs " + numBills2 + " bills.");

		console.close();
	}
}