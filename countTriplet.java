/*
 You are given an array and you need to find number of tripets of indices at those indices are in geometric progression for a given common ratio
For example, . If , we have and .
Function Description
such that the elements and .
  Complete the countTriplets function in the editor below. It should return the number of triplets forming a geometric progression for a given as an integer.
countTriplets has the following parameter(s): arr: an array of integers
r: an integer, the common ratio
Input Format
The first line contains two space-separated integers
The next line contains space-seperated integers .
Constraints
Output Format
Return the count of triplets that form a geometric progression.
Sample Input 0
42 1224
Sample Output 0
2
Explanation 0
There are triplets in satisfying our criteria, whose indices are
Sample Input 1
63
1 3 9 9 27 81
Sample Output 1
and , the size of
and the common ratio.
at indices
and
  and
  6
Explanation 1
The triplets satisfying are index
Sample Input 2
55
1 5 5 25 125
Sample Output 2
4
Explanation 2
The triplets satisfying are index
, ,
, ,
and .
  
 */

// AUTHOR : Nisarg Devdhar
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countTriplet {

	private static long countTriplets(long[] arr, long r) {
		Map<Long, Long> leftMap = new HashMap<>();
		Map<Long, Long> rightMap = new HashMap<>();

		for (long item : arr) {
			rightMap.put(item, rightMap.getOrDefault(item, 0L) + 1);
		}

		long count = 0;

		for (int i = 0; i < arr.length; i++) {
			long midTerm = arr[i];
			long c1 = 0, c3 = 0;

			rightMap.put(midTerm, rightMap.getOrDefault(midTerm, 0L) - 1);

			if (leftMap.containsKey(midTerm / r) && midTerm % r == 0) {
				c1 = leftMap.get(midTerm / r);
			}

			if (rightMap.containsKey(midTerm * r))
				c3 = rightMap.get(midTerm * r);

			count += c1 * c3;

			leftMap.put(midTerm, leftMap.getOrDefault(midTerm, 0L) + 1);

		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		long n=sc.nextLong();
		long r=sc.nextLong();
		long[] arr=new long[(int) n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		
		System.out.println(countTriplets(arr,r));
	}
}
