#HARD

'''
 Anagrams are words or phrases you spell by rearranging the letters of another word or phrase. For instance, fans of the Harry Potter series know that Lord Voldemort’s full name is actually an anagram of his birth name, 
 and some people even play games challenging one another to make anagrams still relevant to the original term.  
 
 For example,   
 
 "schoolmaster" can be turned into "the classroom", "punishments" becomes "nine thumps", and "debit card" turns into "bad credit".  
 
 The only rule is that all the letters from the original word or phrase must be used when they’re reordered to say something entirely different.  

'''

#AUTHOR: SANTOSH D KOLUR

def compute(a,b):
    count=0
    for ele in a:
        if(len(b)==0):
            break
        try:
            b.remove(ele)
            count+=1
        except:
            break
    
    if len(b)==0 and count==len(a):
        print("True")
    else:
        print("False")

if __name__ == '__main__':
    a = ''.join(input().split(' '))
    b = list(''.join(input().split(' ')))
    compute(a,b)
