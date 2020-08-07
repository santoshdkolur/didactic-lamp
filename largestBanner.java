/*
 * An organizer has to buy the largest rectangular banner, there are n number of houses and n different heights for the houses
 * You'll have to display the largest possible area of the banner that can be put.
Assume the buildings are of unit width and there is no space between the buildings
Input: 
5
3,4,4,5,6
Output:
Maximum area of the banner is 16 
Explaination:
Consecutive buldings with maximum possible height is 4 and 4 houses (4,4,5,6)
Since they are of unit length, total width = 4
Max area = 4 * 4 ==> 16sq units
The heights of the houses could be 3, 4, 1, 5, 2 or in any order.
 */
import java.util.Scanner;

public class largestBanner {
	int n;
	public static int[] height;
	
	public largestBanner() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of houses");
		n=sc.nextInt();
		height=new int[n];
		System.out.println("Enter the heights of the building");
		for(int i=0;i<n;i++)
			height[i]=sc.nextInt();
		
		sc.close();
	}
	
	public static void main(String[] args) {
		largestBanner lb=new largestBanner();
		lb.bannerSize();
	}
	
	int sizes;
	public void bannerSize() {
		//int sizes;
		int maxSize=0;
		for(int i=0;i<n;i++) {
			sizes=0;
			for(int j=i;j<n;j++) {
				if(height[i]<=height[j]) {
					sizes=sizes+height[i];
				}
				if(maxSize<sizes) {
					maxSize=sizes;
				}
			}
		}
		System.out.println(maxSize);
	}

}
