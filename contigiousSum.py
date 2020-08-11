'''
Largest Sum Contiguous Subarray
Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum.

Consider the input: -2 -3 4 -1 -2 1 5 -3
Here the largest contiguous(consecutive elements) sum possible is 7
Combination  : 4 -1 -2 1 5

'''

# AUTHOR : SANTOSH D KOLUR

n=[int(ele) for ele in input().split(' ')]
i=1
max_till_now=0
a=[]
def contigiousSum(n,i):
    global max_till_now
    global a
    if(i<len(n)):
        for j in range(0,len(n)+1):
            if(j+i<len(n)):
                s=sum(n[j:j+i])
                if(s>max_till_now):
                    max_till_now=s
                    a=n[j:j+i]
            
        contigiousSum(n,i+1)

contigiousSum(n,i)

print("Max=",max_till_now)
print("Combination=",a)
