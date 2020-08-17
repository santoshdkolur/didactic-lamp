/*
 * #Half Pyramid
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5  
#Inverted Half Pyramid
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1
#Hollow Half Pyramid
1
1 2
1   3
1     4
1 2 3 4 5
#Full Pyramid
         1
        1 2
       1 2 3
      1 2 3 4
     1 2 3 4 5
#Hollow Full Pyramid
    1
   1 2
  1   3
 1     4
1 2 3 4 5 
#Hollow Inverted Half Pyramid
1 2 3 4 5
2     5
3   5
4 5
5
 */
import java.util.Scanner;

public class pyramidPatterns {

	public static void main(String[] args) {
		System.out.println("hoose an option to print the pattern \n1. Half Pyramind\n"
				+ "2. Inverted Half Pyramid\n3. Hollow Half Pyramid\n4. Full Pyramid\n"
				+ "5. Hollow Full Pyramid\n6. Hollow Inverted half pyramid\n\nEnter your choice: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		
		if(n==1)
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		
		if(n==2)
			for(int i=5;i>=1;i--) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
		
		if(n==3)
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=i;j++) {
					if(j==1 || j==i || i==5)
						System.out.print(j+" ");
					else
						System.out.print(" "+" ");	
				}
			System.out.println();
		}
		
		int space=5;
		if(n==4)
			for(int i=1;i<=5;i++) {
				int p=1;
				for(int j=1;j<=5;j++) {
					if(j>=space)
						System.out.print(p++ +" ");
					else
						System.out.print(" ");
				}
				space--;
				System.out.println();
			}
		
		
		if(n==5)
			for(int i = 1; i <= 5; i++){
				for(int j = i; j < 5; j++){
					System.out.print(" ");
				}
				for(int j = 1; j <= i; j++){
					if(j == 1 || i == 5){
						System.out.print(j + " ");
					}
					else{
						System.out.print(" ");
					}
				}
				for(int j = 1; j < i; j++){
					if(j == i-1 && j < 5-1){
						System.out.print(j+1+" ");
					}
					else{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		
		if(n==6)
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j==1 || i==j || i==5)
					System.out.print(j+" ");
				else 
					System.out.print(" "+" ");
			}
			System.out.println();
		}
		

	}
}
