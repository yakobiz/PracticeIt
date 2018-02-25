package variables;

public class StringExpressions {
public static void main(String[] args) {
	String str1 = "Frodo Baggins";
	String str2 = "Gandalf the GRAY";

	
	 System.out.println("1:"+str1.length());
	 System.out.println("2:"+str1.charAt(7));	
	 System.out.println("3:"+str2.charAt(0));
	 System.out.println("4:"+str1.indexOf("x"));
	 System.out.println("5:" +str2.toUpperCase());
	 System.out.println("6:" +str1.toLowerCase().indexOf("B"));
	 System.out.println("7:" +str1.substring(4));
	 System.out.println("8:" +str2.substring(3, 14));
	 System.out.println("9:" +str2.replace("a", "oo"));
	 System.out.println("10:" +str2.replace("gray", "white"));
	 System.out.println("11:"+"str1".replace("r", "range"));
}
}
