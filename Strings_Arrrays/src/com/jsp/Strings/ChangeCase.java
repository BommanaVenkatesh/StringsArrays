package com.jsp.Strings;

public class ChangeCase {

	public static void main(String[] args) {
		String s1="Java";
		String chan=change(s1);
		System.out.println(chan);
	}
	static String change(String s)
	{
		char[] a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='A' && a[i]<='Z')
			{
				a[i]=(char)(a[i]+32);
			}
			else if(a[i]>='a' && a[i]<='z')
			{
				a[i]=(char)(a[i]-32);
			}
		}
		return new String(a);
	}
}
