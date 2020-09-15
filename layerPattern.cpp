/*
Take an input N
Print a layered pattern for N.

Ex: Say
Input:

4

Output:


4  4  4  4  4  4  4                                                                                                                                                                  
4  3  3  3  3  3  4                                                                                                                                                                  
4  3  2  2  2  3  4                                                                                                                                                                  
4  3  2  1  2  3  4                                                                                                                                                                  
4  3  2  2  2  3  4                                                                                                                                                                  
4  3  3  3  3  3  4                                                                                                                                                                  
4  4  4  4  4  4  4 


*/
//AUTHOR : SANTOSH D KOLUR

#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int n,i=0,j=0,k=0,x=0;
    cin>>n;
    int z=n;
    n=n*2-1;
    int a[n][n]={0};
    for(x=0;x<=n/2;x++)
    {
        for(j=0+x;j<n-x;j++)
            a[i][j]=z-x;
        
        j--;
        
        for(;i<n-x;i++)
            a[i][j]=z-x;
        
        i--;
        
        for(j=n-x-1;j>=0+x;j--)
            a[i][j]=z-x;
        
        j++;
        
        for(;i>x;i--)
            a[i][j]=z-x;
        
        i++;
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            cout<<a[i][j]<<"  ";
            
        }
        cout<<endl;
    }
}
