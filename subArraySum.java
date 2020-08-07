/*
 * Largest Sum Contiguous Subarray
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.
Consider the input: -2 -3 4 -1 -2 1 5 -3
Here the largest contiguous(consecutive elements) sum possible is 7
Combination  : 4 -1 -2 1 5
 */
public class subArraySum {
	public static void main(String[] args) {
		int[] a= {-2,-3,4,-1,-2,1,5,-3};
		checkSubArray(a);
	}
	
	public static void checkSubArray(int[] arr) { 
		int sum,x=0,y=0;
		int maxSum=0;
		for(int i=0;i<arr.length;i++) {
			sum=0;
			for(int j=i;j<arr.length;j++) {
				sum=sum+arr[j];
				if(maxSum<sum) {
					maxSum=sum;
					x=i;
					y=j;
				}
			}
		}
		
		for(int i=x;i<=y;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
