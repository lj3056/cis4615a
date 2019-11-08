/****************************************************************************** 
*  Compilation:  javac R49_MSC01_J.java 
*  Execution:    java R49_MSC01_J.java
*   Do not use an empty infinite loop
 * ******************************************************************************/
 
public class R49_MSC01_J {

	public static final int DURATION=100; // 100 in milliseconds
	public static int counter = 0; // count will break the loop

    public static void main(String[] args) {
    	System.out.println("Program Starting.\nGoing into nop()...");

    	try
    	{
    		nop();
    	}
    	catch(InterruptedException ex)
    	{
    		System.out.println("nop interrupted");
    	}

    	System.out.println("Done");

    }

	 public static void nop() throws InterruptedException {
	  while (true) {
	    // Useful operations
	    Thread.sleep(DURATION);
	    
	    counter++;
	    if(counter>=10)
	    	throw new InterruptedException();
	  }
	}
}