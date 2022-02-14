package in.sts.stsproject.wordcount;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.log4j.Logger;



public class FileWordsCount {
	final Logger log=Logger.getLogger(FileWordsCount.class);        
	public void wordsCount(ArrayList<String> listOfFiles) {
		BufferedReader bufferedReader=null;                          //Initialize  BufferReader Object
		int count=0;

		try {
			for(String path:listOfFiles) {                          //Iterating  Each file 
				FileReader file = new FileReader(path);             //Give the location to the filereader object
				@SuppressWarnings("resource")
				BufferedReader bufferReader = new BufferedReader(file);     //Bufferreader read the file
				String line;                                                
				while((line = bufferReader.readLine()) != null)             //Read the file and storing the string into the line
				{              
					String []words=line.split(" ");                         //words object for storing the words in the string 
					count=count+words.length;                               //count object for storing the to total no of count
					log.info(count);
				}
				count=0;

			}
		}
		catch(FileNotFoundException filenotfoundexception) {
			log.error("File not found");
		}
		catch(IOException ioexception) {
			log.error("cannot read file properly");
		}finally {
			if(bufferedReader!=null) {
				try {
					bufferedReader.close();
				} catch (IOException ioexception) {

					log.error("Cannot read file ");
				}
			}
		}


	}
}
