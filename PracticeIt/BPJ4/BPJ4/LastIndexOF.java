package BPJ4;

public class LastIndexOF {

	public static void main(String[] args) {
		int[]example={74, 85, 102, 99, 101, 85, 56};
		System.out.println(lastIndexOf(example,5));
	}
	public static int lastIndexOf(int[] a, int target) {
		int result = -1;
			for (int i =0; i<a.length; i++){
				if(a[i]==target){
					result = i;
				} 
			}
			return result;
	}
}
