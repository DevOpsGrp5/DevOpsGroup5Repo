/**
 * This package holds the custom classes written to handle files.
 */
package pgm.system.file;

import java.io.File;

/**
 * This class lists the contents of the directory that is passed at the time of innvocation.
 * Usage: DirectoryContents <Directory path>
 * 
 * @author Pragam Saxena
 *
 */
public class DirectoryContents {

	/**
	 * Main method that gets executed when the program is executed.
	 * It accepts PATH / directory as the argument (supplied at command prompt).
	 * If the PATH / directory does not exist then it exits with an error response.
	 * 
	 * @param args Directory path
	 */
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Error: Invalid count of arguments");
			System.out.println("\t\tUsage: DirectoryContents <Directory path>");
			System.exit(-1);
		}//condition for incorrect number of arguments ends
		
		int dirCount = 0;
		int fileCount = 0;
		File dirLoc = new File(args[0]);
		File[] list = dirLoc.listFiles();
		for(int i=0; i<list.length; i++) {
			if(list[i].isDirectory()) {
				dirCount++;
			} else if(list[i].isFile()) {
				fileCount++;
			}
		}//loop for all files ends
		System.out.println("\n\nDirectory " + args[0] + " has...");
		System.out.println("\tFiles:\t\t" + fileCount);
		System.out.println("\tDirectories:\t" + dirCount);
	}//main method ends
}//class DirectoryContents ends