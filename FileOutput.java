package in.sts.sts_project.output;

import java.util.HashMap;
import java.util.Map;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.services.FileOperation;

public class FileOutput {
	public  void  getFileOutput(HashMap<String , Integer> outputMap) {
		   //call the fileOpration object for output
		for(Map.Entry<String,Integer>filemap:outputMap.entrySet()) {                           //iterating each file into ky and value pair
			String filename=filemap.getKey();                                                  //store the key into file
			int count=filemap.getValue();                                                      //store the wordcount into count variable; 
			System.out.println(filename);
			System.out.println("count = "+count);
		}

	}



}
