package in.sts.stsproject.services;
import java.util.Scanner;
import org.apache.log4j.Logger;
import in.sts.stsproject.readers.MultipleFileReader;
import in.sts.stsproject.readers.SingleFileReader;

public class FileOperation {
	final Logger log=Logger.getLogger(FileOperation.class);
	
	public void operation()  {
		@SuppressWarnings("resource")
		Scanner  scanner=new Scanner(System.in);
		System.out.println("Enter 1 for Read only one file in drive");
		System.out.println(" Enter 2 for Read all the files in drive");
		System.out.println("Enter the operation you want tro perform");
		String operation=scanner.nextLine();
		System.out.println("Enter the drive");                      //Take the drive name from user               
		String drive=scanner.nextLine();

		String path=""+drive+":\\";                                  //drive name stored into the path
		switch(operation) {
		case "1":
			System.out.println("Enter the File name");                               //taking the file name from the user 
			String input=scanner.nextLine();
			path=path+input+".txt";                                                   //That file name stored into the path
			SingleFileReader singleFileRead=new SingleFileReader();

			singleFileRead.singleFileRead(path);

			break;
		case "2":
			MultipleFileReader multipleFileRead=new MultipleFileReader();
			multipleFileRead.multiFileRead(path);               
			break;
		default:
			log.info("Wrong input given");
		}
		scanner.close();
	


	}
}
