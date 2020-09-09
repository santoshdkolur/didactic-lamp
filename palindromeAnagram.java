
/*
 * We have given a anagram string and we have to check whether it can be made palindrome o not.
 * Examples:

Input : geeksforgeeks 
Output : No
There is no palindrome anagram of 
given string

Input  : geeksgeeks
Output : Yes
There are palindrome anagrams of
given string. For example kgeeseegk
 */

// Author: Nisarg Devdhar
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class palindromeAnagram {
	static HashMap<Character,Integer> map=new HashMap<>();
	public static void main(String[] args) {
		System.out.print("String=");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		//char[] ch=s.toCharArray();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		Collection<Integer> n=map.values();
		
		int odd=0;
		
		for(Integer i: n) {
			if(i%2!=0)
				odd++;
		}
		
		if(odd>1) {
			System.out.println("false");
			return;
		}
		
		System.out.println("True");
		
	}
}
