/****************************************************************************** 
*  Compilation:  javac R04_STRO3_J.java 
*  Execution:    java R04_STRO3_J.java
*  Non character data should not be inputted into string 
 * ******************************************************************************/

public class R04_STR03_J {
	public static void main(String args[]) {
		System.out.println("Data properly casted to string");
		CompliantSolution();

	
	}
public static void CompliantSolution(){
	BigInteger x = new BigInteger("530500452766");
	String s = x.toString(); //Valid character data
	byte[] byteArray = s.getBytes();
	String ns = new String(byteArray);
	x = new BigInteger(ns);
	System.out.println("x = " + x);
	}

}