/*
 Anagrams are words or phrases you spell by rearranging the letters of another word or phrase. For instance, fans of the Harry Potter series know that Lord Voldemort’s full name is actually an anagram of his birth name, 
 and some people even play games challenging one another to make anagrams still relevant to the original term.
 For example, "schoolmaster" can be turned into "the classroom", "punishments" becomes "nine thumps", and "debit card" turns into "bad credit".
 The only rule is that all the letters from the original word or phrase must be used when they’re reordered to say something entirely different.
 */


//Author:Nisarg Devdhar


import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class anagramString {
	public static HashMap<Character,Integer> map=new HashMap<Character,Integer>();

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String s=sc.nextLine();
		String s1=sc.nextLine();

		anagramString a=new anagramString();
		boolean b= a.checkAnagram(s,s1);
		System.out.println(b);
		sc.close();
	}

	private boolean checkAnagram(String s, String s1) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			char  ch=s.charAt(i);
			if(ch==' ')
				continue;
			map.put(ch,map.getOrDefault(ch,0)+1);
		}

		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);

			if(ch==' ')
				continue;
			int key;
			if(map.get(ch)==null) {
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
			else {
				key=map.get(ch);
				map.put(ch,key-1);
			}
		}

		boolean flag=true;
		Collection<Integer> v=map.values();

		for(Integer i:v) {
			if(i!=0)
				flag=false;
		}

		return flag;
	}
}
