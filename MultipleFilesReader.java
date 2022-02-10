package in.sts.stsproject.assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class MultipleFilesReader{


	public  void readingMultipleFiles() {
		final Logger log=Logger.getLogger(MultipleFilesReader.class);       //create a logger object for print the statement
		BufferedReader bufferReader=null;                                    //buffer reader object 
		Scanner scanner=null;                                                //scanner reader object
		try {
			scanner=new Scanner(System.in);

			log.info("Enter the drive");                                    //Taking the drive name from user
			String drive=scanner.next();
			//			 scanner.remove();
			String path=""+drive+":\\";                                     //Storing path in the variable 
			File file = new File(path);
			File[] files=file.listFiles();			                       //storing all the files in the directory in file array
			ArrayList<String> getFilesname=new ArrayList<>();              //Creating arraylist object for storing the .txt files
			for(File File2:files) {
				if(File2.getName().endsWith(".txt")==true) {                          
					getFilesname.add(path+File2.getName()); 
				}
			}
			log.debug(getFilesname);                                       //print the all the files
			String line;                                                    //line variable for storing each statement in that line
			int count=0;

			for(String singleFile:getFilesname)
			{                           //Iterating each files
				FileInputStream fileInputstream = new FileInputStream(singleFile);
				InputStreamReader inputStreamReader= new InputStreamReader(fileInputstream);
				bufferReader = new BufferedReader(inputStreamReader);

				while((line = bufferReader.readLine()) != null)
				{             //if the files i not null then loop has been executed  

					String []words=line.split(" ");                           //split the line from space and stored in the word array
					count=count+words.length;                                 //count all the words in the variable
					log.info(count);                                          //total count of words
				}
				count=0;

			}

		}catch(NullPointerException nullpointerException) {                 
			log.error("No files in the directory");
		}catch(IOException ioexception) {
			log.info("cannot read file properly");
		}
		finally {                                                       // close the bufferreader and scanner object

			if(bufferReader!=null) {
				try {
					bufferReader.close();
				} catch (IOException ioexception) {

					ioexception.printStackTrace();
				}
			}
			if(scanner!=null) {
				scanner.close();
			}


		}

	}

}






