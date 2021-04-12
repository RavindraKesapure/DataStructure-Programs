package com.ravi.datastructure;
import java.util.*;
class QueueDouble
{
	int data;
	QueueDouble left,right;
	
	QueueDouble(int data,QueueDouble left,QueueDouble right)
	{
		this.data=data;
		this.left=left;
		this.right=right;
	}
}
public class QueueUsingDoubleLinkList {

	static QueueDouble front = null;
	static QueueDouble rear = null;
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
		QueueDouble temp;
		int ele;
		System.out.println("Enter the Emement");
		ele=sc.nextInt();
		temp=new QueueDouble(ele,null,null);
		
		if(front==null)
		{
			front = rear = temp; 	
		}
		else
		{
			rear.right=temp;
			temp.left = rear;
			rear=temp;	
		}
		
	}

	private static void delete() {

		if(front==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			QueueDouble temp;
			temp=front;
			
			front = front.right;
			
			System.out.println("Delete Element is "+temp.data);
			temp = temp.right;
		}
		
	}

	private static void display() {

		QueueDouble temp;
		if(front==null)
		{
			System.out.println("Queue is Empty");
		}
		else
		{
			temp = front;
			while(temp !=null)
			{
				System.out.println("Element is "+temp.data);
				temp = temp.right;
			}
		}
		
		
	}

}
