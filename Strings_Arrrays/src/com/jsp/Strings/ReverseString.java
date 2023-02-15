package com.jsp.Strings;

public class ReverseString {

	public static void main(String[] args) {
		String s1="Malayalam";
		String rev=reverse(s1);
		System.out.println(rev);
	}
	static String reverse(String s)
	{
		char[] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}
}
