#HARD

'''

Given a matix, sort the elements and rotatle the layers of the matrix in anti-clockwise manner by one unit.  
Note: It works for all square matrices
Input:  
n - size of the matrix  
2*2 elements  

Output:  
Sorted matrix  
AntiClock wise rotated matrix

Example:

Input:
Enter the size of the matrix:  4
Enter the elements:  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16

Output:

After sorting and Before rotation:
1       2       3       4
5       6       7       8
9       10      11      12
13      14      15      16


After rotation:
2       3       4       8
1       7       11      12
5       6       10      16
9       13      14      15

'''


#AUTHOR : SANTOSH D KOLUR


from math import floor
import time,os

def matrix(n,mat):
    if len(mat) != n**2:
        print("Invalid matrix")
        exit()
    mat.sort()
    m=[]
    for i in range(0,len(mat),n):
        m.append(mat[i:i+n])

    mat=m
    print("After sorting and Before rotation: ")
    for ele in mat:
        for e in ele:
            print(e,end='\t')
        print()

    del m

    if(n%2!=0):
        lim=floor((0+n-1)/2)
    else:
        lim=floor((0+n-1)/2)+1

    #while(True):  #Uncomment and indent the lines till the last line to see it move continously (uncommment the last two lines as well)
    for i in range(lim): #Traverses layer by layer. Imagine an onion XD
        temp=mat[i][i]
        for j in range(i+1,n-i):  #Top Layer
            mat[i][j-1]=mat[i][j]
        
        j=n-i-1
        k=i
        for k in range(i+1,n-i): #Right Layer
            mat[k-1][j]=mat[k][j]
        
        for k in range(j-1,i-1,-1): #Bottom Layer
            mat[j][k+1]=mat[j][k]
        
        for j in range(n-i-2,i-1,-1): #Left Layer
            mat[j+1][i]=mat[j][i]

        mat[i+1][i]=temp

    print('\n\nAfter rotation :')
    for ele in mat:
        for e in ele:
            print(e,end='\t')
        print()
    #time.sleep(0.5)
    #os.system('cls')

if __name__ == "__main__":  
    n=int(input("Enter the size of the matrix:"))
    mat=[int(ele) for ele in input("Enter the elements: ").split(' ')]
    matrix(n,mat)




