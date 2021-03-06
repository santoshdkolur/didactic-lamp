'''
Determine if a 9x9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the 9 3x3 sub-boxes of the grid must contain the digits 1-9 without repetition.
A partially filled sudoku which is valid.
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

Example 1:

Input:

[
  ["5","3",".",".","7",".",".",".","."],
  
  ["6",".",".","1","9","5",".",".","."],
  
  [".","9","8",".",".",".",".","6","."],
  
  ["8",".",".",".","6",".",".",".","3"],
  
  ["4",".",".","8",".","3",".",".","1"],
  
  ["7",".",".",".","2",".",".",".","6"],
  
  [".","6",".",".",".",".","2","8","."],
  
  [".",".",".","4","1","9",".",".","5"],
  
  [".",".",".",".","8",".",".","7","9"]
]

Output: true

Example 2:

Input:

[
  ["8","3",".",".","7",".",".",".","."],
  
  ["6",".",".","1","9","5",".",".","."],
  
  [".","9","8",".",".",".",".","6","."],
  
  ["8",".",".",".","6",".",".",".","3"],
  
  ["4",".",".","8",".","3",".",".","1"],
  
  ["7",".",".",".","2",".",".",".","6"],
  
  [".","6",".",".",".",".","2","8","."],
  
  [".",".",".","4","1","9",".",".","5"],
  
  [".",".",".",".","8",".",".","7","9"]
]

Output: false

Explanation: Same as Example 1, except with the 5 in the top left corner being 
    modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
    
'''

#AUTHOR: SANTOSH D KOLUR


a=[input().split(' ') for i in range(9)]
flag=0
for i in range(9):
    r=[]
    c=[]
    for j in range(9):
        if(a[i][j]=='.'):
            continue
        if(a[i][j] in c):
            flag=1
            break 
        else:
            c.append(a[i][j])

    for j in range(9):
        
        if(a[j][i]=='.'):
            continue
        if(a[j][i] in r):
            flag=1
            break 
        else:
            r.append(a[j][i])

    if(flag==1):
        break

if(flag==0):
    for i in range(0,7,3):
        t=[]
        for j in range(i,i+3):
            for k in range(i,i+3):
                if(a[j][k]=='.'):
                    continue
                if(a[j][k] in t):
                    flag=1
                    break
                else:
                    t.append(a[j][k])
    if(flag==0):
        print("True")
    else:
        print("Flase")
else:
    print("Flase")
