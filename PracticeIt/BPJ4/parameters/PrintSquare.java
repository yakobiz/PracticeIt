package parameters;

//import java.util.Scanner;

public class PrintSquare {
	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("podaj 2 liczby całkowite");
		// String line = sc.nextLine();
		// String sline[] = new String[2];
		// String[] sLine = line.split(" ");
		//
		//
		// int numSc = max(sLine[0], sLine[1]);
		//
		// int numSc2= min(sLine[0], sLine[1];
		// printSquare(numSc,numSc2);
		// sc.close();

//		int min = 4;
//		int max = 8;
		printSquare(4,8);

	}

	public static void printSquare(int min, int max) {
		for (int i = min; i <= max ; i++) {
			for (int j = i; j <= max; j++) {
				System.out.print(j + ", ");
				
			}
			System.out.println("");
		}
	}
}
