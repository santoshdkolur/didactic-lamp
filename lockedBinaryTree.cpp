/*

Implement locking in a binary tree. A binary tree node can be locked or unlocked only if all of its descendants or ancestors are not locked.  

Design a binary tree program with the following methods:  

is_locked, which returns whether the node is locked  
lock, which attempts to lock the node. If it cannot be locked, then it should return false. Otherwise, it should lock it and return true.  
unlock, which unlocks the node. If it cannot be unlocked, then it should return false. Otherwise, it should unlock it and return true.  
You may augment the node to add parent pointers or any other property you would like. You may assume the class is used in a single-threaded program, so there is no need for actual locks or mutexes. Each method should run in O(h), where h is the height of the tree.

NOTE: Take the elements of the binary tree as input and create the tree in the begining.

*/


// AUTHOR: SANTOSH D KOLUR



#include<iostream>
using namespace std;
struct tree
{
    struct tree *left;
    struct tree *right;
    int data;
    int locked;
};
int found=0;
struct tree *root=NULL;
void add(int num)
{
    if(root==NULL)
    {
        struct tree *temp=(struct tree*)malloc(sizeof(struct tree));
        temp->data=num;
        temp->left=NULL;
        temp->right=NULL;
        temp->locked=0;
        root=temp;
    }
    else
    {
        struct tree *temp=(struct tree*)malloc(sizeof(struct tree));
        temp->data=num;
        temp->left=NULL;
        temp->right=NULL;
        temp->locked=0;
        struct tree *p,*q;
        p=root;
        while(p!=NULL)
        {
            q=p;
            if(num>p->data)
                p=p->right;
            else if(num<p->data)
                p=p->left;
        }
        if(q->data>num)
        {
            q->left=temp;
        }
        else if(num>q->data)
            q->right=temp;
    }
}
void check(struct tree *p)
{
    if(p==NULL)
        return;
    if(p->locked==1)
    {
        found=1;
        return;
    }
    check(p->right);
    check(p->left);
        
}
void lock(int num)
{
    struct tree *p;
    p=root;
    while(p->data!=num && p!=NULL)
    {
        if(num>p->data)
            p=p->right;
        else
            p=p->left;
    }
    if(p==NULL)
    {
        cout<<"\n!!!   Element and node are not present in the tree  !!!"<<endl;
        return;
    }
    else
    {
        struct tree *q;
        p;
        check(p);
        if(found==1)
        {
            cout<<"\n!!!   Cannot be locked   !!!";
            found=0;
        }
        else
        {
            p->locked=1;
            cout<<"\n!!!   Node has been locked !!!";
    }
}
void is_locked(int num)
{
    struct tree *p;
    p=root;
    while(p->data!=num && p!=NULL)
    {
        if(num>p->data)
            p=p->right;
        else
            p=p->left;
    }
    if(p==NULL)
    {
        cout<<"\n!!!   Element or node is not present in the tree.  !!!"<<endl;
        return;
    }
    else
    {
        if(p->locked==1)
            cout<<"\n!!!!   Node is locked  !!!"<<endl;
        else
            cout<<"\n!!!   The node is not locked !!!"<<endl;
    }
}
void unlock(int num)
{
    struct tree *p;
    p=root;
    while(p->data!=num && p!=NULL)
    {
        if(num>p->data)
            p=p->right;
        else
            p=p->left;
    }
    if(p==NULL)
    {
        cout<<"\n!!!   Element or node is not present in the tree.  !!!"<<endl;
        return;
    }
    else
    {
        if(p->locked==1)
        {
            p->locked=0;
            cout<<"\n!!!!   Node is unlocked  !!!"<<endl;
        }
        else
            cout<<"\n!!!   The node is not locked !!!"<<endl;
    }
}
void inorder(struct tree *p)
{
    if(p==NULL)
        return;
    inorder(p->left);
    cout<<p->data<<"\t";
    inorder(p->right);
}
int main()
{
    int num;
    cout<<"Enter the numbers to add to the tree. Enter a negative number to stop."<<endl;
    cin>>num;
    while(num>=0)
    {
        add(num);
        cin>>num;
    }
    cout<<"The nodes in the tree are:\n";
    inorder(root);
    cout<<"\n\nEnter:\n  1. To lock a node\n  2. To check if a node is locked\n  3. To unlock a node\n  4. To exit\nEnter your choice:  ";
    cin>>num;
    while(num!=4)
    {
        if(num==1)
        {
            cout<<"Enter the value of the node to lock it:  ";
            int n;
            cin>>n;
            lock(n);
        }
        else if(num==2)
        {
            cout<<"Enter the value of the node to unlock:  ";
            int n;
            cin>>n;
            unlock(n);
        }
        else
        {
            cout<<"Enter the value of the node to check if it is locked:  ";
            int n;
            cin>>n;
            is_locked(n);
        }
        
        cout<<"\n\nEnter:\n  1. To lock a node\n  2. To check if a node is locked\n  3. To exit\nEnter your choice:  ";
        cin>>num;
    }
}
