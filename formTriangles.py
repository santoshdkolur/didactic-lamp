'''
From the given inputs find how many number of triangles can be formed. 
Input : N number of slopes of n different lines. 

Note : Slope--> angle formed by the line wrt x axis

Example 1:

Input 
20 -20 0 50 50

Output
7


Example 2:

Input
50 -50 50 -50 50

Output
0


'''

# AUTHOR : SANTOSH D KOLUR

from itertools import combinations
n=int(input())
slopes=[int(ele) for ele in input().split(' ')]
count=0
for ele in combinations(slopes,3):
    if(len(ele)>len(set(ele))):
        continue
    else:
        count=count+1
print(count)
