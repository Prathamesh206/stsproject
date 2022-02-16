package in.sts.stsproject.readers;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import in.sts.stsproject.input.UserInput;
import in.sts.stsproject.wordcount.FileWordsCount;


public class MultipleFileReader {
	final Logger log=Logger.getLogger(MultipleFileReader.class);               //create a logger object for print the statement

	public  void multiFileRead()  {  
		try {
			UserInput userInput=new UserInput();                              //creating a UserInput object for input 
			ArrayList<String>listfiles=userInput.multiFileInput();            //call the multiFileInput method for taking the input from user and storing into the arraylist

			FileWordsCount   fileWordsCount=new FileWordsCount();           //create FileWordsCount object for count the number present in the file
			fileWordsCount.wordsCount(listfiles);

		}catch(NullPointerException nullPointerExeption) {
			log.error("File not found");
		}
	}
}

