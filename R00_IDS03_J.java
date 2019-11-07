/* Non Compliant */
/****************************************************************************** 
*  Compilation:  javac R00_IDS03_J.java 
*  Execution:    java R00_IDS03_J.java
*  Data that is inputted into string should not be non-character
 * ******************************************************************************/
 
import java.util.logging.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class R00_IDS03_J {
static Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());

public static String sanitizeUser(String username) {
	return Pattern.matches("[A-Za-z0-9_]+", username)
	? username : "unauthorized user";
}

public static void main(String args[]) {
boolean loginSuccessful;

//testing for valid username
System.out.print("Input Valid Username: ");
Scanner in = new Scanner(System.in);
String username = in.nextLine();
loginSuccessful = true;

if(loginSuccessful) {
	logger.severe("User login succeeded for : " + sanitizeUser(username));
} else {
	logger.severe("User login failed for: " + sanitizeUser(username));
}


//testing for invalid username 
System.out.print("Input invalid Username: ");
in = new Scanner(System.in);
username = in.nextLine();
loginSuccessful = false;

if(loginSuccessful) {
	logger.severe("User login succeeded for : " + sanitizeUser(username));
} else {
	logger.severe("User login failed for: " + sanitizeUser(username)); 
}

}
