package com.jsp.Strings;

public class _04 {

	public static void main(String[] args) {
         String s1="   Java Developer   ";
         String s2=s1.replace("Java","Python");
         String s3=s1.replace("Java","");
         String s4=s1.trim();
         String[] a=s1.split(" ");
         int i2=s1.indexOf('D');
         int i1=s1.indexOf('n');
         System.out.println(i1);
         System.out.println(i2);
         System.out.println(s2);
         System.out.println(s3);
         System.out.println(s4);
         for(String n:a)
        	 System.out.println(n);
	}
}
