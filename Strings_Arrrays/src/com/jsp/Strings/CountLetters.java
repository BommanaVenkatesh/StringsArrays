package com.jsp.Strings;

public class CountLetters {

	public static void main(String[] args) {
		String s1="javak223245622";
		int sum=0;
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			String s2=s1.replace(c+"","");
			int count=s1.length()-s2.length();
			System.out.println(c+"="+count);
			if(count>1)
			{
				if(c>='0' && c<='9')
				{
					for(int i=1;i<=count;i++)
					sum+=c-'0';
				}
			}
			s1=s2;
		}
		System.out.println("Sum of Deplicates is "+sum);
	}
}
