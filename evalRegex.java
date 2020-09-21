/*
 
Implement regular expression matching with the following special characters:

. (period) which matches any single character
//* (asterisk) which matches zero or more of the preceding element
That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.

Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.
 */

// Author: Nisarg Devdhar

import java.util.Scanner;


public class evalRegex {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		String s=sc.next();
		String p=sc.next();
		
		System.out.println(isMatch(s,p));
	}
	
	
	public static boolean isMatch(String s, String p) {
		// base case
		if (p.length() == 0) {
			return s.length() == 0;
		}
	 
		// special case
		if (p.length() == 1) {
	 
			// if the length of s is 0, return false
			if (s.length() < 1) {
				return false;
			}
	 
			//if the first does not match, return false
			else if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
				return false;
			}
	 
			// otherwise, compare the rest of the string of s and p.
			else {
				return isMatch(s.substring(1), p.substring(1));
			}
		}
	 
		// case 1: when the second char of p is not '*'
		if (p.charAt(1) != '*') {
			if (s.length() < 1) {
				return false;
			}
			if ((p.charAt(0) != s.charAt(0)) && (p.charAt(0) != '.')) {
				return false;
			} else {
				return isMatch(s.substring(1), p.substring(1));
			}
		}
	 
		// case 2: when the second char of p is '*'.
		else {
			//a char & '*' can stand for 0 element
			if (isMatch(s, p.substring(2))) {
				return true;
			}
	 
			//a char & '*' can stand for 1 or more preceding element, 
			int i = 0;
			while (i<s.length() && (s.charAt(i)==p.charAt(0) || p.charAt(0)=='.')){
				if (isMatch(s.substring(i + 1), p.substring(2))) {
					return true;
				}
				i++;
			}
			return false;
		}
	}
}
