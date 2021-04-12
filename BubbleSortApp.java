package com.ravi.sorting;

public class BubbleSortApp {
	
	public void bubbSort(int a[],int n)
	{
		int count=0;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n-1-i; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				count++;
			}	
		}
		System.out.println("No of Time Loop Execute "+count +" times");
	}
	
	
	public void display(int a[],int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
	
	public static void main(String[] args) {
		
		int a[]={3,98,56,2,5,100,33,15,79};
		int n=a.length;
		
		BubbleSortApp t=new BubbleSortApp();
		t.bubbSort(a,n);
		t.display(a,n);
	}

}
