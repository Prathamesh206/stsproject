package in.sts.stsproject.readers;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;
import in.sts.stsproject.wordcount.FileWordsCount;
public class SingleFileReader {
	final Logger log=Logger.getLogger(MultipleFileReader.class);
	Scanner scanner=new Scanner(System.in);                                        //Creating scanner object for taking the input from the user 

	ArrayList<String> singleFilePathList=new ArrayList<String>();                  //Creating arraylist Object for storing the file in the array
	public void singleFileRead()
	{
		try {

			System.out.println("Enter the drive name");                              //taking the drive name from user 
			String drive=scanner.nextLine();
			System.out.println("Enter the File name");                               //taking the file name from the user 
			String input=scanner.nextLine();
			String path=""+drive+":\\"+input+".txt";
			singleFilePathList.add(path);                                            //adding the file into into the arraylist
			FileWordsCount wordCount=new FileWordsCount();                           //creating a FileWordsCount object
			wordCount.wordsCount(singleFilePathList);                                 	//with the help of the wordCount object call the wordscount method for counting the number of words in the file

		}catch(Exception excpeion ) {
			log.error("File not found exception ");
		}

		finally {
			if(scanner!=null) {
				scanner.close();
			}
		}
	}
}
