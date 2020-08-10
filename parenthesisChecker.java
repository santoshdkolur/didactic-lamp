/*
 * Given an expression string exp. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the program should print 'balanced' for exp = “[()]{}{[()()]()}” and 'not balanced' for exp = “[(])”

Input:
 Each test case consists of a string of expression, in a separate line.

Output:
Print 'balanced' without quotes if the pair of parenthesis is balanced else print 'not balanced' in a separate line.

Constraints:
1 ≤ |s| ≤ 105

Example:
Input:

{([])}
()
([]

Output:
balanced
balanced
not balanced
 */
import java.util.Scanner;
import java.util.Stack;

public class parenthesisChecker {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> c=new Stack<Character>();
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		int flag=0;
		
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(ch=='{' || ch=='[' || ch=='(') {
				c.push(ch);
				continue;
			}
				
			if(s.isEmpty()) {
				flag=1;
				break;
			}
			
			if(ch==')') {
				c.pop();
				if(ch=='}'||ch==']') {
					flag=1;
					break;
				}
			}
			else if(ch=='}') {
				c.pop();
				if(ch==')'||ch==']') {
					flag=1;
					break;
				}
			}
			else if(ch==']') {
				c.pop();
				if(ch=='}'||ch==')') {
					flag=1;
					break;
				}
			}	
		}
		
		if(flag==0)
			System.out.println("balanced");
		else
			System.out.println("Not balanced");
	}

}
