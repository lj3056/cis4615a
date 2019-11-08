
/****************************************************************************** 
*  Compilation:  javac R04_STR02_J .java 
*  Execution:    java R04_STR02_J .java
*  Specify an appropriate locale when comparing locale-dependent data
 * ******************************************************************************/
 
	public class R04_STR02_J 
	{    
	  public static void main(String[] args) 
	  {
	    
	    String s = new String();
	    s = "title";
	    
	    processTagProper(s);
	    System.out.println("When properly handled: " + s);
	  }
	  
	  
	  //Compliant code
	  public static void processTagProper(String tag) {
	      if (tag.toUpperCase().equals("SCRIPT")) {
	        return;
	      }
	      // Process tag
	    }
	  