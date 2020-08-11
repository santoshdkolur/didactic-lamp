'''How many ways can a sum of consecutive numbers be expressed to represent a number N
    For ex: Say N is 10, then we can get n by '1+2+3+4' and no other combination. Hence the output should be 1'''

# AUTHOR : SANTOSH D KOLUR


from math import ceil
n=int(input())
count=0
for i in range(1,ceil(n/2)+1):
    s=0
    for j in range(i,ceil(n/2)+1):
        s=s+j 
        if s==n:
            for x in range(i,j+1):
                print(x,end=' ')
                
            print('')
            count+=1 
            break
print(count)
