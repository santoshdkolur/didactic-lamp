/*
Input Format
First line contains an integer T denoting the number of test cases.
Next T lines contains an integer N denoting the maximum price of the item present Philaland.


Output Format
For each test case print a single line denoting the minimum number of denominations of coins required.


Constraints
1<=T<=100
1<=N<=5000


Refer the Sample Output Formatting

Sample Input:

      2
     10
      5

Sample Output:

     4
     3

Explanation:

For test case 1, N=10.
According to Manish {$1, $2, $3,… $10} must be distributed.
But as per Manisha only {$1, $2, $3, $4} coins are enough to purchase any item ranging from $1 to $10. Hence minimum is 4. Likewise denominations could also be {$1, $2, $3, $5}. Hence answer is still 4.


For test case 2, N=5.
According to Manish {$1, $2, $3, $4, $5} must be distributed.
But as per Manisha only {$1, $2, $3} coins are enough to purchase any item ranging from $1 to $5. Hence minimum is 3. Likewise denominations could also be {$1, $2, $4}. Hence answer is still 3.
*/
import java.util.Scanner;

public class philalandCoins {
	static int t;
	static int[] coins;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Test cases");
		t=sc.nextInt();
		coins=new int[t];

		System.out.println("max Value");
		for(int i=0;i<t;i++) {
			coins[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<t;i++) {

			findCoins(coins[i]);
		}

	}

	private static void findCoins(int n) {
		// TODO Auto-generated method stub
		System.out.println((int)Math.ceil(Math.log(n)+1));
	}
}
