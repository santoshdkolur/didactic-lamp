'''

We have given a anagram string and we have to check whether it can be made palindrome o not.

Examples:

Input : abcd 
Output : False

Explaination: 
There is no palindrome anagram of 
given string

Input  : geeksgeeks
Output : Yes

Explaination:
There are palindrome anagrams of
given string. For example kgeeseegk
'''

#AUTHOR: SANTOSH D KOLUR




def anagram(n):
    d={c:0 for c in set(list(n))}

    for ele in list(n):
        d[ele]+=1
    occr=list(d.values())
    even_occr=0
    for ele in occr:
        if ele%2==0:
            even_occr+=1
    if(even_occr>=len(occr)-1 and occr.count(1)<=1):
        print("True")
    else:
        print("False")

if __name__== '__main__':
    n=input()
    anagram(n)
