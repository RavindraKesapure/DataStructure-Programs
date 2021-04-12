package com.ravi.datastructure;

import java.util.*;

class Node
{
	 int data;
	 Node link;
	 
	  Node(int data, Node link)
	 {
		  this.data = data;
		  this.link = link;
	 }
	 
}

public class LikedListApp {
	
	static Node root = null;
    static Scanner sc=new Scanner(System.in);
    
	public static void main(String[] args) {

		int choice;
		while(true)
		{
			System.out.println(" 1:Append\n 2:Display\n 3:Exit()");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1: LikedListApp.append();
			        break;
			        
			case 2: LikedListApp.display();
					break;
			
			case 3: System.exit(1);
			
			default:System.out.println("Invalid Choice\n");
			}
		}
		
	}
   static void append() {

	   Node temp;
	   int ele;
	   
	   System.out.println("Enter Node Data");
	   ele =sc.nextInt();
	   
	  temp = new Node(ele, null);
	   
	   if(root==null)
	   {
		   root = temp;
	   }
	   else
	   {
		   Node p = root;
		   while(p.link != null)
		   {
			   p = p.link;
		   }
		   
		   p.link = temp;
	   }
		
	}
   
   static void display() {

		Node temp ;
		temp = root;
		
		if(temp == null)
		{
			System.out.println(" List is Empty...\n");
		}
		else
		{
			while(temp != null)
			{
				System.out.println("Element is "+temp.data);
				temp = temp.link;
			}
		}
	}

}
