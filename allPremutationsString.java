/*
Write a program to print all the permutations of a given string without any inbuilt functions.
(Like no importing additional libraries)
 */

//Author: Nisarg Devdahr
public class allPremutationsString{

	public static void generate(String s,int start,int end) {
		if(start==end-1)
			System.out.println(s);
		else {
			for(int i=start;i<end;i++) {
				s=swap(s,start,i);
				generate(s,start+1,end);
				s=swap(s,start,i);
			}
		}
	}

	private static String swap(String s, int i, int j) {
		// TODO Auto-generated method stub
		char[] b=s.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		
		return String.valueOf(b);
	}
	
	public static void main(String[] args) {
		generate("Nisarg",0,6);
	}
}
