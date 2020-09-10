'''
Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
    ...
Example 1:

Input: "A"
Output: 1
Example 2:

Input: "AB"
Output: 28
Example 3:

Input: "ZY"
Output: 701

'''


#AUTHOR : SNATOSH D KOLUR


def columnCode(n):
    n=n.upper()
    count=0
    for i,ele in enumerate(list(n)[::-1]):
        count+=(ord(ele)-64)*(26**i)
    print(count)

if __name__=='__main__':
    n=input()
    columnCode(n)
