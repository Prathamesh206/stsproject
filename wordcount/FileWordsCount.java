package in.sts.stsproject.wordcount;
import org.apache.log4j.Logger;



public class FileWordsCount {
	final Logger log=Logger.getLogger(FileWordsCount.class);        
	public void wordsCount(String line) {
		         int count=0;
                  String []words=line.split(" ");                         //words object for storing the words in the string 
				  count=count+words.length;                               //count object for storing the to total no of count
				  log.info(count);
			
//				count=0;

		

	}
}
