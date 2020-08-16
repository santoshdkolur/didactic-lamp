'''
#Half Pyramid
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5  

#Inverted Half Pyramid
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1

#Hollow Half Pyramid
1
1 2
1   3
1     4
1 2 3 4 5

#Full Pyramid
         1
       2 3 2
     3 4 5 4 3
   4 5 6 7 6 5 4
 5 6 7 8 9 8 7 6 5

#Hollow Full Pyramid
    1
   1 2
  1   3
 1     4
1 2 3 4 5 

#Hollow Inverted Half Pyramid
1 2 3 4 5
2     5
3   5
4 5
5
'''

n=int(input("Choose an option to print the pattern \n1. Half Pyramind\n2. Inverted Half Pyramid\n3. Hollow Half Pyramid\n4. Full Pyramid\n5. Hollow Full Pyramid\n6. Hollow Inverted half pyramid\n\nEnter your choice: "))
print('\n\n')

if(n==1):
    print("#Half Pyramid\n")
    for i in range(1,6):
        for j in range(1,i+1):
            print(j,' ',end='')
        print()
    print("\n\n")

elif(n==2):
    print("#Inverted Half Pyramid\n")
    for i in range(5,0,-1):
        for j in range(1,i+1):
            print(j,' ',end='')
        print()

    print("\n\n")

elif(n==3):
    print("#Hollow Half Pyramid\n")
    for i in range(1,6):
        if(i!=5 and i!=1):
            print(str(1)+' '*((i-2)*2+1)+str(i),end='')
        elif(i==1):
            print(i,end='')
        elif(i==5):
            for j in range(1,i+1):
                print(str(j)+' ',end='')
        print()
    print("\n\n")

elif(n==4):
    print("#Full Pyramid\n")
    for i in range(1,6):
        print('  '*(5-i),end=' ')
        for j in range(i,i+i):
            print(j,end=' ')
        for j in range(i+i-2,i-1,-1):
            print(j,end=' ')
        print()
    print('\n\n')

elif(n==5):
    print("#Hollow Full Pyramid\n")
    for i in range(1,6):
        print(' '*(5-i),end='')
        if(i!=1 and i!=5):
            print(1,end='')
            print(' '*((i-2)*2+1),end='')
            print(i,end='')
        elif i==1:
            print(i,end='')
        elif i==5:
            for j in range(1,i+1):
                print(j,end=' ')
        print()

    print('\n\n')

elif(n==6):
    print("#Hollow Inverted Half Pyramid\n")
    for i in range(1,6,):
        if(i==1):
            for j in range(1,6):
                print(j,end=' ')
        elif(i!=5 and i!=1):
            print(i,end='')
            print(' '*((5-i-1)*2+1),end='')
            print(5,end='')
        elif(i==5):
            print(i,end='')
        print()
    print('\n\n')

else:
    print('Invalid Option\n\n')





