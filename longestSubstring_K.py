'''
Given an integer k and a string s, find the length of the longest substring that contains at most k distinct characters.

For example, given s = "abcba" and k = 2, the longest substring with k distinct characters is "bcb"



'''

#AUTHOR : SANTOSH D KOLUR




def subString(n,k):
    m=n[0]
    for i in range(len(n)):
        j=i
        b=[n[i]]
        count=0
        while(j<len(n)):
            if(n[j] in b):
                j=j+1
            else:
                count+=1
                if(count==k):
                    break
                b.append(n[j])
                j=j+1
            
        if(len(m)< j-i):
            m=n[i:j]
    print(m)

if __name__ == '__main__':
    subString(input(),int(input()))
