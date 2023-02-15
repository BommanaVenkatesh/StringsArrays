package com.jsp.Strings;

public class _03 {

	public static void main(String[] args) {
       String s1=new String("Java");
       String s2=s1;
       s2=s2.toLowerCase();
       System.out.println(s1==s2);
       System.out.println(s1.equals(s2));
	}

}
