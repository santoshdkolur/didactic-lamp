/*

Given two singly linked lists of size N and M, write a program to get the point where two linked lists intersect each other.

Y ShapedLinked List
Above diagram shows an example with two linked list having 15 as intersection point.

Example 1:

Input:
LinkList1 = {10,20,5,10}
LinkList2 = {30,40,50,5,10}
Output: 5
Explanation:The point of intersection of
two linked list is 5, means both of them
get linked (intersects) with each other
at node whose value is 5.
Your Task:
The task is to complete the function intersetPoint() which finds the point of intersection of two linked list. The function should return data value of a node where two linked lists merge. If linked list do not merge at any point, then it should return -1.

Challenge : Try to solve the problem without using any extra space.

Expected Time Complexity: O(N+M)
Expected Auxiliary Space: O(1)

Constraints:
1 <= N <= 100
1 <= value <= 1000

*/



// AUTHOR : SANTOSH D KOLUR



#include<iostream>
using namespace std;
struct node
{
    int data;
    struct node *next;
    struct node *prev;
};
struct node *head1=NULL;
struct node *head2=NULL;

int main()
{
    int n,count;
    cout<<"Enter the first list: "<<endl;
    cin>>n;
    while(n>=0)
    {
        struct node *temp=(struct node *)malloc(sizeof(struct node));
        temp->data=n;
        temp->next=NULL;
        temp->prev=NULL;
        if(head1==NULL)
            head1=temp;
        else
        {
            struct node *p=head1;
            while(p->next!=NULL)
                p=p->next;
            temp->prev=p;
            p->next=temp;
        }
        cin>>n;
    }
    
    cout<<"Enter the second list: "<<endl;
    cin>>n;
    while(n>=0)
    {
        struct node *temp=(struct node *)malloc(sizeof(struct node));
        temp->data=n;
        temp->next=NULL;
        temp->prev=NULL;
        if(head2==NULL)
            head2=temp;
        else
        {
            struct node *p=head2;
            while(p->next!=NULL)
                p=p->next;
            temp->prev=p;
            p->next=temp;
        }
        cin>>n;
    }
    
    cout<<"Linked List 1--> ";
    struct node *p;
    p=head1;
    while(p!=NULL)
    {
        cout<<p->data<<"  ";
        p=p->next;
    }
    
    cout<<"\nLinked List 2--> ";
    p=head2;
    while(p!=NULL)
    {
        cout<<p->data<<"  ";
        p=p->next;
    }
    
    struct node *q;
    p=head1;
    q=head2;
    
    while(p->next!=NULL)
        p=p->next;
    while(q->next!=NULL)
        q=q->next;
    
    count=0;
    while(q!=NULL || p!=NULL)
    {
        if(p->data == q->data)
        {
            p=p->prev;
            q=q->prev;
            count++;
        }
        else
            break;
    }
    if(count==0)
    {
        cout<<"\n\nThere is no point of intersection"<<endl;
    }
    else
        cout<<"\n\nThe LL intersect at -> "<<p->next->data<<endl;
}
