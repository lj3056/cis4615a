  /****************************************************************************** 
*  Compilation:  javac R04_STR01_J.java 
*  Execution:    java R04_STR01_J.java
*  Counts the number of characters in the string and prints it properly
 * ******************************************************************************/

import java.lang.*;

public class R04_STR01_J 
{
  public static void main(String[] args)
  {
    String s = new String();
    s = "0x123456";
    String result = new String();
    String result2 = new String();
    
    System.out.println("Original string: " + s + "\n");
    
    System.out.println("Correct string:");
    result2 = trimProper(s);
    System.out.println(result2);
    
  }
  
  
  //this is the method that counts the number of characters in a string
  public static String trimProper(String string) {
      int ch;
      int i;
      for (i = 0; i < string.length(); i += Character.charCount(ch)) {
        ch = string.codePointAt(i);
        if (!Character.isLetter(ch)) {
          break;
        }
      }
      return string.substring(i);
    }
  
  
  
  

}