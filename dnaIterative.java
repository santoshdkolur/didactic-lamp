/*
Structure of DNA
*/

import java.util.Scanner;

public class dnaIterative {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		int n=sc.nextInt();
		sc.close();
		printDna(n);
	}

	private static void printDna(int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++) {
			if(i%2==0)
				printUp(n);
			else
				printDown(n);
		}
	}

	private static void printDown(int n) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 4; i++) {
		        for (int j = 4 - i; j >= 1; j--)
		            System.out.print(" ");
		        System.out.print("*");
		        for (int j = 1; j < i; j++)
		            System.out.print("--");
		        System.out.println("*");
		    }
	}

	private static void printUp(int n) {
		// TODO Auto-generated method stub
		 for (int i = 1; i <= 4; i++) {
			 for (int j = 1; j < i; j++)
		            System.out.print(" ");
		        System.out.print("*");
		        for (int j = 4 - i; j >= 1; j--)
		            System.out.print("--");
		        System.out.println("*");
		    }
	}
}
