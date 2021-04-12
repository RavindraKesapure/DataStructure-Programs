package com.ravi.datastructure;
import java.util.*;

public class CircularQueueOpration {

	static Scanner sc=new Scanner(System.in);
	static int size = 3;
	static int front=-1,rear=-1;
    static int queue[]=new int[size];	
    
	public static void main(String[] args) {

		int ch,ele;
		while(true)
		{
			System.out.println("\n 1:Insert\n 2:Delete\n 3:Display\n 4:Exit()\n");
			System.out.println("Enter Your Choice");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: 
				   System.out.println("Enter the Element ");
				   ele=sc.nextInt();
				   insert(ele);
				   break;
			
			case 2: delete(); 
				/*
				 * if(ele == 0) { System.out.println("queue is empty"); } else {
				 * System.out.println("Delete Element is "+ele); }
				 */
			        break;
			
			case 3: display(); break;
			
			case 4: System.exit(1);
			
			default: System.out.println("Invalid Input\n");
			}
		}
		
	}

	private static void insert(int ele) {

		if((front == 0 && rear == size - 1) || (front == rear+1))
		{
		      System.out.println("\nCircular Queue is Full! Insertion not possible!!!\n");
		}
		else
		{
			  if(rear == size-1 && front != 0)
				   rear = -1;
			      queue[++rear] = ele;
			      System.out.println("\nInsertion Success!!!\n");
			      if(front == -1)
				      front = 0;
		}
	}

	private static void delete() {
    
		if(front==-1 && rear==-1)
		{
			System.out.println("Circular Queue is Empty! Deletion is not possible!!!");
		}	
		else
		{
			 System.out.println("\nDeleted element :" +queue[front++]);
		      if(front == size)
			       front = 0;
		      if(front-1 == rear)
			       front = rear = -1;
		}
		
	}

	private static void display() {

		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty");
		}
		
		else if(front == size-1)
		{
			front = 0; 
			for(int i=front; i<=rear; i++)
			{
				System.out.println("Element is "+queue[i]);
			}		
		}	
		else
		{
			for(int i=front; i<=rear; i++)
			{
				System.out.println("Element is "+queue[i]);
			}
				
		}
	}

}
