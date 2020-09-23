//MEDIUM
/*
 Anagram numbers
 
Two numbers are said to be anagrams of each other. If the digits of one can be re-arranged to form the other number. In other words, two numbers are said to be anagrams of each other, if they contain exactly the same set of digits.
For example, 121 and 211 are anagrams of each other
5692, 9526
3426,6423, 6432,2346, 4326 are anagrams of each other
Are anagrams_find sun:
Given 2 numbers , you are expecteddd to find whether the numbers are anagrams of each other (ie whether they contain exactly the same set of digits)
If both the numbers are anagrams of each other, return the sum of the digits that are same across the two given numbers.
If both the numbers are NOT anagrams of each other, return the sum of the digits that are different across the two given numbers.
Case 1
Input 1 = 12321    input 2 =32112             
Output
Anagrams!
Output 1+2+3 =6
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Anagram {

	public int n1;
	public int n2;
	HashMap<Integer, Integer> set1=new HashMap<Integer,Integer>();
	//HashMap<Integer, Integer> set2=new HashMap<Integer,Integer>();
	public Object[] temp1;
	public Object[] temp2;
	public static int sum;
	public static int sum1;
	public static int count;
	public static int size;
	
	public Anagram() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		sc.close();
	}
	
	public int sizecheck() {
		int i=0;
		int n=n1;
		while(n>0) {
			//int rem=n%10;
			i++;
			n=n/10;
		}
		n=n2;
		int j=0;
		while(n>0) {
			j++;
			n=n/10;
		}
		
		if(i==j) {
			return (size=i);
		}
		else
			return 0;
		
	}
	
	public void anagramCheck() {
		if(size>0) {
			while(n1>0) {
				//int key=0;
				int rem1=n1%10;
				set1.put(rem1,set1.getOrDefault(rem1,0)+1);
				n1=n1/10;
			}
			while(n2>0) {
				int rem=n2%10;
				int key;
				if(set1.get(rem)==null) {
					set1.put(rem,set1.getOrDefault(rem,0)+1);
				}
				else {
					key=set1.get(rem);
					set1.put(rem,key-1);
				}
				n2=n2/10;
			}
			for(Entry<Integer, Integer> i:set1.entrySet()) {
				if(i.getValue()==0) {
					count++;
					sum=sum+i.getKey();
				}
				else
					sum1=sum1+i.getKey();	
			}
			if(set1.size()==count) {
				
				System.out.println("Anagram"+sum);
			}
			else
				System.out.println(sum1);
		}
		else
			System.out.println("Can't form anagram");	
	}
	public static void main(String[] args) {
		Anagram a=new Anagram();
		a.sizecheck();
		a.anagramCheck();
	}
}
