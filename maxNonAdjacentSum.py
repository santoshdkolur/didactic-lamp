'''

Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5

'''

#AUTHOR: SANTOSH D KOLUR


n=[int(ele) for ele in input().split(' ')]
a=0
_max=0
for a in range(len(n)):
    for i in range(2,len(n)-a,1):
        s=sum(n[a::i])
        if(s>_max):
            _max=s

print(_max)
