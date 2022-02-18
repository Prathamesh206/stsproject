package in.sts.stsproject.services;
import org.apache.log4j.Logger;
import in.sts.stsproject.input.FileInput;
import in.sts.stsproject.reader.MultipleFileReader;
import in.sts.stsproject.reader.SingleFileReader;
import in.sts.stsproject.wordcount.FileWordsCount;

public class Opearation {                                                                       //Operation class for performing the business logic
	final Logger log=Logger.getLogger(MultipleFileReader.class);                                //Creating a logger class for for print
	public void fileOpertion(String operation) {
		FileWordsCount wordCount=new FileWordsCount();                                          //Creating the Counting Class Object For Counting the words in the file                 
		switch(operation) {                                        
		case "1":
			SingleFileReader singleFileRead=new SingleFileReader();                            //Single File reader object create for for read the file 
			wordCount.wordsCount(singleFileRead.singleFileReader(FileInput.getSingleFileInput()));
			break;                                                        
		case "2":
			MultipleFileReader multipleFileRead=new MultipleFileReader();                      //for read the multiple file read create the multiple object
			wordCount.wordsCount(multipleFileRead.multiFileRead(FileInput.getMultipleFileInput()));               
			break;
		default:
			log.info("Wrong input given");                                                      //if user give the other input than given then it will be comes in the default case
		}

	}

}
