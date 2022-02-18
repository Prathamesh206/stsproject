package in.sts.stsproject.wordcount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
public class FileWordsCount {
	final Logger log=Logger.getLogger(FileWordsCount.class);

	public    void wordsCount(ArrayList<String>listOfFiles){
		int count=0;

		for(String line:listOfFiles) {                                   //Iterating each files

			count=0;
			String []words=line.split(" ");                           //split the line from space and stored in the word array
			count=count+words.length;                                 //count all the words in the variable

			log.info(count);           

		}
	}




	public void  wordsCount(HashMap<String, ArrayList<String>> fileMap) {
		int count=0;

		for (Map.Entry<String, ArrayList<String>> set : fileMap.entrySet()) {                //iterating each file from filemap of fileshashmap in the form of key and value pair  

			String fileName=set.getKey() ;                                             //show thw file
			ArrayList<String>listOfFiles=set.getValue();                    
			for(String line:listOfFiles) {                                            //  Then the list of files itearting in single line 

				String []words=line.split(" ");                           //split the line from space and stored in the word array
				count=count+words.length;                                 //count all the words in the variable

				log.info(fileName);                                        //Show the filename 
				log.info(count);                                           //give the total count of words

			}
			count=0;
		}

	}
}





