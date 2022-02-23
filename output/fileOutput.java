package in.sts.sts_project.output;

import java.util.HashMap;
import java.util.Map;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.services.Operation;

public class fileOutput {
	public void  getFileOutput() {
		Operation caseOpration=new Operation();                                                //creating fileOperation object 
		HashMap<String , Integer> outputMap=caseOpration.fileOpertion(FileInput.getInput());   //call the fileOpration object for output
		for(Map.Entry<String,Integer>filemap:outputMap.entrySet()) {                           //iterating each file into ky and value pair
			String filename=filemap.getKey();                                                  //store the key into file
			int count=filemap.getValue();                                                      //store the wordcount into count variable; 
			System.out.println(filename);
			System.out.println("count = "+count);
		}

	}



}
