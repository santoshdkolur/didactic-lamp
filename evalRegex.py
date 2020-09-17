'''

Implement regular expression matching with the following special characters:  

. (period) which matches any single character  
* (asterisk) which matches zero or more of the preceding element  
That is, implement a function that takes in a string and a valid regular expression and returns whether or not the string matches the regular expression.  

For example, given the regular expression "ra." and the string "ray", your function should return true. The same regular expression on the string "raymond" should return false.  

Given the regular expression ".*at" and the string "chat", your function should return true. The same regular expression on the string "chats" should return false.  

Example  

Input:  
sa*sh.  
santoshs  

Output:  
True

'''


#AUTHOR: SANTOSH D KOLUR

def compute(s,r):
    copy_r=r.copy()
    sc=0
    while(len(copy_r)!=0):
        if(sc==len(s)):
            break
        if(copy_r[0]==s[sc] or copy_r[0]=='.'):
            sc+=1
            copy_r.pop(0)
        elif(copy_r[0]=='*'):
            while(s[sc]!=copy_r[1]):
                sc+=1
                if(sc==len(s)):
                    print('Flase')
                    exit()
            copy_r.pop(0)
            copy_r.pop(0)
            sc+=1
        else:
            break
    if(sc==len(s) and len(copy_r)==0):
        print('True')
    else:
        print('False')


if __name__ == "__main__":
    r=list(input())
    s=list(input())
    compute(s,r)
