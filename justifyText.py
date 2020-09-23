'''

 Write an algorithm to justify text. Given a sequence of words and an integer line length k, return a list of strings which represents each line, fully justified.  
More specifically, you should have as many words as possible in each line. There should be at least one space between each word. Pad extra spaces when necessary so that each line has exactly length k.  
Spaces should be distributed as equally as possible, with the extra spaces, if any, distributed starting from the left.  
If you can only fit one word on a line, then you should pad the right-hand side with spaces.  
Each word is guaranteed not to be longer than k.  

For example, given the list of words ["the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"] and k = 16, you should return the following:  
["the  quick brown", # 1 extra space on the left  
"fox  jumps  over", # 2 extra spaces distributed evenly  
"the   lazy   dog"] # 4 extra spaces distributed evenly Write an algorithm to justify text.  
 Given a sequence of words and an integer line length k, return a list of strings which represents each line, fully justified.  
 
Input:
the quick brown fox jumps over the lazy dog
16

Output: 
the  quick brown
fox  jumps  over
the   lazy   dog
 
 '''
 
 #Author: SANTOSH D KOLUR
 
 
 n=input().split()
k=int(input())
l=[]
a=''

#Dividing the input text into subtexts
for i,ele in enumerate(n):
    b=a
    a=a+' '+ele
    if(len(a)>k):
        l.append(b.strip())
        a=ele
        continue
    elif len(a)==k:
        l.append(a.strip())
        a=''
        continue
    if(i==len(n)-1):
        l.append(a.strip())

#Justifying the texts
l=[ele.split(' ') for ele in l]
for ele in l:
    
    a=[1 for i in range(len(ele)-1)]
    diff=k-len(' '.join(ele))
    i=0
    while(diff!=0):
        a[i]+=1
        diff-=1
        i=(i+1)%len(a)
    just=ele[0]
    
    for i in range(len(a)):
        if(len(ele)!=1):
            just+=' '*a[i]+ele[i+1]
        else:
            just+=' '*a[i]

    print(just)
