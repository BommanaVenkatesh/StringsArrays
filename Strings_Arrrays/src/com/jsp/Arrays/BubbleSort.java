package com.jsp.Arrays;

public class BubbleSort {

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
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
}
