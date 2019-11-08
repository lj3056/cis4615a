
/****************************************************************************** 
*  Compilation:  javac R00_IDS03_J.java 
*  Execution:    java R00_IDS03_J.java
*  Data that is inputted into string should not be non-character
 * ******************************************************************************/
 
import java.util.logging.*;
import java.util.regex.Pattern;
import java.util.Scanner;


public class R00_IDS03_J {
	
	static Logger logger = Logger.getLogger(MyLogger.class.getName());
	
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String firstcheck = "Login";
		String secondcheck = "Password";
		
		
		System.out.println("To test that it properly works, use Login and Password for the Login and Password. Try 1234 to see it fail. \n\n");

		
		System.out.println("Login:");
		String username = new String(scan.next());
		
		System.out.println("Password:");
		String password = new String(scan.next());
		
		boolean loginSuccessful = false;
		

		//check username and password to determine if login is allowed.
		if(username.compareTo(firstcheck)== 0)
		{
			if(password.compareTo(secondcheck)== 0) 
			{
				loginSuccessful = true;
			}
		}
		
		//compliant check with sanitation
		if (loginSuccessful == true) {
			  logger.severe("User login succeeded for: " + sanitizeUser(username));
			} else {
			  logger.severe("User login failed for: " + sanitizeUser(username));
			}
		
	}
	//function to sanatize user input for the username field
	public static String sanitizeUser(String username) {
		  return Pattern.matches("[A-Za-z0-9_]+", username)
		      ? username : "unauthorized user";
	}

	public static class MyLogger 
	{
		static private String Log;
	}

	

}