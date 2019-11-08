/****************************************************************************** 
*  Compilation:  javac R07_ERR04_J.java 
*  Execution:    java R07_ERR04_J.java
*  Do not complete abruptly from a finally block
 * ******************************************************************************/

public class R07_ERR04_J {

	private static boolean doLogic(boolean throwerror) {
	    try {
	    	if(throwerror)
	      		throw new IllegalStateException();
	    } finally {
	      System.out.println("logic done");
	    }
	    // Any return statements must go here;
	    // applicable only when exception is thrown conditionally
	    System.out.println("Exit finally block.");
	    System.out.println("Return true");
	    return true;
	  }

   public static void main(String[] args) {
   	System.out.println("Running the logic with no error...");
   	doLogic(false);
   	System.out.println("Running the logic with an error...");
   	doLogic(true);
   	System.out.println("Done.");
   }


}