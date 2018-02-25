package variables;

public class CountQuarters {
	public static void main(String[] args) {
		int c = 1278;
		
		countQuarters(c);
	}

	public static void countQuarters(int cents){
		int result = (cents%100)/25;
		System.out.println(result);
				
	}
}
