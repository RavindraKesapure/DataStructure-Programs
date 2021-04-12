package com.ravi.datastructure;
import java.util.*;

class DoubleAll
{
	int data;
	DoubleAll left;
	DoubleAll right;
	
	DoubleAll(int data,DoubleAll left,DoubleAll right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}

public class DoubleLinkListAllOpration {
	
	static DoubleAll root = null;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		int ch;
		
		while(true)
		{
			System.out.println("\n 1:Append\n 2:AddAtBegin\n 3:AddAtMiddle\n 4:length\n 5:DisplayForward\n 6:DisplayBackward\n 7:DeleteFirst\n 8:deleteMiddle\n 9:deleteLast\n 10:Exit()");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:append(); break;
			
			case 2:addAtBegin(); break;
			
			case 3:addAtMiddle(); break;
			
			case 4:length(); break;
			
			case 5:displayForward(); break;
			
			case 6:displayBackward(); break;
			
			case 7:deleteFirst(); break;
			
			case 8:deleteMiddle(); break;
			
			case 9:deleteLast(); break;
			
			case 10:System.exit(1);
			
			default: System.out.println("Invalid Choice\n");
			}
		}
	}

	
	private static void append() {

		DoubleAll temp;
		int ele;
		
		System.out.println("Enter The Element");
		ele=sc.nextInt();
		
		temp = new DoubleAll(ele,null,null);
		
		if(root == null)
		{
			root = temp;
		}
		else
		{
			DoubleAll p;
			p = root;
			
			while(p.right !=null)
			{
				p = p.right; 
			}
			p.right = temp;
			temp.left = p;
		}
		
	}

	private static void addAtBegin() {
		
		DoubleAll temp;
		int ele;
		
		System.out.println("Enter The Element");
		ele=sc.nextInt();
		
		temp = new DoubleAll(ele,null,null);
		
		if(root == null)
		{
			root = temp;
		}
		else
		{
			temp.right = root;
			root.left = temp;
			root= temp;
			
		}

		
	}

	private static void addAtMiddle() {

		DoubleAll temp,p,q;
		int ele,loc,len=0,i=1;
		
		System.out.println("Enter The location you Want to insert the list");
		loc=sc.nextInt();
		
		q = root;
		
	    while(q != null)
	   {
		 q = q.right;
		 len++;
	   }
		if(loc > len)
	    {
	    	System.out.println("Invalid Location "+loc);
	    }
		else
		{  
		    System.out.println("Enter The Element");
			ele=sc.nextInt();
		    
			temp = new DoubleAll(ele,null,null);
			
			p=root;
			while(i < loc)
			{
				p = p.right;
				i++;
			}
			
			temp.right = p.right;
			p.right.left = temp;
			 
			temp.left = p;
			p.right = temp; 	
		}
		
	}

	private static void length() {

		DoubleAll temp;
		int count=0;
		temp = root;
		
		while(temp != null)
		{
			temp = temp.right;
			count++;
		}
		System.out.println("Double List Length is "+count);
	}
	
	private static void displayForward() {

		DoubleAll temp;
		temp = root;
		if(temp == null)
		{
			System.out.println("Double Link List is Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println("Forward Element is "+temp.data);
				temp = temp.right;
			}
		}	
	}

	private static void displayBackward() {
		DoubleAll temp,p;
		temp = root; 
		if(temp == null)
		{
			System.out.println("Double Link List Is Empty");
		}
		else
		{
			while(temp!=null)
			{
				temp = temp.right;
			}
			p = temp;
			
			while(p != null)
			{
				System.out.println("Backword Element is "+p.data);
				
				p = p.left;
			}
		}
		
	}

	private static void deleteFirst() {
		
		DoubleAll temp;
		temp = root;
		
		if(temp==null)
		{
			System.out.println("List Is Empty");
		}
		else
		{
			  temp = temp.right;
		      temp.left = null;
		  //    temp.left.right= null;
		      root = temp;
		}
	}
	
    private static void deleteMiddle() {
    	
		
	}
    private static void deleteLast() {
	
    	DoubleAll temp;
    	temp = root;
    	
    	if(temp == null)
    	{
    		System.out.println("List Is Empty");
    	}
    	else
    	{
        	while(temp.right != null)
    	   {
    		 temp = temp.right; 
    	   }
    	    temp.left.right=null;
    	    temp.left=null;
    	}
    	
    	
    	
    	
    	
    }

}
