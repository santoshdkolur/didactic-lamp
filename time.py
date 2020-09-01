'''
Given an array of 4 digits, return the largest 24 hour time that can be made.

The smallest 24 hour time is 00:00, and the largest is 23:59.  Starting from 00:00, a time is larger if more time has elapsed since midnight.

Return the answer as a string of length 5.  If no valid time can be made, return an empty string.

 

Example 1:

Input: [1,2,3,4]
Output: "23:41"
Example 2:

Input: [5,5,5,5]
Output: "Time cannot be formed"
'''

#AUTHOR: SANTOSH D KOLUR


n=[int(ele) for ele in input().split(' ')]
n.sort()
a=[0,0,0,0]
flag=0
for i in range(2,-1,-1):
    if i in n:
        n.remove(i)
        a[0]=i
        break
    else:
        flag=1
t=3 if a[0]==2 else 9
for i in range(t,-1,-1):
    if i in n:
        n.remove(i)
        a[1]=i
        break
    else:
        flag=1
for i in range(5,-1,-1):
    flag=0
    if i in n:
        n.remove(i)
        a[2]=i
        break
    else:
        flag=1
for i in range(9,-1,-1):
    flag=0
    if i in n:
        n.remove(i)
        a[3]=i
        break
    else:
        flag=1
if(flag==1):
    print("Time cannot be formed\n")
else:
    print(str(a[0])+str(a[1])+" : "+str(a[2])+str(a[3]))
