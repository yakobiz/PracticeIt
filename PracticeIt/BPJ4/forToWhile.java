
public class forToWhile {

	public static void main(String[] args) {
		//  a.
		System.out.println("a.");
		int max = 1;
		while (max <= 5) {
			System.out.println(max);
			max++;
		}
		System.out.println();

		//  b.
		System.out.println("b.");
		int total = 25;
		int number = 1;
		while (number <= (total / 2)) {
			total = total - number;
			System.out.println(total + " " + number);
			number++;
		}
		System.out.println();

		//  c.
				System.out.println("c.");
				int i = 1;
				
				
				while ( i <= 2 ) { 
					int j = 1;
					while ( j <= 3 ) {
						int k = 1;
						while ( k <= 4 ) {
							System.out.print("*");
							k++;
						}
						System.out.print("!");
						j++;
					}
					System.out.println();
					i++;
				} 
				System.out.println();

		//  d.
		System.out.println("d.");
		int numbeR = 4;
		int counT = 1;
		while ( counT <= numbeR) {
			System.out.println(numbeR);
			numbeR = +numbeR/2;
			 counT++;
		}

	}
}
