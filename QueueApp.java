package com.ravi.datastructure;

import java.util.*;
public class QueueApp {

	static Scanner sc=new Scanner(System.in);
	static int max=5;
	static int queue[]=new int[max], front=0,rear=0; 
	public static void main(String[] args) {

		int choice,val;
		while(true)
		{
			System.out.println(" 1:Insert\n 2:Delete\n 3:Display\n 4:Exit()\n");
			System.out.println("Enter Your Choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter the Element\n");
					val=sc.nextInt();
					insert(val);
					break;
				
				case 2: delete();
				       break;
				
				case 3:display();break;
				
				case 4:System.exit(1);
				
				default: System.out.println("Invalid Input\n");
			}
		}
		
	}
	

	private static void insert(int val) {

		if(rear==max)
		{
			System.out.println("Queue Is Full");
		}
		else
		{
			queue[rear]=val;
			System.out.println("Insert Element is "+val);
			rear++;
		}
		
	}
	private static void delete() {
         if(front ==  rear)
        	 System.out.println("Queue Is Empty");
         else
         {
        	 System.out.println("Delete Element is "+queue[front]);
        	 for(int i=0; i<rear-1; i++)
        	 {
             	 queue[i] = queue[i+1];	
        	 }
        	 rear--;
         }
	}
	private static void display() {

		if(front == rear)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			System.out.println("Queue Element is \n");
			for(int i=front; i<rear; i++)
			{
				System.out.println(queue[i]);
			}
		}
	}
}
