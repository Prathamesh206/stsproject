package in.sts.stsproject.readers;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;
import in.sts.stsproject.wordcount.FileWordsCount;

public class MultipleFileReader {
	public  void multiFileRead() {
		final Logger log=Logger.getLogger(MultipleFileReader.class);
	
		        //create a logger object for print the statement
		BufferedReader bufferReader=null;                                     //buffer reader object 
		Scanner scanner=null;                                                //scanner reader object
		try {
			scanner=new Scanner(System.in);

			log.info("Enter the drive");                                    //Taking the drive name from user
			String drive=scanner.next();

			String path=""+drive+":\\";                                     //Storing path in the variable 
			File file = new File(path);
			File[] files=file.listFiles();			                       //storing all the files in the directory in file array
			ArrayList<String> multipleFileList=new ArrayList<>();              //Creating arraylist object for storing the .txt files
			for(File File2:files) {
				if(File2.getName().endsWith(".txt")==true) {                          
					multipleFileList.add(path+File2.getName()); 
				}
			}
			log.debug(multipleFileList);                                       //print the all the files
			FileWordsCount wordsCount=new FileWordsCount();
			wordsCount.wordsCount(multipleFileList);
			
		}catch(NullPointerException nullpointerException) {                 
			log.error("No files in the directory");
		}
		finally {                                                       // close the bufferreader and scanner object

			if(bufferReader!=null) {
				try {
					bufferReader.close();
				} catch (IOException ioexception) {

					log.error("Cannot Read file Properly");
				}
			}
			if(scanner!=null) {
				scanner.close();
			}


		}

	}
}
