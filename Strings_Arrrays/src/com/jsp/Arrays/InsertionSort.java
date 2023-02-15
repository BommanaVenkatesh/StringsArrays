package com.jsp.Arrays;

public class InsertionSort {

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
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
}
