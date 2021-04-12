package com.ravi.datastructure;
import java.util.*;
class BSTTree
{
	int data;
	BSTTree left,right;
	
	BSTTree(int data,BSTTree left,BSTTree right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
public class BSTOpration {
	static BSTTree root = null;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {

		int ch;
		while(true)
		{
			System.out.println(" 1:Insert\n 2:Preorder\n 3:Inorder\n 4:Postorder\n 5:Exit()\n");
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

		BSTTree temp,p,current;
		int ele;	
		System.out.println("Enter the Element");
		ele=sc.nextInt();
		
		temp = new BSTTree(ele,null,null);
		
		if(root==null)
		{
			root = temp;
		}
		else
		{
			p=root;	
			while(true)
			{ 
				current = p;
			    if(temp.data < p.data)
			    {
			      p = p.left;   
			       if(p==null)
			      {
			    	  current.left = temp;
			    	  return;
			      }
			    }
		        else
		        {
			     	p = p.right;
			     	if(p==null)
			     	{
			     		current.right = temp;
			     	    return;
			     	}
		        }
			}
		}	
	}

	private static int preOrder(BSTTree r) {
		
		/* if(r==null) { System.out.println("Tree is empty"); return 0; } */
		 if(r!=null)
		  {
	    
		    System.out.println(r.data);
			preOrder(r.left);
			preOrder(r.right);
		    
		  }
		return 0;	
	}

	private static int inOrder(BSTTree r) {
       
		/*
		 * if(r==null) { System.out.println("Tree is empty"); return 0; }
		 */
        if(r!=null)
        {
        	inOrder(r.left);
        	System.out.println(r.data);
        	inOrder(r.right);
        }
		
		return 0;
	}

	private static int postOrder(BSTTree r) {
		
		/*
		 * if(r==null) { System.out.println("Tree is empty"); return 0; }
		 */
	    if(r!=null)
	    {
	    	postOrder(r.left);
	       	postOrder(r.right);
	       	System.out.println(r.data);
	    }
	        
		return 0;	
	}

}
