package in.sts.stsproject.assignment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class MultipleFilesReader{

	
	public  void readingMultipleFiles() {
		final Logger log=Logger.getLogger(MultipleFilesReader.class);
		BufferedReader bufferReader=null;
		Scanner scanner=null;
		try {
			scanner=new Scanner(System.in);

			log.info("Enter the drive");
			String drive=scanner.next();
			//			 scanner.remove();
			String path=""+drive+":\\";
			File file = new File(path);
			ArrayList<String> getFilesname=new ArrayList<>();
			File[] files=file.listFiles();
			for(File File2:files) {
				if(File2.getName().endsWith(".txt")==true) {
					getFilesname.add(path+File2.getName()); 
				}
			}
			log.debug(getFilesname);
			String line;
			int count=0;
			for(String singleFile:getFilesname) {
				FileInputStream fileInputstream = new FileInputStream(singleFile);
				InputStreamReader inputStreamReader= new InputStreamReader(fileInputstream);
				bufferReader = new BufferedReader(inputStreamReader);
				while((line = bufferReader.readLine()) != null){

					String []words=line.split(" ");
					count=count+words.length;
					log.info(count);
				}
				count=0;
			}

		}catch(FileNotFoundException filenotfoundException) {
			log.error("please enter the correct file name");
		}catch(IOException ioexception) {
			log.info("cannot read file properly");
		}
		finally {

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






