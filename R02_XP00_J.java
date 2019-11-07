/****************************************************************************** 
*  Compilation:  javac R02_XP00_J.java 
*  Execution:    java R02_XP00_J.java 
*  Sees if file is able to be deleted and if not it notifies user 
 * ******************************************************************************/
 
import java.io.*; 

	public class R02_XP00_J {
	public static void main(String args[]) {
		System.out.println("Will the file be deleted after creation?");
	deleteFile();

	}

	public static void deleteFile() {
		File someFile = new File("hello.txt");
		//Do something with someFile
		System.out.println(someFile + " created file object");
		
		if (!someFile.delete()) {
			//handle failure to delete file
		System.out.println(someFile + " NOT Deleted");
	}
	else
	{
		System.out.println(someFile + " Deleted");
	}
	}

	}