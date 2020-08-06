'''
Anagram numbers
Two numbers are said to be anagrams of each other. If the digits of one can be re-arranged to form the other number. In other words, two numbers are said to be anagrams of each other, if they contain exactly the same set of digits.
For example, 121 and 211 are anagrams of each other
5692, 9526

3426,6423, 6432,2346, 4326 are anagrams of each other

Are anagrams_find sun:
Given 2 numbers , you are expecteddd to find whether the numbers are anagrams of each other (ie whether they contain exactly the same set of digits)

If both the numbers are anagrams of each other, return the sum of the digits that are same across the two given numbers.

If both the numbers are NOT anagrams of each other, return the sum of the digits that are different across the two given numbers.

Case 1

Input 1 = 12321    input 2 =32112             
Output
Anagrams!
Output 1+2+3 =6 
'''




n=input().split(' ')
n=[list(ele) for ele in n]
a=[int(ele) for ele in n[0]]
b=[int(ele) for ele in n[1]]
a.sort()
b.sort()
if(a==b):
    print("Anagram!")
    print(sum(set(a)))
else:
    print("Not Anagrams")
