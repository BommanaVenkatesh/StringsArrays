package com.jsp.Strings;

public class AllPalindromes {

	public static void main(String[] args) {
		String s1="Malayalam";
		s1=s1.toLowerCase();
		String big="",small="";
		char[] a=s1.toCharArray();
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(isPalindrome(i,j,s1))
				{
					String temp=s1.substring(i,j+1);
					System.out.println(temp);
					small=temp;
					if(small.length()>temp.length()) small=temp;
					if(big.length()<temp.length()) big=temp;
				}
			}
		}
		System.out.println("Big Palindrome is "+big);
		System.out.println("Small Palindrome is "+small);
	}
	public static boolean isPalindrome(int i,int j,String s)
	{
		char[] a=s.toCharArray();
		while(i<j)
		{
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}
