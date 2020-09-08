/*

Given a long sentence, reverse each word of the sentence individually in the sentence itself.
Examples:

Input : How are you
Output : woH era uoy


*/

// AUTHOR : SANTOSH D KOLUR

#include<iostream>
#include<string.h>
using namespace std;
int main()
{
    char s[200],s2[200]="";
    gets(s);
    
    int i=0,j=0,count=0;
    while(j<=strlen(s))
    {
        if(s[j]==' ' || s[j]=='\0')
        {
            int k=j;
            for(k=j-1;k>=i;k--)
                s2[count++]=s[k];
            s2[count++]=' ';
            i=j+1;
            j++;
        }
        else
        {
            j++;
            continue;
        }
        
    }
    s2[count]='\0';
    puts(s2);
}
