package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumValidation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
        String exp="[6-9][0-9]{9}";
        System.out.println("Enter the mobile number");
        String phn=scn.next();
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(phn);
        System.out.println(m.matches());
	}

}
