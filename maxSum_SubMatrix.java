import java.util.Scanner;

public class maxSum_SubMatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		
		int[][] arr=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				arr[i][j]=sc.nextInt();
		
		int k=sc.nextInt();
		
		int max=maxSubMatrix(arr,n,k);
		System.out.println(max);
	}

	private static int maxSubMatrix(int[][] arr, int n, int k) {
		// TODO Auto-generated method stub
		int sum=0;
		int max=0;
		int count=0;
		int count2=0;
		while(count+k<=n) {
			for(int i=count;i<k+count;i++) {
				for(int j=count2;j<k+count2;j++) {
					sum+=sum=arr[i][j];
				}
			}
			if(sum>max)
				max=sum;
			sum=0;
			count++;
		}
		return max;
	}
}
