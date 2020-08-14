''' 
Write a program to print a dna structure

'''




#AUTHOR : SANTOSH D KOLUR

def dna(n):
    for _ in range(n):
        for i in range(8,0,-2):
            print(' '*int((8-i)/2),'*','-'*int(8-(((8-i)/2)*2+2)),'*',' '*int((8-i)/2))
        for i in range(2,9,2):
                print(' '*int((8-i)/2),'*','-'*int(8-(((8-i)/2)*2+2)),'*',' '*int((8-i)/2))
                
if __name__='__main__':
    n=input("Enter the number of blocks required:\n")
    dna(n)
    
        
    
