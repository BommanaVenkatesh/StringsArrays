package com.jsp.Strings;

public class VowelsCount {

	public static void main(String[] args) {
		String s1="Malayalam";
		s1=s1.toLowerCase();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			{
				count++;
				System.out.print(c+" ");
			}
		}
		System.out.println();
		System.out.println("Count = "+count);
	}
}
