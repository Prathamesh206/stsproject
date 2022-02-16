package in.sts.stsproject.services;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.log4j.Logger;
import in.sts.stsproject.readers.MultipleFileReader;
import in.sts.stsproject.readers.SingleFileReader;

public class FileOperation {
	final Logger log=Logger.getLogger(FileOperation.class);

	public void operation() throws FileNotFoundException  {

		@SuppressWarnings("resource")
		Scanner  scanner=new Scanner(System.in);
		System.out.println("Enter 1 for Read only one file in drive");
		System.out.println(" Enter 2 for Read all the files in drive");
		System.out.println("Enter the operation you want tro perform");
		String operation=scanner.next();
		switch(operation) {
		case "1":
			SingleFileReader singleFileRead=new SingleFileReader();

			singleFileRead.singleFileRead();
			break;                                                         //That file name stored into the path

		case "2":
			MultipleFileReader multipleFileRead=new MultipleFileReader();       //for read the multiple file read create the multiple object
			multipleFileRead.multiFileRead();               
			break;
		default:
			log.info("Wrong input given");

		}



	}
}

