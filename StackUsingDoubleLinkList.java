package com.ravi.datastructure;
import java.util.*;

class StackDouble
{
	int data;
	StackDouble left;
	StackDouble right;
	
	StackDouble(int data,StackDouble left,StackDouble right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
public class StackUsingDoubleLinkList {
	
	static StackDouble top=null;
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		int ch;
		
		while(true)
		{
			System.out.println("\n 1:PUSH\n 2:POP\n 3:Display\n 4:Exit()\n");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: push(); break;
			
			case 2: pop(); break;
			
			case 3: display(); break;
			
			case 4: System.exit(1);
			
			default: System.out.println("Invalid Input");
			}
		}

	}

	private static void push() {
  
		StackDouble temp;
		int ele;
		
		System.out.println("Enter The Element");
		ele=sc.nextInt();
		
		temp = new StackDouble(ele,null,null);
		
		if(top == null)
		{
			top = temp;
		}
		else
		{
			StackDouble p;
			p = top;
			while(p.left !=null)
			{
				p = p.left; 
			}
			temp.right = p;
			p.left = temp;
			top = temp;
		}
		
	}
	
	private static void pop() {
		StackDouble temp;
		
		if(top == null)
		{
			System.out.println("Double Link list is Empty");
		}
		else
		{
			temp = top;
			
			if(temp !=null)
			{
			 
			   System.out.println("pop item is "+temp.data);
			   
			   top=temp.right;
			   
			   if(temp.right !=null)
			   {
			       temp.right.left=null;
			       temp.right=null;
			   } 
               
			}
		}
		
	}

	private static void display() {
		
		StackDouble temp;
		temp = top;
		if(temp == null)
		{
			System.out.println("Double Link list is Empty");
		}
		else
		{
			while(temp !=null)
			{
				System.out.println("Element is "+temp.data);
				
				temp = temp.right;
			}
		}
		
	}

}
