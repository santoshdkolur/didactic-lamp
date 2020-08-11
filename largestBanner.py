''' 
An organizer has to buy the largest rectangular banner, there are n number of houses and n different heights for the houses
You'll have to display the largest possible area of the banner that can be put.
Assume the buildings are of unit width and there is no space between the buildings

Input: 
5
3,4,4,5,6

Output:
Maximum area of the banner is 16 

Explaination:
Consecutive buldings with maximum possible height is 4 and 4 houses (4,4,5,6)
Since they are of unit length, total width = 4
Max area = 4 * 4 ==> 16sq units

The heights of the houses could be 3, 4, 1, 5, 2 or in any order.
'''

# AUTHOR : SANTOSH D KOLUR

n=int(input())
h=[int(ele) for ele in input().split(' ')]

h.sort()
m=[]
for i in range(0,len(h)):
    m.append(h[i]*(len(h)-i))

print("Maximum area of the banner is ",max(m))
