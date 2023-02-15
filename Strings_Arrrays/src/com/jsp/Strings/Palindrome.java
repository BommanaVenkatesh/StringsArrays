package com.jsp.Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s1="Malayalam";
		if(isPalindrome(s1))
			System.out.println(s1+" is a Palindrome");
		else
			System.out.println(s1+" is not a Palindrome");
	}
	public static boolean isPalindrome(String s)
	{
		s=s.toLowerCase();
		char[] a=s.toCharArray();
		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]!=a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}
