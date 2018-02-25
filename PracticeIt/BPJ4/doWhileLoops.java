
public class doWhileLoops {
	public static void main (String[] args){
		System.out.print(zeroDigits(3555506)); 
		
	}
		static int zeroDigits(int number) {
			int count = 0;

			char[] tab = Integer.toString(number).toCharArray();
		    int i = 0;
		   
		    while (i<tab.length){
		     	
		     	if (tab[i]=='0'){
		     		count++;
		    }
		     	i++;
		    }
		    
		    return count;
		}
	
}
