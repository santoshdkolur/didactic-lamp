'''
Given two sorted arrays arr1[] and arr2[] in non-decreasing order with size n and m. The task is to merge the two sorted arrays into one sorted array (in non-decreasing order).
Note: Expected time complexity is O((n+m) log(n+m)). DO NOT use extra space.  We need to modify existing arrays as following.
Input: arr1[] = {10};
       arr2[] = {2, 3};
Output: arr1[] = {2}
        arr2[] = {3, 10}  
Input: arr1[] = {1, 5, 9, 10, 15, 20};
       arr2[] = {2, 3, 8, 13};
Output: arr1[] = {1, 2, 3, 5, 8, 9}
        arr2[] = {10, 13, 15, 20} 
Input:
 each  case contains two space separated integers X and Y, denoting the size of the two sorted arrays. 
 Second line of each test case contains X space separated integers, 
 denoting the first sorted array P. Third line of each test case contains Y space separated integers, denoting the second array Q.
Output:
For each case, print (X + Y) space separated integer representing the merged array.
Constraints:
1 <= X, Y <= 5*104
0 <= arr1i, arr2i <= 109
Example:
Input:
4 5
1 3 5 7
0 2 6 8 9
Output:
0 1 2 3 5 6 7 8 9

'''

a=[int(ele) for ele in input().split(' ')]
b=[int(ele) for ele in input().split(' ')]
a.sort()
b.sort()
c=[]
counta=0
countb=0

for i in range(len(a)+len(b)-1):
    if(counta==len(a)):
        while(countb!=len(b)):
            c.append(b[countb])
            countb+=1
        break
    elif(countb==len(b)):
        while(counta!=len(a)):
            c.append(a[counta])
            counta+=1 
        break
    else:
        if(a[counta]<=b[countb]):
            c.append(a[counta])
            counta+=1 
        else:
            c.append(b[countb])
            countb+=1
    
for ele in c:
    print(ele,end='\t')
