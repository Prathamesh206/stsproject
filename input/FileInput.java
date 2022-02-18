package in.sts.stsproject.input;

import java.util.Scanner;
import org.apache.log4j.Logger;


public class FileInput {
	final Logger log=Logger.getLogger(FileInput.class);

	public static String getSingleFileInput() {
		String path=null;


		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the drive name");
		String Drive=sc.nextLine();
		System.out.println("Enter the file name");
		String file=sc.nextLine();
		path=""+Drive+":\\"+file+".txt";
		return path;
	} 

	public static String getMultipleFileInput() {

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the drive name ");
		String Drive=sc.nextLine();
		String path=""+Drive+":\\";
		return path;

	}
}

