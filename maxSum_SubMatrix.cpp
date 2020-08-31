/* 
Given an N x N matrix, find a k x k submatrix where k <= N and k >= 1, 
such that sum of all the elements in submatrix is maximum. 
The input matrix can contain zero, positive and negative numbers.

Input:
Size of the matrix N
The N x N matrix
The size of sub-matriz K

Output:
Maximum sum of sub-matrix of size K x K


Ex:

Input:

4
1 2 3 4
5 6 7 8
4 3 2 1
8 7 6 5
3

Output:

48

*/



// AUTHOR : SANTOSH D KOLUR

#include<iostream>
using namespace std;
int main()
{
    int i,j, n,m,k,sum=0,max=0;
    cin>>n;
    int a[n][n];
    for(i=0;i<n;i++)
        for(j=0;j<n;j++)
            cin>>a[i][j];
    
    cin>>k;
    int count=0,count2=0;
    while(count+k<=n)
    {
    
        for(i=count;i<k+count;i++)
        {
            for(j=count2;j<k+count2;j++)
                sum+=a[i][j];
        }
        if(sum>max)
            max=sum;
        sum=0;
        count++;
    }
    cout<<max;
}
