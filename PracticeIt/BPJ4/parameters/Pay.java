package parameters;

public class Pay {
	public static void main(String[] args) {
		pay(5.50, 6);
		pay(4.00, 11);
	}

	public static double pay(double salary, int hours) {
		double pay = 0;
		int extraHours = hours - 8;
		if (extraHours < 0) {
			pay = salary * hours;
		} else {
			pay = (salary * 8) + (1.5 * salary * extraHours);
		}
		System.out.println(pay);
		return pay;
	}
}
