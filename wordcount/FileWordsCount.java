package in.sts.stsproject.wordcount;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.log4j.Logger;
public class FileWordsCount {
final Logger log=Logger.getLogger(FileWordsCount.class);        
	public void wordsCount(ArrayList<String>files) {

		int count=0;
		
		BufferedReader bufferedReader=null;
		try {
			for(String file:files) {
			FileReader file1 = new FileReader(file);                      //Give the location to the fileReader  object
			@SuppressWarnings("resource")
			BufferedReader bufferReader = new BufferedReader(file1);      //Creating Bufferreader read the file
			String line;
			while((line = bufferReader.readLine()) != null)               //Read the file and storing the string into the line
			{      
                 String []words=line.split(" ");                         //words object for storing the words in the string 
				  count=count+words.length;                               //count object for storing the to total no of count
				  log.info(count);                                         //count the no of word present in the file
			}
			count=0;
			

	}
		}catch(IOException ioException) {
			
		log.error("Cannot Read File Properly");
		}finally {
			if(bufferedReader!=null) {
				try {
					bufferedReader.close();
				} catch (IOException ioException) {
					log.error("cannot read file properly");
				}
			}
			
		}
	}
}
	


