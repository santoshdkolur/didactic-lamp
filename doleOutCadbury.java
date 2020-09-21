/*
Dole Out Cadbury
Problem Description
You are a teacher in reputed school. During Celebration Day you were assigned a task
to distribute Cadbury such that maximum children get the chocolate. You have a box
full of Cadbury with different width and height. You can only distribute largest square
shape Cadbury. So if you have a Cadbury of length 10 and width 5, then you need to
break Cadbury in 5X5 square and distribute to first child and then remaining 5X5 to
next in queue
Constraints
0<P<Q<1501
0<R<S<1501
Input Format
First line contains an integer P that denotes minimum length of Cadbury in the box
Second line contains an integer Q that denotes maximum length of Cadbury in the box
Third line contains an integer R that denotes minimum width of Cadbury in the box
Fourth line contains an integer S that denotes maximum width of Cadbury in the box
Output
Print total number of children who will get chocolate.
Test Case
Explanation
Example 1
Input
5
7
3
4
Output
24
Explanation
Length is in between 5 to 7 and width is in between 3 to 4.
So we have 5X3,5X4,6X3,6X4,7X3,7X4 type of Cadbury in the box.
If we take 5X3 :
First, we can give 3X3 square Cadbury to 1st child .Then we are left with 3X2. Now
largest square is 2X2 which will be given to next child. Next, we are left with two 1X1
part of Cadbury which will be given to another child.
And so on
 */

//Author : Nisarg Devdhar
import java.util.Scanner;

public class doleOutCadbury {
	
	static int minlen;
	static int maxlen;
	static int minwid;
	static int maxwid;
	static int child;
	
	public doleOutCadbury() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter");
		minlen=sc.nextInt();
		maxlen=sc.nextInt();
		minwid=sc.nextInt();
		maxwid=sc.nextInt();
		
		sc.close();
		child=0;
	}
	
	public void available(int len, int breadth) {
		if(len==breadth) {
			child++;
		}
		else if(len>breadth) {
			child++;
			available(len-breadth,breadth);
		}
		else if(breadth<len) {
			child++;
			available(len,breadth-len);
		}
		else {
			child+=(len==1)?breadth:len;
		}
	}

	public static void main(String[] args) {
		doleOutCadbury c=new doleOutCadbury();
		//c.available(5,4);
		for(int i=minlen;i<=maxlen;i++)
			for(int j=minwid;j<=maxwid;j++)
				c.available(i, j);
		System.out.println(child);
	}
}
