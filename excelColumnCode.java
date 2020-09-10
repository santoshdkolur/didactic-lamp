/*
 Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...

    Z -> 26
    AA -> 27
    AB -> 28
    ...

Example 1:

Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701
 */

 // Author: Nisarg Devdhar
import java.util.Scanner;

public class excelColumnCode {
	public static void main(String[] args) {
		excelColumnCode ec=new excelColumnCode();
		Scanner sc=new Scanner(System.in);
		System.out.print("Column number:");
		String s=sc.next();

		System.out.println(ec.titleToNumber(s));
	}
	 public int titleToNumber(String s) {
         int result = 0;
         for (char c : s.toCharArray()) {
        	 result = result * 26 + (c - 'A') + 1;
         }
         return result;
	 }
}
