package com.ravi.sorting;

public class SelectionSort {
		
	public void selecSort(int a[],int n)
	{
		int temp=0,min,count=0,count1=0;
		
		for(int i=0; i<n; i++)
		{
			min=i;
			for(int j=i+1; j<n; j++)
			{
				if(a[j] < a[min])
				{
					min=j;
				}
				count++;
			}
			
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
			count1++;
		
		}
		System.out.println("No of Time Loop Execute "+(count + count1)+" times");
	}	
	
	public void display(int a[],int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
		
    public static void main(String[] args) {
			
	 int [] a={3,98,56,2,5,100,33,15,79};
	 int n=a.length;
	 
	 SelectionSort s=new SelectionSort(); 
	 s.selecSort(a,n);
	 s.display(a,n);
	 
	}

}
