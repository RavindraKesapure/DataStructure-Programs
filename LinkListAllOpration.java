package com.ravi.datastructure;
import java.util.*;

class Node1
{
   int data;
   Node1 link;
   
   Node1(int data, Node1 link)
   {
	   this.data=data;
	   this.link=link;
   }
}

public class LinkListAllOpration {
	
	 static Node1 root = null;
	 static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int ch;
		
		while(true)
		{
			System.out.println("\n 1:Append\n 2:AddAtBegin\n 3:AddAtAfter\n 4:length\n 5:Display\n 6:Delete\n 7:displayReverse\n 8:Exit()\n");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: append();break;
			
			case 2: addAtBegin(); break;
			
			case 3: addAtAfter(); break;
			
			case 4: length(); break;
			
			case 5: display(); break;
			
			case 6: delete(); break;
			
			case 7: displayReverse(); break;
			
			case 8: System.exit(1);
			
			default: System.out.println("Invalid Choice");
			
			}
		}

	}


	private static void append() {

		Node1 temp;
		int ele;
		
		System.out.println("Enter the Data\n");
		ele=sc.nextInt();
		
		temp = new Node1(ele, null);
		
		if(root == null)
		{
			root = temp;
		}
		else
		{
			Node1 p = root;
			while(p.link != null)
			{
				p = p.link;
			}
			p.link = temp;
		}
	}

	private static void addAtBegin() {

		Node1 temp;
		int ele;
		
		System.out.println("Enter the Data\n");
		ele=sc.nextInt();
		
		temp = new Node1(ele, null);
		
		if(root == null)
		{
			root = temp;
		}
		else
		{
			temp.link = root;
			root = temp;
		}
		
	}

	private static void addAtAfter() {
		Node1 temp,p;
		int ele,pos;
		
		System.out.println("Enter the Data\n");
		ele=sc.nextInt();
		
		temp = new Node1(ele, null);
		
		System.out.println("Enter The Position You Want to Insert");
	    pos = sc.nextInt();
		
		if(root == null)
		{
			root = temp;
		}
		else
		{
			p=root;
			for(int i=1; i<= pos-1; i++)
			{
			    p = p.link;
			    
			    if(p == null)
			    {
			    	break;
			    }
			}
			
			if(p != null)
			{
			
			    temp.link = p.link;
			    p.link = temp;
			}
		}
		
	}

	private static void length() {
 
		Node1 temp;
		int count=0;
		temp = root;
		
		if(temp == null)
		{
		       count = 0 ;
		}
		else
		{
			while(temp != null)
			{
				temp = temp.link;
				count++;
			}
		}
		
		System.out.println("Length Of List is "+count);
		
		
	}

	private static void display() {
    
		Node1 temp;
		temp = root;
		if(temp == null)
	    {
			System.out.println("List Is Empty");
	    }
		else
		{
			 while(temp !=null)
			 {
				 System.out.println("Element is "+temp.data);
				 
				 temp = temp.link;
			 }
		}	
		
	}

	private static void delete() {

		Node1 temp,len;
		int loc,count=0;
		
		System.out.println("Enter The Location You Want To delete\n");
		loc=sc.nextInt();
		
		len = root;
		while(len != null)
		{
			len = len.link;
			count++;
		}
		
		if(loc > count)
		{
			System.out.println("Invalid location");
		}
		else if(loc == 1)
		{
			temp = root ;
			root = temp.link;
			temp.link = null;
		}
		else
		{
			Node1 p,q;
			p = root;
			int i=1;
			while(i < loc-1)
			{
				p = p.link;
				i++;
			}
			q = p.link;
			
			 p.link = q.link;
			 q.link=null;
		}
		
	}
	
	
	private static void displayReverse() {
	
		Node1 p,q,r;
		int count=0,i=0,j;
		r=root;
		
		if(root==null)
		{
			System.out.println("List Is Empty");
		}
		
	else
	 {
		
		while(r !=null)
		{
			count++;
			r=r.link;
		}
		
		j=count-1;
	  	p=root;
	  	q=root;
	  	
	  	while(i<j)
	  	{
	  		int k=0;
	  		while(k < j)
	  		{
	  			q= q.link;
	  			k++;
	  			
	  		}	
	  		int temp=p.data;
	  		p.data=q.data;
	  		q.data=temp;
	  		
	  		i++;
	  		j--;
	  		
	  		p=p.link;
	  		q=root;		
	  	}
	 
	  	Node1 rev;
	  	rev=root;
	  	
	  	while(rev !=null)
	  	{
	  		System.out.println("Reverse "+rev.data);	
	  		rev=rev.link;
	  	}	
	  }	
	}
	

}
