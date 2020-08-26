/*

Given the root to a binary tree, implement serialize(root), 
which serializes the tree into a string, and deserialize(s), 
which deserializes the string back into the tree.

*/

//AUTHOR : SANTOSH D KOLUR



#include<iostream>
using namespace std;
struct tree
{
    struct tree * left;
    char c;
    struct tree * right;
};
struct tree *root=NULL;
char serial[100];int count=0;
void add(char ch)
{
    if(root==NULL)
    {
        struct tree *temp;
        temp=(struct tree *)malloc(sizeof(struct tree));
        temp->c=ch;
        temp->left=NULL;
        temp->right=NULL;
        root=temp;
    }
    else
    {
       struct tree *p,*q,*temp;
       temp=(struct tree*)malloc(sizeof(struct tree));
       temp->c=ch;
       temp->left=NULL;
       temp->right=NULL;
       p=root;
       while(p!=NULL)
       {
           q=p;
           if(ch < p->c)
                p=p->left;
            else
                p=p->right;
       }
       if(ch < q->c)
            q->left=temp;
        else
            q->right=temp;
    }
    
}
void deleteTree(struct tree* node)  
{ 
    if (node == NULL) 
        return; 
    deleteTree(node->left); 
    deleteTree(node->right); 
    free(node); 
}
void serialize(struct tree *p)
{
    if(p)
    {
        serialize(p->left);
        cout<<p->c<<" ";
        serial[count++]=p->c;
        serialize(p->right);
    }
}
int main()
{
    char s[100];
    cout<<"Enter a string:  ";
    gets(s);
    cout<<"Creating a binary tree"<<endl;
    for(int i=0;s[i];i++)
    {
        add(s[i]);
    }   
    cout<<"Binary Tree Created!\n"<<endl<<"Serializing..."<<endl;
    serialize(root);
    deleteTree(root);
    root=NULL;
    cout<<"\n\nDeserializing or reconstructing the tree: "<<endl;
    for(int i=0;i<count;i++)
        add(serial[i]);
        
    serialize(root);
    
    
}
