package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAll_Split {

	public static void main(String[] args) {
        String s1="a1b2c3";
        String s2=s1.replace("[0-9]","");//not supports replace
        System.out.println(s2);
        String s3=s1.replaceAll("[0-9]","");// supports
        System.out.println(s3);
        String[] a=s1.split("[0-9]");//supports
        for(String n:a)
        	System.out.print(n+" ");
        System.out.println();
        Pattern p=Pattern.compile("([a-z])\\1+");
        Matcher m=p.matcher("succcessss");
        while(m.find())
        	System.out.println(m.group());
	}

}
