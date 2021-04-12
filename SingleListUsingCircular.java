package com.ravi.datastructure;
import java.util.*;

class ListDouble
{
	int data;
	ListDouble link;
	
	ListDouble(int data,ListDouble link)
	{
		this.data=data;
		this.link=link;
	}
}

public class SingleListUsingCircular {
	
	static ListDouble root = null;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
	
		int ch;
		while(true)
		{
			System.out.println("\n 1:Append\n 2:addAtBegin\n 3:addAtMiddle\n 4:deleteFirst\n 5:deleteMiddle\n 6:deleteLast\n 7:display\n 8:Exit()\n");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: append(); break;
			
			case 2: addAtBegin(); break;
			
			case 3: addAtMiddle(); break;
			
			case 4: deleteFirst(); break;
			
			case 5: deleteMiddle(); break;
			
			case 6: deleteLast(); break;
			
			case 7: display(); break;
			
			case 8: System.exit(1);
			
			default: System.out.println("invalid Choice");
			}
		}

	}

	private static void append() {

		ListDouble temp,p;
		int ele;
		System.out.println("Enter the Element ");
		ele=sc.nextInt();
		
		temp = new ListDouble(ele,null);
		if(root==null)
		{
			root = temp;
			temp.link=root;
		}
		else
		{  
		   p = root;  
		  while(p.link !=root) 
		  {
			 p=p.link;  
		  }
		   p.link = temp;
		   temp.link = root;
		}
	}

	private static void addAtBegin() {
		
		ListDouble temp,p;
		int ele;
		System.out.println("Enter the Element ");
		ele=sc.nextInt();
		
		temp = new ListDouble(ele,null);
		if(root==null)
		{
			root = temp;
			temp.link=root;
		}
		else
		{
			p=root;
			while(p.link!= root)
			{
				p=p.link;
			}
			
			temp.link=root;
			p.link=temp;
			root=temp;	
		}
	}

	private static void addAtMiddle() {
		
		ListDouble temp,p;
		int ele,i=1;
		System.out.println("Enter the Element ");
		ele=sc.nextInt();
		
		temp = new ListDouble(ele,null);
		if(root==null)
		{
			root = temp;
		}
		else
		{
			p=root;
			System.out.println("Enter the position");
			int pos=sc.nextInt();
			
			while(i< pos)
			{
				p= p.link;
				i++;
			}
			
			temp.link=p.link;
			p.link=temp;
		}
		
	}

	

	private static void deleteFirst() {
		ListDouble temp,p;
		temp=root;
		
		p=root;
		while(p.link!= root)
		{
			p=p.link;
		}
		root= temp.link;
		p.link=root;
		temp.link= null;
		
		System.out.println("Delete First List Element ");
	}

	private static void deleteMiddle() {
		
		
	}
	
    private static void deleteLast() {
    	ListDouble temp,p;
		temp=root;
		 	
		
	}

	private static void display() {
		
		ListDouble temp;
		temp = root;
		if(temp == null)
		{
			System.out.println("The List is Empty");
		}
		else
		{
			while(temp.link != root)
			{
				System.out.println("Element is "+temp.data);
				temp = temp.link;
			}
			
			System.out.println("Element is "+temp.data);
		}	
	}

}
