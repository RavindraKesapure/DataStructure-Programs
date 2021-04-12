package com.ravi.datastructure;
import java.util.*;
class QueueList
{
	int data;
	QueueList link;
	
	QueueList(int data,QueueList link)
	{
		this.data=data;
		this.link=link;
	}
}
public class QueueUsingLinkList {
	
	static QueueList front = null;
	static QueueList rear = null;
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int ch;
		while(true)
		{
			System.out.println("\n 1:Insert\n 2:delete\n 3:display\n exit()\n");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			
			switch(ch)
			{
			case 1: insert(); break;
			
			case 2: delete(); break; 

			case 3: display(); break;
			
			case 4: System.exit(1);
			
			default: System.out.println("Invalid choice ");
			}
		}
		
	}

	private static void insert() {

		QueueList temp;
		int ele;
		System.out.println("Enter the Emement");
		ele=sc.nextInt();
		temp=new QueueList(ele,null);
		
		if(front==null)
		{
			front = rear = temp; 	
		}
		else
		{
		  rear.link = temp;
		  rear = temp; 
		}
	}

	private static void delete() {

		if(front==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			QueueList temp;
			temp = front;
			front = front.link;
			System.out.println("Delete element is "+temp.data);
			temp.link=null;
		}
	}

	private static void display() {
		QueueList temp;
		if(front==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			temp = front;
			int len=0;
			
			while(temp!=null)
			{
				System.out.println("Element is "+temp.data);
				temp = temp.link; 
			}
			
		}
		
		
	}

}
