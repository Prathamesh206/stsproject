package in.sts.sts_project.finalmain;
import java.io.FileNotFoundException;
import org.apache.log4j.BasicConfigurator;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.output.FileOutput;
import in.sts.sts_project.services.FileOperation;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BasicConfigurator.configure();
		
		FileInput fileInput=new FileInput();
		
		FileOperation fileOperation=new FileOperation();
		
		FileOutput fileOutput=new FileOutput();
		
		fileOutput.getFileOutput(fileOperation.fileOpertion(fileInput.getInput()));
		
		


	}

}
