import java.util.Scanner;

/*
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB
    ...
Example 1:

Input: 1
Output: "A"
Example 2:

Input: 28
Output: "AB"
Example 3:

Input: 701
Output: "ZY"
 */

 // Author:Nisarg Devdhar
public class revExcelColumnCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Column number");
		int n=sc.nextInt();
		System.out.println(convertToTitle(n));
	}

    public static String convertToTitle(int n) {
        if(n <= 0){
        	throw new IllegalArgumentException("Input is not valid!");
        }

        StringBuilder sb = new StringBuilder();

        while(n > 0){
        	n--;
        	char ch = (char) (n % 26 + 'A');
        	n /= 26;
        	sb.append(ch);
        }

        sb.reverse();
        return sb.toString();
    }
}
