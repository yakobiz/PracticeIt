package variables;

public class MathExpressions {

	public static void main(String[] args) {
		
		double grade = 2.7;
		Math.round(grade);
		System.out.println("1:" + grade);
		grade = Math.round(grade);
		System.out.println("2:" + grade);
		
		double min = Math.min (grade, Math.floor(2.9));
		System.out.println("floor:" + Math.floor(2.9));
		System.out.println("3:"  + min);
		
		double x = Math.pow(2,4);
		System.out.println("pow:"+ x);
		x = Math.sqrt(64);
		System.out.println("4:"+ x);
		
		int count = 25;
		Math.sqrt(count);
		System.out.println("sqrt:"+Math.sqrt(count));
		count = (int)Math.sqrt(count);
		System.out.println("5:" + count);
		int a = Math.abs(Math.min(-1, -3));
		System.out.println("abs:"+ a);
		
			
	}
}
