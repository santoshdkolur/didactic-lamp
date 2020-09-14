'''
Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list. 

If there is more than one possible reconstruction, return any of them.

If there is no possible reconstruction, then return null.

For example, given the set of words 'quick', 'brown', 'the', 'fox', and the string "thequickbrownfox", 
you should return ['the', 'quick', 'brown', 'fox'].

Given the set of words 'bed', 'bath', 'bedbath', 'and', 'beyond', and the string "bedbathandbeyond", 
return either ['bed', 'bath', 'and', 'beyond] or ['bedbath', 'and', 'beyond'].

'''

#AUTHOR : SANTOSH D KOLUR


def compute(n,s):
    r_s=[]
    flag=0
    while(len(s)!=0):
        a=len(s)
        for i in range(len(s)):
            if(s[0:i+1] in n):
                r_s.append(s[0:i+1])
                s=s[i+1:]
                break
        if(a==len(s)):
            flag=1
            break

    if(flag==1):
        print("False")
    else:
        print(r_s)

if __name__ == "__main__":
    n=input().split(' ')
    s=input()
    compute(n,s)
