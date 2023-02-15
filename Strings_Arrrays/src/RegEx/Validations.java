package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validations {

	public static void main(String[] args) {
           String exp="[6-9][0-9]{9}";
           String str="Venky9704168253Jayaram9704278494";
           Pattern p=Pattern.compile(exp);
           Matcher m=p.matcher(str);
           while(m.find())
           {
        	   System.out.println(m.group());
           }
	}
}
