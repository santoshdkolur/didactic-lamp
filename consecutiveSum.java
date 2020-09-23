//MEDIUM

/*
 * How many ways can a sum of consecutive numbers be expressed to represent a number N
    For ex: Say N is 10, then we can get n by '1+2+3+4' and no other combination. Hence the output should be 1
 */
public class consecutiveSum {
	public static void main(String[] args) {
		int n=35;
		int sum;
		for(int i=1;i<=Math.ceil(n/2)+1;i++) {
			sum=0;
			for(int j=i;j<=Math.ceil(n/2)+1;j++) {
				sum=sum+j;
				if(sum==n)
					printconsecutive(i,j);
			}
		}
	}

	private static void printconsecutive(int i, int j) {
		// TODO Auto-generated method stub
		for(int x=i;x<j;x++) {
			System.out.print(x+"+");
		}
		System.out.println(j);
	}
}
