
public class forToWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
