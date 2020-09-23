'''
Write a program to print all the permutations of a given string without any inbuilt functions. (Like no importing additional libraries)

Example:
Input:
abc

Output:
'abc', 'acb', 'bac', 'bca', 'cab', 'cba'
'''

#Author: SANTOSH D KOLUR

l=[]
st=list(input())

def perm(s,temp):
    if(len(s)==0):
        l.append(temp)
        return
    for i in range(len(s)):
        t=s.copy()
        ele=s.pop(i)
        perm(s,temp+ele)
        s=t.copy()

perm(st.copy(),'')
print(l)

