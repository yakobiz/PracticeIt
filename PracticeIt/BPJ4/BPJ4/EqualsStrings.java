import java.util.Arrays;

public class equalsStrings {
public static void main (String[] args){
	String[]listA={"a","b","a","c","a","d","a","e","a"}; 
	String[]listB={"x","b","a","c","a","d","a","e","a"};
	
	System.out.println(equals(listA, listB));
	
}

	static boolean equals(String[] list1, String[] list2) {
		boolean result;
		if ((list1.length == list2.length)&&(Arrays.equals(list1, list2))) {
			result = true;
			} else {
			result = false;
			}
	
		return result;
	}
}
