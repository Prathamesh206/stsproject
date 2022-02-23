package in.sts.sts_project.services;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.reader.MultipleFileReader;
import in.sts.sts_project.reader.*;
import in.sts.sts_project.wordcount.FileWordsCount;


public class Operation {                                                                       //Operation class for performing the business logic
	int count=0;                   
	final Logger log=Logger.getLogger(MultipleFileReader.class);                               //Creating a logger class for for print
	HashMap<String, Integer> hashMap=new HashMap<String, Integer>();                           //Creating hashmap object for storing the file and count
	public HashMap<String, Integer> fileOpertion(String operation) {
		FileWordsCount wordCount=new FileWordsCount();                                          //Creating the Counting Class Object For Counting the words in the file                 
		switch(operation) {                                        
		case "1":
			SingleFileReader singleFileReadr=new SingleFileReader();                            //Single File reader object create for for read the file 
			count=wordCount.wordsCount(singleFileReadr.singleFileReader (FileInput.getSingleFileInput()));
			hashMap.put("file", count);                                                           

			return hashMap;

		case "2":
			MultipleFileReader multipleFileReadr=new MultipleFileReader();                      //for read the multiple file read create the multiple object
			HashMap<String, Integer> multipleFileCount =wordCount.wordsCount(multipleFileReadr.multiFileRead(FileInput.getMultipleFileInput()));               
			for (Map.Entry<String, Integer> set : multipleFileCount.entrySet()) {
				
				hashMap.put(set.getKey(), set.getValue());
			}
			return hashMap;	

		default:
			log.info("Wrong input given");                                                      //if user give the other input than given then it will be comes in the default case
		}
		return null;

	}

}
