/*
 * Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing. Example {1,2,4,5,6,7,8,9,10} --> 3. Array may be unsorted
 */
public class MissingNumber {
	public static void main(String[] args) {
		int n[]= {1,2,3,5,6,7,8,9,10};
		check(n,n.length);
	}

	private static void check(int n[],int length) {
		// TODO Auto-generated method stub
		int total=(length+1)*(length+2)/2;
		for(int i=0;i<length;i++)
			total=total-n[i];
		
		System.out.println(total);
	}
}
