/*
 * Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).

Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.

Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  

Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 
Input:
 each  case contains two space separated integers X and Y, denoting the size of the two sorted arrays. 
 Second line of each test case contains X space separated integers, 
 denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.

Output:
For each case, print (X + Y) space separated integer representing the merged array.

Constraints:

1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109

Example:
Input:
4 5
1 3 5 7
0 2 6 8 9


Output:
0 1 2 3 5 6 7 8 9
 */
import java.util.Arrays;
import java.util.Scanner;

public class inplaceMerger {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
	
		System.out.println();
		int n = 0;
		int m = 0;
		int[] p = null;
		int[] q = null;
		inplaceMerger im=new inplaceMerger();
		
			 n=sc.nextInt();
			 m=sc.nextInt();
			 p=new int[n];
			 q=new int[m];
			 im.input(n,m,p,q);
			 
		sc.close();
	}

	private void input(int n, int m, int[] p, int[] q) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			p[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++)
			q[i]=sc.nextInt();
		
		merge(n,m,p,q);
	}

	private void merge(int n, int m, int[] p, int[] q) {
		// TODO Auto-generated method stub
	    int i,j,temp;
        for(i=q.length - 1;i>=0;i--){
            temp =p[p.length-1];
            for(j=p.length-2; j>=0 && q[i] < p[j];j--){
                p[j+1] = p[j];
            }
 
            if(j!=p.length-2 || temp > q[i]){
                p[j+1] = q[i];
                q[i] = temp;
            }
        }
		for(i=0;i<p.length;i++)
			System.out.print(p[i]+" ");
		for(i=0;i<q.length;i++)
			System.out.print(q[i]+" ");
	}
	
	
}
