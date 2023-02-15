package com.jsp.Strings;

public class _01 {
	   public static void main(String[] args) {
		String s1=new String("Java");
		String s2="Java";
		String s3="Venky";
		Object o1=new String("Venky");//upcasting
		System.out.println(o1);
		System.out.println(s1.toString());
		System.out.println(s1);
		System.out.println(s1==s2);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(o1.equals(s3));//true
	}
	}

