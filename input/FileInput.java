package in.sts.sts_project.input;

import java.util.Scanner;
import org.apache.log4j.Logger;


public class FileInput {
	final Logger log=Logger.getLogger(FileInput.class);

	static Scanner  scanner=new Scanner(System.in); 
	public static String getInput() {
		                        //Creating Scanner class for taking input from user
		System.out.println("Enter 1 for Read only one file in drive");
		System.out.println(" Enter 2 for Read all the files in drive");
		System.out.println("Enter the operation you want tro perform");
		String operation=scanner.nextLine();
		
		return operation;
	}



	public static String getSingleFileInput() {
		String path=null;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name");
		String Drive=scanner.nextLine();
		System.out.println("Enter the file name");
		String file=scanner.nextLine();
		path=""+Drive+":\\"+file+".txt";
		scanner.close();
		return path;
	} 

	public static String getMultipleFileInput() {

		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name ");
		String Drive=scanner.nextLine();
		String path=""+Drive+":\\";
		scanner.close();
		return path;
		

	}
}

