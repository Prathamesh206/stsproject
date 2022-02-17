package in.sts.stsproject.input;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;
import in.sts.stsproject.wordcount.FileWordsCount;

public class UserInput {
	final Logger log=Logger.getLogger(FileWordsCount.class);

	public ArrayList<String> singleFileInput(){
		Scanner scanner=null;
		try {
			ArrayList< String>fileObject=new ArrayList<String>();                   //creating arraylist object 
			scanner=new Scanner(System.in);                                        //Creating Scanner Class For taking input from user
			System.out.println("Enter the drive");                                 //Taking   the drive name from user               
			String drive=scanner.nextLine();
			System.out.println("Enter the file name");                             //Taking the file name from user         
			String file =scanner.nextLine();
			String path=""+drive+":\\"+file+".txt";                                //storing the path into the variable
			fileObject.add(path);                                                  //Storing the all the files into arraylist
			return fileObject;

		}
		catch(NullPointerException nullPointerException)                          
		{
			log.error("Files not stored ");
		}
		finally 
		{
			if(scanner!=null) 
			{
				scanner.close();
			}
		}
		return null;

	}

	public ArrayList<String> multiFileInput(){
		Scanner scanner=null;

		try {
			ArrayList<String> listFiles=new ArrayList<String>() ; 
			scanner=new Scanner(System.in);
			System.out.println("Enter the drive");                                 //Take the drive name from user               
			String drive=scanner.nextLine();
			String  path=""+drive+":\\";
			File file = new File(path);                                     //give the location of the file
			File[] files=file.listFiles();			                       //storing all the files in the directory in file array

			for(File File2:files) {                                        //itearting each file into file object                           
				if(File2.getName().endsWith(".txt")==true) {
					listFiles.add(path+File2.getName());

				}
				log.debug(listFiles);
				return lisfiles;
			}
		}
		catch(NullPointerException nullPointerException) 
		{
			log.error("File not stored");
		}
		finally 
		{
			if(scanner!=null) 
			{
				scanner.close();
			}

		}
		return null();
	}
}
