package variables;
import java.util.Scanner;

public class PromptMultiplyBy2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Type an integer: ");
	int var = sc.nextInt();
	MultiplyBy2(var);
	sc.close();
}
public static int MultiplyBy2(int a){
	int result = 2*a; 
	System.out.println(a +" times 2 = "+result);
	return result;
}
}
