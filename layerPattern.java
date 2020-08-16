/*
 * Print concentric circles
 * 
 * input 
 * n=4
 * 
 * Output:
 * 4444444
 * 4333334
 * 4322234
 * 4321234
 * 4322234
 * 4333334
 * 4444444
 */

// Author: Nisarg Devdhar
import java.util.Scanner;

public class layerPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		sc.close();
		
		int size=2*n-1;

		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(Math.max(Math.abs(i-size/2),Math.abs(j-size/2))+1);
			}
			System.out.println();
		}
	}
}
