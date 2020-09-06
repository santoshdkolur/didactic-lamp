'''

A string S of lowercase English letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

 

Example 1:

Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
Explanation:
The partition is "ababcbaca", "defegde", "hijhklij".
This is a partition so that each letter appears in at most one part.
A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.

'''

#Author: SANTOSH D KOLUR


n=input()
p=[]
i=0
while(i<len(n)):
    a=n[i]
    j=len(n)-n[::-1].index(a)-1
    s=n[i:j+1]
    k=1
    while(k<len(s)):
        if (len(n)-n[::-1].index(s[k])-1) > j:
            j=len(n)-n[::-1].index(s[k])-1
            s=n[i:j+1]
        k=k+1
    i=j
    i=i+1
    p.append(s)

print(' '.join(p))
            


