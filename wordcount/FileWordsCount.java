package in.sts.sts_project.wordcount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
public class FileWordsCount {
	final Logger log=Logger.getLogger(FileWordsCount.class);
	int count=0;

	public int wordsCount(ArrayList<String>listOfFiles){
		 count=0;

		for(String line:listOfFiles) {                                   //Iterating each files

			count=0;
			String []words=line.split(" ");                           //split the line from space and stored in the word array
			count=count+words.length;                                 //count all the words in the variable

			log.info(count);           

		}
		return count;
	}




	public HashMap<String, Integer>  wordsCount(HashMap<String, ArrayList<String>> fileMap) {
		count=0;
		HashMap<String, Integer> multipleFileCount=new HashMap<String, Integer>();
		for (Map.Entry<String, ArrayList<String>> set : fileMap.entrySet()) {                //iterating each file from filemap of fileshashmap in the form of key and value pair  

			String fileName=set.getKey() ;    
			log.info(fileName);   //show thw file
			ArrayList<String>listOfFiles=set.getValue();                    
			int fileCount=wordsCount(listOfFiles);
			multipleFileCount.put(fileName, fileCount);
		}
		return multipleFileCount;

	}
}





