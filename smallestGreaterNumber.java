/*
 * Compute the nearest larger number by interchanging its digits updated.
 * Given 2 numbers a and b find the smallest number greater than b by interchanging the digits of a and if not possible print -1.
 * 
 * Sample Input:
 * 459 500
 * Sample Output:
 *   549
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class smalledGreaterNumber {
	static int a;
	static int b;
	
	static ArrayList<Integer[]> s=new ArrayList<Integer[]>();
	static Set<Integer> set=new HashSet<Integer>();
	
	public smalledGreaterNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
		sc.close();
	}
	
	public static void main(String[] args) {
		smalledGreaterNumber s=new smalledGreaterNumber();
		check();
	}

	private static void check() {
		// TODO Auto-generated method stub
		int minimum;
		if(a<b)
			minimum=a;
		else if(b<a)
			minimum=b;
		else
			return;
		Integer[] num = new Integer[3];
		int i=0;
 		while(minimum!=0) {
			int rem=minimum%10;
			num[i++]=rem;
			minimum=minimum/10;
		}
 
 		permute(num,0);
 		
 		for(Integer[] j:s) {
 			Integer n=0;
 			for(int k=0;k<j.length;k++) {
 				n=n+j[k];
 				n=n*10;
 			}
 			set.add(n/10);
 		}
 		
 		Object[] finale=set.toArray();
 		
 		Arrays.sort(finale);
 		
 		for(i=0;i<finale.length;i++) {
 			if((int)finale[i]>b) {
 				System.out.println(finale[i]);
 				break;
 			}
 		}
	}
	
	static void permute(Integer[] a, int k) 
    {
		Integer[] data=new Integer[3];
        if (k == a.length) 
        {
            for (int i = 0; i < a.length; i++) 
            {
                data[i]=a[i];
            }
            s.add(data);
        } 
        else 
        {
            for (int i = k; i < a.length; i++) 
            {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                permute(a, k + 1);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
	
	
}
