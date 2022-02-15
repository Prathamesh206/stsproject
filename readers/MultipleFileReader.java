package in.sts.stsproject.readers;
import java.io.File;
import org.apache.log4j.Logger;



public class MultipleFileReader {
	final Logger log=Logger.getLogger(MultipleFileReader.class);               //create a logger object for print the statement
	SingleFileReader singleFileReader=new SingleFileReader();                  //create a SingleFileReader Object
	public  void multiFileRead(String path) {                                   
		try {
			                              
			File file = new File(path);                                     //give the location of the file
			File[] files=file.listFiles();			                       //storing all the files in the directory in file array
			         
			for(File singleFile:files) {                                        //itearting each file into file object                           
				if(File2.getName().endsWith(".txt")==true) {               //if the file ends with txt          
					String newPath=path+singleFile.getName();                   //then all the file stored into the newPath    
					singleFileReader.singleFileRead(newPath);              //Creating SingleFileReader object and read the file in the array
				}
			}
			                                    

		}catch(NullPointerException nullpointerException) {                 
			log.error("No files in the directory");
		}
		
	}
}

