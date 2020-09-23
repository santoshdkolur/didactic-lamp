#MEDIUM

'''

Given two numbers you are required to check whether they are anagrams of each other or not in binary representation.

Examples:

Input : a = 8, b = 4 
Output : Yes
Binary representations of both
numbers have same 0s and 1s.

Input : a = 4, b = 5
Output : No

'''

#AUTHOR: SANTOSH D KOLUR


def check(bin_a,bin_b):
    if bin_a.count(1)==bin_b.count(1):
        print("True")
    else:
        print("False")


def binary(a,b):
    i=0
    while(2**i<=a):
        i+=1
    bin_a=[0 for ele in range(i)]
    a_copy=a
    for c in range(i):
        if 2**(len(bin_a)-1-c) <= a_copy:
            a_copy-=2**(len(bin_a)-1-c)
            bin_a[c]=1
        if(a_copy==0):
            break
    
    bin_b=[0 for ele in range(i)]
    b_copy=b
    for c in range(i):
        if 2**(len(bin_b)-1-c) <= b_copy:
            b_copy-=2**(len(bin_b)-1-c)
            bin_b[c]=1
        if(b_copy==0):
            break

    check(bin_a,bin_b)
    


if __name__ == '__main__':
    a=int(input())
    b=int(input())
    a,b=max(a,b),min(a,b)
    binary(a,b)

