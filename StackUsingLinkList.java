package com.ravi.datastructure;
import java.util.*;

class Stack
{
	int data;
	Stack link;
	
	Stack(int data,Stack link)
	{
		this.data=data;
		this.link=link;
	}
}

public class StackUsingLinkList {
	
	 static Stack top = null;
	 static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		int ch;
		while(true)
		{
			System.out.println("\n 1:PUSH\n 2:POP\n 3:DISPLAY\n 4:Exit()\n");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: push(); break;
			
			case 2: pop(); break;
			
			case 3: display(); break;
			
			case 4: System.exit(1);
			
			default: System.out.println("Invalid Choice\n");
			  
			}
			
		}

	}

	private static void push() {
		
		Stack temp;
		int ele;
		
		System.out.println("Enter The Element");
		ele=sc.nextInt();
		
		temp = new Stack(ele, null);
		
		if(top == null )
		{
			top = temp;
		}
		else
		{
			temp.link = top;
			top = temp;
		}
		
	}

	private static void pop() {

		Stack temp;
		
		if(top == null )
		{
			System.out.println("Stack list is Empty");
		}
		else
		{
			   temp = top; 
			   if(temp!=null)
			   {
			     System.out.println("Pop Element  is "+temp.data);
			     top = top.link; 
			     temp.link=null;
			   }
		}
		
	}

	private static void display() {

		Stack temp;
		
		temp = top;
		if(temp == null)
		{
			System.out.println("Stack List is Empty");
		}
		else
		{
			while(temp != null)
			{
				System.out.println("Stack Element "+temp.data);
				temp = temp.link;
				
			}
		}
		
	}

}
