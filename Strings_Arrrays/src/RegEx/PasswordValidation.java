package RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the Password");
        String password=scn.next();
        String exp="(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{6,12}";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(password);
        System.out.println(m.matches());
	}

}
