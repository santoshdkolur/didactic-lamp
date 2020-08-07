'''
Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number.
Assume you have 9 numbers between 1 to 10 and only one number is missing. Example {1,2,4,5,6,7,8,9,10} --> 3. 
Array may be unsorted

'''

n=[int(ele) for ele in input().split(' ')]
d=n[1]-n[0]
s=((len(n)+1)/2)*(2*n[0]+(len(n)+1-1)*d)   #Sum of an arithmetic progression

for ele in n:
    s=s-ele
print(int(s))
