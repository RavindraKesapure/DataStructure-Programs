package com.ravi.datastructure;

import java.util.*;
public class StackApp {
	
	static Scanner sc=new Scanner(System.in);
    static int max=5;
	static int stack[]=new int[max],top=-1;
	
	public static void main(String[] args) {
		
		int choice,val;
		while(true)
		{
			
			System.out.println(" 1: PUSH\n 2: POP\n 3: DISPLAY\n 4: EXIT\n");
			System.out.println("Enter your choice\n");
			choice=sc.nextInt();
		
			  switch(choice) { case 1: 
				             System.out.println("Enter the Value In stack");
				             val=sc.nextInt();
				              push(val); 
				                break;
			 
			  case 2:         val =  pop();
			                  if(val==0)
			                  {
			                	  System.out.println("Stack Is Underflow");
			                  }
			                  else
			                  {
			                	  System.out.println("POP Element is "+val);
			                  }
			                    break;
			  
			  case 3: display(); break;
			  
			  case 4: System.exit(1);
			  
			  default: System.out.println("Enter Wrong Choice\n");
			  
			  }
			 
		}
		

	}

	
	private static void push(int val) 
	{
		if(top==max-1)
		{
			System.out.println("Statck is Overflow\n");
		}
		else
		{
			top=top+1;
			stack[top]=val;
			System.out.println("Push Element is "+val);
		}	
		
	}

	private static int pop() {
		if(top==-1)
		{
			System.out.println("Stack Is Underflow\n");
		}
		else
		{
		   return stack[top--];
		}
		return 0;
	}
	
    private static void display() {

    	if(top==-1)
    	{
    		System.out.println("Stack Is Underflow\n");
    	}
    	else
    	{
    		for(int i=top; i>=0; i--)
    		{
    			System.out.println(stack[i]);
    		}
    	}
    	
		
	}


}
