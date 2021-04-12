package com.ravi.datastructure;
import java.util.*;

class Double
{
	int data;
	Double left;
	Double right;
	
	Double(int data,Double left,Double right)
	{
	   this.data=data;
	   this.left=left;
	   this.right=right;	   
		 
	}
}

public class DoubleLinkListApp {
	
	static Double root = null;
	static Scanner sc=new Scanner(System.in);	

	public static void main(String[] args) {

		int ch;
		
		while(true)
		{
			System.out.println(" 1:Append\n 2:Display\n 3:Exit()\n");
			System.out.println("Enter Your Choice\n");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: append(); break;
			
			case 2: display(); break;
			
			case 3: System.exit(1);
			
			default: System.out.println("Invalid Input\n");
			}
		}
		
	}

	private static void append() {

		Double temp;
		int ele;
		System.out.println("Enter the Element");
		ele=sc.nextInt();
		
		temp = new Double(ele,null,null); 
		
		if(root==null)
		{
			root = temp;
		}
		else
		{
			Double p;
			p = root;
			while(p.right !=null)
			{
				p = p.right;
			}
			
			p.right = temp;
			temp.left = p;	
			
		}
	}

	private static void display() {

		Double temp;
		temp = root;
		if(temp == null)
		{
			System.out.println("Double List is Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println("Element is "+temp.data);
				temp = temp.right; 
			}
		}	
		
	}

}
