package com.jsp.Arrays;

public class MergeSort {

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
		if(a.length==1) return;
		int[] left=new int[a.length/2];
		int[] rigth=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)
			left[i]=a[i];
		for(int j=0;j<rigth.length;j++)
		    rigth[j]=a[left.length+j];
		sort(left);
		sort(rigth);
		merge(left,rigth,a);
	}
	static void merge(int[] a,int[] b,int[] c)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j]) c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
	}
}
