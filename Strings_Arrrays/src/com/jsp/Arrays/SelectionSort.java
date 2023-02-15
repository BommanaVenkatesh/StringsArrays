package com.jsp.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a= {1,7,2,9,10,5};
	      sort(a);
	      for(int i=0;i<a.length;i++)
	      {
	    	  System.out.print(a[i]+" ");
	      }
	}
	static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index]) index=j;
			}
			if(i!=index)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
}
