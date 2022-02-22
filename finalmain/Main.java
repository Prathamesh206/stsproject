package in.sts.sts_project.finalmain;
import java.io.FileNotFoundException;

import org.apache.log4j.BasicConfigurator;

import in.sts.sts_project.input.FileInput;
import in.sts.sts_project.services.Opearation;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BasicConfigurator.configure();	
		
		Opearation fileoperation=new Opearation();                       //Creating Opeartion object for performing opeartion
		fileoperation.fileOpertion(FileInput.getInput());
		
		
	
		
		


	}

}
