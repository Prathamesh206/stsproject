package in.sts.stsproject.readers;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import in.sts.stsproject.input.UserInput;
import in.sts.stsproject.wordcount.FileWordsCount;

public class SingleFileReader {
	final Logger log=Logger.getLogger(MultipleFileReader.class);          //Create a logger object for  print the statement                                                     
	public void singleFileRead()  {
		UserInput userInput=new UserInput();                           //creating a UserInput object for input
		ArrayList<String> fileObject=userInput.SingleFileInput();        //call the SingleFileInput method for taking the input from user and storing into the arraylist
		FileWordsCount word=new FileWordsCount();                         //with the help of the wordCount object call the wordscount method for counting the number of words in the file
		word.wordsCount(fileObject);                                //count the no of word present in the file
	}
}

