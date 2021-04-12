package com.ravi.datastructure;
import java.util.*;
class BST
{
	int data;
	BST left,right;
	
	BST(int data,BST left,BST right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
public class BSTInsertion {
	static BST root = null;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		int ch;
		while(true)
		{
			System.out.println("\n 1:Insert\n 2:Preorder\n 3:Inorder\n 4:Postorder\n 5:Exit()\n");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:insert(); break;
			
			case 2:preOrder(root); break;
			
			case 3:inOrder(root); break;
			
			case 4:postOrder(root); break;
			
			case 5:System.exit(1);
			
			default:System.out.println("invalid choice");
			}
			
		}

	}

	private static void insert() {
		
		BST temp;
		int ele;
		System.out.println("Enter the Element ");
		ele=sc.nextInt();
		
		temp=new BST(ele,null,null);
		
		if(root==null)
		{
			root = temp;
		}
		else
		{
			BST curr,parent;
			curr =root;
			parent = root;
			
			while(curr!=null)
			{
				parent=curr;
				if(temp.data < curr.data)
				{
				  curr = curr.left;
				}
				else 
				{
					curr = curr.right;
				}
			}
			if(temp.data < parent.data)
			{
				parent.left=temp;
			}
			else
			{
				parent.right=temp;
			}
		}

		
	}

	private static void preOrder(BST r) {
		
		if(root==null)
		{
			System.out.println("Tree is Empty");
		}
		
		if(r!=null)
		{
			System.out.print(r.data+" ");
			preOrder(r.left);
			preOrder(r.right);
		}
	}

	private static void inOrder(BST r) {
		
		if(root==null)
		{
			System.out.println("Tree is Empty");
		}
		if(r!=null)
		{
			inOrder(r.left);
			System.out.print(r.data+" ");
			inOrder(r.right);
		}
	}

	private static void postOrder(BST r) {
		
		if(root==null)
		{
			System.out.println("Tree is Empty");
		}
		
		if(r!=null)
		{
		  postOrder(r.left);
		  postOrder(r.right);
		  System.out.print(r.data+" ");
		}
	}

}
