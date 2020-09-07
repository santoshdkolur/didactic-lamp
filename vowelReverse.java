/*
 * Program that takes input as a String and reverse only the vowels of the String.
 * For Example:
 * input: Mango
 * output: Monga
 */

 //Author: Nisarg S Devdhar
import java.util.ArrayList;
import java.util.Scanner;

public class vowelReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("String =");
		String s=sc.next();
		String result=reverse(s.toCharArray());
		sc.close();
		System.out.println(result);
	}

	private static String reverse(char[] charArray) {
		// TODO Auto-generated method stub
		ArrayList<Character> vowels=new ArrayList<Character>();
		vowels.add('a');vowels.add('e');vowels.add('i');vowels.add('o');vowels.add('u');
		int i=0;
		int j=charArray.length-1;

		while(i<=j) {
			if(!vowels.contains(charArray[i])) {
				i++;
				continue;
			}

			if(!vowels.contains(charArray[j])) {
				j--;
				continue;
			}

			char temp=charArray[i];
			charArray[i]=charArray[j];
			charArray[j]=temp;

			i++;
			j--;
		}
		return new String(charArray);
	}

}
