/*

A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

Given the root to a binary tree, count the number of unival subtrees.

For example, the following tree has 5 unival subtrees:

   0
  / \
 1   0
    / \
   1   0
  / \
 1   1
 
 
 */
 
 //AUTHOR: SANTOSH D KOLUR
 
 
 #include<iostream>
using namespace std;
struct tree
{
    int data;
    struct tree * left;
    struct tree * right;
};
struct tree *root=NULL;
void check(struct tree *);
int count=0,num=0;
int main()
{
    struct tree *n1,*n2,*n3,*n4,*n5,*n6,*n7;
    n1=(struct tree *)malloc(sizeof(struct tree));
    n2=(struct tree *)malloc(sizeof(struct tree));
    n3=(struct tree *)malloc(sizeof(struct tree));
    n4=(struct tree *)malloc(sizeof(struct tree));
    n5=(struct tree *)malloc(sizeof(struct tree));
    n6=(struct tree *)malloc(sizeof(struct tree));
    n7=(struct tree *)malloc(sizeof(struct tree));
    n1->data=0;n1->left=n1->right=NULL;
    n2->data=1;n2->left=n2->right=NULL;
    n3->data=0;n3->left=n3->right=NULL;
    n4->data=1;n4->left=n4->right=NULL;
    n5->data=0;n5->left=n5->right=NULL;
    n6->data=1;n6->left=n6->right=NULL;
    n7->data=1;n7->left=n7->right=NULL;
    if(root==NULL)
        root=n1;
    n1->left=n2;
    n1->right=n3;
    n3->left=n4;
    n3->right=n5;
    n4->right=n7;
    n4->left=n6;
    check(root);
    cout<<count;
}
void check(struct tree *q)
{
    if(num==7)
        return;
    num++;
    if(q->right!=NULL)
    {
        if(q->data==q->right->data)
        {
            struct tree*p=q->right;
            if(p->right!=NULL)
            {    
                while(p->data==p->right->data)
                {
                    p=p->right;
                    count++;
                    if(p->right==NULL)
                        break;
                }
                count++;
            }
            else
                count++;
        }
    }
    if(q->left!=NULL)
    {
        if(q->data==q->left->data)
        {
            struct tree*p=q->left;
            if(p->left!=NULL)
            {
                while(p->data==p->left->data)
                {
                    p=p->left;
                    count++;
                    if(p->left==NULL)
                        break;
                }
                count++;
            }
            else
                count++;
        }
    }
    if(q->right!=NULL)
        check(q->right);
    if(q->left!=NULL)
        check(q->left);
    
}




