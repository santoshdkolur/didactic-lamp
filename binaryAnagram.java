//MEDIUM

/*
 * Given two numbers you are required to check whether they are anagrams of each other or not in binary representation.

Examples:

Input : a = 8, b = 4 
Output : Yes
Binary representations of both
numbers have same 0s and 1s.

Input : a = 4, b = 5
Output : No
 */

//Author: Nisarg Devdhar
import java.util.Scanner;

public class binaryAnagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		if(Integer.bitCount(n)==Integer.bitCount(m))
			System.out.println("True");
		else
			System.out.println("False");
		
		sc.close();
		
	}
}
