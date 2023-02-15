package com.jsp.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a= {1,7,2,9,10,5};
	      sort(a,0,a.length-1);
	      for(int i=0;i<a.length;i++)
	      {
	    	  System.out.print(a[i]+" ");
	      }
	}
	static void sort(int[] a,int start,int end)
	{
		if(start>=end) return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(i<=j)
		{
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}
}
