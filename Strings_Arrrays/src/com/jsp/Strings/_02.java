package com.jsp.Strings;

public class _02 {

	public static void main(String[] args) {
        String s1="JavaDeveloper";
        int i1=s1.length();
        char c=s1.charAt(4);
        char[] a=s1.toCharArray();
        String s2=s1.substring(0,4);
        String s3=s1.substring(4);
         String s4=s1.toLowerCase();
         String s5=s1.toUpperCase();
        System.out.println("Length="+i1);
        System.out.println("Charracter at index 4 is "+c);
        for(char c1:a)
        	System.out.print(c1+" ");
        System.out.println();
        for(int i=a.length-1;i>=0;i--)//reverse string
        	System.out.print(a[i]+" ");
        System.out.println();
        System.out.println(s2);//Java
        System.out.println(s3);//Developer
        System.out.println(s4);
        System.out.println(s5);
	}

}

