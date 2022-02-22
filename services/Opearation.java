package in.sts.sts_project.services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.reader.MultipleFileReader;
import in.sts.sts_project.reader.*;
import in.sts.sts_project.wordcount.FileWordsCount;


public class Opearation {                                                                       //Operation class for performing the business logic
	int count=0;                   
	final Logger log=Logger.getLogger(MultipleFileReader.class);                                //Creating a logger class for for print
	public void fileOpertion(String operation) {
		FileWordsCount wordCount=new FileWordsCount();                                          //Creating the Counting Class Object For Counting the words in the file                 
		switch(operation) {                                        
		case "1":
			SingleFileReader singleFileReadr=new SingleFileReader();                            //Single File reader object create for for read the file 
			count=wordCount.wordsCount(singleFileReadr.singleFileReader (FileInput.getSingleFileInput()));
			System.out.println( "Total Number of wordcount:"+ count);
			break;                                                        
		case "2":
			MultipleFileReader multipleFileReadr=new MultipleFileReader();                      //for read the multiple file read create the multiple object
			HashMap<String, Integer> multipleFileCount =wordCount.wordsCount(multipleFileReadr.multiFileRead(FileInput.getMultipleFileInput()));               
			for (Map.Entry<String, Integer> set : multipleFileCount.entrySet()) {
				System.out.println("Filename is  = "+set.getKey());
				System.out.println("total number of wordcount = "+set.getValue());
				System.out.println(" ");
//				count=count+set.getValue();

			}
//			System.out.println( "Total Number of wordcount:"+ count);
			break;
		default:
			log.info("Wrong input given");                                                      //if user give the other input than given then it will be comes in the default case
		}

	}

}
