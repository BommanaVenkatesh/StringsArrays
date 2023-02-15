package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterSet {

	public static void main(String[] args) {
        Pattern p=Pattern.compile("a[123]");
        Matcher m=p.matcher("a1a2aa3a4a1");
        while(m.find())
        {
        	System.out.println(m.start());
        	System.out.println(m.end());
        	System.out.println(m.group());
        	System.out.println("-----");
        }
	}

}
