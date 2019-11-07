/****************************************************************************** 
*  Compilation:  javac R03_NUM03_J.java 
*  Execution:    java R03_NUM03_J.java
*  An unsigned int is read and then converted to a 32-bit unsigned int 
 * ******************************************************************************/
 
 package sample.java;

import java.io.*;

public class R03_NUM03_J {
public static void main(String args[]) throws IOException {
DataInputStream is = new DataInputStream(System.in);
System.out.println("Integer = " + getInteger(is));
}

public static long getInteger(DataInputStream is) throws IOException {
	System.out.println("Input integer data:");
	return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}
}
