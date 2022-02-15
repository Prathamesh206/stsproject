package in.sts.stsproject.readers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.apache.log4j.Logger;
import in.sts.stsproject.wordcount.FileWordsCount;
public class SingleFileReader {
	final Logger log=Logger.getLogger(MultipleFileReader.class);          //Create a logger object for  print the statement                                                     
	public void singleFileRead(String path)  {
		BufferedReader bufferedReader=null;
		try {
			FileReader file = new FileReader(path);             //Give the location to the fileReader  object
			@SuppressWarnings("resource")
			BufferedReader bufferReader = new BufferedReader(file);     //Creating Bufferreader read the file
			String line;
			while((line = bufferReader.readLine()) != null)             //Read the file and storing the string into the line
			{     
				FileWordsCount word=new FileWordsCount();             //with the help of the wordCount object call the wordscount method for counting the number of words in the file
				word.wordsCount(line);                                //count the no of word present in the file
			}

		}
		catch(IOException ioexception) 
		{
			log.error("Cannot read file properly ");
		}

		finally {
			if(bufferedReader!=null) {
				try {
					bufferedReader.close();
				} catch (IOException ioexception) {
					log.error("Cannot read file properly");
				}
			}

		}
	}
}
