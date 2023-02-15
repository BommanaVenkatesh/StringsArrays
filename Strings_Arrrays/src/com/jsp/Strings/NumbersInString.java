package com.jsp.Strings;

public class NumbersInString {

	public static void main(String[] args) {
		String s1="KA12EC3456";
		int sum=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c>='0' && c<='9')
			{
				System.out.print(c+" ");
				sum+=c-'0';
			}
		}
		System.out.println();
		System.out.println("Sum is "+sum);
	}
}
