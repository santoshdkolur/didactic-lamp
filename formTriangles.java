/*
 *From the given inputs find how many number of triangles can be formed. 
Input : N number of slopes of n different lines. 
Note :angle formed by the line wrt x axis
Example 1:
Input 
20 -20 0 50 50
Output
7
Example 2:
Input
50 -50 50 -50 50
Output
0
 
 */

import java.util.Scanner;

public class formTriangles {
	
	public static int n;
	public static int[] angle;
	//ArrayList<ArrayList<Integer>> subAngle=new ArrayList<ArrayList<Integer>>();
	int[] subAngle;
	
	static int count=0;
	
	public static void main(String[] args) {
		formTriangles t=new formTriangles();
		t.noOfTriangles();
		System.out.println(count);
	}
	
	private void noOfTriangles() {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
				    if(angle[i]!=angle[j]&&angle[i]!=angle[k]&&angle[k]!=angle[j])
		                  count++;
				}
			}
		}
	}

	public formTriangles() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		System.out.println("Enter angles of lines");
		angle=new int[n];
		for(int i=0;i<n;i++)
			angle[i]=sc.nextInt();
		
		sc.close();
		
		
	}
	
}
