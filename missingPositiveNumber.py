'''
Given an array of integers, find the first missing positive integer in linear time and constant space. 
In other words, find the lowest positive integer that does not exist in the array. 
The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
'''

#AUTHOR : SANTOSH D KOLUR


n=[int(ele) for ele in input().split(' ')]
l=len(n)
n=[ele for ele in n if ele>0]
m=min(n)
for i in range(m,m+l):
    if i not in n:
        print(i)
        break
