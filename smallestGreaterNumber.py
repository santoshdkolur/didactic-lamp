'''
Compute the nearest larger number by interchanging its digits updated.
Given 2 numbers a and b find the smallest number greater than b by interchanging the digits of a and if not possible print -1.

Sample Input:

    459 500

Sample Output:
    549
    
'''

# AUTHOR : SANTOSH D KOLUR


n=input().split(' ')
from itertools import permutations

p=permutations(n[0])
a=[]
for i in list(p):
    a.append(int(''.join(i)))

a.sort()
flag=0
for ele in a:
    if ele>int(n[1]):
        print(ele)
        flag=1 
        break

if(flag==0):
    print('-1')
